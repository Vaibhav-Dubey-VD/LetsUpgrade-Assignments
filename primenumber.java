public class primenumber {
    public static void main(String[] args) {
        System.out.print("Prime No Is: ");
        for(int i = 2; i<=10; i++){
            int j = 2;
           int count=0;
            while(j!=i){ 
                if(i%j==0){
                    count = 1;
                    break;
                }
                ++j;
            }
            if(count == 0){
                System.out.print(i);
            }
        }
    }
}
