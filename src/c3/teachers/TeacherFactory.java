package teachers;

import org.springframework.stereotype.Component;

@Component
public class TeacherFactory {
    WisdomWordsService wisdomWordsService = new WisdomWordsService();
    HomeworkService homeworkService = new HomeworkService();

    public ITeacher getTeacher(String teacherType){
        if(teacherType == null){
            return null;
        }

        if(teacherType.equalsIgnoreCase("Math")){
            return new MathTeacher();
        }

        if(teacherType.equalsIgnoreCase("History")){
            return new HistoryTeacher();
        }

        if(teacherType.equalsIgnoreCase("Java")){
            return new JavaTeacher(this.wisdomWordsService, this.homeworkService);
        }

        return null;
    }
}
