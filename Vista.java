import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public int menu_p(Radio radio) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        try {
            if (radio instanceof RadioC) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad\n7.Salir");
                i = scan.nextInt();
                while (i <= 0 || i >= 8) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else if (radio instanceof RadioS) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad\n7.Salir");
                i = scan.nextInt();
                while (i <= 0 || i >= 8) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else if (radio instanceof RadioA) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad\n7.Salir");
                i = scan.nextInt();
                while (i <= 0 || i >= 8) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Salir");
                i = scan.nextInt();
                while (i <= 0 || i >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return i;
    }

    public int menu_r() {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\n¿Que desea hacer?\n1.Cambar FM a AM\n2.Cambiar emisora (intervalos de 0.5)\n3.Guatdar emisora\n4.Cargar emisora\n5.Salir");
            i = scan.nextInt();
            while (i <= 0 || i >= 6) {
                System.out.println("\n*********Ingrese una opcion valida*********");
                i = scan.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return i;
    }

    public int menu_re() {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\n¿Que desea hacer?\n1.Seleccionar lista de reproduccion\n2.Cambiar cancion\n3.Escuchar cancion\n4.Salir");
            opcion = scan.nextInt();
            while (opcion <= 0 || opcion >= 5) {
                System.out.println("\n*********Ingrese una opcion valida*********");
                opcion = scan.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return opcion;
    }

    public int menu_t(Radio radio) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try {
            if (radio instanceof RadioS) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Cambiar a bocinas o auriculares\n6.Salir");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioA) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Llamar al ultimo contacto con el que se hablo\n6.Salir");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioC) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Cambiar a llamada en espera\n6.Salir");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else{
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Salir");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 6) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            }
        } catch (Exception e) {

        }
        return opcion;
    }
    
    public int menu_pro(Radio radio){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            if(radio instanceof RadioS){
                System.out.println("\n¿Que desea hacer?\n1.Planificar Viajes");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioA){
                System.out.println("\n¿Que desea hacer?\n1.Ver tarjetas de presentacion");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioC){
                System.out.println("\n¿Que desea hacer?\n1.Ver pronostico del tiempo");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else{
                System.out.println("\nEste radio no cuenta con el Modo Productividad");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
    }
    
    public String nombre_emisora(){
        String nombre = "";
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Ingrese el nombre de la emisora");
            nombre = scan.nextLine();
        }catch (Exception e){
            System.out.println(e);
        }
        return nombre;
    }
    
    public int indexEmi(ArrayList<String> emisoras){
        int opcion = 0;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        try{
            for (String emisora : emisoras) {
                i++;
                System.out.println(i+". "+emisora);
            }
            System.out.println("\n¿Que emisora desea cargar?");
            opcion = scan.nextInt()-1;
            while(opcion < 0 || opcion >= emisoras.size()){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt()-1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
        
    }
    
    public int menu_tipo(){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("\n¿Que tipo de radio esta instalando?\n1.Radio Comun\n2.Radio Clase A\n3.Radio Clase C\n4.Radio Clase S");
            opcion = scan.nextInt();
            while(opcion <= 0 || opcion >= 5){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
    }
    
    public boolean menu_vol(){
        boolean decision = false;
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("\n¿Que desea hacer?\n1.Subir volumen\n2.Bajar volumen");
            opcion = scan.nextInt();
            while(opcion <= 0 || opcion >= 3){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
            if(opcion == 1){
                decision = true;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return decision;
    }
    
    public boolean menu_emi(){
        boolean decision = false;
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("\n¿Que desea hacer para cambiar de emisora?\n1.Subir frecuencia\n2.Bajar frecuencia");
            opcion = scan.nextInt();
            while(opcion <= 0 || opcion >= 3){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
            if(opcion == 1){
                decision = true;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return decision;
    }
    
    public int menu_play(){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("¿Que playlist desea escuchar?\n1.Playlist Normal\n2.Playlist en espanol\n3.Playlist personal\n4.Playlist familiar");
            opcion = scan.nextInt();
            while(opcion <= 0 || opcion >= 5){
                System.out.println("******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
    }
    
    public void imprimirArray(ArrayList<String> array){
        try{
            for (String array1 : array) {
                System.out.println(array1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public int indexArray(ArrayList<String> array){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            int i = 0;
            System.out.println("\nElija una opcion: ");
            for(String array1: array){
                i++;
                System.out.println(i+". "+array1);
            }
            opcion = scan.nextInt()-1;
            while(opcion <= 0 || opcion >= array.size()){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
    }
    
     public boolean menu_cancion(){
        boolean decision = false;
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("\n¿Que desea hacer?\n1.Retroceder una cancion\n2.Avanzar una cancion");
            opcion = scan.nextInt();
            while(opcion <= 0 || opcion >= 3){
                System.out.println("\n******Ingrese una opcion valida******");
                opcion = scan.nextInt();
            }
            if(opcion == 1){
                decision = true;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return decision;
    }
}
