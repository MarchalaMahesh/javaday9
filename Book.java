package javaday9;

public class Book {
	int id;

	public Book(int id) {
		
		this.id = id;
	}
	public static void main(String[] args) {
		Book b1 = new Book(100);
		Book b2 = new Book(100);
		
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println(b1.hashCode()==b2.hashCode());
		System.out.println(b1.equals(b2));
	}
	public boolean equals(Object o)
	{
		if(this.id==((Book)o).id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		return id;
	}
	
	public String toString()
	{
		return "book id is :"+id;
	}

}
