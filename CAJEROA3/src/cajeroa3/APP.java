/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroa3;
import cajeroa3.CLAVE;
import cajeroa3.ENTRADAS;
import javax.swing.JOptionPane;
/**
 *
 * @author Chokolate
 */
public class APP {
    
    double saldo = 0, tasa = 0.012; 
    
    public static void main(String[] args) {
               CLAVE uy= new CLAVE();
        APP ca = new APP();
         ENTRADAS cap= new ENTRADAS(); 
    }
        
    
     public APP(){    
         
        
      ENTRADAS cap= new ENTRADAS(); 
        
 
         
         
        double saldo = 0, tasa = 0.012;   
        int opcion = 0;
        double valor = 0;
        String op="";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (opcion != 9) {
            //menu listo y esta entrando en el switch case
            op=JOptionPane.showInputDialog("Seleccione Una Opcion: \n "
                                           + "1 consignar \n"
                                           + "2 retirar \n"
                                           + "3 saldo \n"
                                           + "4 salir \n");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    
                    //double saldo=0;
                    valor = cap.consignar();//metodo consignar 
                    saldo = saldo + valor;//por que  no se  inicializa saldo
                    
                    MENSAJE pc = new MENSAJE(5, 0);//por que  aqui va 0 en vez de saldo
                    
                    break;
                    
                    case 2:
                    valor = cap.retirar();//se pordria  hacer  un solo metodo para  consignar y retirar  pero tocaria  poner las   condiciones  especiale spara  caa uno en el "CASE" para  asi confirmar que  es logica el retiro o  la  consignacion
                    saldo = saldo - valor;
                    
                    MENSAJE ph = new MENSAJE(5, 0);
                    break;
                    
                    case 3://mostrar  saldo que lo hago en un mensaje directamente,se  muestra el   interes  y el total que  se  tiene  en la  cuenta
                     
                    MENSAJE pd = new MENSAJE(5, 0);
                    break;

                    case 4:// salir
                    System.exit(0);
                    break;
                    
                    
                    
                    default:// cualquier otra  opcion que  no este  en el menu
                    MENSAJE pl = new MENSAJE(9, 0);
                    break;

                
            }
        }
    
        
     }
     
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
     

    double SALDO() {
       this.saldo = saldo;
    return saldo; //To change body of generated methods, choose Tools | Templates.
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    double TASA() {
       this.tasa = tasa;
    return tasa; //To change body of generated methods, choose Tools | Templates.
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   

}