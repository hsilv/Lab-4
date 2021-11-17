import java.util.ArrayList;

public class RadioS extends Radio{
    private boolean bocinas;
    private ArrayList<String> viajes;
    
    public RadioS(){
        super();
        this.bocinas = false;
    }
    
    public void switch_bocinas(){
        if(bocinas){
            bocinas = false;
            System.out.println("Se cambio a auriculares");
        }else{
            bocinas = true;
            System.out.println("Se cambio a bocinas");
        }
    }
    
    public void planificar(Vista v){
        String viaje = v.datos_viaje();
        System.out.println(viaje);
    }
    
    @Override
    public String toString(){
        String cadena = "";
        return cadena;
    }
}