package com.fm.edusys.controller.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fm.edusys.common.base.BaseController;
import com.fm.edusys.model.auto.SysArea;
import com.fm.edusys.model.auto.SysAreaExample;
import com.fm.edusys.model.auto.SysCity;
import com.fm.edusys.model.auto.SysCityExample;
import com.fm.edusys.model.auto.SysProvinceExample;
import com.fm.edusys.model.auto.SysStreet;
import com.fm.edusys.model.auto.SysStreetExample;
import com.fm.edusys.model.custom.TitleVo;
import com.fm.edusys.service.SysAreaService;
import com.fm.edusys.service.SysCityService;
import com.fm.edusys.service.SysProvinceService;
import com.fm.edusys.service.SysStreetService;

import io.swagger.annotations.Api;

/**
 * 省份联动controller
 * @ClassName: ProvinceLinkageController
 * @author fuce
 * @date 2019-10-05 11:19
 */
@Api(value = "省份联动controller")
@Controller
@RequestMapping("/ProvinceLinkageController")
public class ProvinceLinkageController  extends BaseController{
	@Autowired
	private SysProvinceService sysProvinceService;
	@Autowired
	private SysCityService sysCityService;
	@Autowired
	private SysAreaService sysAreaService;
	
	@Autowired
	private SysStreetService sysStreetService;
	
	private String prefix = "admin/province";
	
	
	@GetMapping("/view")
    public String view(ModelMap model)
    {	
		String str="省份联动";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		model.addAttribute("provinceList",sysProvinceService.selectByExample(new SysProvinceExample()));
        return prefix + "/list";
    }
	/**
	 * 市查询
	 * @param pid
	 * @return
	 */
	@GetMapping("/getCity")
	@ResponseBody
	public List<SysCity> getCity(String pid){
		SysCityExample example=new SysCityExample();
		example.createCriteria().andProvinceCodeEqualTo(pid);
		return sysCityService.selectByExample(example);
		
	}
	
	/**
	 * 区查询
	 * TODO(请说明这个方法的作用).
	 * @param pid
	 * @return
	 */
	@GetMapping("/getArea")
	@ResponseBody
	public List<SysArea> getArea(String pid){
		SysAreaExample example=new SysAreaExample();
		example.createCriteria().andCityCodeEqualTo(pid);
		return sysAreaService.selectByExample(example);
		
	}
	
	/**
	 * 街道查询
	 * @param pid
	 * @return
	 */
	@GetMapping("/getStreet")
	@ResponseBody
	public List<SysStreet> getStreet(String pid){
		SysStreetExample example=new SysStreetExample();
		example.createCriteria().andAreaCodeEqualTo(pid);
		return sysStreetService.selectByExample(example);
		
	}
		
	
}
