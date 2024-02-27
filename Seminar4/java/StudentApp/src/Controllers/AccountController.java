package Controllers;

import java.util.List;

import Domain.Employee;
import Domain.Person;
import Domain.Teacher;
import Domain.WorkingPerson;

public class AccountController {

    public static <T extends WorkingPerson> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплаченная зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person> double averageAge(List<T> persons){
        double tmpSumm = 0;
        if (persons.size() == 0)
            return 0.0;
        for (T tmpPers : persons)
            tmpSumm += tmpPers.getAge();
        return tmpSumm/persons.size();
    }
}
