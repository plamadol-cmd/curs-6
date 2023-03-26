package c5;

import org.springframework.stereotype.Component;

@Component
public class Task {
    private String taskName;
    private static Integer taskId = 0;
    private Integer executionTime;
    static Integer numberOfTasks = 0;

    public Task(){
        System.out.println("An instance of the Task class is created: ");
    }

    public void run(){
        System.out.println("Sleep for " + this.executionTime + " seconds:");
        try{
            Thread.sleep(this.executionTime * 1000);
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Sleep has finished.");
    }

    public static void generateId(){
        taskId += 1;
    }

    private void init(){
        System.out.println("This method is called at initialisation: ");

        numberOfTasks++;
        System.out.println("Current number of Tasks: " + numberOfTasks);

        System.out.println("TaskId: " + taskId);

        this.taskName = "Task" + taskId;
        System.out.println("Task Name: " + this.taskName);

        this.executionTime = (int) (Math.random() * 19 + 1);
        System.out.println("Execution time: " + this.executionTime);

        generateId();
    }

    private void destroy(){
        System.out.println("This method is called before destruction.");
        numberOfTasks--;
        System.out.println("Task destroyed: " + this.taskName);
    }

}
