<template>
  <div class="card" style="width: 18rem; background-color: whitesmoke">
    <!--    <img class="card-img-top" :src="category.imageURL" alt="Card image cap">-->
    <div class="card-body" >
      <p class="card-title">{{ product.name}}</p>
      <p class="card-text"></p>
      <a href="#" class="btn btn-primary">Product Details</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "ProductCard",
  data() {
    return {
      product: {
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