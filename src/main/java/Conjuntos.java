/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;


/**
 *
 * @author MargaritaT
 */
public class Conjuntos<T> implements Iterable<T>{

    ArrayList<T> elemento =new ArrayList<>();
    
    public int numElementos()
    {
        return elemento.size();
    }
    
    public boolean contenido(T value)
    {
        return elemento.indexOf(value) !=1;
    }
    
       public void add(T value)
    {
            elemento.add(value);
        
    }
       

    
    public boolean agregarSi(Conjuntos<T> other )//si existe no lo duplica
    {
        if(numElementos() !=other.numElementos())
        {
            return false;
        }
        for(int i=0;i<numElementos();i++)
        {
            if(!other.contenido(elemento.get(i))) {
                
                return false;
                
        }
           
    }
         return true;
    }
    
    
    public void eliminar(T value)
    {
        elemento.remove(value);
    }
    
    
   public boolean esSubConjunto(Conjuntos<T> other)
   {
       
        for(int i = 0; i < numElementos(); i++) {
            if(!other.contenido(elemento.get(i))) {
                return true;
            }
        }
        return false;
   }
   
public void union(Conjuntos<T> other) {
        for(int i = 0; i < other.numElementos(); i++) 
        {
            add(other.elemento.get(i));
        }
    }
   
public Conjuntos<T> interseccion(Conjuntos<T> other) {
    
        Conjuntos<T> obj = new Conjuntos<T>();
        
        for(int i = 0; i < numElementos(); i++) 
        {
            if(other.contenido(elemento.get(i))) 
            {
                obj.add(elemento.get(i));
            }
        }
        return obj;
    }

 public Conjuntos<T> diferencia(Conjuntos<T> other) {
        Conjuntos<T> result = new Conjuntos<T>();
        for(int i = 0; i < numElementos(); i++) {
            if(!other.contenido(elemento.get(i))) {
                result.add(elemento.get(i));
            }
        }
        for(int i = 0; i < other.numElementos(); i++) {
            if(!contenido(other.elemento.get(i))) {
                result.add(other.elemento.get(i));
            }
        }
        return result;
    }
    
public String toString() {
        return elemento.toString();
        
    }
  @Override
  public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;
            public boolean hasNext() {
                return index < elemento.size();
            }
            
            
              @Override
            public T next() {
                return elemento.get(index++);
            }
            
     
    
            public void eliminar() {
                throw new UnsupportedOperationException();
            }
        };
}
           
        }


        
    
 
