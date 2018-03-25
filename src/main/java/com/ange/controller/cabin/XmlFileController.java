package com.ange.controller.cabin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ange.service.cabin.XmlFileService;
import com.ange.tool.FileRead;
import com.ange.tool.Result;
import com.ange.tool.XmlHelper;


/**
 * 和文件相关接口（图片或其他文件的上传）
 * @author ange
 *
 */
@RestController
@RequestMapping("/xmlFile")
public class XmlFileController {
	@Autowired
	private XmlFileService xmlFileService;
	private static String upFile = XmlFileController.class.getResource("/").getFile().toString()
			.split("WEB-INF/classes/")[0] + "upFile/";
	
	
	/**
	 * 上传文件<br>接口：file/upload
	 * @param request request
	 * @param file 文件
	 * @return 文件所在路径
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Result upload(HttpServletRequest request,@RequestParam(value = "file", required = false)MultipartFile file,Integer upFileGoodsId){
		if(file.getSize()>10*1024) {
			return new Result(false,"文件不可大于10kb");
		}
		String path =upFile;
        String fileName = file.getOriginalFilename();
        String type="."+fileName.substring(fileName.lastIndexOf(".")+1);
        if(!type.equals(".xml")&&!type.equals(".XML")) {
        	return new Result(false,"文件格式有误，请上传xml");
        }
	    fileName = new Date().getTime()+type;
	    File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            String fileContent=FileRead.readToString(path + "/" + fileName);
            if(fileContent.startsWith("\uFEFF")){
            	fileContent = fileContent.replace("\uFEFF", "");//转成UTF-8无bom格式
    			}
            XmlHelper xmlHelper = XmlHelper.of(fileContent);
            Result res=xmlFileService.addCustomsRelease(xmlHelper.toMap(),upFileGoodsId,fileName);
            return res;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return new Result(false,"上传失败");
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(false,"上传失败");
        }
	}

	
	
}
