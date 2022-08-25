<template>
  <div class="card" style="width: 18rem; background-color: whitesmoke">
<!--    <img class="card-img-top" :src="category.imageURL" alt="Card image cap">-->
    <div class="card-body" >
      <p class="card-title">{{ category.categoryName}}</p>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <a href="#" class="btn btn-primary">Go somewhere</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "CategoryBox",
  data() {
    // let category;
    return {
    //   const: category = {
    //     name: this.categoryName
      }
    },
  methods: {

  }


}
</script>

<style scoped>

</style>