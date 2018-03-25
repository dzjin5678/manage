<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="../../picture/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>船舶货物管理</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

    <!-- Canonical SEO -->
    <link rel="canonical" href="https://www.creative-tim.com/product/light-bootstrap-dashboard-pro"/>

    <!--  Social tags      -->
    <meta name="keywords" content="creative tim, html dashboard, html css dashboard, web dashboard, bootstrap dashboard, bootstrap, css3 dashboard, bootstrap admin, light bootstrap dashboard, frontend, responsive bootstrap dashboard">

    <meta name="description" content="Forget about boring dashboards, get an admin template designed to be simple and beautiful.">

    <!-- Schema.org markup for Google+ -->
    <meta itemprop="name" content="Light Bootstrap Dashboard PRO by Creative Tim">
    <meta itemprop="description" content="Forget about boring dashboards, get an admin template designed to be simple and beautiful.">

    <meta itemprop="image" content="http://s3.amazonaws.com/creativetim_bucket/products/34/original/opt_lbd_pro_thumbnail.jpg">
    <!-- Twitter Card data -->

    <meta name="twitter:card" content="product">
    <meta name="twitter:site" content="@creativetim">
    <meta name="twitter:title" content="Light Bootstrap Dashboard PRO by Creative Tim">

    <meta name="twitter:description" content="Forget about boring dashboards, get an admin template designed to be simple and beautiful.">
    <meta name="twitter:creator" content="@creativetim">
    <meta name="twitter:image" content="http://s3.amazonaws.com/creativetim_bucket/products/34/original/opt_lbd_pro_thumbnail.jpg">
    <meta name="twitter:data1" content="Light Bootstrap Dashboard PRO by Creative Tim">
    <meta name="twitter:label1" content="Product Type">
    <meta name="twitter:data2" content="$29">
    <meta name="twitter:label2" content="Price">
    <!-- Open Graph data -->
    <meta property="og:title" content="Light Bootstrap Dashboard PRO by Creative Tim" />
    <meta property="og:type" content="article" />
    <meta property="og:url" content="http://demos.creative-tim.com/light-bootstrap-dashboard-pro/examples/dashboard.html" />
    <meta property="og:image" content="http://s3.amazonaws.com/creativetim_bucket/products/34/original/opt_lbd_pro_thumbnail.jpg"/>
    <meta property="og:description" content="Forget about boring dashboards, get an admin template designed to be simple and beautiful." />
    <meta property="og:site_name" content="Creative Tim" />


    <!-- Bootstrap core CSS     -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" />

    <!--  Light Bootstrap Dashboard core CSS    -->
    <link href="../css/light-bootstrap-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="../css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href='../css/685fd913f1e14aebad0cc9d3713ee469.css' rel='stylesheet' type='text/css'>
    <link href="../css/pe-icon-7-stroke.css" rel="stylesheet" />
    
</head>

<body>

<div class="wrapper">
    <!-- 左侧菜单-->
    <div class="sidebar" data-color="orange" data-image="../../picture/full-screen-image-3.jpg">
        <!--
            Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple"
            Tip 2: you can also add an image using data-image tag
        -->

        <div class="logo">
            <a href="index.html" class="logo-text">
                	管理后台
            </a>
        </div>
        <div class="logo logo-mini">
            
        </div>

        <div class="sidebar-wrapper">
            <div class="user">
                <div class="photo">
                    <img src="../picture/default-avatar.png" />
                </div>
                
            </div>
            
            <ul class="nav">
            				<c:forEach items="${pageList}" var="pg" >
								<li><a href="${pg.pageUrl}">${pg.explains}</a ></li>
							</c:forEach>
            </ul>
            
        </div>
    </div>
    
    <!-- 主面板 -->
    <div class="main-panel">
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                             <div class="header">
                                <div class="row">
                                    <div class="col-md-6">
                                        <h4 class="title">船舶货物管理</h4>
                                    </div>
                                    
                                    <div class="col-md-3" >
                                    <br>
                                    <!-- <a class="btn btn-primary btn-fill" href="/manage/ship_predition/add_ship_forecast.jsp">添加船舶预报信息</a> -->
                            		</div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4"></div>
                                <div class="col-md-4"></div>
                               
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-hover table-striped">

                                    <td><h5>船舶代码</h5></td>
                                    <td><h5>航次编号</h5></td>
                                    <td><h5>进口航次</h5></td>
                                    <td><h5>出口航次</h5></td>
                                    <td><h5>通知编号</h5></td>
                                    <td><h5>所属公司</h5></td>
                                    <td><h5>代理</h5></td>
                                    <td><h5>内外贸</h5></td>
                                    <td><h5>总吨(t)</h5></td>
                                    <td><h5>净重(t)</h5></td>
                                    <td><h5>预计进港时间</h5></td>
                                    <td colspan=2><h5>船舶货物信息</h5></td>
                                    
                                  	<tbody>
										<c:forEach items="${requestScope.list}" var="sfc" >
										<tr>
		                                        <td>${sfc.shipCode}</td>
		                                        <td>${sfc.voyageNumber}</td>
		                                        <td>${sfc.importVoyage}</td>
		                                        <td>${sfc.exportVoyage}</td>
		                                        <td>${sfc.noticeNumber}</td>
		                                        <td>${sfc.affiliatedCompany}</td>
		                                        <td>${sfc.proxy}</td>
		                                        <%-- <td>${sfc.iFTrade}</td> --%>
		                                        <td>
		                                        <c:if test="${sfc.iFTrade == 0 }">
													内贸
												</c:if>
		                                        <c:if test="${sfc.iFTrade == 1 }">
													外贸
												</c:if>
												</td>
		                                        <td>${sfc.grossWeight}</td>
		                                        <td>${sfc.netWeight}</td>
		                                        <%-- <td><fmt:formatDate value="${sfc.expectedArrivalTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
		                                        <td>${sfc.expectedArrivalTime}</td>
		                                        <td><a href="/manage/tack/getGoodsList?page=1&strip=10&forecastId=${sfc.id}">查看</a></td>
		                                        <td><a href="/manage/tack/getAddGoodsPage?forecastId=${sfc.id}">添加</a></td>
		                                </tr>
										</c:forEach>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="box" id="box"></div>
            </div>
        </div>
    </div>

