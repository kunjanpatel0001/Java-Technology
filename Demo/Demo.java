class Demo{
    public static void main(String[] args) {
        System.out.println("Filter");
        int[] a = new int[] {10,20,30,40,50};
        for(int i = 0; i < 5; i++){
          if(a[i] > 30){
            int v = a[i] * 2;
            System.out.println(v);
          }
        }
        }
}
