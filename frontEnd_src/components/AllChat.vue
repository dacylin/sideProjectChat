<template>
  <h5>所有留言</h5>
  <el-table :data="currentTableData" border style="width: 100%">
    <el-table-column prop="id" label="ID"></el-table-column>
    <el-table-column prop="name" label="留言者"></el-table-column>
    <el-table-column prop="subject" label="留言主題"></el-table-column>
    <el-table-column prop="content" label="留言內容"></el-table-column>
  </el-table>
  <el-pagination
    @size-change="handleSizeChange"
    @current-change="handleCurrentChange"
    :current-page="currentPage"
    :page-sizes="[5, 10, 20, 50]"
    :page-size="pageSize"
    layout="total, prev, pager, next, jumper"
    :total="info.length"
  >
  </el-pagination>
</template>

<script>
import axios from "axios";
export default {
  name: "AllChat",
  data() {
    return {
      info: [],
      currentPage: 1,
      pageSize: 3,
    };
  },

  mounted() {
    axios
      .get("http://192.168.7.94:8080/chat/allchat")
      .then((response) => (this.info = response.data))
      .catch(function (error) {
        console.log(error);
      });
  },

  computed: {
    currentTableData() {
      const start = (this.currentPage - 1) * this.pageSize;
      const end = this.currentPage * this.pageSize;
      return this.info.slice(start, end);
    },
  },

  methods: {
    handleSizeChange(val) {
      this.pageSize = val;
      this.currentPage = val;
    },
    handleCurrentChange(val) {
      this.currentPage = val;
    },
  },
};
</script>
<style>
h5 {
  text-align: center;
}
</style>
