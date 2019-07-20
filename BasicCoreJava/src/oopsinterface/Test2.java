package oopsinterface;

public class Test2 {


public static void main(String[] args) {
A1 a = new A1();
B1 b = new B1();

a.parentMeth();
//a.childMeth();

b.childMeth();
a.parentMeth();

}

}

class A1{

public void parentMeth(){

}
}

class B1 extends A1{
public void childMeth(){

}

}

