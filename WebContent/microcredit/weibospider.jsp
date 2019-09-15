<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="DbUtil.DbUtil"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
<%@ page import="njupt.microcredit.entity.UserInfo" %>
<%@ page import="DbUtil.DbUtil" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no" />
	<title>显示申请人员</title>
	<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
	<link title="" href="${pageContext.request.contextPath}/microcredit/css/weibospider.css" rel="stylesheet" type="text/css" />
	<style>
		.search-condition{
	    width:1200px;
	    margin: 0 auto;
	    margin-top:20px;
	}
	.search-condition-title{
	    background:#CCE8EB;
	    height:40px;
	    line-height:40px;
	    border:rgba(184, 181, 181, 0.562) solid 1px;
	    padding-left:20px;
	    color: #666;
	    font-size:25px;
	    text-align:center;
	    font-weight: bold;
	}
	.search-condition-content{
		padding-top:10px;
	    height:70px;
	    line-height:40px;
	    border:rgba(184, 181, 181, 0.562) solid 1px;
	    padding-bottom:10px;
	}
	.search-condition-content span:first-child{
	    padding-left:20px;
	}
	input{
	    margin-right:50px;
	}
	.info-table{
	    width:1200px;
	    margin: 0 auto;
	    border-collapse: collapse;
	    margin:20px;
	    white-space: nowrap;
	}
	.info-table th,.info-table td{
	    border: 1px solid #cad9ea;
	    color: #666;
	    height: 30px;
	}
	.info-table th{
	    text-align: center;
	}
	.info-table-title th{
	    background-color: #CCE8EB;
	    text-align: center;
	    width: 150px;
	}
	.info-table tr:nth-child(odd)
	{
	    background: #fff;
	}
	.info-table tr:nth-child(even)
	{
	    background: #F5FAFA;
	}
	</style>
	</style>
	<script type="text/javascript">
		function JudgeSql(){
			 var sql1 = "select * from t_userinfo";
			var username = document.getElementById("username").value;
			var address = document.getElementById("address").value;
			var gender = document.getElementById("gender").value;
			console.log('username='+ username + '' +address );
			if((null==username&&null==address&&null==gender)||(username==""&&address==""&&gender=="")){
				sql1="select * from t_userinfo"
			}else if((null!=username&&null==address&&null==gender) || (username!=""&&address==""&&gender=="")){
				sql1="select * from t_userinfo where username like'%" + username + "%'";
			}else if(null!=username&&null!=address&&null==gender){
				sql1="select * from t_userinfo where username like'%" + username + "%' and address like'%" + address + "%'";
			}else if(null!=username&&null!=address&&null!=gender){
				sql1="select * from t_userinfo where username like'%" + username + "%' and address like'%" + address + "%' and gender ="+gender;
			}else if(null==username&&null!=address&&null!=gender){
				sql1="select * from t_userinfo where address like'%" + address + "%' and gender ="+gender;
			}else if(null!=username&&null==address&&null!=gender){
				sql="select * from t_userinfo where username like'%" + username + "%' and gender ="+gender;
			}else if(null==username&&null!=address&&null==gender){
				sql1="select * from t_userinfo where address like'%" + address + "%'";
			}else if(null==username&&null==address&&null!=gender){
				sql1="select * from t_userinfo where gender ="+gender;
			}
			console.log(sql1);
			document.getElementById("sql").value = sql1;
			return sql1;
		}
		
	</script>		

</head>

<body onload="JudgeSql()">
	<!--
	    	作者：offline
	    	时间：2019-5-15
	    	描述：微博爬虫页面
        -->

	<div id="spider">
		<div class="search-condition">
			<div class="search-condition-title" size="30px">查询微博个人信息</div>
			<form class="search-condition-content" method="get" action="${pageContext.request.contextPath}/microcredit/weibospider.jsp">
				<span>昵称：</span> 
				<input type="text" class="" id="username" name="username" value=""/> 
				<span>所在地:</span>
				<input type="text" class="" id="address" name="address" value=""/> 
				<span>性别:</span> 
				<input type="text" class="" id="gender" name="gender" value=""/>
				<!-- 隐藏的输入框用来存放sql语句 -->
				<input id="sql" type="hidden" name="sql" />
				<input id="search" type="submit" value="查询" onclick="JudgeSql()"/>
			</form>
		</div>
		<table id="userinfo" class="info-table" style="margin: 0 auto;">
				<tr>
					<th>昵称</th>
					<th>所在地</th>
					<th>性别</th>
					<th>性取向</th>
					<th>感情状况</th>
					<th>生日</th>
					<th>大学</th>
					<th>高中</th>
					<th>血型</th>
					<th>简介</th>
					<th>注册时间</th>
					<th>邮箱</th>
					<th>QQ</th>
					<th>标签</th>
				</tr>
			<%
			String sql = request.getParameter("sql");
			System.out.println(sql);
			DbUtil db = new DbUtil();
	        List<UserInfo> user=db.getUserinfo(sql);			
			for(UserInfo attribute:user) {
				out.print("<tr><td id=tid>"+attribute.getUsername()+"</td><td>"+attribute.getAddress()+"</td><td>"+
			attribute.getGender()+"</td><td>"+attribute.getSexual()+"</td><td>"+attribute.getRelationship()+"</td><td>"+
			attribute.getBirthday()+"</td><td>"+attribute.getCollege()+"</td><td>"+attribute.getBlood()+"</td><td>"+
			attribute.getProfile()+"</td><td>"+attribute.getRegistertime()+"</td><td>"+attribute.getEmail()+"</td><td>"+
			attribute.getQq()+"</td><td>"+attribute.getTag()+"</td></tr>");
			};
			%>
		</table>



	</div>
	
	<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/microcredit/script/jquery.cookie.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/microcredit/script/function.js" type="text/javascript"></script>
</body>

</html>