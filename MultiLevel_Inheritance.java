class GrandFather{
    void land(){
        System.out.println("Grandfather's Land");
    }
}

class Father extends GrandFather{
    void house(){
        System.out.println("Father's House");
    }
}

class Son extends Father{
    void car(){
        System.out.println("Son's Car");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args){
        Son s = new Son();
        s.land();
        s.house();
        s.car();
    }
}
