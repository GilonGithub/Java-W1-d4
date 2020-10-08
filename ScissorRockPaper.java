import java.util.Scanner;
import java.lang.Math;

public class ScissorRockPaper {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        short AI_points = 0, user_points = 0;
        short round = 0;

    while (user_points < 3 && AI_points < 3) {

        String output = "The computer is ";
        short pick = -1;

        System.out.println("Round number " + ++round);

        while(pick > 2 || pick < 0) {

            System.out.print("Select scissor(0), rock(1), paper(2): ");
            pick = input.nextShort();

            if(pick > 2 || pick < 0) {
                System.out.println("Invalid! Pick again...");
            }

        }

        short AI = (short)(Math.random() * 3);

        switch(AI) {
            case 0: output += "scissor. "; break;
            case 1: output += "rock. "; break;
            case 2: output += "paper. "; break;
        }

        switch(pick) {
            case 0: output += "You are scissor"; break;
            case 1: output += "You are rock"; break;
            case 2: output += "You are paper"; break;
        }


        if((pick == 0 && AI == 0) || (pick == 1 && AI == 1) || (pick == 2 && AI == 2)) {
            System.out.println("Round " + round + " : " + output + " too. It is a draw. AI - " + AI_points + " You - " + user_points);
        } else if ((pick == 0 && AI == 2) || (pick == 1 && AI == 0) || (pick == 2 && AI == 1)) {
            user_points += 1;
            System.out.println("Round " + round + " : " + output + ". You won. AI - " + AI_points + " You - " + user_points);
        } else if ((pick == 2 && AI == 0) || (pick == 0 && AI == 1) || (pick == 1 && AI == 2)) {
            AI_points += 1;
            System.out.println("Round " + round + " : " + output + ". You lost. AI - " + AI_points + " You - " + user_points);
        }
    }

    }



}
