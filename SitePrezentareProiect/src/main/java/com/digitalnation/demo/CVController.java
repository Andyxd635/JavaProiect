package com.digitalnation.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CVController implements ErrorController {
	@RequestMapping("/CV")
	public String cv() {
		return "CV";
	}
}
