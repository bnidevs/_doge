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
	
	public static void main(String[] args){}
}
