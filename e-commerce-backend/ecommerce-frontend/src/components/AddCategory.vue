<template>
  <div class="submit">
    <div class="row">
      <div class="col-12 text-center">
        <h3 class="pt-3">Add Category</h3>
      </div>
    </div>
    <div class="row">
      <div class="col-3"></div>
      <div class="col-6">
        <form>
          <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" v-model="name" />
          </div>
          <!--
          <div class="form-group">
            <label>Description</label>
            <textarea type="text" class="form-control" v-model="description" />
          </div>
          <div class="form-group">
            <label>Image</label>
            <input type="text" class="form-control" v-model="imageUrl" />
          </div> -->
          <br> <br>
          <button type="button" class="btn btn-primary" @click="addCategory">
            Submit
          </button>
        </form>
      </div>
      <div class="col-3"></div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
//import router from "@/router";

export default {
  name: "AddCategory",
  data() {
    return {
      name: '',
    }
  },

  methods: {
    addCategory() {
      console.log(this.name);
      axios.post('http://localhost:8080/category/addCategory', {
        name: this.name
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