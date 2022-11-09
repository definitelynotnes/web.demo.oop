package generics.demo1a;

import java.util.ArrayList;
import java.util.List;

// Generic Type Class or Interface
public class Calculator <T extends Number> {

        public void add(T num1, T num2) {
            System.out.println(num1.doubleValue() + num2.doubleValue());
        }
        
        public static Number computeSum(List<? extends Number> numbers) {
            double sum = 0;
            for(Number number: numbers) {
                sum += number.doubleValue();
            }
            return sum;
        }
        
        public static<T> void print(T data) {
            System.out.println("Data: " + data);
        }
        
        public static void main(String[] args) {
            
            Calculator.<String>print("Hello World");
            Calculator.<Integer>print(1);
            
            Calculator<Float> calculator = new Calculator<>();
            calculator.add(1F, 1F);
            
            List<Float> numberParameter = new ArrayList<>();
            numberParameter.add(1F);
            numberParameter.add(2F);
            numberParameter.add(3F);
            System.out.println("Sum: " + computeSum(numberParameter));
        }
}
