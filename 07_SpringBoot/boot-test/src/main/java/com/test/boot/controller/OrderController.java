package com.test.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	@PostMapping("/orderProduct.do")
	public String order(String name, int blackPen, int redPen, 
			int bluePen, int white, Model model) {
        
        int totalBlack = blackPen * 500;
        int totalRed = redPen * 700;
        int totalBlue = bluePen * 700;
        int totalWhite = white * 1000;
        int total = totalBlack + totalRed + totalBlue + totalWhite;

        System.out.println(total);
        
        if (total != 0) {
            model.addAttribute("name", name);
            model.addAttribute("blackPen", blackPen);
            model.addAttribute("redPen", redPen);
            model.addAttribute("bluePen", bluePen);
            model.addAttribute("white", white);
            
            model.addAttribute("totalBlack", totalBlack);
            model.addAttribute("totalRed", totalRed);
            model.addAttribute("totalBlue", totalBlue);
            model.addAttribute("totalWhite", totalWhite);
            
            model.addAttribute("total", total);
            return "resultPage";
            
        } else {
            return "errorPage";
        }
        
	}
	
    @GetMapping("/error.do")
    public String error() {
        return "errorPage";
    }
    
}
