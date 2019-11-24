

package com.mycompany.listacircularconjuntos;
public class ListaCircular {
    private Nodo inicio;
    private Nodo ultimo;
    private int tamaño;

    public void ListaCircular() {
       inicio=null;
       ultimo=null;
       tamaño=0;
    }

    ListaCircular milistaunion ;
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia(){
        return (inicio==null)&&(ultimo==null);
    }

    public int getTamaño() {
        return tamaño;
    }
     
                        
    public void addFinal(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setValor(valor);
        if(esVacia())
        {
            inicio=nuevo;
            ultimo=nuevo;
            ultimo.setSiguiente(inicio);
        }
        else
        {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo=nuevo;
        }
        tamaño++;
    }
  
    public boolean buscar(int ref)
    {
        Nodo auxiliar=inicio;
        boolean bandera=false;
        do{
            if(ref==auxiliar.getValor())
            {
                bandera=true;
            }
            else
            {
                auxiliar=auxiliar.getSiguiente();
            }
        }while(auxiliar!=inicio && bandera !=true);
        return bandera;
    }
        
    public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 1;
            do{
                System.out.println("En la posición"
                        +i+" hay un: "+aux.getValor());
                aux = aux.getSiguiente();
                i++;
            }while(aux != inicio);
        }
    }
                        
    
    public ListaCircular union2(ListaCircular Milista,ListaCircular Milista2){
        
        if(Milista.getTamaño()>=Milista2.getTamaño()){
                        
            milistaunion=Milista;  
            
            Nodo aux=Milista2.getInicio();
            do{
                
                if (!valorlista(Milista,aux.getValor())) {
                    milistaunion.addFinal(aux.getValor());
                }                                                
                aux = aux.getSiguiente();                                              
            }while(aux !=Milista2.getInicio()); 
                        
        }else{
            
            milistaunion=Milista2;                                    
            Nodo aux=Milista.getInicio();
            do{
                
                if (!valorlista(Milista2,aux.getValor())) {                                       
                    milistaunion.addFinal(aux.getValor());
                }                                                
                aux = aux.getSiguiente();                                              
            }while(aux !=Milista.getInicio()); 
                                                                                    
        }
        
         
        
        return milistaunion;
    }
    
    public boolean valorlista(ListaCircular lista,int valor){
        boolean estaelvalor=false;

          milistaunion=lista;                                    
            Nodo aux = milistaunion.getInicio();
            
            int tamaño=milistaunion.getTamaño();
            int i=0;
            
            do{
                if(aux.getValor()==valor){
                    estaelvalor=true;  
                    break;
                }
                aux = aux.getSiguiente();                              
                i++;
            }while( i<tamaño); 
            
        return  estaelvalor;
    }
    
    public boolean validarsiesta(ListaCircular listacircular, int valor){
        Nodo aux=listacircular.getInicio();
        boolean siesta=false;
            do{
                
                if (aux.getValor()==valor) {
                    siesta=true;
                }                                                
                aux = aux.getSiguiente();                                              
            }while(aux !=listacircular.getInicio());    
            
        return siesta;
   }
   
    
    
    
    public ListaCircular intersecion(ListaCircular Milista,ListaCircular Milista2){
        ListaCircular milistaInterseccion=new ListaCircular();
        
        
        Nodo auxL1=Milista2.getInicio();
        do{
            if(estaenlalista1(Milista,auxL1.getValor()))   
                if(milistaInterseccion.getInicio()!=null){
                    if (!estaenlalista1(milistaInterseccion,auxL1.getValor())) 
                           milistaInterseccion.addFinal(auxL1.getValor()) ; 
                }else milistaInterseccion.addFinal(auxL1.getValor()) ;    
                                                                                                                               
                 
            
            auxL1=auxL1.getSiguiente();
        }while(auxL1 !=Milista2.getInicio());
                
        return milistaInterseccion;
    }
    private boolean estaenlalista1(ListaCircular milista1,int valor) {
            boolean siesta=false;
            
            Nodo auxL1=milista1.getInicio();
         do{
            if(auxL1.getValor()==valor) siesta=true;
            auxL1=auxL1.getSiguiente();
        }while(auxL1 !=milista1.getInicio()); 
            return siesta;
    }
    
    
    public ListaCircular difrencia(ListaCircular Milista,ListaCircular Milista2){
        ListaCircular milistadiferencia=new ListaCircular();
            Nodo auxL1=Milista2.getInicio();
        do{
            if(!estaenlalista1(Milista,auxL1.getValor()))   
                if(milistadiferencia.getInicio()!=null){
                    if (!estaenlalista1(milistadiferencia,auxL1.getValor())) 
                           milistadiferencia.addFinal(auxL1.getValor()) ; 
                }else milistadiferencia.addFinal(auxL1.getValor()) ;    
                                                                                                                               
                 
            
            auxL1=auxL1.getSiguiente();
        }while(auxL1 !=Milista2.getInicio());    
        return milistadiferencia;
    }
    
   
}
