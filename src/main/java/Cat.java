import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    public Cat() {
   }
public String getName() {
        return name;
}
public void setName(String s) {
        this.name=name;
}
}
