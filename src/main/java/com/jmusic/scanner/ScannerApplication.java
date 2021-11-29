package com.jmusic.scanner;

import com.jmusic.scanner.service.ScanService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScannerApplication.class, args);
		ScanService sc = new ScanService();
		sc.scan();
	}

}
