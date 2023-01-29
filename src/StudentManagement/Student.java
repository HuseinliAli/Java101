package StudentManagement;

//name,stuNo,classes,course1,course2,course3,avarage,isPass
//Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
public class Student {
    public String name;
    public String stuNo;
    public String classes;
    public double course1;
    public double course2;
    public double course3;
    public double avarage;
    public boolean isPass;
    public Student(){

    }
    public Student(String name, String stuNo, String classes){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
    }
    public void addBulkExamNote(double course1, double course2, double course3){
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    public double avgCalc(){
        this.avarage = (this.course1 + this.course2 + this.course3)/3;
        System.out.println("Avarage is: "+this.avarage);
        return this.avarage;
    }
    public void isPassed(){
        if(this.avarage >=51){
            this.isPass = true;
            System.out.println("Exams are successflly passed");
        }else {
            this.isPass = false;
            System.out.println("Exams failed");
        }
    }
    public void printNote(){
        System.out.println("Course 1: "+this.course1+"\n"+"Course 2: "+ this.course2+"\n"+"Course 3: "+this.course3);
    }
}
