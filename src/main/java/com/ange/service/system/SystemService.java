package com.ange.service.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ange.dao.SysPageDao;
import com.ange.dao.SysPowerDao;
import com.ange.dao.SysRoleDao;
import com.ange.model.SysPage;
import com.ange.model.SysPower;
import com.ange.model.SysRole;
import com.ange.tool.DateHandle;
import com.ange.tool.Result;
import com.ange.tool.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SystemService {
	@Autowired
	private SysRoleDao sysRoleDao;
	@Autowired
	private SysPowerDao sysPowerDao;
	@Autowired
	private SysPageDao sysPageDao;

	/**
	 * 添加角色
	 * 
	 * @param roleName
	 *            角色名
	 * @return Result
	 */
	public Result addRole(String roleName) {
		SysRole sysOldRole = sysRoleDao.byRoleNameGetSingle(roleName);
		if (sysOldRole != null) {
			return new Result(false, "角色已经存在");
		}
		String role = UuidUtil.createUUID();
		String time = DateHandle.getCurrent(DateHandle.S);
		SysRole sysRole = new SysRole();
		sysRole.setRole(role);
		sysRole.setExplains(roleName);
		sysRole.setCreatetime(time);
		try {
			sysRoleDao.addRole(sysRole);
			return new Result(true, sysRole);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}

	/**
	 * 删除角色
	 * 
	 * @param id
	 *            角色id
	 * @return
	 */
	public Result deleteRole(Integer id) {
		try {
			sysRoleDao.deleteRole(id);
			return new Result(true);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	/**
	 * 获取权限列表
	 * 
	 * @param page
	 * @param strip
	 * @return
	 */
	public Map<String, Object> getRoleList(Integer page, Integer strip) {
		PageHelper.startPage(page, strip);
		List<SysRole> list = sysRoleDao.getRoleList();
		PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}

	/**
	 * 给角色添加权限
	 * 
	 * @param roleId
	 *            角色id
	 * @param url
	 *            url
	 * @param explains
	 *            说明
	 * @return
	 */
	public Result addPower(Integer roleId, String url, String explains) {
		String time = DateHandle.getCurrent(DateHandle.S);
		SysPower sysPower = new SysPower();
		sysPower.setRoleId(roleId);
		sysPower.setExplains(explains);
		sysPower.setUrl(url);
		sysPower.setCreatetime(time);
		try {
			sysPowerDao.addPower(sysPower);
			return new Result(true, sysPower);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}

	/**
	 * 删除角色权限
	 * 
	 * @param id
	 *            记录id
	 * @return Result
	 */
	public Result deletePower(Integer id) {
		try {
			sysPowerDao.deletePower(id);
			return new Result(true);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	/**
	 * 获取指定角色拥有权限
	 * 
	 * @param roleId
	 *            角色id
	 * @param page
	 *            页数
	 * @param strip
	 *            条数
	 * @return Result
	 */
	public Map<String, Object> getPowerList(Integer roleId, Integer page, Integer strip) {
		PageHelper.startPage(page, strip);
		List<Map<String, Object>> list = sysPowerDao.getPowerList(roleId);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("total", pageInfo.getTotal());
		return map;
	}

	/**
	 * 更新角色权限
	 * 
	 * @param roleId
	 *            角色id
	 * @param id
	 *            权限id
	 * @return Result对象
	 */
	public Result updatePower(Integer roleId, Integer id) {
		String time = DateHandle.getCurrent(DateHandle.S);
		SysPage sysPage = sysPageDao.getSinglePage(id);

		SysPower sysPower = sysPowerDao.getSinglePower(roleId, sysPage.getExplains());

		if (sysPower == null) {
			sysPower = new SysPower();
			sysPower.setRoleId(roleId);
			sysPower.setExplains(sysPage.getExplains());
			sysPower.setUrl(sysPage.getPageUrl());
			sysPower.setCreatetime(time);
			try {
				sysPowerDao.addPower(sysPower);
				return new Result(true, sysPower);
			} catch (Exception e) {
				e.printStackTrace();
				return new Result(false, "添加失败");
			}
		} else {
			try {
				sysPowerDao.deletePower(sysPower.getId());
				return new Result(true, sysPower);
			} catch (Exception e) {
				e.printStackTrace();
				return new Result(false, "删除失败");
			}
		}
	}

	/**
	 * 根据角色id获取角色权限列表
	 * 
	 * @param role
	 *            角色id
	 * @return
	 */
	public List<SysPage> getRolePage(int roleId) {
		List<SysPage> list;
		if (roleId == 0) {
			list = sysPageDao.getAllPage();
		} else {
			list = sysPageDao.getRoleAllPage(roleId);
		}
		return list;
	}

	

}
