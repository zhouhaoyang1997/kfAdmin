<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<div class="panel panel-headline">
    <div class="panel-heading">
        <h3 class="panel-title">欢迎 <span class="text-danger">${admin.userName!''}</span> 来到网站后台系统</h3>
    </div>
</div>
</@defaultLayout.layout>