abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.A = 0;
        this.B = 0;

    }
    //virtual void fun() = 0;
    abstract void fun();

    void gun()
    {
        System.out.println("Inside gun ");
    }
}

class AbstractDemo
{
    public static void main(String Arg[])
    {
       // Demo obj =new Demo();
    }
}