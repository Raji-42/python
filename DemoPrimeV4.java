public class DemoPrimeV4{
    public static void main(String args[]){
        int num=50,i,j,flag=0;
        for(i=2;i<=num;i++)
        {
            flag=0;
            for(j=2;j<=i/2;j++){
               if(i%j==0){
                 flag=1;
                 break;
               }
            }
            if(flag==0)
            {
                System.out.println(i+" is a prime  ");
                
            }
        }
    }
}
