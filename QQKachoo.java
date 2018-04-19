import java.util.ArrayList

public class QQKachoo<T> implements Deque<T>{

    ArrayList<T> _que;

    public T getFirst() {
	return _que.get( 0 );
    }
    public static void main(String[] args){}
}
