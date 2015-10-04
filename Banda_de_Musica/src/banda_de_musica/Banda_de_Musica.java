/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda_de_musica;

public class Banda_de_Musica {

    public static void main(String[] args) {
      
        Instrumento i = new Instrumento();
        i.tocar('C');
        TViento viento = new TViento();
        viento.tocar('D');
        Flauta f = new Flauta();
        f.tocar('E');
        Trompeta t = new Trompeta();
        t.tocar('E');
       
        TCuerda Cuerda = new TCuerda();
        Cuerda.tocar('C');
        
        Guitarra g = new Guitarra();
        g.tocar('R');
        
        
        TPercusion p = new TPercusion();
        p.tocar('T');
        
        Tambor a = new Tambor();
        a.tocar('H');
        
        System.out.println("");
        Integrante Ramon = new Integrante(new Guitarra());
        Integrante Juan = new Integrante(new Tambor());
        
        Ramon.concierto();
        Juan.concierto();
        Ramon.mi_Instrumento=new Flauta();
        Ramon.concierto();
        
        
    }
    
}
