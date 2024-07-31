package TaskManagementSystem;

public class TestClass {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task("T001", "Design", "Pending");
        Task task2 = new Task("T002", "Develop", "In Progress");
        Task task3 = new Task("T003", "Test", "Completed");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("Search for Task T002:");
        Task foundTask = taskList.searchTask("T002");
        System.out.println(foundTask != null ? foundTask : "Task not found");

        System.out.println("Delete Task T001:");
        boolean isDeleted = taskList.deleteTask("T001");
        System.out.println("Deleted: " + isDeleted);

        System.out.println("All Tasks after Deletion:");
        taskList.traverseTasks();
    }
}
