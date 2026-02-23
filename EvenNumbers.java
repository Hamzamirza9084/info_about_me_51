public class EvenNumbers {
    public static void main(String[] args) {
       
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        int sum = 0;

        System.out.print("The list of even numbers between 1 to 100: \n");
        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                System.out.print(i + " "); 
                

                if (i < min) {
                    min = i;
                }
                
               
                if (i > max) {
                    max = i;
                }
                
               
                sum += i;
            }
        }
        
        System.out.println("\n"); 

        System.out.println("The minimum even number: " + min);
        System.out.println("The maximum even number: " + max);
        System.out.println("The total (sum) of all even numbers between 1 to 100: " + sum);
    }
}