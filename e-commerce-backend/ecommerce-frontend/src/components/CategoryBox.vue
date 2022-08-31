<template>
  <div class="card" style="width: 18rem; background-color: whitesmoke">
<!--    <img class="card-img-top" :src="category.imageURL" alt="Card image cap">-->
    <div class="card-body" >
      <p class="card-title">{{ category.name}}</p>
      <p class="card-text"></p>
      <a href="#" class="btn btn-primary">See Products</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "CategoryBox",
  data() {
    return {
    category: {
      name
      },

    }

  }


}
</script>

<style scoped>

</style>