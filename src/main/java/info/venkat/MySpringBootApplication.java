package info.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("info.venkat.repository")
@EntityScan("info.venkat.model")
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String args[])
    {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
