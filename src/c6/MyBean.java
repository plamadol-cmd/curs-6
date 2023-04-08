package c6;

import org.springframework.stereotype.Component;

@Author(
        name = "Andrew M",
        date = "12/02/2022"
)
@Component
public class MyBean {
    @SuppressWarnings(value = "unchecked")
    public void sayHello(){
        System.out.println("Hello!");
    }

    @Deprecated
    static void deprecatedMethod(){

    }

    @SuppressWarnings("deprecation")
    void useDeprecatedMethod(){
        deprecatedMethod();
    }

}
