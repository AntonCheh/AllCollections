package CreateTodoList;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String todo) {
        todos.add(todo);
    }

    public void add(int index, String todo) {
        if (index >= 0 && index <= todos.size()) {
            todos.add(index, todo);
        } else {
            todos.add(todo);
        }
    }

    public void edit(int index, String todo) {
        if (index >= 0 && index < todos.size()) {
            todos.set(index, todo);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        return todos;
    }
}
