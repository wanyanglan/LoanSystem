<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
							<li >
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />个人申请列表</div>
								<a href="client_loanPersonList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">个人申请列表</span></a>
							</li>
							
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
			<div class="right-product view-product right-full">
				<div class="container-fluid">
					<div class="message-manage info-center">
						<div class="manage-detail">
							<div class="manage-detail-con clearfix">
								<a class="custom" href="company_viewInsert">新建申请</a>
							</div>
						</div>
											
						<div class="manage-record">
							<h6 class="margin-big-top"></h6>
							<div class="clearfix"></div>
							<div class="table-margin">
								<div class="col-lg-12" style="margin-bottom: 20px;border: solid 1px #D6D6D6;">
									<s:form action="/company_loanSearchInfo" method="post">
										<div class="row" style="margin-top: 5px;">
											<div class="form-group">
												<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户类型:</label>
												<div class="col-md-2" style="padding-left: 0px;">
													<select id="inputSex" name="sex" class="form-control" >
													<option value="2">对公客户</option>
												</select>
												</div>
											</div>
		
											<div class="form-group">
												<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户:</label>
												<div class="col-md-2" style="padding-left: 0px;">
													<input type="text" name="companyinfo" class="form-control" placeholder="名称或营业执照" />
												</div>
											</div>	
											<div class="form-group">
												<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">贷款类型:</label>
												<div class="col-md-2" style="padding-left: 0px;">
													<input type="text" name="loantype" class="form-control" />
												</div>
											</div>	
										</div>
										
										<div class="row">
											<div class="form-group col-md-6">
												<label class="col-md-2 conntrol-label" style="text-align: center;margin-top: 5px;margin-left: 5px;">创建时间:</label>
												<div class="form-inline" >
													<input type="text" name="applytime1" class="form-control"  size="22%"/>&nbsp;——&nbsp;
													<input type="text" name="applytime2" class="form-control"  size="22%"/>					
												</div>
											</div>
											<div class="form-group col-md-6" >												
												<button class="btn btn-info col-md-2" type="submit" style="margin-right: 20px;margin-left: 48%;">搜索</button>	
												<button class="btn btn-danger col-md-2" type="reset" >重置</button>											
											</div>
										</div>
																				
									</s:form>
								</div>
								<table class="table table-bordered table-header" style="text-align: center;font-size: 15px;">
									<thead>
										<tr>
											<td class="w20">客户名称</td>
											<td class="w20">营业执照</td>	
											<td class="w15">法人姓名</td>							
											<td class="w10">贷款类型</td>
											<td class="w13">申请金额(元)</td>
											<td class="w15">创建时间</td>
											<td class="w7">操作</td>
										</tr>
									</thead>
									<tbody>
										<s:if test="#request.companyLoan != null">
											<s:iterator var="loanInfo" value="#request.companyLoan" status="st">
												<tr>
													<td><s:property value="#loanInfo[1]" /></td>
													<td><s:property value="#loanInfo[2]" /></td>
													<td><s:property value="#loanInfo[3]" /></td>
													<td><s:property value="#loanInfo[4]" /></td>
													<td><s:property value="#loanInfo[5]" /></td>
													<td><s:date name="#loanInfo[6]" format="yyyy-MM-dd HH:mm"/></td>
													<td><s:a href="company_viewCompanyLoanInfo?loanApplyInfo.loanId=%{#loanInfo[0]}">详情</s:a></td>
												</tr>
											</s:iterator>
										</s:if>
										<s:else>
											<tr>
												<td colspan="7" align="center">对不起，暂时没有企业贷款信息！请先录入</td>
											</tr>
										</s:else>
									</tbody>
									<tfoot>
			                          	<tr>
				                            <td colspan="7">
				                              <div class="pull-right">
				                                  <nav>
				                                      <ul class="pagination">
				                                        <li>
				                                          <a href="#" aria-label="Previous">
				                                            <span aria-hidden="true">&laquo;</span>
				                                          </a>
				                                        </li>
				                                        <li><a href="#">1</a></li>
				                                        <li><a href="#">2</a></li>
				                                        <li><a href="#">3</a></li>
				                                        <li><a href="#">4</a></li>
				                                        <li><a href="#">5</a></li>
				                                        <li>
				                                          <a href="#" aria-label="Next">
				                                            <span aria-hidden="true">&raquo;</span>
				                                          </a>
				                                        </li>
				                                      </ul>
				                                    </nav>
				                              </div>
				                            </td>
			                          	</tr>
				                    </tfoot>
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
		<script src="script/jquery-1.11.1.min.js" type="text/javascript"></script>
		<script src="script/jquery.cookie.js" type="text/javascript"></script>
		<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="script/function.js" type="text/javascript"></script>
	</body>

</html>