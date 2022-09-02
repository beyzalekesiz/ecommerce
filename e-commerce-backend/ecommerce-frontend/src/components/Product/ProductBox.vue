<template>
<!--  <div class="card" style="width: 18rem; background-color: whitesmoke">-->
<!--    <v-img-->
<!--        class="white&#45;&#45;text align-end"-->
<!--        height="200px"-->
<!--        v-bind:src="require('@/assets/white-sneakers.jpg')"-->
<!--    >-->
<!--    </v-img>-->

<!--    <div class="card-body" >-->
<!--      <p class="card-title">{{ product.name}}</p>-->
<!--      <p class="card-text"></p>-->
<!--      <a href="#" class="btn btn-primary">Product Details</a>-->
<!--    </div>-->
<!--  </div>-->
  <v-card
      class="mx-auto"
      max-width="344"
  >
    <v-img
        v-bind:src="product.file_upload_id"
        height="200px"
    ></v-img>

    <v-card-title>
      {{ product.name }}
    </v-card-title>

    <v-card-subtitle>
      {{product.price + " TL"}}
    </v-card-subtitle>

    <v-card-actions>
      <v-btn
          color="orange lighten-2"
          text
      >
        Add to cart
      </v-btn>

      <v-spacer></v-spacer>

<!--      <v-btn-->
<!--          icon-->
<!--          @click="show = !show"-->
<!--      >-->
<!--        <v-icon>{{ show ? 'mdi-chevron-up' : 'mdi-chevron-down' }}</v-icon>-->
<!--      </v-btn>-->
      <v-expansion-panel>
        <v-expansion-panel-header color-="orange lighten-2">
          Product Details
        </v-expansion-panel-header>
        <v-expansion-panel-content>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        </v-expansion-panel-content>
      </v-expansion-panel>
    </v-card-actions>

  </v-card>
</template>

<script>

export default {

  name: "ProductCard",
  props:["product"],
  data() {
    return {
      productnew: {
        name: '',
        color: '',
        description: '',
        price: '',
        size: '',
        imageURl: '',
        category: ''
      },

    }

  }
}
</script>

<style scoped>

</style>