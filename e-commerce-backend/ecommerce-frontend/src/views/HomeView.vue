<template>
  <div>
    <!--<ToolBar/> -->
    <hello-world/>
  </div>
</template>

<script>
  import HelloWorld from '../components/HelloWorld'
  //import ToolBar from "@/components/ToolBar";

  export default {
    name: 'HomeView',

    components: {
      //ToolBar,
      HelloWorld,
    },
  }
</script>
