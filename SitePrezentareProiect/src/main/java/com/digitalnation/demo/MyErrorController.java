package com.digitalnation.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyErrorController implements ErrorController {
@RequestMapping("/Fisier")
public String handleError() {
	return "home";
}
}