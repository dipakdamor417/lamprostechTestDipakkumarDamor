import java.util.Scanner;

public class coin_change{

    public static int coin(int [] arr,int target){
        int t=target;
        int [] arr1=new int[3];
        for(int i=0;i<arr.length;i++){
            int tempcoin=arr[i];
            target=t;
            int tempcount=0;
              while(target>=0){        
                 tempcount++;  
                //  System.out.println(tempcount+" for coin:"+tempcoin);
                  target=target-tempcoin;       
            }
            arr[i]=tempcount;     
        }
        int min=0;
        for(int i=0;i<arr1.length-1;i++){
             if(arr[i]>arr[i+1]){
                 min=arr[i+1];
             }
        }
        return min;
    }

public static void main(String[] args){
    try{
        try (Scanner fc = new Scanner(System.in)) 
    {
        //declaring the coin types values in an array
        int [] coinstypes={1,5,10};
        int tar=fc.nextInt();
         //enter a target value
        System.out.println(coin(coinstypes,tar));
    }
    }
    catch(Exception e){
              System.out.println(e);
    }
   }
}