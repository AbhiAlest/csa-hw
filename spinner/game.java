public class SpinnerGame{
  public int spin(int min, int max){
    int result = 0; 
    result = (int)(Math.random() * max) + min;
    return result;
  }
  public void playRound(){
    int player = spin(1,10);        
    int computer = spin(2,8);                 
    if (player > computer){                System.out.println("You win! " + (player-computer) + " points");        
    }        
    else if (computer>player){                System.out.println("You lose. " + (computer-player)+ " points");        }         
    else{                
      int playerT = spin(1,10);                
      int computerT=spin(1,8);                
      if (playerT>computerT){                System.out.println("You win! "+ 1 + " points");                
         }                
      else if (computerT>playerT){                        System.out.println("You lose! "+-1+ " points");                        }                
      else{                        
        System.out.println("Tie. " +0+ " points");                      }        
    }
  }
}
