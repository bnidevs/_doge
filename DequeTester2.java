
//based on Fiona's on the qaf
public class DequeTester2{
  public static void main(String[] args) {

    QQKachoo<String> iscream = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    iscream.addFirst("Chocolate");
    System.out.println(iscream.getFirst()); //Chocolate
    iscream.addFirst("Vanilla");
    System.out.println(iscream.getFirst()); //Vanilla
    iscream.addFirst("Strawberry");
    System.out.println(iscream.getFirst()); //Strawberry
    iscream.addFirst("Mint");
    System.out.println(iscream.getFirst()); //Mint

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.add("Pistachio");
    System.out.println(iscream.getLast()); //Pistachio
    iscream.add("Coffee");
    System.out.println(iscream.getLast()); //Coffee
    iscream.add("S'mores");
    System.out.println(iscream.getLast()); //S'mores

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("-----Removing from front-----");
    iscream.remove(); //Mint  dies
    System.out.println(iscream.getFirst()); //Strawberry

    System.out.println("");

    System.out.println("-----Removing from end-----");
    iscream.removeLast(); //S'mores dies
    System.out.println(iscream.getLast()); //Coffee

    System.out.println("");

    //System.out.println("------Current Deque------");
    //System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores
    //toString implemenation 

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    iscream.remove();
    //System.out.println(iscream); //lacking toString implementation
    iscream.remove();
    //System.out.println(iscream);
    iscream.remove();
    //System.out.println(iscream);
    iscream.remove();
    //System.out.println(iscream);
    iscream.remove();
    //System.out.println(iscream);
    System.out.println("Empty now?: "+iscream.isEmpty()); //true
  }





}
