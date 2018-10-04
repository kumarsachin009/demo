// overriding code
import java.util.*;
import java.io.*;
class A
{
    void show()
    {
        System.out.println("PRINT A");
    }
}
class B extends A
{
    void show()
    {
        super.show();
        System.out.println("PRINT B");
    }
}
class overriding
{
    public static void main(String arr[])
    {
        B obj= new B();
        obj.show();
    }
}