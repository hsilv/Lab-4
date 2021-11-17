import java.util.*;
public class RadioC extends Radio{
    private boolean idle;
    private String pronostico;
    
    public RadioC(){
        super();
        this.idle = false;
    }
    public void espera(){
        this.idle = true;
    }
    
    @Override
    public void llamarC(Vista v){
        try{
            if(this.llamada == false || this.idle){
            System.out.println("\n¿A que contacto desea llamar?");
            int opcion = v.indexArray(contactos);
            System.out.println("Se llamara a: "+contactos.get(opcion));
            this.llamada = true;
            this.contacto = contactos.get(opcion);
            }
            else{
                System.out.println("\nAun esta en llamada, no puede llamar");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void pronostico(){
        try{
            Random rand = new Random();
            double temperatura = (rand.nextDouble()*4)+32;
            double velocidad = (rand.nextDouble()*4);
            int factor = (rand.nextInt()*4);
            if(factor == 1){
                this.pronostico = "Clima: Soleado, Temperatura: "+temperatura+", Velocidad del aire: "+velocidad;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @Override
    public String toString(){
        String cadena = "";
        return cadena;
    }
}