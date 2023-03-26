package teachers;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    @Override
    public String getHomework() {
        return "Learn about WW1";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
