import java.util.ArrayList;
import java.util.Iterator;

public class QQKachoo<T> implements Deque<T>{

    ArrayList<T> _que;
	
	//constructor
    public QQKachoo() {
	_que = new ArrayList();
    }

    //returns first element in the deque
    public T getFirst() {
	return _que.get( 0 );
    }

    //returns last element in the deque
    public T getLast() {
	return _que.get( _que.size() - 1 );
    }

    //returns size of the deque
    public int size() {
	return _que.size();
    }

    //returns true if the deque is empty, false if not
    public boolean isEmpty() {
	return _que.isEmpty();
    }

    //adds element to the end of the deque
    public boolean add( T x ) {
	return _que.add( x );
    }

    //adds element to the beginning of the deque
    public  void addFirst( T x ) {
	_que.add( 0, x );
    }

    //removes the first element of the deque and returns it
    public T remove() {
	return _que.remove( 0 );
    }

    //removes the last element of the deque and returns it
    public T removeLast() {
	return _que.remove( _que.size() - 1 );
    }

    //returns an Iterator for the deque
    public Iterator<T> iterator() {
	return new QQIterator();
    }
	
	//returns an Iterator that returns the elements in reverse order for the deque
    public Iterator<T> descendingIterator() {
	return new QQDescendingIterator();
    }
	
	//checks to see if x is in the deque
    public boolean contains( T x ) {
	return _que.contains( x );
    }
	
	//removes a specific element from the deque by value
    public boolean remove( T x ) {
	return _que.remove( x );
    }
	
	//removes the last occurrence of a specific element from the deque by value
    public boolean removeLastOccurrence( T x ) {
	Iterator<T> it = descendingIterator();
	T i;
	while( it.hasNext() ) {
	    i = it.next();
	    if( i.equals( x ) ) {
		it.remove();
		return true;
	    }
	}
	return false;
    }
	
	//private class for Iterator of deque
    private class QQIterator implements Iterator<T> {
		
	private boolean _okToRemove;
	private int _index;
		
	public QQIterator() {
	    _index = 0;
	}
		
	public boolean hasNext() {
	    return _index < _que.size() - 1;
	}
		
	public T next() {
	    T retVal = _que.get( _index );
	    _index++;
	    _okToRemove = true;
	    return retVal;
	}
		
	public void remove() {
	    if ( ! _okToRemove )
		throw new IllegalStateException("must call next() beforehand");
	    _que.remove( _index );
	    _okToRemove = false;
	}
		
    }
	
	//private class for DescendingIterator of deque
    private class QQDescendingIterator implements Iterator<T> {
		
	private boolean _okToRemove;
	private int _index;
		
	public QQDescendingIterator() {
	    _index = _que.size() - 1;
	}
		
	public boolean hasNext() {
	    return _index > 0;
	}
		
	public T next() {
	    T retVal = _que.get( _index );
	    _index--;
	    _okToRemove = true;
	    return retVal;
	}
		
	public void remove() {
	    if ( ! _okToRemove )
		throw new IllegalStateException("must call next() beforehand");
	    _que.remove( _index );
	    _okToRemove = false;
	}
		
    }
	
    public static void main(String[] args){
	/*
	//some comes from the qaf
	QQKachoo<String> t = new QQKachoo<String>();
	System.out.println("Is the deque empty? " + t.isEmpty()); //Expecting true;
	//System.out.println(t.removeFirstOccurrence("polly")); //Will throw exception
	System.out.println("Size: " + t.size());//Expecting 0
	//Both methods below will throw exceptions
	//t.removeLast();
	//t.removeFirst();
	System.out.println("--------END-------");
	t.addFirst("bob");
	System.out.println("bob");
	t.addFirst("tom");
	System.out.println("tom");
	t.addFirst("jerry");
	System.out.println("jerry");
	System.out.println("-------Front-------");
	System.out.println("Size: " + t.size());//Expecting 3
	    
	t.add("a");
	System.out.println("a");
	t.add("b");
	System.out.println("b");
	t.add("c");
	System.out.println("c");
	System.out.println("-------Front-------);
	System.out.println("Size: " + t.size());//Expecting 6
	    
	System.out.println(t.getFirst());
	System.out.println(t.getLast());
			   
	System.out.println(t.remove());	
	System.out.println(t.removeLast());		   
			 
	System.out.println(t.contains("d"));
        System.out.println(t.contains("c")); 
				   
	System.out.println(t.remove("d"));
	System.out.println(t.remove("c"));		   
	
	t.add("jerry");
	t.add("jerry");   
	System.out.println(t.removeLastOccurrence("jerry"));
	*/
 
    }
}
