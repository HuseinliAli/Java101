import java.sql.SQLOutput;
import java.time.LocalDate;

public class Employee {
    String name;
    String surname;
    double salary;
    double workHours;
    int hireYear;
    Employee(){

    }
    Employee(String name, String surname, double salary, double workHours, int hireYear){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if(this.salary>1000){
            this.salary -= (this.salary*(0.03));
        }
        System.out.println("size qalan maasiniz: "+this.salary);
    }
    void bonus(){
        if(workHours>40){
            this.salary += ((workHours-40)*30);
            System.out.println("bonuslu maasiniz: "+this.salary);
        }else {
            System.out.println("siz bonussuz maas alirsiniz"+this.salary);
        }
    }
    void raiseSalary(){
        int workYear = LocalDate.now().getYear() - hireYear;
        if(workYear<10){
            this.salary *= 1.05;
        }else if(workYear >=10 && workYear<20){
            this.salary *= 1.1;
        }else if(workYear>=20){
            this.salary *= 1.15;
        }
        System.out.println("maasiniz: "+ this.salary);
    }
    void printEmployee(Employee emp){
        System.out.println("name: "+emp.name+ " "+emp.surname);
        System.out.println("hireyear: "+emp.hireYear);
        System.out.println("salary: "+emp.salary);
        System.out.println("workhours: "+emp.workHours);
    }
}
