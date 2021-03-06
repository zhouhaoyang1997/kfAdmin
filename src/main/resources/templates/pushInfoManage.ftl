<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<script>
    menuSelected("pushInfoManage");
</script>
<script src="../js/bootstrap-table.js"></script>
<link href="../css/bootstrap-table.css" rel="stylesheet" />
<script src="../js/bootstrap-table-zh-CN.js"></script>
    <div class="panel panel-default">
        <div class="panel-heading">
            查询条件
        </div>
        <div class="panel-body form-group" style="margin-bottom:0px;">
            <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">按类别：</label>
            <div class="col-sm-2">
                <select class="form-control" name="mcId" id="mcId">
                    <option value="">不限</option>
                    <option value="2">房产</option>
                    <option value="3">二手市场</option>
                    <option value="1">招聘</option>
                    <option value="4">生活服务</option>
                    <option value="5">宠物</option>
                    <option value="6">名企招聘</option>
                </select>
            </div>
            <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">按关键词：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="inputKeyWrod" name="keyWord" placeholder="请输入关键词">
            </div>
            <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">按用户：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="inputUserName" name="userName" placeholder="请输入用户名">
            </div>
            <div class="col-sm-2">
                <button class="btn btn-primary" id="search_btn">查询</button>
            </div>
        </div>
    </div>
<!-- BASIC TABLE -->
        <table id="dataShow" class="table table-hover">
                <#--<th data-field="piUserId">用户Id</th>-->
        </table>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                您确认删除该条信息吗?  删除后不可恢复!
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
    <button id="btn_del" type="button" onclick="deletePushInfoList()" class="btn btn-default">
        <span class="glyphicon glyphicon-remove" aria-hidden="true" ></span>批量删除
    </button>
</div>
<!-- END BASIC TABLE -->
<script>
    //根据窗口调整表格高度
    $(window).resize(function() {
        $('#dataShow').bootstrapTable('resetView', {
            height: tableHeight()
        })
    })
    //生成用户数据
    $('#dataShow').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",//必须要有！！！！
        url:"pushInfoSearch",//要请求数据的文件路径
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
        pageSize:3,//单页记录数
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
                    field: 'piId',
                    title: 'ID'
                }, {
                    field: 'piTitle',
                    title: '信息标题'
                }, {
                    field: 'piUserId',
                    title: '用户ID'
                }, {
                    field: 'userName',
                    title: '发布人'
                }, {
                    field: 'piPhone',
                    title: '联系电话'
                },{
                    field: 'piPushDate',
                    title: '发布日期',
                    formatter:function (value,row,index) {
                        var unixTimestamp = new Date( value ) ;
                        return  unixTimestamp.toLocaleString();

                     }
                },{
                    field: 'piChujia',
                    title: '出价'
                },{
                    field: 'piZhiding',
                    title: '置顶'
                },{
                    field: 'status',
                    title: '状态',
                    formatter:function (value,row,index) {
                        switch (value){
                            case 0:
                                return '正常';
                            case 1:
                                return '拉黑';
                        }
                    }
                },{
                    field:'option',
                            title:'操作',
                            formatter:function (value,row,index) {
//                                var s = '<a href="/user/alterInfo?piId='+row.piId+'">修改</a>';
                                var d = '<a id="remove" data-toggle="modal" href="javascript:void(0)" onclick="removeModal('+row.piId+')">删除</a>';
                                return d;}
                    }
                ],
        locale:'zh-CN',//中文支持,
        responseHandler:function(res){
            //在ajax获取到数据，渲染表格之前，修改数据源
            return res;
        }
    });
    //三个参数，value代表该列的值
//    function operateFormatter(value,row,index){
//        if(value==2){
//            return '<i class="fa fa-lock" style="color:red"></i>'
//        }else if(value==1){
//            return '<i class="fa fa-unlock" style="color:green"></i>'
//        }else{
//            return '数据错误'
//        }
//    }

    //请求服务数据时所传参数
    function queryParams(params){
        return{
            //每页多少条数据
            limit: params.limit,
            //请求第几页
            offset:params.offset,
            mcId:$('#mcId').val(),
            keyWord:$('#inputKeyWrod').val(),
            userName:$('#inputUserName').val()
        }
    }
    //查询按钮事件
    $('#search_btn').click(function(){
        $('#dataShow').bootstrapTable('refresh', {url: 'pushInfoSearch?offset=1'});//此处会用上次的offset而不是1，所以强制传参数

    })
    //tableHeight函数
    function tableHeight(){
        //可以根据自己页面情况进行调整
        return $(window).height();
    }
    function removeModal(piId) {
        $("#piIdHidden").val(piId);
        $("#deleteModal").modal("show");
        $("#removeBtn").click(function(event) {
            $("#deleteModal").modal("hide");
            $.ajax({
                url: "deletePushInfoByPiId?piId=" + piId,
                method: "GET",
               // dataType: "json",
                success:function(data,status) {
                    //刷新列
                    $('#dataShow').bootstrapTable('refresh', {url: 'pushInfoSearch'});
                },
                error:function () {
                    alert("删除失败！")
                }

            })
                });
    }
    //批量删除
    function deletePushInfoList() {
        //获取所有被选中的记录
        var rows = $("#dataShow").bootstrapTable('getSelections');
        if (rows.length== 0) {
            alert("请先选择要删除的记录!");
            return;
        }
        var ids = '';
        for (var i = 0; i < rows.length; i++) {
            piId = rows[i]['piId'];
            $.get("deletePushInfoByPiId?piId="+piId)
        }
        $('#dataShow').bootstrapTable('refresh', {url: 'pushInfoSearch'});
        console.log(ids)
    }
</script>
</@defaultLayout.layout>