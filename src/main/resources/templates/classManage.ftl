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
        url:"",//要请求数据的文件路径
        // height:tableHeight(),//高度调整
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
                field: 'userId',
                title: '主类ID'
            }, {
                field: 'userName',
                title: '第二类'
            },  {
                field: 'status',
                title: '修改',
                formatter:function (value,row,index) {
                    switch (value){
                        case 0:
                            return '已拉黑';
                        case 1:
                            return '正常';
                    }
                }
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


</script>

</@defaultLayout.layout>