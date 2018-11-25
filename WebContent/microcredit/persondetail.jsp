<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
		<title>贷款人员详情页</title>
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
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />首页</div>
								<a href="index.jsp"><span class="sublist-icon glyphicon glyphicon-home"></span><span class="sub-title">首页</span></a>
							</li>
						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">用户中心</span>
						</div>
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />账号管理</div>
								<a href="accountInfo.jsp"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">账号管理</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />黑名单管理</div>
								<a href="blacklist.jsp"><span class="sublist-icon glyphicon glyphicon-ban-circle"></span><span class="sub-title">黑名单管理</span></a>
							</li>
						</ul>
					</div>
					<div class="sBox">
						<div class="subNav sublist-up"><span class="title-icon glyphicon glyphicon-chevron-up"></span><span class="sublist-title">贷款管理</span></div>
						<ul class="navContent" style="display:block">
							<li class="active">
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />申请列表</div>
								<a href="loan_loanList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">申请列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />审批列表</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">审批列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />放款列表</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">放款列表</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />贷后催收</div>
								<a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">贷后催收</span></a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--
            	描述：右侧正文部分
            -->
			
			<div class="right-product right-full">
				<div class="center-back right-back">
					<div class="container-fluid">
						<div class="info-center">
							<div class="page-header">
								<div class="pull-left">
									<h4>申请信息</h4>
								</div>
							</div>
							<div class="col-lg-12">
								<s:form action="/lclient_updateClientInfo" method="post"></s:form>
									<!--
                                    	作者：offline
                                    	时间：2018-11-24
                                    	描述：个人信息起始行
                                    -->
                                    <s:hidden name="clientId" id="id" value="%{clientId}"></s:hidden>
									<!--个人信息第一行-->
									<div class="row">
										<div class="form-group">
											<label style="margin-top: 15px;">个人信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">客户姓名:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientName" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientName"></s:property>" disabled/>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">性别:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientGender" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientGender"></s:property>" disabled/>
										
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">年龄:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientAge" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientAge"></s:property>" disabled/>

											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">出生日期:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientBirthday" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientBirthday"></s:property>" disabled/>
												
											</div>
										</div>
									</div>
									<!--个人信息第3行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">证件类型:</label>
											<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="identifyType" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.identifyType"></s:property>" disabled/>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">证件号码:</label>
											<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="identifyNum" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.identifyNum"></s:property>" disabled/>
						
											</div>
										</div>
									</div>
									<!--个人信息第2行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">联系电话:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="phoneNumber" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.phoneNumber"></s:property>" disabled/>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">电子邮箱:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientEmail" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientEmail"></s:property>" disabled/>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">户籍:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientCensus" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientCensus"></s:property>" disabled/>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">学历:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clientEducation" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clientEducation"></s:property>" disabled/>
												
											</div>
										</div>
									</div>
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">婚姻状况:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="maritalStatus" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.maritalStatus"></s:property>" disabled/> 
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">家庭地址:</label>
											<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="clentAddress" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.clentAddress"></s:property>" disabled/>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">居住年限:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="addrYears" class="form-control" value="<s:property value="#request.loanInfo.clientInfoID.addrYears"></s:property>" disabled/>
												
											</div>
										</div>
										
									</div>
									
									
									<!--最后提交部分-->
									<div class="row" >
										<div class="form-group">
											<button class="btn btn-info col-md-1" type="submit" style="margin-left: 80%;margin-top: 30px;margin-right: 10px;">编辑</button>	
											<button class="btn btn-info col-md-1" type="submit" style="margin-top: 30px;">提交申请</button>
										</div>
									</div>
								</form>
									<!--
                                    	作者：offline
                                    	时间：2018-11-13
                                    	描述：贷款信息第一行
									-->
									<hr style="margin-top:30px"/>
									
									<div class="row">
										<div class="form-group">
											<label >贷款信息</label>
										</div>
										<s:hidden name="loanId" id="id" value="%{loanId}"></s:hidden>
										<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款类型:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="loanType" class="form-control" value="<s:property value="#request.loanInfo.loanType"></s:property>" disabled />
											</div>
										</div>
	
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款种类:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="loanClass" class="form-control" value="<s:property value="#request.loanInfo.loanClass"></s:property>" disabled />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">担保方式:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="guranteeMethod" class="form-control" value="<s:property value="#request.loanInfo.guranteeMethod"></s:property>" disabled/>
											</div>
										</div>
									</div>

									<!--
                                    	作者：offline
                                    	时间：2018-11-13
                                    	描述：第二行
									-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right; margin-top: 15px;">贷款用途:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="loanUse" class="form-control"  value="<s:property value="#request.loanInfo.loanUse"></s:property>" disabled />
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">申请金额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="appliAmount" class="form-control"  value="<s:property value="#request.loanInfo.appliAmount"></s:property>" disabled />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">贷款期限:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="loanTerm" class="form-control"  value="<s:property value="#request.loanInfo.loanTerm"></s:property>" disabled />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">最大分期额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="maxInstallment" class="form-control"  value="<s:property value="#request.loanInfo.maxInstallment"></s:property>" disabled />

											</div>
										</div>
									</div>

									<!--
                                    	作者：offline
                                    	时间：2018-11-13
                                    	描述：第三行
                                    -->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 10px;">申请理由:</label>
											<div class="col-md-11 " style="padding-left: 0px;margin-top: 10px;">
												<textarea name="appliReason" class="form-control" cols="30" rows="8" disabled><s:property value="#request.loanInfo.appliReason"/></textarea>
											</div>
										</div>										
									</div>									
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery.cookie.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/function.js" type="text/javascript"></script>
	
	</body>

</html>