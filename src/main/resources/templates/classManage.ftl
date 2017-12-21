<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<script>
    menuSelected("blacklist");
</script>
<script src="../js/bootstrap-table.js"></script>
<link href="../css/bootstrap-table.css" rel="stylesheet" />
<script src="../js/bootstrap-table-zh-CN.js"></script>
<div class="panel">
    <div class="panel-body">
        <div class="alert-success text-center" style="height:50px">
            <h3 style="line-height: 50px">菜单管理</h3>
        </div>
    </div>
</div>
<div class="row">
    <label for="inputClass" class="col-sm-1 control-label"><h4>主类</h4></label>
    <div class="col-sm-5">
        <select id="mainClass" class="form-control">
            <option value="-1" selected>请选择主类</option>
        <#if Mcs??>
        <#list Mcs as mc>
        <option value="${mc.mcId}">${mc.mcName}</option>
        </#list>
        </#if>
        </select>
    </div>
</div>
<div id="toolbar" class="btn-group">
    <button id="btn_add" type="button" onclick="addSc()" class="btn btn-default">
        <span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>新增
    </button>
</div>
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
<div class="modal fade" id="addModal" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">请输入二级菜单名称</h4>
            </div>
            <div class="modal-body">
            <form  class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="scName" class="col-sm-2 control-label">名称</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" name="scName" id="scName" value="">
                    </div>
                </div>
            </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="addBtn" class="btn btn-primary">确认</button>
            </div>
        </div>
    </div>
</div>
<br>
<br>
<br>
<table id="dataShow" class="table table-hover"></table>

<script>
    //根据窗口调整表格高度
    $(window).resize(function() {
        $('#dataShow').bootstrapTable('resetView', {
            height: tableHeight()
        })
    });
    //生成用户数据
    $('#dataShow').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",//必须要有！！！！
//        url:"",//要请求数据的文件路径
        // height:tableHeight(),//高度调整
        toolbar: '#toolbar',//指定工具栏
        sortable: false,                     //是否启用排序
        cache: false,                       //是否使用缓存，默认为true
        striped: true, //是否显示行间隔色
//        dataField: "list",//bootstrap table 可以前端分页也可以后端分页，这里
        //我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的
        //rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
//        pageNumber: 1, //初始化加载第一页，默认第一页
//        pagination:true,//是否分页
//        queryParamsType:'limit',//查询参数组织方式
//        queryParams:queryParams,//请求服务器时所传的参数
//        sidePagination:'server',//指定服务器端分页
        pageSize:1,//单页记录数
        pageList:[5,10,20,30],//分页步进值
//      showRefresh:true,//刷新按钮
        showColumns:true,
        clickToSelect: true,//是否启用点击选中行
        toolbarAlign:'right',//工具栏对齐方式
        buttonsAlign:'right',//按钮对齐方式
        escape:true,
        columns:[
            {
                checkbox: true
            }, {
                field: 'scId',
                title: '子类ID'
            }, {
                field: 'scName',
                title: '子类名称'
            },  {
                field: '',
                title: '操作',
                formatter:function (value,row,index) {
                    var d = '<a id="remove" data-toggle="modal" href="javascript:void(0)" onclick="removeModal('+row.scId+')">删除</a>';
                    return d;}
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
    //tableHeight函数
    function tableHeight(){
        //可以根据自己页面情况进行调整
        return $(window).height();
    }
    $('#mainClass').change(function () {
        $.get("getSecondClassList?mcId="+$(this).val(),function (data,status) {
            $('#dataShow').bootstrapTable('load', data);
        })
    });
    function removeModal(scId) {
        $("#piIdHidden").val(scId);
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
    }
    function addSc() {
        if( $('#mainClass').val()==-1){
            alert("请选择主类！")
        }else{

            $("#addModal").modal("show");
            $("#addBtn").unbind("click").click(function(event) {
                $("#addModal").modal("hide");
                $.ajax({
                    type: "POST",
                    url: "insertSecondClassByScId",
                    data: {"scName": $('#scName').val(), "mcId": $('#mainClass').val()},
                    success: function (msg) {
                        $.get("getSecondClassList?mcId=" + $('#mainClass').val(), function (data, status) {
                            $('#dataShow').bootstrapTable('load', data);
                        })
                    }
                });

            })
        }
    }
</script>

</@defaultLayout.layout>