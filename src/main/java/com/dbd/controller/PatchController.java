package com.dbd.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbd.service.PatchService;

@Controller
@RequestMapping("/patch/*")
public class PatchController {

	@Autowired
	private PatchService patchService;
	
	// 업로드폴더 주입
	@Resource(name = "uploadPath") 
	private String uploadPath;
	
	@GetMapping("/patchDetail")
	public void patchDetail() {
		
	}
}
