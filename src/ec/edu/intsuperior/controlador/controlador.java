/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

/**
 *
 * @author marcelopula
 */
public class controlador {
//    private Punto arreglo [];
    public void dimension (String dimen){
//    Arreglo String dim Integer.
}
private void txtdimKeyTyped(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if( Character.isLetter(c));
        evt.consume();
    }                 
public void ingresar (String x,String y){
    if (x.equals("")){
        System.out.println(" Se inicializara con cero");
        x= "0";
    }
    if (x.equals("")){
        System.out.println(" Se inicializara con cero");
        x= "0";
}
    int i = 0;
    while (arreglo[i]!= null)
        i++;
    arreglo[i]=new Punto(Integer.parseInt(x));
     arreglo[i]=new Punto(Integer.parseInt(y));
}
 public int getLleno(){
     int b=0;
 
    for (Punto p1:arreglo)// for arreglado o mejorado
        if (p1!=null)
            b++;
        
            return  b;
 }}