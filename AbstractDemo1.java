abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo Constructor");
        this.A = 0;
        this.B = 0;

    }
    //virtual void fun() = 0;
    abstract void fun();

    void gun()
    {
        System.out.println("Inside gun of Demo ");
    }
}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside hello Constructor");
    }

    public void fun()
    {
        System.out.println("Inside Fun of hello" );
    }
}

class AbstractDemo1
{
    public static void main(String Arg[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    }
}