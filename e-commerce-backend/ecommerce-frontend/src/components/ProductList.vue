<template>
  <div>
    <h1>Products</h1> <br><br>


  </div>

</template>

<script>
import axios from "axios";
import router from "@/router";

export default {
  name: "ProductList",
  data() {
    return {

    }

    },
  methods: {
    listProduct(){
      axios.get('http://localhost:8080/products/getAllProducts', {

      })
          .then(function (response) {
            console.log(response);
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