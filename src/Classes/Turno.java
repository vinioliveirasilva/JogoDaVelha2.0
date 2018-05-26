/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author internet
 */
public class Turno {
    
    private int ValorTurno;
    private String simbolo;
    public Turno(ArrayList<JButton> btns)
    {
        alterAll(btns, true, true);
        ValorTurno = 0;
    }
    
    public void Jogar(ArrayList<Jogador> jogador)
    {        
        ValorTurno = (ValorTurno+1) % Jogador.Num;
        this.simbolo = jogador.get(ValorTurno).simbolo;
    }
    
    public String Simbolo()
    {
        return this.simbolo;
    }
    
    public int Jogador()
    {
        return ValorTurno;
    }
    
    public void Finaliza(ArrayList<JButton> btns)
    {
        alterAll(btns, false, false);
    }
    
    public static void alterAll(ArrayList<JButton> btns, boolean status, boolean clear)
    {
        for(int i = 0; i < btns.size(); i++)
        {
            btns.get(i).setEnabled(status);
            if(clear)
                btns.get(i).setText("");
        }
            
    }
}
