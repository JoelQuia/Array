/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

import Xadrez.Peca;
import Xadrez.Cavalo;
import Xadrez.Peao;
import Xadrez.Bispo;

/**
 *
 * @author Admin
 */
public class Xadrez {
    
    public static void main(String[]args){
        Peca Peao = new Peao();
        Peca Cavalo = new Cavalo();
        Peca Bispo = new Bispo();
        
        Peao.mover();
        Cavalo.mover();
        Bispo.mover();
    }
    
}
