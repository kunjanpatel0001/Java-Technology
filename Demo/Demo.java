import static javax.swing.JOptionPane.*;
class Demo{
    public static void main(String[] args) {
        System.out.println("Find Operation");
        String str = showInputDialog("Enter a number: ");
        int num = Integer.parseInt(str);

        int[] a = new int[]{10,20,30,40};
        int index = -1;
        for(int i = 0; i < 5; i++){
            if(num == a[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Number not found.");
        }else
        {
           System.out.println("Number found at Index " + index);
        }
        }
    }
