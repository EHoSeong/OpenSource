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

	@RequestMapping(value = "test/std2.do", method = RequestMethod.GET)
	public ModelAndView eprocess2() {
		return new ModelAndView("/test/stdinput", "msg", new Student());
	}

	@RequestMapping(value = "/bookinfo.do", method = RequestMethod.POST)
	public String eprocess3(@ModelAttribute Student ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create(ret);
		return "/result";
	}

	// 조회
	@RequestMapping(value = "test/std_list.do", method = RequestMethod.GET)
	public String getStudent(Model model, @RequestParam(value = "seq", required = false, defaultValue = "0") int seq) {

		if (seq == 0) {
			List<Student> std = stddb.select();
			model.addAttribute("std_cmd", std);
			return "/test/list";
		} else {
			Student std = stddb.select(seq);
			model.addAttribute("msg", std);
			return "/test/result";
		}
	}
	@RequestMapping(value = "test/std_delete.do", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "seq", required = true) int seq) {
		stddb.delete(seq);
		return "redirect:/test/std_list.do";
	}

	
}
