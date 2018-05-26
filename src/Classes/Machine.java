package Classes;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

public class Machine
{
    int dif;
    
    public void play(ArrayList<JButton> gameState)
    {
        Random rand = new Random();
        double p;
        do{
            p = rand.nextInt(9) % 10; 
        }
        while(!gameState.get((int)p).isEnabled());
        
        gameState.get((int)p).doClick();
    }
}