<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
	<title>贷款申请</title>
	<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" />
	<link title="" href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
	<link title="blue" href="${pageContext.request.contextPath}/microcredit/css/dermadefault.css" rel="stylesheet" type="text/css" />
	<link title="green" href="${pageContext.request.contextPath}/microcredit/css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled" />
	<link title="orange" href="${pageContext.request.contextPath}/microcredit/css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled" />
	<link href="${pageContext.request.contextPath}/microcredit/css/templatecss.css" rel="stylesheet" title="" type="text/css" />
	<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />

	
	
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
							<li class="active">
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />个人申请列表</div>
								<a href="client_loanPersonList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">个人申请列表</span></a>
							</li>
							
							<li>
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
		<!--
            	描述：右侧正文部分
            -->
		<div class="right-product right-full">
			<div class="center-back right-back">
				<div class="container-fluid">
					<div class="info-center">
						<div class="page-header">
							<div class="pull-left">
								<h4>个人贷款申请信息</h4>
							</div>
						</div>
						<div class="col-lg-12">
							<s:form action="/client_save" method="post" theme="simple">
								
								<!--customerInfoService
                                    	作者：offline
                                    	时间：2018-11-13
                                    	描述：第一行
									-->
									
								<div class="row" style="margin-top: -20px;">
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
											<input type="text" name="loanApplyInfo.loanUse" class="form-control" placeholder="实际用途" required/>
										</div>
									</div>

									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">申请金额:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="loanApplyInfo.applyAmount" class="form-control" placeholder="填写整数金额" required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">贷款期限:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="loanApplyInfo.loanTerm" class="form-control" placeholder="期限（月）" required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">最大分期额:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="loanApplyInfo.maxInstallment" class="form-control" placeholder="每月最大还款额" required/>
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
											<textarea name="loanApplyInfo.appliReason" class="form-control" cols="30" rows="8" ></textarea>
										</div>
									</div>

									
								</div>

								<!--个人信息第一行-->
								<div class="row" style="margin-top: -15px;">
									<div class="form-group">
										<label style="margin-top: 15px;">个人信息</label>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">客户姓名:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.custName" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">性别:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<select id="inputSex" name="customerInfo.custGender" class="form-control" required>
												<option value="男">男</option>
												<option value="女">女</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">年龄:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.custAge" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group ">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">出生日期:</label>
										<div class="date form_date col-md-2" data-date="" date-date-formate="dd MM yyyy"  data-link-format="yyyy-mm-dd" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.clientBirthday" class="form-control" placeholder=" " style="background-color: white;" readonly />
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-th"></i></span>
										</div>
									</div>
								</div>
								<!--个人信息第3行-->
								<div class="row">
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">证件类型:</label>
										<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
											<select id="inputSex" name="customerInfo.identifyType" class="form-control" required>
												<option value="居民身份证">居民身份证</option>
												<option value="士兵证">士兵证</option>
												<option value="军官证">军官证</option>
												<option value="其他">其他</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">证件号码:</label>
										<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.identifyNum" class="form-control" placeholder=" " required/>
										</div>
									</div>
								</div>

								<!--个人信息第2行-->
								<div class="row">
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">联系电话:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.phoneNum" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">电子邮箱:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.custEmail" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">户籍:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.custCensus" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">学历:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<select id="inputSex" name="customerInfo.custEducation" class="form-control" required>
												<option value="小学">小学</option>
												<option value="初中">初中</option>
												<option value="中专/高中">中专/高中</option>
												<option value="大专">大专</option>
												<option value="本科">本科</option>
												<option value="硕士研究生">硕士研究生</option>
												<option value="博士研究生">博士研究生</option>
											</select>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">婚姻状况:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<select id="inputSex" name="customerInfo.maritalStatus" class="form-control" required>
												<option value="未婚">未婚</option>
												<option value="已婚">已婚</option>
												<option value="丧偶">丧偶</option>
												<option value="离婚">离婚</option>
											</select>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">家庭地址:</label>
										<div class="col-sm-5" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.custAddr" class="form-control" placeholder=" " required/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 15px;">居住年限:</label>
										<div class="col-md-2" style="padding-left: 0px;margin-top: 10px;">
											<input type="text" name="customerInfo.addrYears" class="form-control" placeholder="现址居住时间" required/>
										</div>
									</div>
								</div>								


								<!--最后提交部分-->
								<div class="row" style="margin-top: 30px;">
									<div class="form-group">
										<button class="btn btn-info col-md-3" type="submit" style="margin-right: 20px;">提交申请</button>
										<button class="btn btn-danger col-md-3" type="reset">撤销</button>
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
	<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap-datetimepicker.fr.js"></script>
	<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
	        language:  'fr',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			minView: 2,
			forceParse: 0
	    });
	</script> 

</body>

</html>