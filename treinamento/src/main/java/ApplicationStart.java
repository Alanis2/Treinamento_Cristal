import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
public class ApplicationStart {
    public static void main(String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
