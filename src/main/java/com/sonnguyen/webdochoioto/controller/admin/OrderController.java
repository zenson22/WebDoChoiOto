package com.sonnguyen.webdochoioto.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sonnguyen.webdochoioto.model.OrderDTO;
import com.sonnguyen.webdochoioto.service.IOrderService;
import com.sonnguyen.webdochoioto.service.IProductService;
import com.sonnguyen.webdochoioto.service.IUserService;

@RequestMapping(value ="/quan-tri/don-hang")
@Controller(value="orderControllerOfAdmin")
public class OrderController {
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IUserService userService;
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("admin/order_manager");
		List<OrderDTO> orders = orderService.findAll();
		for (OrderDTO orderDTO : orders) {
			orderDTO.setUser(userService.findOne(orderDTO.getUserId()));
		}
		mav.addObject("orders", orders);
		return mav;
	}
	
	@RequestMapping(value = "/orderDetail/{id}", method = RequestMethod.GET)
	public ModelAndView showOrderDetail(@PathVariable (name="id") Integer id) {
		ModelAndView mav = new ModelAndView("admin/orderDetail_manager");
		List<OrderDTO> orders = orderService.findOneOrderDetails(id);
		for (OrderDTO order : orders) {
			order.setUser(userService.findOne(order.getUserId()));
			order.setProduct(productService.findOne(order.getProductId()));
		}
		mav.addObject("orders", orders);
		return mav;
	}
	
	@RequestMapping(value = "/update-order/{id}", method = RequestMethod.GET)
	public ModelAndView editOrder(@PathVariable (name="id") Integer id) {
		ModelAndView mav = new ModelAndView("admin/order_edit");
		OrderDTO order = orderService.findOne(id);
		mav.addObject("order", order);
		return mav;
	}
	
	@RequestMapping(value="/update-order",method=RequestMethod.POST)
	public String editOrder(HttpServletRequest request,@ModelAttribute ("order") OrderDTO order) {
		orderService.update(order);
		return "redirect:/quan-tri/don-hang";
	}
	
	@RequestMapping(value = "/update-orderDetail/{orderId}/{productId}", method = RequestMethod.GET)
	public ModelAndView editOrderDetails(@PathVariable (name="orderId") Integer orderId,@PathVariable (name="productId") Integer productId) {
		ModelAndView mav = new ModelAndView("admin/orderDetail_edit");
		OrderDTO order = orderService.findProductOrderDetailsOne(orderId, productId);
		order.setUser(userService.findOne(order.getUserId()));
		order.setProduct(productService.findOne(order.getProductId()));
		mav.addObject("order", order);
		return mav;
	}
	
	@RequestMapping(value = "/delete-orderDetail/{orderId}/{productId}", method = RequestMethod.GET)
	public String deleteOrderDetails(@PathVariable (name="orderId") Integer orderId,@PathVariable (name="productId") Integer productId) {
		orderService.deleteProductOrderDetails(orderId, productId);
		return "redirect:/quan-tri/don-hang";
	}
	
	@RequestMapping(value="/update-orderDetail",method=RequestMethod.POST)
	public String editOrderDetails(HttpServletRequest request,@ModelAttribute ("order") OrderDTO order) {
		orderService.update(order);
		return "redirect:/quan-tri/don-hang";
	}
	
	@RequestMapping(value = "/delete-order/{id}", method = RequestMethod.GET)
	public String deleteOrder(@PathVariable (name="id") Integer id) {
		orderService.delete(id);
		return "redirect:/quan-tri/don-hang";
	}
	
}
