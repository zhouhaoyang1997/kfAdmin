<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<script>
    menuSelected("databaseBackup");
</script>
<script src="../js/bootstrap-table.js"></script>
<link href="../css/bootstrap-table.css" rel="stylesheet" />
<script src="../js/bootstrap-table-zh-CN.js"></script>
<table id="dataShow" class="table table-hover"></table>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                您确认删除吗?  删除后不可恢复!
                <input type="hidden" id="piIdHidden" value="">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="removeBtn" class="btn btn-primary">确认</button>
            </div>
        </div>
    </div>
</div>
<div id="toolbar" class="btn-group">
    <button id="btn_add" type="button" onclick="backup()" class="btn btn-default">
        <span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>备份
    </button>
</div>
</@defaultLayout.layout>
<script>
    $('#dataShow').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",//必须要有！！！！
        url:"getDBList",//要请求数据的文件路径
        toolbar: '#toolbar',//指定工具栏
        sortable: false,                     //是否启用排序
        cache: false,                       //是否使用缓存，默认为true
        striped: true, //是否显示行间隔色
        dataField: "list",//bootstrap table 可以前端分页也可以后端分页，这里
        //我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的
        //rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
        pageNumber: 1, //初始化加载第一页，默认第一页
        pagination:true,//是否分页
        queryParamsType:'limit',//查询参数组织方式
        queryParams:queryParams,//请求服务器时所传的参数
        sidePagination:'server',//指定服务器端分页
        pageSize:1,//单页记录数
        pageList:[5,10,20,30],//分页步进值
      showRefresh:true,//刷新按钮
        showColumns:true,
        clickToSelect: true,//是否启用点击选中行
        toolbarAlign:'right',//工具栏对齐方式
        buttonsAlign:'right',//按钮对齐方式
        escape:true,
        columns:[
            {
                checkbox: true
            }, {
                field: 'createTime',
                title: '创建时间',
                formatter:function (value,row,index) {
                    var unixTimestamp = new Date( value ) ;
                    return  unixTimestamp.toLocaleString();

                }
            }, {
                field: 'fileName',
                title: '文件名字'
            }, {
                field: 'filePath',
                title: '文件路径'
            },  {
                field: '',
                title: '操作',
                formatter:function (value,row,index) {
                    var s = '<a id="remove" data-toggle="modal" href="javascript:void(0)" onclick="removeModal('+row.scId+')">删除</a>';
                    var d = '<a id="download" data-toggle="modal" href="javascript:void(0)" onclick="removeModal('+row.scId+')">下载</a>';
                    return d+" "+s;}
            }
        ],
        locale:'zh-CN',//中文支持,
        responseHandler:function(res){
            //在ajax获取到数据，渲染表格之前，修改数据源
            return res;
        }
    });
    //请求服务数据时所传参数
    function queryParams(params){
        return{
            //每页多少条数据
            limit: params.limit,
            //请求第几页
            offset:params.offset
        }
    }
    function removeModal(scId) {
        $("#deleteModal").modal("show");
        $("#removeBtn").unbind("click").click(function(event) {
            $("#deleteModal").modal("hide");
            $.ajax({
                url: "deleteSecondClassByScId?scId=" + scId,
                method: "GET",
                // dataType: "json",
                success:function(data,status) {
                    $.get("getSecondClassList?mcId="+$('#mainClass').val(),function (data,status) {
                        $('#dataShow').bootstrapTable('load', data);
                    })
                },
                error:function () {
                    alert("删除失败！")
                }

            })
        });
    }bbbbbbbbbbbbbbbbbbb
    function backup() {
        $.get("addBackup",function (value,status) {
            if(status=="success"){
                alert("备份chbbbbbbbbbbbb")
            }
        })
    }
</script>