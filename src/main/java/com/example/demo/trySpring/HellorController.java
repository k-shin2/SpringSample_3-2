package com.example.demo.trySpring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@COntroller
@Controller
public class HellorController {
	
	//@GetMapping
	@GetMapping("/hello")
	public String getHello() {
		
		//helloe.htmlに遷移
		return "hello";
		
	}
	
	//@PostMapping
	//@RequestParam
	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1")String str,Model model) {
		//画面から受け取った文字列をModelに登録
		model.addAttribute("sample",str);
		
		//helloResponse.htmlに画面遷移
		return "helloResponse";
	}
	

}
