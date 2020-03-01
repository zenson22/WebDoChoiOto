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

import com.sonnguyen.webdochoioto.model.BrandDTO;
import com.sonnguyen.webdochoioto.model.CategoryDTO;
import com.sonnguyen.webdochoioto.model.ProductDTO;
import com.sonnguyen.webdochoioto.service.IBrandService;
import com.sonnguyen.webdochoioto.service.ICategoryService;
import com.sonnguyen.webdochoioto.service.IProductService;
import com.sonnguyen.webdochoioto.validator.ProductValidator;

@RequestMapping(value = "/quan-tri/san-pham")
@Controller(value = "productControllerOfAdmin")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@Autowired 
	private ICategoryService categoryService;
	
	@Autowired
	private IBrandService brandService;
	
	@Autowired
	private ProductValidator productValidator;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("admin/product");
		List<ProductDTO> products =productService.findAll();
		mav.addObject("products", products);
		return mav;
	}
	
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public ModelAndView editNew() {
		ModelAndView mav = new ModelAndView("admin/product_insert");
		List<CategoryDTO> categories = categoryService.findAll();
		List<BrandDTO> brands = brandService.findAll();

		mav.addObject("categories", categories);

		mav.addObject("brands", brands);
		return mav;
	}
	
	@RequestMapping(value="/add-product",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute ("product") ProductDTO productDto,BindingResult bindingResult) {
		productValidator.validate(productDto, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/product_insert";
		}
		productService.insert(productDto);
		return "redirect:/quan-tri/san-pham";
	}
	
	@RequestMapping(value="/update-product/{id}",method=RequestMethod.GET)
	public String updateUser(HttpServletRequest request,@PathVariable ("id") Integer id) {
		ProductDTO product = productService.findOne(id);
		request.setAttribute("product", product);
		List<CategoryDTO> categories = categoryService.findAll();
		List<BrandDTO> brands = brandService.findAll();
		request.setAttribute("categories", categories);
		request.setAttribute("brands", brands);
		return "admin/product_edit";
	}
	
	@RequestMapping(value="/update-product",method=RequestMethod.POST)
	public String updateUser(HttpServletRequest request,@ModelAttribute ("product") ProductDTO productDto,BindingResult bindingResult) {
		productValidator.validate(productDto, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/product_edit";
		}
		productService.update(productDto);
		return "redirect:/quan-tri/san-pham";
	}
	
	@RequestMapping(value="/delete-product/{productId}",method=RequestMethod.GET)
	public String deleteUser(HttpServletRequest request,@PathVariable ("productId") Integer id) {
		productService.delete(id);
		return "redirect:/quan-tri/san-pham";
	}
	
}
