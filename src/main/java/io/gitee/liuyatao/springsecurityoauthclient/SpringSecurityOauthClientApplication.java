package io.gitee.liuyatao.springsecurityoauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@EnableOAuth2Sso
public class SpringSecurityOauthClientApplication extends WebSecurityConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauthClientApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String index(){
		return "index";
	}

}
