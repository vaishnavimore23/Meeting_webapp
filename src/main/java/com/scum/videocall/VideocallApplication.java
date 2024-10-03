package com.scum.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.scum.videocall.user.User;
import com.scum.videocall.user.UserService;


@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService userService
	)
	{
		return  args -> {
			userService.register(User.builder()
					.username("Vaishnavi")
					.email("vaish@gmail.com")
					.password("1234")
					.build());

			userService.register(User.builder()
					.username("Shraddha")
					.email("Shraddha@gmail.com")
					.password("3456")
					.build());

			userService.register(User.builder()
					.username("Shubham")
					.email("Shubham@gmail.com")
					.password("78910")
					.build());

		};
	}
}
