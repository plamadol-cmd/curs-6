package teachers;

import org.springframework.stereotype.Component;

@Component
public class HomeworkService {

    private String homework = "Do the exercises";

    public void setHomework(String message) {

        this.homework = homework;
    }

    public String getHomework() {

        return homework;
    }
}
