import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope ("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
       Cat cat = new Cat();
       cat.setName("Vasya");
       return cat;
    }

}