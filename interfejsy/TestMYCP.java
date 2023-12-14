public class TestMYCP implements MyComparator
{
    public int a;
    public int b;

    public TestMYCP(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compare(int a, int b)
    {
        switch (Integer.compare(a,b))
        {
            default:
                return 0;
            case -1:
                return -1;
            case 1:
                return 1;


        }
    }

    public static void main(String[] args)
    {
        TestMYCP test=new TestMYCP(1,1);
        System.out.println(test.compare(test.a,test.b));
    }
}
