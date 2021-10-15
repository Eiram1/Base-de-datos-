/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;
/**
 *
 * @author Armando
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("José"));
        lsl.append(new String("Mariana"));
        lsl.append(new String("Diego"));
        lsl.append(new String("Eiram"));
        lsl.append("Daniela");
        lsl.transversal();
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos delm tipo Empleado
        lsl2.append(new Empleado(1, "José", "Pérez","García" , 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Diego", "Pérez","Hernández" , 1950.5f, 2017, 5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla","García" , 2850.5f, 2010, 7));
        lsl2.append(new Empleado(1, "Daniela", "Casilla","López" , 3850.5f, 2019, 8));
        
        lsl2.transversal();
    }
    
}
