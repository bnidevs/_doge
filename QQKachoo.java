import java.util.ArrayList;
import java.util.Iterator;

public class QQKachoo<T> implements Deque<T>{

    ArrayList<T> _que;

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
	
    }
	
    public static void main(String[] args){}
}
