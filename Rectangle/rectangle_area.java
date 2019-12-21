package 课堂作业.Student.Rectangle;

public class rectangle_area {
    private  int l;
    private  int w;
    public rectangle_area(int l,int w){
        this.l=l;
        this.w=w;
    }
    int area(){
        return l*w;
    }
    public static void main(String args[]){
        rectangle_area r = new rectangle_area(2,3);
        System.out.println(r.area());
    }
}
