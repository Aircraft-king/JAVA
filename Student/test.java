package Student;

public class test {
    public static void main(String[] args) {
        Un_student wang = new Un_student("UFE",123,"男","1999-02-06");
        wang.Show();
        wang.setName("王柯");
        wang.setScore(100);
        wang.setDepartment("信息系");
        wang.setMajor("软件工程");
        wang.Show();
    }
}
