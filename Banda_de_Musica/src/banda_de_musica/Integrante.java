/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda_de_musica;

public class Integrante {
    
   Instrumento mi_Instrumento;
    
  public Integrante(Instrumento mi_Instrumento){
      this.mi_Instrumento = mi_Instrumento;
      
  }
  public void concierto(){
      mi_Instrumento.tocar('C');
      
  }  
}
