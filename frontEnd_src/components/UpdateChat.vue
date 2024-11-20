<template>
  <h5>修改留言</h5>
  <el-input v-model="id" placeholder="輸入ID"></el-input>
  <el-input v-model="content" placeholder="輸入內容"></el-input>
  <el-button type="primary" @click="update">確定修改</el-button>
  <hr />
  {{ message }}
</template>
<script>
import axios from "axios";
export default {
  name: "UpdateChat",
  data() {
    return {
      id: "",
      content: "",
      message: "",
    };
  },

  methods: {
    update() {
      let data = {
        id: this.id,
        content: this.content,
      };
      let url = "http://192.168.7.94:8080/chat/updatechat";

      axios
        .put(url, data)
        .then((response) => (this.message = response.data))
        .catch(function (error) {
          console.log(error);
        });
    },
  },
};
</script>
<style></style>
