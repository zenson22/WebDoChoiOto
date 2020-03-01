package com.sonnguyen.webdochoioto.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sonnguyen.webdochoioto.entity.Product;
import com.sonnguyen.webdochoioto.model.CategoryDTO;
import com.sonnguyen.webdochoioto.repository.ProductRepository;
import com.sonnguyen.webdochoioto.service.ICategoryService;

@Controller(value = "productControllerOfWeb")
public class ProductController {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping(value = "/san-pham", method = RequestMethod.GET)
	public ModelAndView productPage() {
		ModelAndView mav = new ModelAndView("web/product");
		List<Product> products =productRepository.findAll();
		List<CategoryDTO> categories = categoryService.findAll();
		mav.addObject("products", products);
		mav.addObject("categories",categories);
		return mav;
	}
	
	@RequestMapping(value = "/san-pham/chi-tiet-san-pham/{productId}", method = RequestMethod.GET)
	public ModelAndView productDetailsPage(@PathVariable (name= "productId" ,required = true) Integer productId) {
		ModelAndView mav = new ModelAndView("web/productDetails");
		Product product =productRepository.findOne(productId);
		mav.addObject("product", product);
		return mav;
	}
	
	@RequestMapping(value = "/san-pham/danh-muc/{id}", method = RequestMethod.GET)
	public ModelAndView productCategoryPage(@PathVariable (name= "id" ,required = true) Integer id) {
		ModelAndView mav = new ModelAndView("web/product");
		List<Product> products =productRepository.findByCategoryId(id);
		mav.addObject("products", products);
		List<CategoryDTO> categories = categoryService.findAll();
		mav.addObject("categories",categories);
		return mav;
	}
}
