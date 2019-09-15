<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
		<title>企业申请</title>
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
							</li >
							
							<li class="active">
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />企业申请列表</div>
								<a href="company_comList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">企业申请列表</span></a>
							</li>
							
							<li >
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
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcreditimg/leftimg.png" />微博信息查询</div>
								<a href="weibospider.jsp"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">微博信息查询</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcreditimg/leftimg.png" />公司信息查询</div>
								<a href="info_viewSearch"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">公司信息查询</span></a>
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
			<!--
            	描述：右侧正文部分
            -->
			<div class="right-product right-full">
				<div class="center-back right-back">
					<div class="container-fluid">
						<div class="info-center">
							<div class="col-lg-12">
								<s:form action="/company_updateCompanyInfo" method="post" theme="simple">								
									<!--
	                                    	作者：offline
	                                    	时间：2018-11-13
	                                    	描述：第一行
										-->
									<s:hidden name="loanApplyInfo.loanId" id="id" value="%{loanApplyInfo.loanId}"></s:hidden>
									<s:hidden name="loanApplyInfo.custType" id="id" value="%{loanApplyInfo.custType}"></s:hidden>
									<s:hidden name="loanApplyInfo.custId" id="id" value="%{loanApplyInfo.custId}"></s:hidden>
									<div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label for="inputSex" style="margin-top: 20px;">贷款信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款类型:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<s:textfield name="loanApplyInfo.loanType" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
	
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款种类:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="loanApplyInfo.loanClass" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">担保方式:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="loanApplyInfo.guranteeMethod" cssClass="form-control" readonly="true"></s:textfield>
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
												<s:textfield name="loanApplyInfo.loanUse" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
	
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">申请金额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="loanApplyInfo.applyAmount" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">贷款期限:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="loanApplyInfo.loanTerm" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">最大分期额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="loanApplyInfo.maxInstallment" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
										<s:hidden name="loanApplyInfo.applyTime" value="%{loanApplyInfo.applyTime}" cssClass="form-control" readonly="true" />
									</div>
									
									<!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：公司基本信息
                                   -->
									<!--公司信息第一行-->
									<s:hidden name="companyInfo.id" id="id" value="%{companyInfo.id}"></s:hidden>
									<s:hidden name="companyInfo.custId" id="id" value="%{companyInfo.custId}"></s:hidden>
									<div class="row" style="margin-top: -20px;">
										<div class="form-group">
											<label style="margin-top: 15px;">基本信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户名称:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="companyInfo.custName" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户别名:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												 
												<s:textfield name="companyInfo.custAlias" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">单位性质:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="companyInfo.conpamyProperty" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">所有者性质:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="companyInfo.ownerProperty" cssClass="form-control" readonly="true"></s:textfield>
											</div>
										</div>
									</div>
	
									<!--公司信息第2行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">经济类型:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.economicType" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">信用等级:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.creditGrage" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">企业规模:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.companyScale" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">所属行业:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.industry" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
									</div>
									
									<!--公司信息第3行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位电话:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.companyPhone" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位传真:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.companyFax" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">电子邮件:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.companyEmail" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位邮编:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.companyPostcode" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
									</div>
									<!--公司信息第4行-->
                                    <div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位地址:</label>
											<div class="col-md-5" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.conpamyAddr" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">经营地址:</label>
											<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
												
												<s:textfield name="companyInfo.businessAddr" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
									</div>
                                    <!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：法人信息开始行
                                    -->
                                    <s:hidden name="legalPersonInfo.id" id="id" value="%{legalPersonInfo.id}"></s:hidden>
                                    <s:hidden name="legalPersonInfo.custId" id="id" value="%{legalPersonInfo.custId}"></s:hidden>
                                    <div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label style="margin-top: 15px;">法人信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">法人姓名:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="legalPersonInfo.custType" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">联系电话:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												
												<s:textfield name="legalPersonInfo.phoneNum" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">证件类型:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="legalPersonInfo.identifyType" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">证件号码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												
												<s:textfield name="legalPersonInfo.identifyNum" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
									</div>
									
									<!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：经营信息
                                    -->
									<!--经营信息第一行-->
									<s:hidden name="businessInfo.id" id="id" value="%{businessInfo.id}"></s:hidden>
									<s:hidden name="businessInfo.custId" id="id" value="%{businessInfo.custId}"></s:hidden>
									<s:hidden name="businessInfo.companyId" id="id" value="%{businessInfo.companyId}"></s:hidden>
									<s:hidden name="businessInfo.legalId" id="id" value="%{businessInfo.legalId}"></s:hidden>
									<div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label style="margin-top: 15px;">经营信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">营业执照号:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<s:textfield name="businessInfo.licenseNum" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">营业执照到期日:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												
												<!-- 回显日期格式 -->																		
												<s:textfield name="businessInfo.licenseDueDate" cssClass="form-control change" required="true" disabled="true">  
												   <s:param name="value"><s:date name="businessInfo.licenseDueDate" format="yyyy-MM-dd"/></s:param>  
												</s:textfield> 
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">国税登记号:</label>
											<div class="col-md-2" style="padding-left: 0px;">
											
												<s:textfield name="businessInfo.nationalTaxNum" cssClass="form-control change"  readonly="true" ></s:textfield>
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">地税登记号:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												
												<s:textfield name="businessInfo.localTaxNum" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
									</div>
									<!--经营信息第2行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">组织机构代码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
											
												<s:textfield name="businessInfo.organizationCode" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">开户许可证:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
											
												<s:textfield name="businessInfo.openPermit" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">企业代码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
							
												<s:textfield name="businessInfo.companyCode" cssClass="form-control change" readonly="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">注册资本:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												
												<s:textfield name="businessInfo.registerCapital" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
									</div>
									<!--经营信息第3行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">开户许可证到期日:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												
												<!-- 回显日期格式 -->																		
												<s:textfield name="businessInfo.openDueDate" cssClass="form-control change" required="true" disabled="true">  
												   <s:param name="value"><s:date name="businessInfo.openDueDate" format="yyyy-MM-dd"/></s:param>  
												</s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">外币基本账户开户行:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												
												<s:textfield name="businessInfo.foreigrAccount" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">本币基本账户开户行:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												<s:textfield name="businessInfo.localAccount" cssClass="form-control change" required="true" disabled="true"></s:textfield>
											</div>
										</div>
										
									</div>
	
									<!--最后提交部分-->
									<!--最后提交部分-->
									<div class="row" >
										<div class="form-group">
											<button class="btn btn-info col-md-1" type="button" style="margin-left: 80%;margin-top: 30px;margin-right: 10px;" id="editId">编辑</button>	
											<button class="btn btn-info col-md-1" type="submit" style="margin-top: 30px;">提交申请</button>
										</div>
									</div>
									
								</s:form>
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
		
		<script type="text/javascript">			
			$("#editId").click(function(){
				$(".change").attr("disabled",false);		
			});
		</script>
	</body>

</html>