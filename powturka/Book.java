public class Book
{
    public String title;
    public String author;
    public int  numberOfPagers;
    public Book(String title,String author,int numberOfPagers)
    {
        this.title=title;
        this.author=author;
        this.numberOfPagers=numberOfPagers;
    }
    @Override
    public String toString()
    {
        return "book="+title+"\nauthor="+author+"\nnum="+numberOfPagers;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Book temp)//tak nazywamy sobie nowa zmienna i nam przpisuje
        {
            return (temp.title.equals(this.title)
                    && temp.author.equals(this.author)
                    && temp.numberOfPagers==this.numberOfPagers);

        }
        return false;

}}

