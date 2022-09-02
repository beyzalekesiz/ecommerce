<template>
  <form @submit.prevent="addProduct">
    <h1>Add Product</h1> <br><br>

    <div>
      <input type="file" @change="uploadFile" ref="file">
      <button @click="submitFile">Upload!</button>
    </div>

    <label>Name:</label> &nbsp;
    <input type = "name" required v-model="name"> <br><br>

    <label>Color:</label> &nbsp;
    <input type = "text"  v-model="color"> <br><br>

    <label>Description:</label> &nbsp;
    <input type = "description" v-model="description"> <br><br>

    <label>ImageURL:</label> &nbsp;
    <input type = "text"  v-model="imageURL"> <br><br>

    <label>Price:</label> &nbsp;
    <input type = "price"  v-model="price"> <br><br>

    <label>Size:</label> &nbsp;
    <input type = "size"  v-model="size"> <br><br>

    <div class="selection-handle">
      <label>Category</label> <br>
      <select class="form-control" v-model="category" required>
        <option disabled value="">Select a category</option>-->
        <option
            v-for="category of categories" :key="category.id" :value="category.id">{{category.name}}
        </option>
      </select>
    </div> <br>

    <div class="submit" type="button">
      <button>Add</button>
    </div> <br><br>
  </form>
</template>


<script>
import axios from "axios";

export default {
  name: "AddProduct",
  data() {
    return {
      name: '',
      color: '',
      description: '',
      imageURL: '',
      price: '',
      size: '',
      categories: []
    }
  },

  methods: {
    uploadFile() {
      this.imageURL= this.$refs.file.files[0];
    },
    submitFile() {
      const formData = new FormData();
      formData.append('imageURL', this.ImageURL);
      const headers = {'Content-Type': 'multipart/form-data'};
      axios.post('https://localhost:8080/fileUpload/upload', formData, {headers})
          .then((res) => {
        this.imageURL = res.data; // binary representation of the file
        res.status; // HTTP status
      });
    },
  async getAllCategories() {
    await axios.get('http://localhost:8080/category/getAllCategories')
        .then(res => this.categories = res.data)
        .catch(err => console.log(err))
  },
  addProduct: async function () {
    console.log(this.name);
    console.log(this.color);
    console.log(this.description);
    console.log(this.imageURL);
    console.log(this.price);
    console.log(this.size);
    console.log(this.category);

    const product = {
      name: this.name,
      color: this.color,
      description: this.description,
      imageURl: this.imageURL,
      price: this.price,
      size: this.size,
      categoryID: this.category

    }
    console.log(product);

    await axios.post('http://localhost:8080/product/addProduct',

        product
        ,
    )
        .then(function (response) {
          console.log(response);
          alert("Product added.")
        })
        .catch(function (error) {
          console.log(error);
        })
  }
},
mounted() {
  this.getAllCategories();
}
}
</script>

<style scoped>

</style>