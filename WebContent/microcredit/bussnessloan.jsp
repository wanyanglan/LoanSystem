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
								<a href="accountInfo.jsp"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">对私管理</span></a>
							</li>
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />对公管理</div>
								<a href="blacklist.jsp"><span class="sublist-icon glyphicon glyphicon-ban-circle"></span><span class="sub-title">对公管理</span></a>
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
								<s:form action="/company_insert" method="post" theme="simple">								
									<!--
	                                    	作者：offline
	                                    	时间：2018-11-13
	                                    	描述：第一行
										-->
									
									<div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label for="inputSex" style="margin-top: 20px;">贷款信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款类型:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="loanApplyInfo.loanType" class="form-control" required>
													<option value="新增贷款" >新增贷款</option>
													<option value="收回再贷" >收回再贷</option>
													<option value="借新还旧" >借新还旧</option>
													<option value="其他" >其他</option>
												</select>
											</div>
										</div>
	
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款种类:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="loanApplyInfo.loanClass" class="form-control" required>
													<option value="住房贷款">住房贷款</option>
													<option value="汽车消费贷款">汽车消费贷款</option>
													<option value="耐用消费品贷款">耐用消费品贷款</option>
													<option value="经营性贷款">经营性贷款</option>
													<option value="有价单证质押贷款">有价单证质押贷款</option>
													<option value="小额信用贷款">小额信用贷款</option>
													<option value="住宅抵押贷款">住宅抵押贷款</option>
													<option value="非住宅抵押贷款">非住宅抵押贷款</option>
													<option value="其他">其他</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">担保方式:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="loanApplyInfo.guranteeMethod" class="form-control" required>
													<option value="保证">保证</option>
													<option value="抵押">抵押</option>
													<option value="质押">质押</option>
												</select>
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
												<input type="text" name="loanApplyInfo.loanUse" class="form-control" placeholder="实际用途" required />
											</div>
										</div>
	
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">申请金额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="loanApplyInfo.applyAmount" class="form-control" placeholder="填写整数金额" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">贷款期限:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="loanApplyInfo.loanTerm" class="form-control" placeholder="期限（月）" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">最大分期额:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="loanApplyInfo.maxInstallment" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
									
									<!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：公司基本信息
                                   -->
									<!--公司信息第一行-->
									<div class="row" style="margin-top: -20px;">
										<div class="form-group">
											<label style="margin-top: 15px;">基本信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户名称:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="companyInfo.custName" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户别名:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="companyInfo.custAlias" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">单位性质:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="companyInfo.conpamyProperty" class="form-control" required >
													<option value="国家行政企业">国家行政企业</option>
													<option value="公私合作企业">公私合作企业</option>
													<option value="中外合资企业">中外合资企业</option>
													<option value="社会组织机构">社会组织机构</option>
													<option value="国际组织机构">国际组织机构</option>
													<option value="外资企业">外资企业</option>
													<option value="私营企业">私营企业</option>
													<option value="集体企业">集体企业</option>
													<option value="国防军事企业">国防军事企业</option>
													
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">所有者性质:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="companyInfo.ownerProperty" class="form-control" required >
													<option value="1">item1</option>
													<option value="2">item2</option>
													<option value="3">item3</option>
												</select>
											</div>
										</div>
									</div>
	
									<!--公司信息第2行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">经济类型:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<select id="inputSex" name="companyInfo.economicType" class="form-control" required >
													<option value="国有经济">国有经济</option>
													<option value="集体经济">集体经济</option>
													<option value="私营经济">私营经济</option>
													<option value="个体经济">个体经济</option>
													<option value="联营经济">联营经济</option>
													<option value="股份制">股份制</option>
													<option value="外商投资">外商投资</option>
													<option value="港澳台投资">港澳台投资</option>
													<option value="其它经济">其它经济</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">信用等级:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<select id="inputSex" name="companyInfo.creditGrage" class="form-control" required >
													<option value="AAA">AAA</option>
													<option value="AA">AA</option>
													<option value="A">A</option>
													<option value="BBB">BBB</option>
													<option value="BB">BB</option>
													<option value="B">B</option>
													<option value="CCC">CCC</option>
													<option value="CC">CC</option>
													<option value="C">C</option>
													
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">企业规模:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.companyScale" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">所属行业:</label>
											<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
												<select id="inputSex" name="companyInfo.industry" class="form-control" required required >
													<option value="农、林、牧、渔业">农、林、牧、渔业</option>
													<option value="采矿业">采矿业</option>
													<option value="制造业">制造业</option>
													<option value="电力、热力、燃气及水的生产和供应业">电力、热力、燃气及水的生产和供应业</option>
													<option value="环境和公共设施管理业">环境和公共设施管理业</option>
													<option value="建筑业">建筑业</option>
													<option value="交通运输、仓储业和邮政业">交通运输、仓储业和邮政业</option>
													<option value="信息传输、计算机服务和软件业">信息传输、计算机服务和软件业</option>
													<option value="批发和零售业">批发和零售业</option>
													<option value="住宿、餐饮业">住宿、餐饮业</option>
													<option value="金融、保险业">金融、保险业</option>
													<option value="房地产业">房地产业</option>
													<option value="租赁和商务服务业">租赁和商务服务业</option>
													<option value="科学研究、技术服务和地质勘查业">科学研究、技术服务和地质勘查业</option>
													<option value="水利、环境和公共设施管理业">水利、环境和公共设施管理业</option>
													<option value="居民服务和其他服务业">居民服务和其他服务业</option>
													<option value="教育">教育</option>
													<option value="卫生、社会保障和社会服务业">卫生、社会保障和社会服务业</option>
													<option value="文化、体育、娱乐业">文化、体育、娱乐业</option>
													<option value="其它">其它</option>
												
												</select>
											</div>
										</div>
									</div>
									
									<!--公司信息第3行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位电话:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.companyPhone" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位传真:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.companyFax" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">电子邮件:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.companyEmail" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位邮编:</label>
											<div class="col-sm-2" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.companyPostcode" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
									<!--公司信息第4行-->
                                    <div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">单位地址:</label>
											<div class="col-md-5" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.conpamyAddr" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">经营地址:</label>
											<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
												<input type="text" name="companyInfo.businessAddr" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
                                    <!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：法人信息开始行
                                    -->
                                    <div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label style="margin-top: 15px;">法人信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">法人姓名:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="legalPersonInfo.custType" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">联系电话:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="legalPersonInfo.phoneNum" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">证件类型:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<select id="inputSex" name="legalPersonInfo.identifyType" class="form-control" required>
													<option value="居民身份证">居民身份证</option>
													<option value="军官证">军官证</option>
													<option value="其他">其他</option>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">证件号码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="legalPersonInfo.identifyNum" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
									
									<!--
                                    	作者：offline
                                    	时间：2018-12-01
                                    	描述：经营信息
                                    -->
									<!--经营信息第一行-->
									<div class="row" style="margin-top: -15px;">
										<div class="form-group">
											<label style="margin-top: 15px;">经营信息</label>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">营业执照号:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.licenseNum" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">营业执照到期日:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.licenseDueDate" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">国税登记号:</label>
											<div class="col-md-2" style="padding-left: 0px;">
												
												<input type="text" name="businessInfo.nationalTaxNum" class="form-control" placeholder="not blank" required />
												
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">地税登记号:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.localTaxNum" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
									<!--经营信息第2行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">组织机构代码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.organizationCode" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">开户许可证:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.openPermit" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">企业代码:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.companyCode" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">注册资本:</label>
											<div class="col-sm-2" style="padding-left: 0px;">
												<input type="text" name="businessInfo.registerCapital" class="form-control" placeholder="not blank" required />
											</div>
										</div>
									</div>
									<!--经营信息第3行-->
									<div class="row">
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">开户许可证到期日:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												<input type="text" name="businessInfo.openDueDate" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">外币基本账户开户行:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												<input type="text" name="businessInfo.foreigrAccount" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-1 conntrol-label" style="text-align: right;">本币基本账户开户行:</label>
											<div class="col-sm-3" style="padding-left: 0px;">
												<input type="text" name="businessInfo.localAccount" class="form-control" placeholder="not blank" required />
											</div>
										</div>
										
									</div>
	
									<!--最后提交部分-->
									<div class="row" style="margin-top: 25px;">
										<div class="form-group">
											<button class="btn btn-info col-md-2" type="submit" style="margin-right: 20px;">提交申请</button>
											<button class="btn btn-danger col-md-2" type="reset">撤销</button>
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
	</body>

</html>