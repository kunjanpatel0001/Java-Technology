class Demo{
    public static void main(String[] args) {
        System.out.println("Map Operation");
        int[] a = new int[] {10,20,30,40,50};
        int[] b = new int[5];
        for(int i = 0; i < 5; i++){
            int v = a[i] * 2;
            b[i] = v;
          }
        System.out.println("Original Array");
        for(int j=0; j<5; j++){
            System.out.println(a[j]);
        }

        System.out.println("Resulted Array");
        for(int k=0; k<5; k++){
            System.out.println(b[k]);
        }
        }
        }
