public class Demo {
    static int count;
    static String CommandSequence = "iiiddiipriiiidp";
   public static void main(String[] args) {
        System.out.println("Counter");
        int length = CommandSequence.length();
        for(int j = 0; j < length; j++){
            if(CommandSequence.charAt(j) == 'i'){
                count++;
            }
            else if(CommandSequence.charAt(j) == 'd'){
                count--;
            }
            else if(CommandSequence.charAt(j) == 'p'){
                System.out.println(count);
            }
            else if(CommandSequence.charAt(j) == 'r'){
                count = 0;
            }
        }
   } 
}