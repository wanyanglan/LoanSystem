<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
		<title>用户中心</title>
		<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
		<link title="" href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
		<link title="blue" href="${pageContext.request.contextPath}/microcredit/css/dermadefault.css" rel="stylesheet" type="text/css" />
		<link title="green" href="${pageContext.request.contextPath}/microcredit/css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link title="orange" href="${pageContext.request.contextPath}/microcredit/css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled" />
		<link href="${pageContext.request.contextPath}/microcredit/css/templatecss.css" rel="stylesheet" title="" type="text/css" />
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/script/jquery.cookie.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
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
						<ul class="navContent" style="display:block">
							<li class="active">
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
						<ul class="navContent" style="display:none">
							<li>
								<div class="showtitle" style="width:100px;"><img src="${pageContext.request.contextPath}/microcredit/img/leftimg.png" />个人申请列表</div>
								<a href="client_loanPersonList"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">个人申请列表</span></a>
							</li>
							
							<li>
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
					<div class="manage account-manage info-center">
						<div class="page-header">
							<div class="pull-left">
								<h4>会员中心</h4>
							</div>
							<div class="pull-right">
		                        <button type="button" class="btn btn-mystyle btn-sm">搜索</button>
		                        <button type="button" class="btn btn-mystyle btn-sm">返回</button>
		                    </div>
						</div>
						
						<div class="manage-record">
							<h6 class="margin-big-top"></h6>
							<div class="clearfix"></div>
							<div class="table-margin">
								<div class="col-lg-12" style="margin-bottom: 20px;border: solid 1px #D6D6D6;">
									<!-- <form action="/list_searchResult" method="post"> -->
									<s:form action="/list_searchResult" method="get">
										<div class="row" style="margin-top: 5px;">
											<div class="form-group">
												<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">客户:</label>
												<div class="col-md-3" style="padding-left: 0px;">
													<input type="text" name="firstCondition" class="form-control" placeholder="姓名、电话或证件号码" />
												</div>
											</div>
	
											<div class="form-group">
												<label class="col-md-1 conntrol-label" style="text-align: right;margin-top: 5px;">手机号码:</label>
												<div class="col-md-3" style="padding-left: 0px;">
													<input type="text" name="phoneNum" class="form-control"  />
												</div>
											</div>
											
										</div>
										<!--最后提交部分-->
										<div class="row" style="margin-bottom: 20px;margin-top: 20px;">
											<div class="form-group">
												<button class="btn btn-info col-md-1" type="submit" style="margin-left: 75%;margin-right: 20px;" id="editId">搜索</button>	
												<button class="btn btn-danger col-md-1" type="reset" >重置</button>
											</div>
										</div>
									</s:form>
									<!-- </form> -->
								</div>
							
								<table class="table table-bordered table-header" style="text-align: center;font-size: 15px;">
									<thead>
										<tr>
											<td class="w20">客户信息</td>
											<td class="w10">证件类型</td>	
											<td class="w20">证件信息</td>							
											<td class="w15">手机号码</td>
											<td class="w15">客户经理</td>
											<td class="w20">操作</td>
										</tr>
									</thead>
									<tbody>
										<s:if test="#request.privateList  != null ">
											<s:iterator var="privateInfo" value="#request.privateList" status="st">
												<tr>
													<td>
													<s:property value="#privateInfo[1]" />&nbsp;&nbsp;&nbsp;
													<s:property value="#privateInfo[2]"/>&nbsp;&nbsp;&nbsp;
													<s:property value="#privateInfo[3]" />岁
													</td>
													<td><s:property value="#privateInfo[4]" /></td>
													<td><s:property value="#privateInfo[5]" /></td>
													<td><s:property value="#privateInfo[6]" /></td>
													<td><s:property value="#privateInfo[8]" /></td>
													<td>
														<a href="#" style="color: blue;">详情</a>&nbsp;&nbsp;
														<a href="#" style="color: blue;">编辑</a>&nbsp;&nbsp;
														<a href="#" style="color: blue;">删除</a>
													</td>											
													
												</tr>
											</s:iterator>
										</s:if>
										<tfoot>
				                          	<tr>
					                            <td colspan="6">
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
									</tbody>
								</table>
							</div>

						</div>
						
						
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="script/function.js"></script>
	</body>

</html>