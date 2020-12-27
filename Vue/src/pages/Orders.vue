<template>
    <div class="row">
      <div class="col-12">
        <card :title="table1.title">
          <div class="table-responsive-no-overflow">
            <base-table :data="table1.data"
                        :columns="table1.columns"
                        thead-classes="text-primary">
            </base-table>
          </div>
        </card>
      </div>

    </div>
</template>
<script>
import { BaseTable } from "@/components";
const tableColumns = ["Order", "Table", "Status", "Assignee", "Total"];
const tableData = [
  {
    id: 1,
    order: "Order 23",
    table: "7",
    status: "pending",
    assignee: "John Doe",
    total: "$36.738"
  },
  {
    id: 2,
    order: "Order 21",
    table: "4",
    status: "processed",
    assignee: "Mary Poppins",
    total: "$46.712"
  }
];

export default {
  components: {
    BaseTable
  },
  data() {
    return {
      table1: {
        title: "Orders Table",
        columns: [...tableColumns],
        data: [...tableData]
      }
    };
  }
};
</script>
<style>
</style>
