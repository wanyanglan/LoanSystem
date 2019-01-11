<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
		<title>贷款调查_资产负债</title>
		<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
		<link title="" href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
		<link title="blue" href="${pageContext.request.contextPath}/microcredit/css/dermadefault.css" rel="stylesheet" type="text/css" />
		<link title="green" href="${pageContext.request.contextPath}/microcredit/css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link title="orange" href="${pageContext.request.contextPath}/microcredit/css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link href="${pageContext.request.contextPath}/microcredit/css/templatecss.css" rel="stylesheet" title="" type="text/css" />
		<!--angular ui--->
		<link rel="stylesheet" title="" type="text/css" href="${pageContext.request.contextPath}/microcredit/ui-layout-0.0.0/ui-layout.css" />
	</head>

	<body>
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
								<a href="index.jsp"><span class="sublist-icon glyphicon glyphicon-home"></span><span class="sub-title">首页</span></a>
							</li>
						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">客户管理</span>
						</div>
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />对私管理</div>
								<a href="list_privateCustomer"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">对私管理</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />对公管理</div>
								<a href="list_publicCustomer"><span class="sublist-icon glyphicon glyphicon-ban-circle"></span><span class="sub-title">对公管理</span></a>
							</li>

						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-up"><span class="title-icon glyphicon glyphicon-chevron-up"></span><span class="sublist-title">贷款管理</span></div>
						<ul class="navContent" style="display:block">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />个人申请列表</div>
								<a href="client_loanPersonList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">个人申请列表</span></a>
							</li>

							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />企业申请列表</div>
								<a href="company_comList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">企业申请列表</span></a>
							</li>
							
							<li class="active">
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />贷款调查</div>
								<a href="survey_basicinfo_test.jsp"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">贷款调查</span></a>
							</li>

						</ul>
					</div>
					
					<!--描述：第三大模块-->
					<div class="sBox">
						<div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">数据管理</span>
						</div>
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcreditimg/leftimg.png" />多源数据融合</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">多源数据融合</span></a>
							</li>
						</ul>
					</div>
					<!--描述：第四大模块-->
                    <div class="sBox">
						<div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">模型管理</span>
						</div>
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcreditimg/leftimg.png" />对私信用</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">对私信用</span></a>
							</li>
							
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcreditimg/leftimg.png" />对公信用</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">对公信用</span></a>
							</li>
						</ul>
					</div>
					
				</div>
			</div>
			<!--右边显示部分-->
			<div class="right-product view-product right-full">
				<section id="layout" ng-app="doc.ui-layout">
					<div ui-layout class="layout-mock">
						<ui-layout options="{ flow : 'column' }">
							<!---leftlist--->
							<sidebar class="east-back left-back">
								<ul class="nav nav-pills nav-stacked">
									<li>
										<a href="survey_basicinfo_test.jsp">基本信息</a>
									</li>
									<li class="active">
										<a href="survey_asset_test.jsp">资产负债</a>
									</li>
									<li>
										<a href="survey_finance.jsp">财务分析</a>
									</li>
									<li>
										<a href="survey_validation.jsp">交叉验证</a>
									</li>
								</ul>
							</sidebar>
							<!---rightcontent---->
							<div class="center-back right-back">
								<div class="container-fluid">
									<div class="info-center">
										
										<!--
                                            	作者：offline
                                            	时间：2019-01-11
                                            	描述：内容在这里填写
                                            -->
										
									</div>
								</div>
							</div>
						</ui-layout>
					</div>
				</section>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery.cookie.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/angular.min.js"></script>
		<script src="${pageContext.request.contextPath}/microcredit/ui-layout-0.0.0/ui-layout.js"></script>
		<script type="text/javascript">
			/*Angular-UI-layout*/
			angular.module('doc.ui-layout', ['ui.layout']);
		</script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/microcredit/script/function.js"></script>
	</body>

</html>