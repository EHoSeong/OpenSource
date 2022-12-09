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
public class AdminController {
	@Autowired
	private AdminDB addb;

	@RequestMapping(value = "/adminregister", method = RequestMethod.GET)
	public String adinput(Model model) {
		model.addAttribute("ad", new Admin());
		return "/adinput";
	}
	@RequestMapping(value = "/home")
	public String home(Model model) {
		List<Admin> ad = addb.select();
		model.addAttribute("ad", ad);
		return "/home";
	}

	@RequestMapping(value = "/bookcheck", method = RequestMethod.GET)
	public String Check(Model model) {
		
		return "/bookcheck";
	}
	@RequestMapping(value = "/adminregister.do", method = RequestMethod.POST)
	public String Add(@ModelAttribute Admin ret, Model model) {
		model.addAttribute("ad", ret);
		addb.create(ret);
		return "redirect:/itemlist";
	}

	// 조회
	@RequestMapping(value = "/itemlist", method = RequestMethod.GET)
	public String getStudent(Model model, @RequestParam(value = "seq", required = false, defaultValue = "0") int seq) {

		
		if (seq == 0) {
			List<Admin> ad = addb.select();
			model.addAttribute("ad", ad);
			return "/itemlist";
		} else {
			Admin ad = addb.select(seq);
			model.addAttribute("ad", ad);
			return "/iteminfo";
		}
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "seq", required = true) int seq) {
		addb.delete(seq);
		return "redirect:/itemlist";
	}
}
