/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author MargaritaT
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Conjuntos<Integer> Conjunto1 = new Conjuntos<Integer>();
         Conjuntos<Integer> Conjunto2 = new Conjuntos<Integer>();
        
        Conjunto1.add(2);
        Conjunto1.add(6);
        Conjunto1.add(8);
     
        Conjunto2.add(1);
        Conjunto2.add(4);
        Conjunto2.add(9);
       
        
        System.out.println("Tamanio Conjunto");
        System.out.println("Conjunto1 Numero de Elementos " + Conjunto1.numElementos());
        System.out.println("Conjunto2 Numero de Elementos " + Conjunto2.numElementos());
        
        System.out.println("=========================================");
        System.out.println("Contenido Conjuntos");
        System.out.println("Conjunto1 contenido: " + Conjunto1);
        System.out.println("Conjunto2 contenido: " + Conjunto2);
        
        System.out.println("=========================================");
        System.out.println("Ambos conjuntos tienen los mismos elementos");
        System.out.println("Conjunto1 y Conjunto2 son iguales :" + Conjunto1.esSubConjunto(Conjunto2));
        
        
        System.out.println("=========================================");
        System.out.println("Eliminar");
        Conjunto1.eliminar(2);
        Conjunto2.eliminar(1);
        System.out.println("Nuevo Conjunto 1"+ Conjunto1);
        System.out.println("Nuevo Conjunto 2"+ Conjunto2);
        
        
        System.out.println("=========================================");
       
        if(Conjunto1.agregarSi(Conjunto2)==true)
        {
            Conjunto1.add(10);
            System.out.println("Conjunto 1"+Conjunto1);
        }
        else
        {
            System.out.println("El elemnto ya existe");
        }
        
        System.out.println("=========================================");
        System.out.println("Unioo");
        Conjunto1.union(Conjunto2);
        System.out.println("Conjunto1 union Conjunto2 " + Conjunto1);
        System.out.println("=========================================");
        System.out.println("Interseccion");
        Conjuntos<Integer> conjuntoi = Conjunto1.interseccion(Conjunto2);
        System.out.println("intersection Conjunto1 Conjunto1 " + conjuntoi);

  
       
        
     
        

    }

   
    
}
