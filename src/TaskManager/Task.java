package TaskManager;

public class Task {
    private String taskTitle;
    private String taskDetail;
    private Date dueDate;
    private short priorityLevel;


    public Task(String taskTitle, String taskDetail, Date dueDate, short priorityLevel) {
        this.taskTitle = taskTitle;
        this.taskDetail = taskDetail;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
    }
}
