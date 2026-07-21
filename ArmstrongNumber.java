public class ArmstrongNumber {
    
    public static void main(String[] args){
      int start = 100;
      int end = 5000;

      for(int i = start; i< end; i++){
        boolean isArmStrong = checkForArmstrong(i);
        if(isArmStrong){
            System.out.println(i);
        }
      }


      
        // if(sum = originalNum){
        //     Sytem.out.println(originalNum + "is an armstrong number.");
        // } else{
        //     System.out.println(originalNum + "is not an armstrong number.");
        // }
    }
    }