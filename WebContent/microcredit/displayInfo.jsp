<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
		<title>显示申请人员</title>
		<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
		<link title="" href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
		<link title="blue" href="${pageContext.request.contextPath}/microcredit/css/dermadefault.css" rel="stylesheet" type="text/css" />
		<link title="green" href="${pageContext.request.contextPath}/microcredit/css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link title="orange" href="${pageContext.request.contextPath}/microcredit/css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link href="${pageContext.request.contextPath}/microcredit/css/templatecss.css" rel="stylesheet" title="" type="text/css" />
	</head>

	<body>
		<!--
	    	作者：offline
	    	时间：2018-11-10
	    	描述：导航栏部分
        -->
		<nav class="nav navbar-default navbar-mystyle navbar-fixed-top">
			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> 
			        <span class="icon-bar"></span> 
			        <span class="icon-bar"></span> 
			        <span class="icon-bar"></span> 
			    </button>
				<a class="navbar-brand mystyle-brand"><span class="glyphicon glyphicon-home"></span></a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="li-border">
						<a class="mystyle-color" href="#">xxx信贷系统</a>
					</li>
				</ul>

				<ul class="nav navbar-nav pull-right">
					<li class="dropdown li-border">
						<a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">帮助与文档<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">帮助与文档</a>
							</li>
							<li class="divider"></li>
							<li>
								<a href="#">论坛</a>
							</li>
							<li class="divider"></li>
							<li>
								<a href="#">博客</a>
							</li>
						</ul>
					</li>
					<li class="dropdown li-border">
						<a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">00000000@qq.com<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">退出</a>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">换肤<span class="caret"></span></a>
						<ul class="dropdown-menu changecolor">
							<li id="blue">
								<a href="#">蓝色</a>
							</li>
							<li class="divider"></li>
							<li id="green">
								<a href="#">绿色</a>
							</li>
							<li class="divider"></li>
							<li id="orange">
								<a href="#">橙色</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</nav>
		<!--
        	作者：offline
        	时间：2018-11-10
        	描述：与导航栏分开的下半部分
        -->
		<div class="down-main">
			<!--描述：左侧目录部分-->
			<div class="left-main left-full">
				<div class="sidebar-fold"><span class="glyphicon glyphicon-menu-hamburger"></span></div>
				<div class="subNavBox">
					<div class="sBox">
						<ul class="navContent" style="display:block">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />首页</div>
								<a href="index.html"><span class="sublist-icon glyphicon glyphicon-home"></span><span class="sub-title">首页</span></a>
							</li>
						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">用户中心</span>
						</div>
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />账号管理</div>
								<a href="accountInfo.html"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">账号管理</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />黑名单管理</div>
								<a href="blacklist.html"><span class="sublist-icon glyphicon glyphicon-ban-circle"></span><span class="sub-title">黑名单管理</span></a>
							</li>

						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-up"><span class="title-icon glyphicon glyphicon-chevron-up"></span><span class="sublist-title">贷款管理</span></div>
						<ul class="navContent" style="display:block">
							<li class="active">
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />申请列表</div>
								<a href="displayInfo.html"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">申请列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />审批列表</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">审批列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />放款列表</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">放款列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />贷后催收</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">贷后催收</span></a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--
            	描述：右侧正文部分
            -->
			<div class="right-product view-product right-full">
				<div class="container-fluid">

					<div class="message-manage info-center">
						<div class="page-header">
							<div class="pull-left">
								<h4>已申请人员</h4>
							</div>
						</div>
						<div class="manage-detail">
							<div class="manage-detail-con clearfix">
								<a class="custom" href="loanlist.html">新建申请</a>
							</div>
						</div>
						<div class="manage-record">
							<h6 class="margin-big-top"></h6>
							<div class="clearfix"></div>
							<div class="table-margin">
								<table class="table table-bordered table-header">
									<thead>
										<tr>
											<td class="w10">客户姓名</td>
											<td class="w5">性别</td>
											<td class="w5">年龄</td>
											<td class="w15">手机号</td>
											<td class="w23">证件号</td>
											<td class="w10">贷款类型</td>
											<td class="w10">申请金额</td>
											<td class="w15">创建时间</td>
											<td class="w7">操作</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td><a></a></td>
										</tr>
										<tr>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
											<td>2</td>
										</tr>
									</tbody>
								</table>
							</div>

						</div>
					</div>
					<div class="clearfix"></div>
					<div class="show-page padding-big-right hidden">
						<div class="page">
						</div>
					</div>

				</div>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery.cookie.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="script/function.js" type="text/javascript"></script>
	</body>

</html>