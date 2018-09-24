/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Michael Moretti)
 * @version (17 September 2018)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;
    //2.88
    private String refNumber;
    //2.92
    private boolean courseText;
/**
 * Sets the author and title fields when this object
 * is constructed.
 */
public Book(String bookAuthor, String bookTitle,int bookPages, String refNumber, boolean immutable)
{
    author = bookAuthor;
    title = bookTitle;
    pages = bookPages;
    refNumber = "";
    courseText = immutable;
}

/**
* Returns the name of the author
*/
public String getAuthor()
{
    return author;
}

/**
* Returns the title of the book
*/
public String getTitle()
{
    return title;
}

/**
* Prints the name of the author
* 2.84
*/
public void printAuthor()
{
    System.out.println ("The Author is " + author);
}

/**
* Prints the title of the book
* 2.84
*/
public void printTitle()
{
    System.out.println ("The Title is " + title);
}

/**
* Returns the number of pages in the book
* 2.85
*/
public int getPages()
{
    return pages;
}

/**
* Sets the reference number
* 2.88
*/
public void SetRefNumber(String ref)

{
    //2.90
    if(ref.length()>=3)
    {
        refNumber = ref;
    }
    else
    {
        System.out.println("A Reference number MUST be at least 3 characters.");
    }
}

/**
* Gets reference number and return value
* 2.88
*/

public String getRefNumber()
{
    return refNumber;
}

/**
* Keeps count of how many times the book has been borrowed
* 2.91
*/
public void borrow()
{
    borrowed = borrowed + 1;
}

/**
* Gets the number of times the book was borrowed
*/
public int getBorrowed()
{
    return borrowed;
}

/**
*Is the book a course textbook?
*2.92
*/
public boolean isCourseText()
{
    return courseText;
}

/**
 * Prints all information on the book
 * 2.87
 */
public void printDetails()
{
    System.out.println ("Title: " +title);
    System.out.println ("Author: " + author);
    System.out.println ("Number of Pages: " +pages);
    System.out.println ("This book has been borrowed: " +borrowed+ " times.");
    System.out.println("Reference number: " + refNumber);
    //2.89
    if (refNumber.length() > 0)
{
    System.out.println("Reference number: " + refNumber);
}
    else
{
    System.out.println("Reference number: ZZZ");
}
}
}