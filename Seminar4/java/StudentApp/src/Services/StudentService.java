package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;

public class StudentService implements iPersonService<Student>  {

    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
       return this.students;
    }

    @Override
    public void create(String name, int age) {
       Student newStudent = new Student(name, age);
       this.count++;
       this.students.add(newStudent);
    }   
    
    public void sortByFIO()
    {
        PersonComparator<Student> persComp = new PersonComparator<Student>();
        students.sort(persComp);
    }
}
