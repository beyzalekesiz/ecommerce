<template>
  <div>
    <CategoryBox/>
    <!--
    <router-link id="add-category" :to="{name : 'AddCategory'}" v-if="$route.name='AdminCategory'">
      <button class="btn">Add a new Category</button>
    </router-link> -->

<!--      <div >-->
<!--        <button type="button" class="btn btn-primary btn-lg" @click="getAllCategories">Categories</button>-->
<!--      </div> <br><br>-->
<!--  <v-list>-->
<!--    <v-list-item v-for="category in categories" :key="category.name"></v-list-item>-->
<!--  </v-list>-->
<!--    <ul>-->
<!--      <li v-for="category in categories">-->
<!--        <h2>{{category.name}}</h2>-->
<!--        <ul>-->
<!--          <li v-for="category in category.name">{{category.category_id}}</li>-->
<!--        </ul>-->
<!--      </li>-->
<!--    </ul>-->

  </div>
</template>

<script>
import axios from "axios";
import CategoryBox from "@/components/CategoryBox";

export default {
  components: {CategoryBox},
  data(){
    return{
      categories: [
      ]
    }
    },
  methods: {
    async getAllCategories() {
      await axios.get('http://localhost:8080/category/getAllCategories')
          .then(res => this.categories = res.data)
          .catch(err =>console.log(err))
      // getAllCategories() {
      //   axios.get('http://localhost:8080/category/getAllCategories', {
      //   })
      //       .then(response => {
      //     this.categories = response.data.report.categories
      //   })
      //       .catch(function (error) {
      //         console.log(error);
      //       })
      // }
    }
  },
  mounted() {
    this.getAllCategories();
  }

}
</script>

<style scoped>

</style>