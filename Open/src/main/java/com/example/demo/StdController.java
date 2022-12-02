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

	@RequestMapping(value = "/bookinfo", method = RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Student());
		return "/stdinput";
	}

	@RequestMapping(value = "/home")
	public String home() {

		return "/home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String s(@ModelAttribute Student ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create(ret);
		return "/home";
	}

	// 조회
	@RequestMapping(value = "/bookcheck.do", method = RequestMethod.GET)
	public String getStudent(Model model, @RequestParam(value = "stdnum", required = false, defaultValue = "0") String stdnum) {

		Student std = stddb.select(stdnum);
		model.addAttribute("std", std);
		return "/stdresult";
	}

	@RequestMapping(value = "test/std_delete.do", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "seq", required = true) int seq) {
		stddb.delete(seq);
		return "redirect:/test/std_list.do";
	}

}
