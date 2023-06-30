package ru.netology.javaqa.Scheduler;

public class Epic extends Task {
    private String[] subtasks;

    public Epic(int id, String[] subtask) {
        super(id);
        this.subtasks = subtask;
    }

    public String[] getSubtask() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }

        }
        return false;
    }
}
