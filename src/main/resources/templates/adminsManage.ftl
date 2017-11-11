<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<script>
    menuSelected("adminsManage");
</script>
<div class="panel">
    <div class="panel-heading">
        <#if Session.admin.level ==0>
        <div>
            <label class=" bg-danger btn " style="float: right" onclick="showModal()"><span
                    style="color: white">新建管理员</span></label>
        </div>
        </#if>
    </div>
    <div class="panel-body">
        <table class="table">
            <thead>
            <tr>
                <th>用户名</th>
                <th>姓名</th>
                <th>创建时间</th>
                <th>上次登录时间</th>
                <th>级别</th>
                <th>&nbsp;&nbsp; 操作</th>
            </tr>
            </thead>
            <tbody id="tbody">
            <#--<tr>-->
                <#--<td>zhy</td>-->
                <#--<td>周浩洋</td>-->
                <#--<td>root</td>-->
                <#--<td>2017年9月29日23:40:33</td>-->
                <#--<td><span class="text-info">修改</span>|<span class="text-danger">禁用</span></td>-->
            <#--</tr>-->
            </tbody>
        </table>
    </div>

</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">请填写信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" role="form"  id="form">
                    <div class="form-group">
                        <label for="userName" class="col-sm-3 control-label">用户名</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" name="userName" id="userName" value="">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userPassword" class="col-sm-3 control-label">密码</label>
                        <div class="col-sm-5">
                            <input type="password" class="form-control" name="userPassword" id="userPassword">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" onclick="form_submit()">保存</button>
            </div>
        </div>
    </div>
</div>
</@defaultLayout.layout>
<script>
    $.get("getAdminList",function (data) {
        $.each(data,function (index,value) {
            $("#tbody").append(" <tr>\n" +
                    "                <td>"+value.userId+"</td>\n" +
                    "                <td>"+value.userName+"</td>\n" +
                    "                <td>"+toDate(value.createTime)+"</td>\n" +
                    "                <td>"+toDate(value.lastedTime)+"</td>\n" +
                    "                <td>"+value.level+"</td>\n" +
                    "                <td><span class=\"text-info\" onclick=\'showModal(\"\")\'><a href='javascript:void'>修改</a></span>|<span class=\"text-danger\" onclick=\'deleteAdmin("+value.userId+")\'><a href=\'javascript:void\'>删除</a></span></td>\n" +
                    "            </tr>")
        })
    });
    //全局变量
    var methon;
   function form_submit(methon) {
        //通过methon判断是新建还是修改
       $.ajax({
           type: "POST",
           //gggggg
           url: "insertAdmin",
           data : $("#form").serialize(),
           success: function(msg) {
           }
       });
       //隐藏模态框
       $("#myModal").modal('hide');
       //刷新页面
       location.reload();
       return false;
   }
    function toDate(timestamp) {
        var unixTimestamp = new Date( timestamp ) ;
        return  unixTimestamp.toLocaleString();

    }
    function showModal() {
        //打开模态框
        $("#myModal").modal('show');
    }
    function deleteAdmin(userId) {
        $.ajax({
            type: "POST",
            url: "deleteAdminById",
            data : {"userId":userId},
            success: function(msg) {
                console.log(msg);
            }
        });
        //刷新页面
        location.reload();
    }
</script>