</div>


<div class="cancle"style="height:30px;width:30px;position:absolute;left:270px;display:none;z-index: 100;">
<img src="../images/cha1.png" alt="" />
</div>

</body>

<!--   Core JS Files and PerfectScrollbar library inside jquery.ui   -->
<script src="../js/jquery.min.js" type="text/javascript"></script>
<script src="../js/jquery-ui.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="../css/paging.css">

<!--  Forms Validations Plugin -->
<script src="../js/jquery.validate.min.js"></script>

<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
<script src="../js/moment.min.js"></script>

<!--  Date Time Picker Plugin is included in this js file -->
<script src="../js/bootstrap-datetimepicker.js"></script>

<!--  Select Picker Plugin -->
<script src="../js/bootstrap-selectpicker.js"></script>

<!--  Checkbox, Radio, Switch and Tags Input Plugins -->
<script src="../js/bootstrap-checkbox-radio-switch-tags.js"></script>

<!--  Charts Plugin -->
<script src="../js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="../js/bootstrap-notify.js"></script>

<!-- Sweet Alert 2 plugin -->
<script src="../js/sweetalert2.js"></script>

<!-- Vector Map plugin -->
<script src="../js/jquery-jvectormap.js"></script>

<!--  Google Maps Plugin    -->
<script src="../js/aa743e8f448a4792bad10d201a7080f6.js"></script>

<!-- Wizard Plugin    -->
<script src="../js/jquery.bootstrap.wizard.min.js"></script>

<!--  Bootstrap Table Plugin    -->
<script src="../js/bootstrap-table.js"></script>

<!--  Plugin for DataTables.net  -->
<script src="../js/jquery.datatables.js"></script>

<!--  Full Calendar Plugin    -->
<script src="../js/fullcalendar.min.js"></script>

<!-- Light Bootstrap Dashboard Core javascript and methods -->
<script src="../js/light-bootstrap-dashboard.js"></script>

<!--   Sharrre Library    -->
<script src="../js/jquery.sharrre.js"></script>

<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->
<script src="../js/demo.js"></script>
<script src="../js/pagesJsp.js"></script>
<script src="../js/paging.js"></script>
<script>


	function deleteShipForecasr(id) {
		var r=confirm("删除将无法找回！确定删除？");
    	if (r==true)
    	  {
    		$.ajax({
    	        type: "post",
    	        url: "/manage/ship_forecast/delete",
    	        datatype: "json",
    	        async: false,
    	        data:{
    	            id:id
    	        },
    	        success:function (data) {
    	        	var dat=JSON.parse(data);
    	        		window.location.href="/manage/ship_forecast/list_g?page="+${page}+"&strip=10"; 
    	        	alert("删除成功");
    	        },
    	        error:function(res){
    	            alert("联网失败");
    	        }
    	    })
    	  }
    	else
    	  {
    	  return;
    	  }
		
	}
	
	
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-46172202-1', 'auto');
    ga('send', 'pageview');

    //时间
    $().ready(function(){
        // Init Sliders
        demo.initFormExtendedSliders();
        // Init DatetimePicker
        demo.initFormExtendedDatetimepickers();
    });
    var setTotalCount = ${total};
    $('#box').paging({
        initPageNo: ${page}, // 初始页码
        totalPages: Math.ceil(${total}/10), //总页数
        totalCount: '合计' + setTotalCount + '条数据', // 条目总数
        slideSpeed: 600, // 缓动速度。单位毫秒
        jump: true, //是否支持跳转
        callback: function(page) { // 回调函数
            console.log(page);
	        if(page!=${page}){
	        	window.location.href="/manage/ship_forecast/list_g?page="+page+"&strip=10";
	        }
        }
    })

	</script>
	<style>.message {
		width: 300px;
		height: 150px;
		border: 1px solid #0976B4;
		position: absolute;
		background: #CCCCCC;
		opacity: 0.8;
		text-align: center;
		left: 0px;
		right: 0px;
		display: none;
		z-index: 100;
		border-radius: 5px;
		color:#00BBFF;
	}</style>
	
</html>