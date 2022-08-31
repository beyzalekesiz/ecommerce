<template>
  <div>
    <router-link :to="{name : 'AddCategory'}">
      <button type="button" class="btn btn-primary btn-lg">Add Category</button>
    </router-link>

    <router-link :to="{name : 'AddProduct'}">
      <button type="button" class="btn btn-primary btn-lg">Add Product</button>
    </router-link>
  </div>

</template>

<script>
//import axios from "axios";
//import router from "@/router";

export default {
  name: "AdminView"
}
</script>

<style scoped>

</style>