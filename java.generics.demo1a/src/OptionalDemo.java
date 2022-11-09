import java.util.Optional;

class Printer{
    public void print() {
        System.out.println("This is a printer");
    }
}

public class OptionalDemo {
    public static void execute(Printer printer) {
        if (printer == null) {
            throw new IllegalArgumentException("Printer cannot be null.");
        }
        printer.print();
    }
    
    public static void execute(Optional<Printer> optionalPrinter) {
        if (optionalPrinter.isPresent()) {
            Printer printer = optionalPrinter.get();
            printer.print();
        }
    }
    
    public static void main(String[] args) {
        
        Printer coloredPrinter = new Printer();
        Optional<String> optional = Optional.of("Vroom!");
        optional.isPresent();           //true
        optional.get();                 //Vroom!
        optional.orElse("Boom!");       //Vroom!
        
    }
    
}

