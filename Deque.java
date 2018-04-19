public interface Deque<T>{

    public T getFIrst();

    public T getLast();

    public int size();

    public boolean add( T x );

    public void addFirst( T x );

    public T remove();

    public T removeLast();

    public Iterator<T> iterator();

    public Iterator<T> descendingIterator();

    public boolean contains( T x );

    public boolean remove( T x );

    public boolean removeLastOccurrence( T x );
    
}
