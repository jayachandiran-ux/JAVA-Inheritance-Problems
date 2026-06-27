class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class circle extends Shape{
    void area(){
        System.out.println("Circle Area");
    }
}

class square extends Shape{
    void area(){
        System.out.println("Square area");
    }
}
public class Heirarchical_Inheritance {
    public static void main(String[] args){
        circle c = new circle();
        square s = new square();

        c.draw();
        c.area();

        s.draw();
        s.area();
    }
}
