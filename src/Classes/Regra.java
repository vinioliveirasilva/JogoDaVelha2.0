package Classes;

import java.util.ArrayList;
import javax.swing.JButton;

public class Regra {
    
    public static boolean verificar(ArrayList<JButton> botoes)
    {
        for(int i = 0; i < 9; i+=3)
            if(VerificaBt(botoes.get(i), botoes.get(i+1), botoes.get(i+2)))
                return true;
        
        for(int i = 0; i < 3; i+=1)
            if(VerificaBt(botoes.get(i), botoes.get(i+3), botoes.get(i+6)))
                return true;
        
        if(VerificaBt(botoes.get(0), botoes.get(4), botoes.get(8)))
            return true;
        
        if(VerificaBt(botoes.get(2), botoes.get(4), botoes.get(6)))
            return true;
        
        return false;
    }
    
    private static boolean VerificaBt(JButton bt1, JButton bt2, JButton bt3)
    {
        if(bt1.getText() == "" || bt2.getText() == "" || bt3.getText() == "")
            return false;
        if(bt1.getText() == bt2.getText() && bt1.getText() == bt3.getText())
            return true;
        return false;
    }
    
    public static boolean Empate(ArrayList<JButton> botoes)
    {
        for(int i = 0; i < botoes.size(); i++)
            if(botoes.get(i).isEnabled())
                return false;
        return true;
    }
}
