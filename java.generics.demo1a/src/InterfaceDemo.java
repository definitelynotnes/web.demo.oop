

interface Printable{
    default void print() {
        System.out.println("Use cheap ink");
    }
}

/*abstract class Thing{
    public void print() {
        System.out.println("Default");
    }
}
*/
class TShirt implements Printable{
    
}

class Photo implements Printable{
    
    @Override
    public void print() {
        System.out.println("Print using glossy paper");
    }
}
public class InterfaceDemo {

}
