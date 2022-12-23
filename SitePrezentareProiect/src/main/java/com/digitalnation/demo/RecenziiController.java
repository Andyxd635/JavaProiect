package com.digitalnation.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class RecenziiController implements ErrorController {
 @RequestMapping(value="/Recenzii")
 public String recenzie() {
	 return "Recenzii";
 }
}
