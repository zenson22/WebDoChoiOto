package com.sonnguyen.webdochoioto.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sonnguyen.webdochoioto.model.CategoryDTO;
import com.sonnguyen.webdochoioto.service.ICategoryService;
import com.sonnguyen.webdochoioto.validator.CategoryValidator;

@RequestMapping(value = "/quan-tri/danh-muc")
@Controller(value = "categoryControllerOfAdmin")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@Autowired
	private CategoryValidator categoryValidator;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("admin/category");
		List<CategoryDTO > categories=categoryService.findAll();
		mav.addObject("categories", categories);
		return mav;
	}
	
	@RequestMapping(value = "/add-category", method = RequestMethod.GET)
	public ModelAndView addCategory() {
		ModelAndView mav = new ModelAndView("admin/category_insert");
		return mav;
	}
	
	
	@RequestMapping(value="/add-category",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute ("category") CategoryDTO category,BindingResult bindingResult) {
		categoryValidator.validate(category, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/category_insert";
		}
		categoryService.insert(category);
		return "redirect:/quan-tri/danh-muc";
	}
	
	@RequestMapping(value="/update-category/{id}",method=RequestMethod.GET)
	public String updateUser(HttpServletRequest request,@PathVariable ("id") Integer id) {
		request.setAttribute("category", categoryService.findOne(id));
		return "admin/category_edit";
	}
	
	@RequestMapping(value="/update-category",method=RequestMethod.POST)
	public String updateUser(HttpServletRequest request,@ModelAttribute ("category") CategoryDTO category,BindingResult bindingResult) {
		categoryValidator.validate(category, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/category_edit";
		}
		categoryService.update(category);
		return "redirect:/quan-tri/danh-muc";
	}
	
	@RequestMapping(value="/delete-category/{id}",method=RequestMethod.GET)
	public String deleteUser(HttpServletRequest request,@PathVariable ("id") Integer id) {
		categoryService.delete(id);
		return "redirect:/quan-tri/danh-muc";
	}
	
}
