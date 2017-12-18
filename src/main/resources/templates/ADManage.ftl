<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<link type="text/css" rel="stylesheet" href="../css/fileinput.css"/>
<script type="text/javascript" src="../js/fileinput.js"></script>
<script type="text/javascript" src="../js/fileinput_locale_zh.js"></script>

<script>
    menuSelected("ADManage");
</script>
<form class="form-horizontal required-validate" action="/adUpload" enctype="multipart/form-data" method="post">
    <div class="form-group">
        <label for="inputClass" class="col-sm-2 control-label">请选择要更换的图片位置</label>
        <input type="hidden" name="page" value="${page!'index'}">
        <div class="col-sm-9">
            <select id="position" class="form-control">
                <option selected></option>
                    <#if adverts??>
                        <#list adverts as advert>
                            <option value="${advert.advertPosition}">${advert.advertPosTitle}</option>
                        </#list>
                    </#if>
            </select>
        </div>
    </div>
    <div class="hidden" id="adImage">
        <input class="hidden" id="advertId" name="advertId" type="text" >
        <input class="hidden" id="imgUrl" name="imgUrl" type="text">

        <div class="form-group">
            <label for="" class="col-md-2 control-label">示例图片</label>
            <img id="demoImg" style="max-width: 80%">
        </div>
        <div class="form-group">
            <label for="" class="col-md-2 control-label">尺寸</label>
            <div class="col-md-9">
            <label id="advertWidth" class="control-label"></label>x
            <label id="advertHeight" class="control-label"></label>(宽高)
            </div>
        </div>
        <div class="form-group">
            <label  class="col-md-2 control-label">要上传的图片</label>
            <div class="col-md-9 tl th">
                <input  type="file" name="image" id="adUpload" multiple value=""/>
                <p class="help-block">支持jpg、jpeg、png、gif格式，大小不超过2.0M</p>
            </div>
        </div>
        <#if adverts??>
            <#if page == "轮播图">
                <div class="form-group">
                    <label  class="col-sm-2 control-label">标题</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="bannerTitle" value="">
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">内容</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="bannerContent" value="">
                    </div>
                </div>
            </#if>
        </#if>
        <div class="form-group text-center ">
            <div class="col-md-10 col-md-offset-1">
                <button type="submit" class="btn btn-primary btn-lg">提交改变</button>
            </div>
        </div>
    </div>
</form>
    <script type="text/javascript">

        var projectfileoptions = {
            showUpload: false,
            showRemove: false,
            language: 'zh',
            showCancel:false,
            showClose:false,
            layoutTemplates:{
                actionUpload:'', //设置为空可去掉上传按钮
                actionDelete:'', //设置为空可去掉删除按钮
            },
            allowedPreviewTypes: ['image'],
            allowedFileExtensions: ['jpg', 'png', 'gif'],
            maxFileSize: 20000,
        };

        $('#position').change(function () {
            $.get("getAdvertByPositionAndPage?page=${page}&position="+$(this).val(),function(data,status){
                $('#adUpload').fileinput("destroy");
                var imageurl = data.demoUrl;
                console.log(data.width);
                //显示上传界面
                $('#adImage').attr('class','show');
                $('#advertWidth').text(data.width);
                $('#advertHeight').text(data.height);
                $('#demoImg').attr('src',imageurl);
                $('#imgUrl').attr('value',imageurl);
                $('#advertId').attr('value',data.advertId);
                $('#adUpload').fileinput(projectfileoptions);
            });
        });

    </script>

</@defaultLayout.layout>