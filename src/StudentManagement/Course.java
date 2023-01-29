package StudentManagement;

public class Course {
    public String name;
    public String code;
    public String prefix;
    public int note;
    public Teacher teacher;
    public Course(){

    }
    public Course(String name, String code, String prefix, int note, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.teacher = teacher;
    }
    public Teacher addTeacher(Teacher teacher){
        return teacher;
    }
    public void printTeacher(Teacher teacher){
        System.out.println(teacher.name + " "+ teacher.phoneNumber+ " "+ teacher.branch);
    }


}
