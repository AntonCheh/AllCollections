package SetLesson;

import java.util.Objects;

public class User {
    private String login;
    private double salary;

    public User(String login, double salary) {
        this.login = login;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(salary, user.salary) == 0 && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, salary);
    }
}
