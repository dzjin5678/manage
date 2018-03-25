package com.ange.controller.system;

import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ange.tool.Result;

import sun.misc.BASE64Decoder;

/**
 * 和文件相关接口（图片或其他文件的上传）
 * @author ange
 *
 */
@SuppressWarnings("restriction")
@RestController
@RequestMapping("/file")
public class FileController {

//	private static Property property = new Property("system.configer.properties");
//	private static String upPicUrl = property.getValue("upPicUrl");
	private static String upPicUrl = FileController.class.getResource("/").getFile().toString()
			.split("WEB-INF/classes/")[0] + "pic/";
	private static String upFile = FileController.class.getResource("/").getFile().toString()
			.split("WEB-INF/classes/")[0] + "upFile/";
	
	private static Long time = (long) 0;

	/**
	 * 上传图片<br>接口：file/upPic
	 * 
	 * @param imgBase
	 *            图片base64
	 * @return 图片在项目的路径
	 */
	@RequestMapping("/upPic")
	@ResponseBody
	public Result upPic(String imgBase) {
		imgBase = imgBase.replace("data:image/jpeg;base64,", "");
		Long name = new Date().getTime();
		if (time == name) {
			name++;
			time = name;
		} else {
			time = name;
		}
		String toImagePath = upPicUrl + name + ".jpg";
		String imageType = "jpg";
		try {
			BASE64Decoder decoder = new sun.misc.BASE64Decoder();
			byte[] bytes1 = decoder.decodeBuffer(imgBase);
			ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);
			RenderedImage bi1 = ImageIO.read(bais);
			File w2 = new File(toImagePath);// 可以是jpg,png,gif格式
			if (!w2.getParentFile().exists()) { // 判断文件父目录是否存在
				w2.getParentFile().mkdir();
			}
			if (!w2.exists()) {
				w2.createNewFile();
				System.out.println("no exist=====");
			}
			System.out.println("pass...........");
			ImageIO.write(bi1, imageType, w2);// 不管输出什么格式图片，此处不需改动
			return new Result(true, "pic/" + name + ".jpg");
		} catch (IOException e) {
			e.printStackTrace();
			return new Result(false);
		}
	}
	
	/**
	 * 上传文件<br>接口：file/upload
	 * @param request request
	 * @param file 文件
	 * @return 文件所在路径
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Result upload(HttpServletRequest request,@RequestParam(value = "file", required = false)MultipartFile file){
		if(file.getSize()>25*1024*1024) {
			return new Result(false,"文件不可大于25M");
		}
		String path =upFile;
        String fileName = file.getOriginalFilename();
        String type="."+fileName.substring(fileName.lastIndexOf(".")+1);
	    fileName = new Date().getTime()+type;
	    File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return new Result(false,"上传失败");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return new Result(false,"上传失败");
        }
        return new Result(true,"/upFile/"+fileName);
	}

	
	
}
