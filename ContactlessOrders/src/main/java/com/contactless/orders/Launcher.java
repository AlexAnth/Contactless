package com.contactless.orders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.contactless.orders")
public class Launcher {

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
        consolePrintLog();
	}

	@GetMapping("/")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Welcome to " + appName + " !");
	}
	
	private static void consolePrintLog() {
		// pimp my code style :P
        System.out.println();
        System.out.println("                        #                                                                                                                               ");
        System.out.println("  ###                   #                             #     #                                                                    #     ######    #####  ");
        System.out.println(" #   #                  #                             ##   ##                                                                    #     #     #     #    ");
        System.out.println("#     #   # ###    ######   #####    # ###            # # # #   ######  # ####    ######   ######   #####    # ###              ###    #     #     #    ");
        System.out.println("#     #   ##      #     #  #     #   ##               #  #  #  #     #  ##    #  #     #  #     #  #     #   ##                 # #    ######      #    ");
        System.out.println("#     #   #       #     #  #######   #                #     #  #     #  #     #  #     #  #     #  #######   #                 #####   #           #    ");
        System.out.println(" #   #    #       #     #  #         #                #     #  #    ##  #     #  #    ##  #     #  #         #                 #   #   #           #    ");
        System.out.println("  ###     #        ######   #####    #                #     #   #### #  #     #   #### #   ######   #####    #                ##   ##  #         #####  ");
        System.out.println("                                                                                                #                                                       ");
        System.out.println("                                                                                           #####                                                        ");
        System.out.println();

	}

}
