package com.test.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	@PostMapping("/orderProduct.do")
	public String order(String name, int blackPen, int redPen, int bluePen, int white, Model model) {
        
        int totalBlackPen = blackPen * 500;
        int totalRedPen = redPen * 700;
        int totalBluePen = bluePen * 700;
        int totalWhite = white * 1000;
        
        int total = totalBlackPen + totalRedPen + totalBluePen + totalWhite;
        
        if (total != 0) {
            model.addAttribute("name", name);
            
            model.addAttribute("blackPen", blackPen);
            model.addAttribute("redPen", redPen);
            model.addAttribute("bluePen", bluePen);
            model.addAttribute("white", white);
            
            model.addAttribute("totalBlack", totalBlackPen);
            model.addAttribute("totalRed", totalRedPen);
            model.addAttribute("totalBlue", totalBluePen);
            model.addAttribute("totalWhite", totalWhite);
            
            model.addAttribute("total", total);
            
            return "resultPage";
        } 
        
        else {
            return "redirect:/error.do";
        }
	}
	
    @GetMapping("/error.do")
    public String error() {
        return "errorPage";
    }
}
