package com.sonnguyen.webdochoioto.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sonnguyen.webdochoioto.dao.IOrderDAO;
import com.sonnguyen.webdochoioto.model.OrderDTO;

@RequestMapping(value ="/quan-tri/don-hang")
@Controller(value="orderControllerOfAdmin")
public class OrderController {
	@Autowired
	private IOrderDAO orderDao;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showList(@ModelAttribute("order") OrderDTO order) {
		ModelAndView mav = new ModelAndView("admin/order_manager");
		order.setListResult(orderDao.findAll());
		mav.addObject("order", order);
		return mav;
	}
	
	@RequestMapping(value = "/update-order/{orderId}", method = RequestMethod.GET)
	public ModelAndView editNew() {
		ModelAndView mav = new ModelAndView("admin/order_edit");
		return mav;
	}
}
