import java.util.ArrayList;
import java.util.Iterator;

public class QQKachoo<T> implements Deque<T>{

    ArrayList<T> _que;
	
    public QQKachoo() {
	_que = new ArrayList();
    }

    public T getFirst() {
	return _que.get( 0 );
    }

    public T getLast() {
	return _que.get( _que.size() - 1 );
    }

    public int size() {
	return _que.size();
    }

    public boolean isEmpty() {
	return _que.isEmpty();
    }

    public boolean add( T x ) {
	return _que.add( x );
    }

    public  void addFirst( T x ) {
	_que.add( 0, x );
    }

    public T remove() {
	return _que.remove( 0 );
    }

    public T removeLast() {
	return _que.remove( _que.size() - 1 );
    }

    public Iterator<T> iterator() {
	return new QQIterator();
    }
	
    public Iterator<T> descendingIterator() {
	return new QQDescendingIterator();
    }
	
    public boolean contains( T x ) {
	return _que.contains( x );
    }
	
    public boolean remove( T x ) {
	return _que.remove( x );
    }
	
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
