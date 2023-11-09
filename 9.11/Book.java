public class Book
{
    public String title;
    public String author;
    public int numberOfPages;
    public Book(String title, String author,int numberOfPages)
    {
        if(numberOfPages>=0)
        {
            this.numberOfPages=numberOfPages;
        }
        else
        {
            this.numberOfPages=1;
        }
        if(title.isEmpty())
        {
            this.title="";
        }
        else
        {
            this.title=title;
        }
        if(author.isEmpty())
        {
            this.author="";
        }
        else
        {
            this.author=author;
        }
    }
    @Override
    public String toString()
    {
        return "Book: "+this.title+"\nby: "+this.author+"\nPages: "+numberOfPages;
    }
    @Override
    public boolean equals(Object temp)
    {
        if(this ==temp) return true;
        if(temp==null || getClass()!=temp.getClass()) return false;
        Book otherBook = (Book) temp;
        return title.equals(otherBook.title) && author.equals(otherBook.author) && numberOfPages == otherBook.numberOfPages;
    }
}


