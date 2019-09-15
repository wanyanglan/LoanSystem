<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!-- 引入el标识所需要的标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>公司信息查询</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body style="background: #f6f6f6;">
<div class="container company-block">

    <c:if test="${company == null}">
        <div class="row">
            <div class="col-lg-12">
                <div class="no-result">
                    <div class="no-result-container deep-search-detail">
                        <img class="no-result-left" src="${pageContext.request.contextPath}/microcredit/img/watch-no-data.png" width="230px" alt="">
                        <div class="no-result-right">
                            <div class="no-result-title">抱歉，没有找到相关企业！</div>
                            <div class="steps">
                                <div class="step">输入更准确的关键词，重新搜索</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${company != null}">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="name">${company.name }</h1>
                <div class="detail "><!--联系方式等-->
                    <div class="f0">
                        <div class="in-block">
                            <span>网址：</span>
                            <span>${company.link }</span>
                        </div>
                        <div class="in-block">
                            <span>地址：</span>
                            <span>${company.address }</span>
                        </div>
                    </div>
                    <div class="f0">
                        <div class="summary">
                            <div style="max-height:120px;overflow-y: auto;overflow-x: auto;" class="auto-folder">
                                <div>
                                    <span>简介：</span>
                                    <span>${company.desc }</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row" style="margin-top: 20px">
        <div class="col-lg-12">
            <table class="table -striped-col">
                <tbody>
                <tr>
                    <td>注册资本</td>
                    <td>${company.capital }</td>
                </tr>
                <tr>
                    <td>经营状态</td>
                    <td>${company.state }</td>
                    <td>工商注册号</td>
                    <td>${company.registerNum }</td>
                </tr>
                <tr>
                    <td>统一社会信用代码</td>
                    <td>${company.code }</td>
                    <td>组织机构代码</td>
                    <td>${company.mechanism }</td>
                </tr>
                <tr>
                    <td width="144px">纳税人识别号</td>
                    <td width="308px">${company.taxpayer }</td>
                    <td width="150px">公司类型</td>
                    <td colspan="2" width="301px">${company.type }</td>
                </tr>
                <tr>
                    <td>营业期限</td>
                    <td><span>${company.term }</span></td>
                    <td>行业</td>
                    <td colspan="2">${company.industry }</td>
                </tr>
                <tr>
                    <td>纳税人资质</td>
                    <td>${company.qualifications }</td>
                    <td>核准日期</td>
                    <td colspan="2">${company.date }</td>
                </tr>
                <tr>
                    <td>实缴资本</td>
                    <td>${company.paid }</td>
                    <td>人员规模</td>
                    <td colspan="2">${company.scale }</td>
                </tr>
                <tr>
                    <td>参保人数</td>
                    <td>${company.number }</td>
                    <td>登记机关</td>
                    <td colspan="2">${company.authority }</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    </c:if>
</div>
</body>
</html>