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
        <div class="col-sm-9">
            <select id="position" class="form-control">
                <option selected></option>
                <#list adverts as advert>
                    <option value="${advert.advertPosition}">${advert.advertPosition}</option>
                </#list>
            </select>
        </div>
    </div>
    <div class="hidden" id="adImage">
        <input class="hidden" id="imgUrl" name="imgUrl" type="text" value="">
        <div class="form-group">
            <label for="" class="col-md-2 control-label">要更换的图片</label>
            <div class="col-md-9 tl th">
                <input type="file" name="image" id="adUpload" multiple value=""/>
                <p class="help-block">支持jpg、jpeg、png、gif格式，大小不超过2.0M</p>
            </div>
        </div>
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
                var imageurl = data.advertUrl;
                //初始化隐藏参数imgurl的值
                $("#imgUrl").attr('value',imageurl);
                //显示上传界面
                $('#adImage').attr('class','show');

                if (imageurl) {
                    var op = $.extend({
                        initialPreview: [ // 预览图片的设置
                            "<img src='" + imageurl + "' class='file-preview-image' style='max-width: 100%;max-height: 100%'> ",]
                    }, projectfileoptions);
                    $('#adUpload').fileinput(op);
                }
            });
        });

    </script>
</@defaultLayout.layout>