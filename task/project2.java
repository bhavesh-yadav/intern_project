import java.util.Scanner;
import java.util.Random;

public class project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

       
            String rps[]= {"r","p","s"};
            String computersmove = rps[new Random().nextInt(rps.length)];
            String playermove;
            String playagain;


            while(true){
                
                System.out.println("ENTER YOUR MOVE (r,p,s): ");
                playermove = sc.nextLine();
                if(playermove.equals("r")||playermove.equals("p")||playermove.equals("s")){
                    break;
                }
                System.out.println("invalid move");
            }
            System.out.println("Computers move "+computersmove);

            if (playermove.equals(computersmove)){
                System.out.println("Game tie!");
            }
            else if(playermove.equals("r")){
                if(computersmove.equals("p")){
                    System.out.println("YOU LOOSE");
                }
                else if (computersmove.equals("s")){
                    System.out.println("you win");
                }
            }
            else if(playermove.equals("p")){
                if(computersmove.equals("s")){
                    System.out.println(("You Loose"));
                }
                else if(computersmove.equals("r")){
                    System.out.println("You Win");
                }
            }
            else if(playermove.equals("s")){
                if(computersmove.equals("r")){
                    System.out.println(("You Loose"));
                }
                else if(computersmove.equals("p")){
                    System.out.println("You Win");
                }

            }
            System.out.println("DO you wanna play again! just enter (y/n) : ");
            playagain = sc.nextLine();
            if(playagain.equals("n")){
                break;
            }
        
        } 

    }
    
}
