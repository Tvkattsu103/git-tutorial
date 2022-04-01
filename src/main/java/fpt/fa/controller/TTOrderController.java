/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fpt.fa.entities.LoaiKH;
import fpt.fa.entities.TTOrder;
import fpt.fa.service.LoaiKHService;
import fpt.fa.service.TTOrderService;

@Controller
@RequestMapping(value = "/ttorder")
public class TTOrderController {
	@Autowired
	LoaiKHService loaiKHService;
	@Autowired
	TTOrderService ttOrderService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String displayCreate(Model model){
		Date date = new Date();
		model.addAttribute("ttOrder", new TTOrder(date, date));
		return "createTTOrder";
	}
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ttOrder") TTOrder ttOrder, BindingResult bindingResult, Model model) {
		List<String> loaiKH = loaiKHService.getListLoaiKH();
		boolean flag=false;
		
		for(String lkh: loaiKH){
			if(lkh.equals(ttOrder.getMaloaiKH())){
				flag=true;
			}
		}
		if(flag=true){
			LoaiKH loaiKH1 = loaiKHService.getLoaiKHById(ttOrder.getMaloaiKH());
			ttOrder.setLoaiKH(loaiKH1);
		} else {
			return "createTTOrder";
		}
		
		//get thứ ngày
		Calendar c = Calendar.getInstance();
        c.setTime(ttOrder.getNgayOrder());
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week in number:"+dayOfWeek);
        System.out.println(ttOrder.getGioVao().getHours());
        long tong = 0;
        long tong1 = 0;
		if(dayOfWeek==7||dayOfWeek==1){
			if(ttOrder.getGioVao().getHours()>=10&& ttOrder.getGioVao().getMinutes()>=0){
				tong=ttOrder.getSoNguoiLon()*250000+ttOrder.getSoTreEm()*200000;
				
			} else {
				tong=ttOrder.getSoNguoiLon()*200000+ttOrder.getSoTreEm()*150000;
			}
		} else{
			if(ttOrder.getGioVao().getHours()>=17&& ttOrder.getGioVao().getMinutes()>=0){
				tong=ttOrder.getSoNguoiLon()*200000+ttOrder.getSoTreEm()*150000;
			} else {
				tong=ttOrder.getSoNguoiLon()*150000+ttOrder.getSoTreEm()*120000;
			}
		}
		tong1=tong-tong*ttOrder.getLoaiKH().getChietKhau()/100;
		ttOrder.setTienThanhToan(tong1);
		
		if (bindingResult.hasErrors()) {
			return "createTTOrder";
		}
		
		ttOrderService.save(ttOrder);
		
		return "redirect:/ttorder/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model){
		List<TTOrder> ttOrder = ttOrderService.getTT();
        model.addAttribute("ttOrder", ttOrder);
		return "listTTOrder";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(@RequestParam String maOrder, Model model) {
		model.addAttribute("updateTTOrder", ttOrderService.getTTById(maOrder));
		return "updateTTOrder";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute(name = "updateTTOrder") TTOrder updateTTOrder, Model model, RedirectAttributes redirectAttributes) {
		Calendar c = Calendar.getInstance();
        c.setTime(updateTTOrder.getNgayOrder());
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        long tong=0;
        long tong1=0;
		if(dayOfWeek==7||dayOfWeek==1){
			if(updateTTOrder.getGioVao().getHours()>=10&& updateTTOrder.getGioVao().getMinutes()>=0){
				tong=updateTTOrder.getSoNguoiLon()*250000+updateTTOrder.getSoTreEm()*200000;
				
			} else {
				tong=updateTTOrder.getSoNguoiLon()*200000+updateTTOrder.getSoTreEm()*150000;
			}
		} else{
			if(updateTTOrder.getGioVao().getHours()>=17&& updateTTOrder.getGioVao().getMinutes()>=0){
				tong=updateTTOrder.getSoNguoiLon()*200000+updateTTOrder.getSoTreEm()*150000;
			} else {
				tong=updateTTOrder.getSoNguoiLon()*150000+updateTTOrder.getSoTreEm()*120000;
			}
		}
//		tong1=tong-tong*updateTTOrder.getLoaiKH().getChietKhau()/100;
		updateTTOrder.setTienThanhToan(tong);
		ttOrderService.save(updateTTOrder);
		redirectAttributes.addFlashAttribute("message", "Successfully Insert");
		return "redirect:/ttorder/list";
	}
}
