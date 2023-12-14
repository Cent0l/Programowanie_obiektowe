public class StorageTest
{
    public static void main(String[] args)
    {
        FileStorage f1=new FileStorage("","plik");
        DatabaseStorage d1=new DatabaseStorage("2137","data");
        System.out.println(f1.save(f1.data));
        System.out.println(f1.save(d1.data));
        System.out.println(f1.retrieve(f1.identifier));
        System.out.println(d1.retrieve(d1.identifier));

    }
}
