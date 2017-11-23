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
            <h3 style="line-height: 50px">公司详情</h3>
        </div>
    </div>
</div>
<div class="panel">
    <div class="panel-body">
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label  class="col-sm-2 control-label">公司名字</label>
                <div class="col-sm-10">
                    <if cpInfo??>
                    <p  class="form-control-static"> ${cpInfo.cpName!''}</p>
                    </if>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">联系人</label>
                <div class="col-sm-10">
                    <p  class="form-control-static"> ${cpInfo.cpContactPerson!''}</p>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">公司地址</label>
                <div class="col-sm-10">
                    <p  class="form-control-static">${cpInfo.cpAddress!''}</p>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">所属行业</label>
                <div class="col-sm-10">
                    <p  class="form-control-static">  ${cpInfo.cpSc!''}</p>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">注册号</label>
                <div class="col-sm-10">
                    <p  class="form-control-static">${cpInfo.cpNum!''}</p>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">凭证</label>
                <div class="col-sm-10">
                    <img style="max-width: 600px;" src="${defaultLayout.base}/img/pushimg/5a89473c-f5e1-4065-813a-e7be48bccd1d.png" class="img-thumbnail">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-10">
                    <button class="btn btn-danger" id="refuseBtn">拒绝</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button class="btn btn-primary" id="passBtn">通过</button>
                </div>
            </div>
        </form>
    </div>
</div>

</@defaultLayout.layout>
<script>
    $('#refuseBtn').click(function () {
        //更新user_attr为1(未认证)
        $.get('${defaultLayout.base}/updateUserAttr?userId=${cpInfo.cpUser}&attr=1',function (data,status) {
            $.get('deleteCompanyByCompanyId')
        })
    })
</script>