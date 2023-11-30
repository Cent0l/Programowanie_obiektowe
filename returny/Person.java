public record Person(String name,int age)
{
    public Person
    {
        if(age<0)
            age=0;
    }
    public Person(String name)
    {
        this(name,0);
    }
    public void dziendobry()
    {
        System.out.println("nowi followersi");
    }
}
