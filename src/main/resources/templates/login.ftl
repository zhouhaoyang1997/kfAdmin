<!doctype html>
<html lang="en" class="fullscreen-bg">
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/main.css">
    <link rel="apple-touch-icon" sizes="76x76" href="../img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="../img/favicon.png">
</head>
<body>
<div id="wrapper">
    <div class="vertical-align-wrap">
        <div class="vertical-align-middle">
            <div class="auth-box ">
                <div class="left">
                    <div class="content">
                        <div class="header">
                            <div class="logo text-center"><img src="../img/logo-dark.png" alt="Klorofil Logo"></div>
                            <#--<p class="lead">Login to your account</p>-->
                        </div>
                        <form class="form-auth-small" action="login" method="post">
                            <div class="form-group">
                                <label for="signin-email" class="control-label sr-only">账号</label>
                                <input type="text" class="form-control" id="signin-email" name="userName" value="" placeholder="请输入账号">
                            </div>
                            <div class="form-group">
                                <label for="signin-password" class="control-label sr-only">密码</label>
                                <input type="password" class="form-control" id="signin-password"  name="userPassword" value="" placeholder="请输入密码">
                            </div>
                            <div class="form-group clearfix">
                                    <span class="alert-danger">${message!""}</span>
                            </div>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
                        </form>
                    </div>
                </div>
                <div class="right">
                    <div class="overlay"></div>
                    <div class="content text">
                        <h1 class="heading">网站后台管理系统</h1>
                        <#--<p>by zhy</p>-->
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
