/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;



public class Jogador {
    public String simbolo;
    public static int Num = 0;
    public int Turno;
    public int tipo;
    
    public Jogador(String simbolo, int tipo)
    {
        this.simbolo = simbolo;
        Turno = Num++;
        this.tipo = tipo;
    }
}
