package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StdController {
	@Autowired
	private StdDB stddb;
	@Autowired
	private AdminDB addb;

	@RequestMapping(value = "/bookinfo", method = RequestMethod.GET)
	public String eprocess1(Model model) {
		List<Admin> ad = addb.select();
		model.addAttribute("ad", ad);
		return "/stdinput";
	}

	@RequestMapping(value = "/stdinput.do", method = RequestMethod.POST)
	public String Add(@ModelAttribute Student ret, Model model) {
		model.addAttribute("ad", ret);
		Admin ad = addb.select(ret.getItemname());
		ad.setItemcount(ad.getItemcount()-1);
		addb.update(ad);
		stddb.create(ret);
		return "redirect:/home";
	}

	// 조회
	@RequestMapping(value = "/bookcheck.do", method = RequestMethod.GET)
	public String getStudent(Model model, @RequestParam(value = "stdnum", required = false, defaultValue = "0") String stdnum) {
		Student std = stddb.select(stdnum);
		model.addAttribute("std", std);
		return "/stdresult";
	}

}
