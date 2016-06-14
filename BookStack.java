
public class BookStack {
	
	private int maxSize;
	private int top;
	private Book[] ba;
	
	public BookStack(int mSize){		
		top=0;
		maxSize=mSize;
		ba=new Book[maxSize];
	}
	
	public void push(Book b) throws BookStackOverflowException,BookInvalidPriceException,BookInvalidPagesException{
		if(top<maxSize)
		{
			if(b.getPrice()<0)
				throw new BookInvalidPriceException();
			else if(b.getPages()<0)
				throw new BookInvalidPagesException();
			else
				ba[top++]=b;
		}
			
		else
			throw new BookStackOverflowException();
		
	}
	
	public Book pop() throws BookStackUnderflowException{
		if(top>=1){
			top--;
			return ba[top];
		}
		else
			throw new BookStackUnderflowException();
	}
	
	public void displayStack() {
		for(int i=0;i<top;i++) {
			System.out.println((i+1)+". "+ba[i].getTitle()+" "+ba[i].getPages()+" "+ba[i].getPrice());
		}
	}
	
	public int getMaxSize(){
		return maxSize;
	}

}
