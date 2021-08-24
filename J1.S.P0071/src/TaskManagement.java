
import java.util.ArrayList;

public class TaskManagement {

    ArrayList<Task> list = new ArrayList<>();
    Validate v = new Validate();

    public int addTask(String name, int typeid, String date, double from, double to, String assign, String reviewer) {
        int id ;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(list.size() - 1).getId() + 1;
        }
        Task t = new Task(id, name, typeid, date, from, to, assign, reviewer);
        list.add(t);
        return id;
    }

    public boolean deleteTask(int id) {
        for (Task t : list) {
            if (t.getId() == id) {
                list.remove(t);
                return true;
            }

        }
        return false;
    }

    public void display() {
        for (Task t : list) {
            System.out.println(t);
        }
    }

}
