package com.myspring.kurly.manager;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.kurly.board.BoardDAO;
import com.myspring.kurly.buy.BuyDAO;
import com.myspring.kurly.cart.CartDAO;
import com.myspring.kurly.customer.CustomerDAO;
import com.myspring.kurly.item.ItemDAO;
import com.myspring.kurly.item.ItemDTO;

@Controller
public class ManagerController {
	
	// @Autowired
	// ItemDAO itemdao;
	// BoardDAO boarddao;
	// BuyDAO buydao;
	// CartDAO cartdao;
	// CustomerDAO customerdao;
	// ManagerDAO managerdao;
	
	
	
	
	
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		

		return request.getContextPath(); //value 
	}
	
	@RequestMapping(value="00_index")
	public String index() {
		System.out.println("=====index()=====");
		
		return "00_index"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="00_shopMain")
	public String shopMain() {
		System.out.println("=====00_shopMain()=====");
		
		return "00_shopMain"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="00_topMenu")
	public String topMenu() {
		System.out.println("=====00_topMenu()=====");
		
		return "00_topMenu"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="01_managerMain")
	public String managerMain() {
		System.out.println("=====01_managerMain()=====");
		
		return "01_managerMain"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="02_managerLogin")
	public String managerLogin() {
		System.out.println("=====02_managerLogin()=====");
		
		return "02_managerLogin"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="03_managerLoginPro", method=RequestMethod.POST)
	public String managerLoginPro() {
		System.out.println("=====03_managerLoginPro()=====");
		
		return "03_managerLoginPro"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="04_managerLogout")
	public String managerLogout() {
		System.out.println("=====04_managerLogout()=====");
		
		return "04_managerLogout"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="05_addNewItem")
	public String addNewItem() {
		System.out.println("=====05_addNewItem()=====");
		
		return "05_addNewItem"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="06_addNewItemPro", method=RequestMethod.POST)
	public String addNewItemPro() {
		System.out.println("=====addNewItemPro()=====");
		
		// itemdao.insertItem();
		
		
		
		return "addNewItemPro"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="07_updateItem")
	public String updateItem() {
		System.out.println("=====07_updateItem()=====");
		
		return "07_updateItem"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="08_updateItemPro", method=RequestMethod.POST)
	public String updateItemPro() {
		System.out.println("=====updateItemPro()=====");
		
		return "updateItemPro"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="09_deleteItemPro.jsp", method=RequestMethod.POST)
	public String deleteItemPro() {
		System.out.println("=====deleteItemPro()=====");
		
		return "deleteItemPro"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="10_checkOrderList")
	public String checkOrderList() {
		System.out.println("=====10_checkOrderList()=====");
		
		return "10_checkOrderList"; //뷰 페이지 연결
	}
	
	@RequestMapping(value="11_itemListForManager")
	public String itemListForManager() {
		System.out.println("=====11_itemListForManager.jsp()=====");
		
		return "11_itemListForManager"; //뷰 페이지 연결
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
