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
    <title>修改船舶动态信息</title>

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
  <div class="main-panel">
        <div class="content">
            <div class="container-fluid">
                 <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card" style="height:1300px">
                            <div class="header">
                                <legend>修改船舶动态信息</legend>
                            </div>
                            <div class="content">
                                <form method="post" action="/manage/ship_dynamic/update" accept-charset="UTF-8" onsubmit="document.charset='UTF-8'" class="form-horizontal">

                                    <fieldset>
                                        <input name="id" type="hidden" value="${requestScope.shipDynamic.id }"></input> 
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">船舶预报ID</label>
                                            <div class="col-sm-6">
                                                <input type="number" name="shipForecastId" class="form-control" id="shipForecastId" value="${requestScope.shipDynamic.shipForecastId }" readonly="readonly">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">航次编号</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="voyageNumber" class="form-control" id="voyageNumber" value="${requestScope.shipDynamic.voyageNumber }">
                                            </div>
                                        </div>
                                        
                                       	<div class="form-group">
                                            <label class="col-sm-3 control-label">抵达锚地</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="arriveAnchorage" class="form-control" id="arriveAnchorage" value="${requestScope.shipDynamic.arriveAnchorage }" >
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">进港时间</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="entryTime" class="form-control datetimepicker" id="entryTime" value="${requestScope.shipDynamic.entryTime }" required="required">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">出港时间</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="departureTime" class="form-control datetimepicker" id="departureTime" value="${requestScope.shipDynamic.departureTime }" required="required">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">进港/出港</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="entryDeparture" class="form-control" id="entryDeparture" value="${requestScope.shipDynamic.entryDeparture }"> --%>
                                                <select name="entryDeparture" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue" >
	                                                <option value="0" <c:if test="${'0' eq requestScope.shipDynamic.entryDeparture }">selected</c:if> >进港</option>
	                                                <option value="1" <c:if test="${'1' eq requestScope.shipDynamic.entryDeparture }">selected</c:if> >出港</option>
	                                            </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">首缆上岸时间</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="firstCableTime" class="form-control datetimepicker" id="firstCableTime" value="${requestScope.shipDynamic.firstCableTime }" required="required">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">靠泊完毕时间</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="berthingTime" class="form-control datetimepicker" id="berthingTime" value="${requestScope.shipDynamic.berthingTime }" required="required">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">装/卸</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="loadUnload" class="form-control" id="loadUnload" value="${requestScope.shipDynamic.loadUnload }"> --%>
                                                <select name="loadUnload" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue" >
	                                                <option value="0" <c:if test="${'0' eq requestScope.shipDynamic.loadUnload }">selected</c:if> >装货</option>
	                                                <option value="1" <c:if test="${'1' eq requestScope.shipDynamic.loadUnload }">selected</c:if> >卸货</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">疏运方式</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="transportMode" class="form-control" id="transportMode" value="${requestScope.shipDynamic.transportMode }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">上一港</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="lastPort" class="form-control" id="lastPort" value="${requestScope.shipDynamic.lastPort }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">下一港</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="nextPort" class="form-control" id="nextPort" value="${requestScope.shipDynamic.nextPort }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">装卸类别</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="loadUnloadCategory" class="form-control" id="loadUnloadCategory" value="${requestScope.shipDynamic.loadUnloadCategory }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">库区</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="reservoirArea" class="form-control" id="reservoirArea" value="${requestScope.shipDynamic.reservoirArea }"> --%>
                                                <select name="reservoirArea" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue">
                                                <c:forEach items="${StoragecodeList}" var="sc" >
													<option value="${sc.storageName }" <c:if test="${sc.storageName eq requestScope.shipDynamic.reservoirArea }">selected</c:if> >${sc.storageName }</option>
												</c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">码头</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="wharf" class="form-control" id="wharf" value="${requestScope.shipDynamic.wharf }"> --%>
                                                <select name="wharf" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue">
                                                <c:forEach items="${WharfcodeList}" var="wl" >
													<option value="${wl.wharfName }" <c:if test="${wl.wharfName eq requestScope.shipDynamic.wharf }">selected</c:if> >${wl.wharfName }</option>
												</c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">位置</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="position" class="form-control" id="position" value="${requestScope.shipDynamic.position }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">泊位</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="berth" class="form-control" id="berth" value="${requestScope.shipDynamic.berth }">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">引水/拖轮</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="waterDiversionTug" class="form-control" id="waterDiversionTug" value="${requestScope.shipDynamic.waterDiversionTug }"> --%>
                                                <select name="waterDiversionTug" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue" ">
	                                                <option value="0" <c:if test="${'0' eq requestScope.shipDynamic.waterDiversionTug }">selected</c:if> >引水</option>
	                                                <option value="1" <c:if test="${'1' eq requestScope.shipDynamic.waterDiversionTug }">selected</c:if> >拖轮</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">库区/船代/货代</label>
                                            <div class="col-sm-6">
                                                <%-- <input type="text" name="reservoirShippingFreightForwarding" class="form-control" id="reservoirShippingFreightForwarding" value="${requestScope.shipDynamic.reservoirShippingFreightForwarding }"> --%>
                                                <select name="reservoirShippingFreightForwarding" class="selectpicker" data-title="请选择" data-style="btn-default btn-block" data-menu-style="dropdown-blue" >
	                                                <option value="0" <c:if test="${'0' eq requestScope.shipDynamic.reservoirShippingFreightForwarding }">selected</c:if> >库区</option>
	                                                <option value="1" <c:if test="${'1' eq requestScope.shipDynamic.reservoirShippingFreightForwarding }">selected</c:if> >船代</option>
	                                                <option value="2" <c:if test="${'2' eq requestScope.shipDynamic.reservoirShippingFreightForwarding }">selected</c:if> >货代</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">上运抵时间</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="arrivalTime" class="form-control datetimepicker" id="arrivalTime" value="${requestScope.shipDynamic.arrivalTime }" required="required">
                                            </div>
                                        </div>
                                        
                                    </fieldset>
                                    <div class="footer text-center">
                                    <span style="color: #FF0000">${errorInfo}</span><br>
                                         <a href="/manage/ship_dynamic/shipdynamic?shipForecastId=${requestScope.shipDynamic.shipForecastId }" class="btn btn-info btn-fill">返回</a>
                                         <input type="submit" class="btn btn-info btn-fill" value="保存"/>
                                    </div>
                                </form>
                            </div>
                        </div>  <!-- end card -->

                    </div> <!-- end col-md-12 -->
                </div> <!-- end row -->
            </div>
        </div>
                
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
<script type="text/javascript">
        $().ready(function(){

            // Init Sliders
            demo.initFormExtendedSliders();

            // Init DatetimePicker
            demo.initFormExtendedDatetimepickers();
        });
    </script>
</html>