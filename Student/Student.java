package Student;

public class Student {
       private String name;
       private int sno;
       private String sex;
       private String birthday;
       private String school_name;
       private int score;
       public Student(){

       }
       public Student(String school_name,int sno,String sex,String birthday){
           this.school_name=school_name;
           this.sno=sno;
           this.sex=sex;
           this.birthday=birthday;
       }
       public void setName(String name){
           this.name=name;
       }

       public void setScore(int score) {
           this.score = score;
       }
       public void Show(){
           System.out.println("姓名："+name);
           System.out.println("学号："+sno);
           System.out.println("性别："+sex);
           System.out.println("生日："+birthday);
       }
}
class Un_student extends Student{
    private String department;
    private String major;

    Un_student(String school_name,int sno,String sex,String birthday){
        super(school_name, sno, sex, birthday);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("系："+department);
        System.out.println("专业："+major);
    }
}
