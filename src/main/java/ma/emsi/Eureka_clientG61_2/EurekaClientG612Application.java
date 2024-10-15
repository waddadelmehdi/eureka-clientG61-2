package ma.emsi.Eureka_clientG61_2;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientG612Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientG612Application.class, args);
	}
}
	@RestController
	class DateController {

	    @GetMapping("/date")
	    public String getCurrentDate() {
	        return "Current Date: " + LocalDate.now();
	    }

}

