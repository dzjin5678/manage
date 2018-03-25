$(function () {
	

	
    $('#saveLearnBtn').click(function () {

        var tbody=window.document.getElementById("tbody-result");
           
        $.ajax({
            type: "post",
            dataType: "json",
            url: "/manage/costCode/queryCostCodeTemp",
            data: {
            	
            },
            success: function (msg) {
            	
                if (true) {
                    var str = "";
                    var data = msg.rows;

                    for (i in data) {
                        str += "<tr>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td>" + data[i].costCode + "</td>" +
                        "<td><input type='checkbox' style='zoom:150%;'></input></td>" +
                        "</tr>";
                    }
                    tbody.innerHTML = str;
                }
            },
            error: function () {
                alert("查询失败")
            }
        });
    });
    
    //编辑对话框取消点击事件
    $('#cancelSave').click(function(){
        $("#addModal").modal('hide');
    });

    //保存教程
    $('#saveLearnBtn').click(function(){
        //saveLearn();
    });
    
	$('#saveLearnBtn').click();
    
});