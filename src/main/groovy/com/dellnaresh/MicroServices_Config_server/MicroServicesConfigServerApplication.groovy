package com.dellnaresh.MicroServices_Config_server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class MicroServicesConfigServerApplication {

	static void main(String[] args) {
		SpringApplication.run MicroServicesConfigServerApplication, args
	}
}
