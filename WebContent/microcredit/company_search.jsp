<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${pageContext.request.contextPath}/microcredit/bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
	<link title="" href="${pageContext.request.contextPath}/microcredit/css/style.css" rel="stylesheet" type="text/css" />
	<title>公司信息查询</title>
</head>
<body>
<div class="container-fluid banner">
    <div class="banseo">
        <div class="banjz">
            <p>搜 索 一 下 ，你 就 得 到</p>
        </div>
        <form action="info_companyDesc" method="post">
            <input type="text" class="bantxt" id="searchtxt" autocomplete="off" placeholder="输入企业关键字.." onkeyup="search()">
            <input type="hidden" name="commpanyId" value="-1" id="commpanyId">
            <input type="hidden" name="method" value="desc">
            <button class="btn banbutt" type="submit">
                查找企业信息
            </button>
        </form>
        <span class="seoicn" style="color: rgb(176, 190, 197); transition: all 1.5s ease 0s;"><i class="glyphicon glyphicon-search"></i></span>
        <div class="auto_hidden" id="auto" style="margin: 0 auto"></div>
    </div>
    <iframe class="baniframe"  style="height: 100%" sandbox="allow-scripts allow-same-origin" id="mh" src="http://www.jq22.com/js/a9.html"></iframe>
</div>
<script src="${pageContext.request.contextPath}/microcredit/script/jquery-1.11.1.min.js" type="text/javascript"></script>
<script language="javascript">
    var objs = function (id) {
        return "string" == typeof id ? document.getElementById(id) : id;
    };
    var Bind = function(object, fun) {
        return function() {
            return fun.apply(object, arguments);
        }
    };
    function AutoComplete(obj,autoObj){
        this.obj=objs(obj);        //输入框
        this.autoObj=objs(autoObj);//DIV的根节点
        this.index=-1;          //当前选中的DIV的索引
        this.search_value="";   //保存当前搜索的字符
    }
    AutoComplete.prototype={
        //初始化DIV的位置
        init: function(){
            this.autoObj.style.left = this.obj.offsetLeft + "px";
            this.autoObj.style.top  = this.obj.offsetTop + this.obj.offsetHeight + "px";
            this.autoObj.style.width= this.obj.offsetWidth - 2 + "px";//减去边框的长度2px
        },
        //删除自动完成需要的所有DIV
        deleteDIV: function(){
            while(this.autoObj.hasChildNodes()){
                this.autoObj.removeChild(this.autoObj.firstChild);
            }
            this.autoObj.className="auto_hidden";
        },
        //设置值
        setValue: function(_this){

            return function(){
                $('#commpanyId').val(this.commpanyId);
                _this.obj.value = this.seq;
                _this.autoObj.className="auto_hidden";
            }
        },
        //模拟鼠标移动至DIV时，DIV高亮
        autoOnmouseover: function(_this,_div_index){
            return function(){
                _this.index=_div_index;
                var length = _this.autoObj.children.length;
                for(var j=0;j<length;j++){
                    if(j!=_this.index ){
                        _this.autoObj.childNodes[j].className='auto_onmouseout';
                    }else{
                        _this.autoObj.childNodes[j].className='auto_onmouseover';
                    }
                }
            }
        },
        //更改classname
        changeClassname: function(length){
            for(var i=0;i<length;i++){
                if(i!=this.index ){
                    this.autoObj.childNodes[i].className='auto_onmouseout';
                }else{
                    this.autoObj.childNodes[i].className='auto_onmouseover';
                    this.obj.value=this.autoObj.childNodes[i].seq;
                }
            }
        }
        ,
        //响应键盘
        pressKey: function(event){
            var length = this.autoObj.children.length;
            //光标键"↓"
            if(event.keyCode==40){
                ++this.index;
                if(this.index>length){
                    this.index=0;
                }else if(this.index==length){
                    this.obj.value=this.search_value;
                }
                this.changeClassname(length);
            }
            //光标键"↑"
            else if(event.keyCode==38){
                this.index--;
                if(this.index<-1){
                    this.index=length - 1;
                }else if(this.index==-1){
                    this.obj.value=this.search_value;
                }
                this.changeClassname(length);
            }
            //回车键
            else if(event.keyCode==13){
                this.autoObj.className="auto_hidden";
                this.index=-1;
            }else{
                this.index=-1;
            }
        },
        //程序入口
        start: function(event, datas){
            if(event.keyCode!=13&&event.keyCode!=38&&event.keyCode!=40){
                this.init();
                this.deleteDIV();
                this.search_value=this.obj.value;
                var valueArr = datas;
                if(this.obj.value.replace(/(^\s*)|(\s*$)/g,'')==""){ return; }//值为空，退出
                var div_index=0;//记录创建的DIV的索引
                for(var i=0;i<valueArr.length;i++){
                    var div = document.createElement("div");
                    div.className="auto_onmouseout";
                    div.seq = valueArr[i].name;
                    div.commpanyId = valueArr[i].id;
                    div.onclick = this.setValue(this);
                    div.onmouseover = this.autoOnmouseover(this,div_index);
                    div.innerHTML = datas[i].name;
                    this.autoObj.appendChild(div);
                    this.autoObj.className = "auto_show";
                    div_index++;
                }
            }
            this.pressKey(event);
            window.onresize=Bind(this,function(){this.init();});
        }
    }
</script>
<script>
    var autoComplete = new AutoComplete('searchtxt', 'auto');
    function search() {
        var key = $('#searchtxt').val();
        $.ajax({
            url: 'info_companySearch',
            type: 'get',
            data: {"key": key},
            dataType: "json",
            success: function (data) {
                if (data.state === "ok") {
                    autoComplete.start(event, data.data);
                }
            },
            error: function (data) {
            }
        });
    }
</script>
</body>
</html>