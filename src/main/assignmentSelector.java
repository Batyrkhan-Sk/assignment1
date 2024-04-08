package main;

import java.lang.reflect.Method;
import java.util.Scanner;

public class assignmentSelector {
    public assignmentSelector() {
    }

    public static void main(String[] args) {
        String[] assignments = new String[]{"Task1", "Task2", "Task3", "Task4", "Task5", "Task6", "Task7", "Task8", "Task9", "Task10"};
        System.out.println("Available Tasks:");

        for(int i = 0; i < assignments.length; ++i) {
            System.out.println(i + 1 + ". " + assignments[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the task: ");
        int selectedTaskIndex = scanner.nextInt();
        if (selectedTaskIndex >= 1 && selectedTaskIndex <= assignments.length) {
            String selectedTask = assignments[selectedTaskIndex - 1];
            compileTask(selectedTask);
        } else {
            System.out.println("Invalid task selection.");
        }
    }

    public static void compileTask(String taskName) {
        String taskClassName = "tasks." + taskName;

        try {
            Class<?> taskClass = Class.forName(taskClassName);
            Method mainMethod = taskClass.getMethod("main", String[].class);
            String[] arguments = {};
            mainMethod.invoke(null, (Object) arguments);
        } catch (Exception e) {
            System.out.println("Error: Task not found or failed to execute.");
            e.printStackTrace();
        }
    }
}
