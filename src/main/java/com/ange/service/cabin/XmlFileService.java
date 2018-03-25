package com.ange.service.cabin;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.CustomsReleaseDao;
import com.ange.dao.GoodsDao;
import com.ange.model.CustomsRelease;
import com.ange.tool.Result;

@Service
public class XmlFileService {
	@Autowired
	private CustomsReleaseDao customsReleaseDao;
	@Autowired
	private GoodsDao goodsDao;
	/**
	 * 添加海关放行记录
	 * @param map
	 * @param upFileGoodsId 
	 * @param fileName 
	 * @return
	 */
	public Result addCustomsRelease(Map<String, String> map, Integer upFileGoodsId, String fileName) {
		Result res=new Result(true);
		CustomsRelease customsRelease=new CustomsRelease();
		customsRelease.setBILL_NO(map.get("BILL_NO"));
		customsRelease.setI_E_FLAG(map.get("I_E_FLAG"));
		customsRelease.setTRANSPORT_ID(map.get("TRANSPORT_ID"));
		customsRelease.setTRANSPORT_NAME(map.get("TRANSPORT_NAME"));
		customsRelease.setVOYAGE_NO(map.get("VOYAGE_NO"));
		customsRelease.setDECL_TRAF_MODE(map.get("DECL_TRAF_MODE"));
		customsRelease.setPACK_NO(Integer.valueOf(map.get("PACK_NO")));
		customsRelease.setGROSS_WT(map.get("GROSS_WT"));
		customsRelease.setCREATE_DATE(map.get("CREATE_DATE"));
		customsRelease.setCONTA_ID(map.get("CONTAINER"));
		customsRelease.setFORM_ID(map.get("FORM_ID"));
		customsRelease.setState("0");
		customsRelease.setFilePath(fileName);
		Integer goodsId=goodsDao.byCustomsReleaseGetGoods(map);
		try {
			if(goodsId!=null&&goodsId!=0) {
				customsRelease.setState("1");
				goodsDao.updateState(goodsId,"1",fileName);
			}
			if(goodsId==null||goodsId!=upFileGoodsId) {
				res.setExpect(false);
				res.setMsg("海关文件已加入放行库，您所提供的文件与本记录数据不符");
			}
			CustomsRelease oldCustomsRelease=customsReleaseDao.getCustomsRelease(customsRelease);
			if(oldCustomsRelease==null) {
				customsReleaseDao.addCustomsRelease(customsRelease);
			}
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false);
		}
	}

}
