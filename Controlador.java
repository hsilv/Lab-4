//Controlador (Controller): Este componente es el que responde a la interacción (eventos) que hace el usuario en la interfaz//
//y realiza las peticiones al modelo para pasar estos a la vista.//

public class Controlador {

    public static void main(String[] args) {
        Vista v = new Vista();
        int index_radio = 0;
        int index_accion1 = 0;
        int index_accion2 = 0;
        index_radio = v.menu_tipo();
        Radio radio;

        if (index_radio == 1) {
            radio = new Radio();
            System.out.println(radio);
            while (index_accion1 != 6) {
                index_accion1 = v.menu_p(radio);
                if (index_accion1 == 1) {
                    radio.turn();
                    System.out.println(radio);
                    
                } else if (index_accion1 == 2 && radio.isTurn()) {
                    radio.vol(v.menu_vol());
                    System.out.println(radio);
                    
                } else if (index_accion1 == 3 && radio.isTurn()) {
                    while (index_accion2 != 5) {
                        index_accion2 = v.menu_r();
                        
                        if (index_accion2 == 1) {
                            radio.Switch();
                            System.out.println(radio);
                            
                        } else if (index_accion2 == 2) {
                            radio.cambiarEmisora(v.menu_emi());
                            System.out.println(radio);
                            
                        } else if (index_accion2 == 3) {
                            radio.guardarEmisora(v.nombre_emisora());
                            System.out.println(radio);
                            
                        } else if (index_accion2 == 4) {
                            radio.cargarEmisora(v);
                            System.out.println(radio);
                        }
                        
                    }
                } else if(index_accion1 == 4 && radio.isTurn()){
                    index_accion2 = 0;
                    while(index_accion2 != 4){
                        index_accion2 = v.menu_re();
                        
                        if(index_accion2 == 1){
                            radio.seleccionarLista(v);
                            System.out.println(radio);
                            
                        } else if(index_accion2 == 2){
                            radio.cambiarCancion(v);
                            System.out.println(radio);
                            
                        } else if(index_accion2 == 3){
                            radio.escucharCancion(v);
                            System.out.println(radio);
                        }
                    }
                }
            }
        }
    }
}
