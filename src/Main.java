import StudentManagement.Course;
import StudentManagement.Student;
import StudentManagement.Teacher;

public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher("sahib eliyev", "+994-55-555-55-55", "fizika");
        Course course = new Course(
                "guven", "abc1312", "birinci",1312312, t);
        course.printTeacher(t);

        Student st = new Student();
        st.addBulkExamNote(0, 33,78);
        double avg = st.avgCalc();
        st.printNote();
        st.isPassed();
    }
}