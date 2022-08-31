<template>
  <div>
  <v-list>
    <v-list-item v-for="category in categories" :key="category.name"></v-list-item>
    <ul>
      <li v-for="category in categories" :key="category.id">
        <h2>{{category.name}}</h2>
        <CategoryBox :category="category">
        </CategoryBox>
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
    }
  },
  mounted() {
    this.getAllCategories();
  }

}
</script>

<style scoped>

</style>