package danny.jwtdemo2;

import danny.jwtdemo2.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemo2Application.class, args);
	}

}
