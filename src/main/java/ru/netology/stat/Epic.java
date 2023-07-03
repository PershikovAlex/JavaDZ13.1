package ru.netology.stat;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtask) {
        super(id);
        this.subtasks = subtask;
    }

    public String[] getSubtask() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks)
            if (subtasks.contains(query)) {
                return true;
            }
        return false;
    }

}
