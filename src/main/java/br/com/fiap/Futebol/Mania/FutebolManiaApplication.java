package br.com.fiap.Futebol.Mania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class FutebolManiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutebolManiaApplication.class, args);
	}

	@RequestMapping
	@ResponseBody
	public String home() {
		return "FutebolMania";
	}

}
