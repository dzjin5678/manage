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
    <title>添加储罐详单货物信息</title>
	
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
					<li><a href="/manage/storageTankCode/queryStorageTankCodeList?page=1&strip=10">储罐管理</a></li>
            </ul>
            
            <ul class="nav">
					<li><a href="/manage/storageTankCode/queryStorageTankCodeList?page=1&strip=10&type=query">储罐查询</a></li>
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
                        <div class="card" style="height:1000px">
                            <div class="header">
                                <legend>添加储罐详单货物</legend>
                            </div>
                            <div class="content">
                                <form method="post" action="/manage/storageTankCargo/insertStorageTankCargo" accept-charset="UTF-8" onsubmit="document.charset='UTF-8'" class="form-horizontal">

                                    <fieldset>
                                                                        	
                                    	<div class="form-group" style="display:none;">
                                            <label class="col-sm-3 control-label">作业单ID</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="storageTankTaskId" class="form-control" value="${storageTankTask.id }" readonly="${storageTankTask.id }" >
                                            </div>
                                        </div>
                                    
                                    
                                    	<div class="form-group">
                                            <label class="col-sm-3 control-label">作业单号</label>
                                            <div class="col-sm-6">
                                                <input type="text" name="task" class="form-control" value="${storageTankTask.task }" readonly="${storageTankTask.task }" >
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">货物类型</label>
                                            <div class="col-sm-6">
                                                <select id="cargoType" name="cargoType" class="form-control radius" >
                                                	<option>收货</option>
                                                	<option>发货</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">运输类型</label>
                                            <div class="col-sm-6">
                                                <select id="transportType" name="transportType" class="form-control radius">
                                                    <option>内部转入</option>
                                                	<option>外部转入</option>
                                                	<option>货转转入</option>
                                                	<option>卸船</option>
                                                	<option>卸车</option>
                                                </select>                                            
                                        	</div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">计划数量</label>
                                            <div class="col-sm-6">
                                                <input type="number" name="planNum" class="form-control" >
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">实际数量</label>
                                            <div class="col-sm-6">
                                                <input type="number" name="actualNum" class="form-control" >
                                            </div>
                                        </div>
                                        
                                    </fieldset>
                                    <div class="footer text-center">
                                    <span style="color: #FF0000">${errorInfo}</span><br>
                                         <a href="/manage/storageTankCargo/queryStorageTankCargo?page=1&strip=10&storageTankTaskId=${storageTankTask.id}" class="btn btn-info btn-fill">返回</a>
                                         <input type="submit" class="btn btn-info btn-fill" value="添加"/>
                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
                
            </div>
        </div>
    </div>

</div>

	
	<!--新增窗口-->
	<div id="addModal" class="bootbox modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog " role="document" style="width: 80%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">选择车辆</h4>
            </div>
            
            <div class="modal-body">
				<div class="table-container">  
			        <table class="ui nine column table celled table-result" id="table-result">  
			            <thead>  
			            <tr>
			                <th>hotelSeq</th>  
			                <th>酒店名称</th>  
			                <th>订单号</th>  
			                <th>联系人手机号</th>  
			                <th>预定时间</th>  
			                <th>userId</th>  
			                <th>cellid</th>  
			                <th>gps定位城市</th>  
			                <th>wifi定位城市</th>  
			                <th>定位距离</th>
			                <th>选定</th>  
			            </tr>  
			            </thead>  
			            <tbody id="tbody-result">  
			            </tbody>  
			        </table>  
			    </div>
            </div>
            
            <div class="modal-footer">
                <button data-bb-handler="confirm" type="button" id="saveLearnBtn" class="btn btn-success radius">
                    <span><i class="icon-ok"></i></span> &nbsp;保&nbsp;&nbsp;存
                </button>
                <button data-bb-handler="cancel" type="button" id="cancelSave" class="btn btn-danger radius">取消</button>
            </div>
        </div>
    </div>
	</div>
	
	

<!--   Core JS Files and PerfectScrollbar library inside jquery.ui   -->
<script src="../js/jquery.min.js" type="text/javascript"></script>
<script src="../js/jquery-ui.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>

<!--  Forms Validations Plugin -->
<script src="../js/jquery.validate.min.js"></script>

<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
<script src="../js/moment.min.js"></script>

<!--  Date Time Picker Plugin is included in this js file -->
<script src="../js/bootstrap-datetimepicker.js"></script>

<!--  Select Picker Plugin -->
<script src="../js/bootstrap-selectpicker.js"></script>

<script src="../js/bootstrap-table.js"></script>


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


<script src="../static/js/ace-extra.min.js" ></script>
<script src="../static/js/jqGrid/jquery.jqGrid.min.js" ></script>
<script src="../static/js/jqGrid/i18n/grid.locale-en.js" ></script>
<script src="../static/js/bootstrap.min.js" ></script>
<script src="../static/js/jquery-ui-1.10.3.custom.min.js" ></script>
<script src="../static/js/jquery.slimscroll.min.js" ></script>
<script src="../static/js/chosen.jquery.min.js" ></script>
<script src="../static/js/ace-elements.min.js" ></script>
<script src="../static/js/ace.min.js" ></script>
<script src="../static/js/md5.js" ></script>
<script src="../static/js/custom.js" ></script>
<script src="../static/js/jquery.messager.js" ></script>
<script src="../static/js/layer/layer.js" ></script>
<script src="../static/js/bootbox.min.js" ></script>

<script src="choose.js" ></script>


<script type="text/javascript">
    //货物类型选择事件
	$("#cargoType").change(function(){
		var opt = $("#cargoType").val();		
		if(opt=='收货'){
			//对收货的运输类型进行更新
       		document.getElementById("transportType").innerHTML="";
       		document.getElementById("transportType").options.add(new Option('内部转入','内部转入'));
       		document.getElementById("transportType").options.add(new Option('外部转入','外部装入'));
       		document.getElementById("transportType").options.add(new Option('货转转入','货转转入'));
       		document.getElementById("transportType").options.add(new Option('卸船','卸船'));
       		document.getElementById("transportType").options.add(new Option('卸车','卸车'));

		}else{
			//对发货的运输类型进行更新
       		document.getElementById("transportType").innerHTML="";
       		document.getElementById("transportType").options.add(new Option('内部转出','内部转出'));
       		document.getElementById("transportType").options.add(new Option('外部转出','外部转出'));
       		document.getElementById("transportType").options.add(new Option('货转转出','货转转出'));
       		document.getElementById("transportType").options.add(new Option('装船','装船'));
       		document.getElementById("transportType").options.add(new Option('装车','装车'));
		}
	});
    
    //运输类型选择事件
	$("#transportType").change(function(){
		var opt = $("#transportType").val();
		if(opt=='装车'){
       		//选择装车
            $("#addModal").modal({
                keyboard : false,
                show : true,
                backdrop : "static"
            });
       		
		}else if(opt=='卸车'){
			//选择卸车	
            $("#addModal").modal({
                keyboard : false,
                show : true,
                backdrop : "static"
            });
		}else if(opt=='装船'){
			//选择装船
            $("#addModal").modal({
                keyboard : false,
                show : true,
                backdrop : "static"
            });
		}else if(opt=='卸船'){
			//选择卸船
            $("#addModal").modal({
                keyboard : false,
                show : true,
                backdrop : "static"
            });


		}		
	}); 
</script>

</body>

</html>