package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService <Teacher> {
     private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
 

    @Override
    public List<Teacher> getAll() {
        return this.teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name, age, "Доцент");
        this.count++;
        this.teachers.add(newTeacher);
    }

     public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}
