public class People {
//属性（成员变量） 有什么
    double height;  //身高
    int age;     //年龄
    int sex;    //性别，0为男性，非0为女性

//方法 干什么
    public People(double h, int a, int s){
        height = h;
        age = a;
        sex = s;
    }

    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+"岁");
        if(sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");

    }
    public static void main(String[] args) {
        People LiLei = new People(168.0, 21, 1); //创建一个People对象LiLei



        LiLei.printBaseMes();
    }
}