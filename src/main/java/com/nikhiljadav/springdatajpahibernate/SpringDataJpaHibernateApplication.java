package com.nikhiljadav.springdatajpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ResourceRepository resourceRepository){
//		return args -> {
//			var video = Video.builder().name("Video").length(10).build();
//			resourceRepository.save(video);
//		};
//	}
}
