package com.testpro.teacherRecommentFactor.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testpro.teacherRecommentFactor.bean.TeacherRecommentFactor;
import com.testpro.teacherRecommentFactor.bean.TeacherRecommentFactorSearch;
import com.testpro.teacherRecommentFactor.service.spi.ITeacherRecommentFactorService;

/**
 * Controller of TeacherRecommentFactor
 * @author lubo
 * @date 2018-7-23
 */
@Controller
@RequestMapping("/teacherRecommentFactor")
public class TeacherRecommentFactorController {

	private Logger logger = Logger.getLogger(TeacherRecommentFactorController.class);
	
	@Autowired
	private ITeacherRecommentFactorService teacherRecommentFactorServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model, TeacherRecommentFactorSearch search){
		if (search == null) {
			search = new TeacherRecommentFactorSearch();
			// search.setPageSize(20);
		}
		model.addAttribute("list", teacherRecommentFactorServiceImpl.page(TeacherRecommentFactor.class, search));
		return "teacherRecommentFactor/list";
	}
	
	@RequestMapping(value="/goAdd", method = RequestMethod.GET)
	public String goAdd(Model model) {
		
		return "teacherRecommentFactor/add";
		
	}
	
	@RequestMapping(value="/goUpdate/{id}", method = RequestMethod.GET)
	public String goUpdate(Model model, @PathVariable Integer id) {
		
		return "teacherRecommentFactor/update";
	}
	
	@RequestMapping(value="/goDetails/{id}", method = RequestMethod.GET)
	public String goDetails(Model model, @PathVariable Integer id) {
		
		return "teacherRecommentFactor/details";
	}
	
	
	@RequestMapping(value="/goDel/{id}", method = RequestMethod.GET)
	public String goDel(Model model, @PathVariable Integer id) {
		
		return "teacherRecommentFactor/del";
	}
	
	
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String add(TeacherRecommentFactor teacherRecommentFactor) {
		teacherRecommentFactorServiceImpl.save(teacherRecommentFactor);
		return "redirect:/teacherRecommentFactor";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(TeacherRecommentFactor teacherRecommentFactor) {
		teacherRecommentFactorServiceImpl.update(teacherRecommentFactor);
		return "redirect:/teacherRecommentFactor";
	}
	
	@RequestMapping(value="/del/{id}", method = RequestMethod.GET)
	public String del(Model model, @PathVariable Integer id) {
		teacherRecommentFactorServiceImpl.delete(TeacherRecommentFactor.class, id);
		return "redirect:/teacherRecommentFactor";
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public TeacherRecommentFactor getJson(Model model, @PathVariable Integer id){
		return teacherRecommentFactorServiceImpl.find(TeacherRecommentFactor.class, id);
	}
	
	/**
	 * 后台接收Date转换
	 */
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
