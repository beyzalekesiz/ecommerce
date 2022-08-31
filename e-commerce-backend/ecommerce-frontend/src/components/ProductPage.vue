<template>
  <div>
    <v-list>
      <v-list-item v-for="product in products" :key="product.name"></v-list-item>
      <ul>
        <li v-for="product in products" :key="product.id">
          <h2>{{product.name}}</h2>
          <ProductBox :product="product">
          </ProductBox>
          <br>
          <!--        <ul>-->
          <!--          <li v-for="category in category.name" :key="category.name">{{category.name}}</li>-->
          <!--        </ul>-->
        </li>
      </ul>
    </v-list>
  </div>
</template>

<script>
import axios from "axios";
import ProductBox from "@/components/ProductBox";

export default {

  components: {ProductBox},
  data(){
    return{
      products: [
      ]
    }
  },
  methods: {
    async getAllProducts() {

      await axios.get('http://localhost:8080/product/getAllProducts')
          .then(res => this.products = res.data)
          .catch(err =>console.log(err))
    }
  },
  mounted() {
    this.getAllProducts();
  }

}
</script>

<style scoped>

</style>