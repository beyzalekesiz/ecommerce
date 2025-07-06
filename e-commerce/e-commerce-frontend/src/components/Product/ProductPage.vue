<template>
  <div>
  <v-item-group mandatory>
    <v-container>
      <v-row>
        <v-col
            v-for="product in products"
            :key="product"
            cols="12"
            md="4"
        >
          <v-item>
<!--            <v-card-->
<!--                :color="active ? 'primary' : ''"-->
<!--                class="d-flex align-center"-->
<!--                dark-->
<!--                height="200"-->
<!--                @click="toggle"-->
<!--            >-->
             <ProductBox :product="product"/>
<!--            </v-card>-->
          </v-item>
        </v-col>
      </v-row>
    </v-container>
  </v-item-group>
  </div>
</template>

<script>
import axios from "axios";
import ProductBox from "@/components/Product/ProductBox";

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