public class Java8Tasks1 {

    public static void main(String[] args) {
      
        Ex1Impl ex1 = new Ex1Impl();
        
      
        ex1.java8();
    }
}

interface Ex1 {
    default void java8() {
        System.out.println("This is a default method in the interface Ex1.");
    }
}

class Ex1Impl implements Ex1 {
    
}
