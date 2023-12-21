public class Spr
{
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException
    {
        if(dane.length()<3)
        {
            throw new NiepoprawnyFormatDanychException();
        }
        else
        {
            System.out.println("wszystko git");
        }
    }
    public static void main(String[] args)
    {

    }
}
