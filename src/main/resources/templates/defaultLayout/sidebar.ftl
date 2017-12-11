<!-- LEFT SIDEBAR -->
<div id="sidebar-nav" class="sidebar">
    <div class="sidebar-scroll">
        <nav>
            <ul class="nav" id="menu">
                <li><a href="/index" class="active" id="menuList"><i class="lnr lnr-home"></i> <span>菜单列表</span></a>
                </li>
                <li><a href="/pushInfoManage" id="pushInfoManage"><i class="lnr lnr-code"></i> <span>发布信息管理</span></a>
                </li>
                <#--<li><a href="/databaseBackup" id="databaseBackup" class=""><i class="lnr lnr-alarm"></i>-->
                    <#--<span>数据库备份</span></a></li>-->
                <li>
                    <a href="#users" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i>
                        <span>会员管理</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                    <div id="users" class="collapse ">
                        <ul class="nav">
                            <li><a href="editUserInfo" class="">会员信息管理</a></li>
                            <li><a href="blackList" class="">黑名单管理</a></li>
                        </ul>
                    </div>
                </li>  <li>
                    <a href="#ADManage" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i>
                        <span>广告管理</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                    <div id="ADManage" class="collapse ">
                        <ul class="nav" id="ads">
                            <#--<li><a href="ADManage" class="">首页</a></li>-->
                            <#--<li><a href="ADManage" class="">用户信息页面</a></li>-->
                        </ul>
                    </div>
                </li>
                <li><a href="/adminsManage" id="adminsManage" class=""><i class="lnr lnr-star"></i>
                    <span>管理员设置</span></a>
                </li>
                <li><a href="/adminsManage" id="adminsManage" class=""><i class="lnr lnr-star"></i>
                    <span>管理员设置</span></a>
                </li>

            <#--<li>-->
            <#--<a href="#admins" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i>-->
            <#--<span>管理员</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>-->
            <#--<div id="admins" class="collapse ">-->
            <#--<ul class="nav">-->
            <#--<li><a href="adminsManage" class="">管理员设置</a></li>-->
            <#--<li><a href="page-lockscreen.html" class="">管理员分组</a></li>-->
            <#--</ul>-->
            <#--</div>-->
            <#--</li>-->
                <#--<li><a href="/addNewSecondClass" class="" id="addNewSecondClass"><i class="lnr lnr-dice"></i> <span>信息分类管理</span></a>-->
                <#--</li>-->
                <li><a href="/tipManage" class=""><i class="lnr lnr-text-format"></i> <span>举报管理</span></a></li>
                <li><a href="/companyManage" class=""><i class="lnr lnr-text-format"></i> <span>名企认证</span></a></li>
                <!--<li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li>-->
            </ul>
        </nav>
    </div>
</div>
<!-- END LEFT SIDEBAR -->
<script>
    $.get("${base}/getAdvertPageList",function (data,status) {
        $.each(data,function (index,value) {
            $("#ads").append("<li><a href=\'ADManage?page="+value+"\'>"+value+"</a></li>");
        })
    })
</script>
