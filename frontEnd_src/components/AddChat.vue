<template>
  <h5>新增留言</h5>
  <el-input v-model="name" placeholder="輸入姓名"></el-input>
  <el-input v-model="subject" placeholder="輸入主題"></el-input>
  <el-input v-model="content" placeholder="輸入內容"></el-input>
  <el-button type="primary" @click="add">確定新增</el-button>
  <hr />
  {{ message }}
</template>
<script>
import axios from "axios";
export default {
  name: "AddChat",
  data() {
    return {
      name: "",
      subject: "",
      content: "",
      message: "",
    };
  },

  methods: {
    add() {
      let data = {
        name: this.name,
        subject: this.subject,
        content: this.content,
      };
      let url = "http://192.168.7.94:8080/chat/addchat";

      axios
        .post(url, data)
        .then((response) => (this.message = response.data))
        .catch(function (error) {
          console.log(error);
        });
    },
  },
};
</script>
<style></style>
