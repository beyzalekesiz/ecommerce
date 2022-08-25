<template>
  <div class="submit">
    <div class="row">
      <div class="col-12 text-center">
        <h2 class="pt-3">Add Product</h2>
      </div>
    </div>
    <div class="row">

        <form>
          <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" v-model="name" />
          </div>

          <div class="form-group">
            <label>Color</label>
            <input type="text" class="form-control" v-model="color" />
          </div>

          <div class="form-group">
            <label>Description</label>
            <input type="text" class="form-control" v-model="description" />
          </div>

          <div class="form-group">
            <label>Image</label>
            <input type="text" class="form-control" v-model="imageURL" />
          </div>

          <div class="form-group">
            <label>Price</label>
            <input type="price" class="form-control" v-model="price" />
          </div>

          <div class="form-group">
            <label>Size</label>
            <input type="text" class="form-control" v-model="size" />
          </div>

          <div class="form-group">
            <label>Category</label>
            <input type="text" class="form-control" v-model="category" />
          </div>

          <br> <br>
          <button type="button" class="btn btn-primary" @click="addProduct">
            Submit
          </button>
        </form>
      </div>
  </div>
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
      category_id: ''
    }
  },

  methods: {
    addProduct() {
      console.log(this.name);
      console.log(this.color);
      console.log(this.description);
      console.log(this.imageURL);
      console.log(this.price);
      console.log(this.size);
      console.log(this.category_id);

      axios.post('http://localhost:8080/product/addProduct', {
        name: this.name,
        color: this.color,
        description: this.description,
        imageURl: this.imageURL,
        price: this.price,
        size: this.size,
        category_id: this.category_id
      })

          .then(function (response) {
            console.log(response);
            alert("Category added.")
          })
          .catch(function (error) {
            console.log(error);
          })
    }
  }
}
</script>

<style scoped>

</style>