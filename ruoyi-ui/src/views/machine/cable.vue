<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="电缆编号" prop="cableNumber">
        <el-input
          v-model="queryParams.cableNumber"
          placeholder="请输入电缆编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆名称" prop="cableName">
        <el-input
          v-model="queryParams.cableName"
          placeholder="请输入电缆名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆备注" prop="cableRemark">
        <el-input
          v-model="queryParams.cableRemark"
          placeholder="请输入电缆备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆电压等级" prop="cableVoltageLevel">
        <el-input
          v-model="queryParams.cableVoltageLevel"
          placeholder="请输入电缆电压等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆总长度" prop="cableLength">
        <el-input
          v-model="queryParams.cableLength"
          placeholder="请输入电缆总长度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆预警温度值" prop="cableEarlyWarning">
        <el-input
          v-model="queryParams.cableEarlyWarning"
          placeholder="请输入电缆预警温度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆告警温度值" prop="cableReportWarning">
        <el-input
          v-model="queryParams.cableReportWarning"
          placeholder="请输入电缆告警温度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆报警温度值" prop="cableAlarmWarning">
        <el-input
          v-model="queryParams.cableAlarmWarning"
          placeholder="请输入电缆报警温度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆24小时内最高温度" prop="cableMaxTemperature">
        <el-input
          v-model="queryParams.cableMaxTemperature"
          placeholder="请输入电缆24小时内最高温度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆24小时内最低温度" prop="cableMinTemperature">
        <el-input
          v-model="queryParams.cableMinTemperature"
          placeholder="请输入电缆24小时内最低温度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电缆24小时内平均温度" prop="cableAvgTemperature">
        <el-input
          v-model="queryParams.cableAvgTemperature"
          placeholder="请输入电缆24小时内平均温度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:cable:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:cable:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:cable:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:cable:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="cableList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="自增id" align="center" prop="id" />
      <el-table-column label="电缆编号" align="center" prop="cableNumber" />
      <el-table-column label="电缆名称" align="center" prop="cableName" />
      <el-table-column label="电缆状态 0健康 1异常 2危险" align="center" prop="cableStatus" />
      <el-table-column label="电缆备注" align="center" prop="cableRemark" />
      <el-table-column label="电缆电压等级" align="center" prop="cableVoltageLevel" />
      <el-table-column label="电缆总长度" align="center" prop="cableLength" />
      <el-table-column label="电缆预警温度值" align="center" prop="cableEarlyWarning" />
      <el-table-column label="电缆告警温度值" align="center" prop="cableReportWarning" />
      <el-table-column label="电缆报警温度值" align="center" prop="cableAlarmWarning" />
      <el-table-column label="电缆24小时内最高温度" align="center" prop="cableMaxTemperature" />
      <el-table-column label="电缆24小时内最低温度" align="center" prop="cableMinTemperature" />
      <el-table-column label="电缆24小时内平均温度" align="center" prop="cableAvgTemperature" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:cable:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:cable:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改电缆对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="电缆编号" prop="cableNumber">
          <el-input v-model="form.cableNumber" placeholder="请输入电缆编号" />
        </el-form-item>
        <el-form-item label="电缆名称" prop="cableName">
          <el-input v-model="form.cableName" placeholder="请输入电缆名称" />
        </el-form-item>
        <el-form-item label="电缆备注" prop="cableRemark">
          <el-input v-model="form.cableRemark" placeholder="请输入电缆备注" />
        </el-form-item>
        <el-form-item label="电缆电压等级" prop="cableVoltageLevel">
          <el-input v-model="form.cableVoltageLevel" placeholder="请输入电缆电压等级" />
        </el-form-item>
        <el-form-item label="电缆总长度" prop="cableLength">
          <el-input v-model="form.cableLength" placeholder="请输入电缆总长度" />
        </el-form-item>
        <el-form-item label="电缆预警温度值" prop="cableEarlyWarning">
          <el-input v-model="form.cableEarlyWarning" placeholder="请输入电缆预警温度值" />
        </el-form-item>
        <el-form-item label="电缆告警温度值" prop="cableReportWarning">
          <el-input v-model="form.cableReportWarning" placeholder="请输入电缆告警温度值" />
        </el-form-item>
        <el-form-item label="电缆报警温度值" prop="cableAlarmWarning">
          <el-input v-model="form.cableAlarmWarning" placeholder="请输入电缆报警温度值" />
        </el-form-item>
        <el-form-item label="电缆24小时内最高温度" prop="cableMaxTemperature">
          <el-input v-model="form.cableMaxTemperature" placeholder="请输入电缆24小时内最高温度" />
        </el-form-item>
        <el-form-item label="电缆24小时内最低温度" prop="cableMinTemperature">
          <el-input v-model="form.cableMinTemperature" placeholder="请输入电缆24小时内最低温度" />
        </el-form-item>
        <el-form-item label="电缆24小时内平均温度" prop="cableAvgTemperature">
          <el-input v-model="form.cableAvgTemperature" placeholder="请输入电缆24小时内平均温度" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listCable, getCable, delCable, addCable, updateCable } from "@/api/system/cable";

export default {
  name: "Cable",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 电缆表格数据
      cableList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        cableNumber: null,
        cableName: null,
        cableStatus: null,
        cableRemark: null,
        cableVoltageLevel: null,
        cableLength: null,
        cableEarlyWarning: null,
        cableReportWarning: null,
        cableAlarmWarning: null,
        cableMaxTemperature: null,
        cableMinTemperature: null,
        cableAvgTemperature: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询电缆列表 */
    getList() {
      this.loading = true;
      listCable(this.queryParams).then(response => {
        this.cableList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        cableNumber: null,
        cableName: null,
        cableStatus: null,
        cableRemark: null,
        cableVoltageLevel: null,
        cableLength: null,
        cableEarlyWarning: null,
        cableReportWarning: null,
        cableAlarmWarning: null,
        cableMaxTemperature: null,
        cableMinTemperature: null,
        cableAvgTemperature: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加电缆";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getCable(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改电缆";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateCable(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCable(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除电缆编号为"' + ids + '"的数据项？').then(function() {
        return delCable(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/cable/export', {
        ...this.queryParams
      }, `cable_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
