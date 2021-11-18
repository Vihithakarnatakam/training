package com.ibm.Books;

public class Book {
private String tittle;
private Member mbr;

public Book(String tittle) 
{
	this.tittle = tittle;
}

public void status()
{
	if(mbr==null)
		System.out.println(tittle+" is not isssued");
	else
		System.out.println(tittle+" is issued to "+ mbr.getName());
}

public String getTittle() {
	return tittle;
}

    public void issueBook(Member m)
{
	if(mbr != null)
		System.out.println(tittle+" is already issued");
	else if(m.getBk() != null)
		System.out.println(mbr.getName()+"had already issued the book");
	else
		mbr=m;
	    m.setBk(this);
	    System.out.println("Book issued");
}

public void returnBook(Member m)
{
	if(mbr == null)
		System.out.println(tittle+" is not issued to anyone");
	else if(m.getBk() == null)
	    System.out.println(m.getName()+" has never issued a book");
	else if(!m.getBk().getTittle().equals(tittle))
		System.out.println(m.getName()+" has not issued book "+tittle);
	else if(!m.getName().equals(mbr.getName()))
		System.out.println(tittle+"was not issued to"+m.getName());
	else
		m.setBk(null);
	    mbr=null;
		System.out.println("book returned");
		
}


}



