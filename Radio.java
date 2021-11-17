
import java.util.ArrayList;
import java.io.*;

public class Radio implements ModoRadio, ModoReproduccion, ModoTelefono {

    protected int incremento_vol;
    protected int volumen;
    protected boolean turn;
    protected String banda;
    protected double frecuencia;
    protected ArrayList<String> emisoras;
    protected boolean turn_tel;
    protected ArrayList<String> contactos;
    protected boolean llamada;
    protected ArrayList<String> playlist;
    protected String cancion;
    protected int index_play;

    public Radio() {
        this.volumen = 10;
        this.banda = "FM";
        this.frecuencia = 105.5;
        this.turn = false;
        this.turn_tel = false;
        this.llamada = false;
        this.incremento_vol = 1;
        this.emisoras = new ArrayList(1);
        this.contactos = new ArrayList(1);
        this.playlist = new ArrayList(1);
        this.emisoras.add("La Marca,107.0,MHz,FM");
        this.index_play = 1;
        try {
            FileReader lector = new FileReader("Lista_contactos.csv");
            BufferedReader BR = new BufferedReader(lector);
            String contact = "";
            boolean flag = true;
            do {
                contact = BR.readLine();
                if (contact == null) {
                    flag = false;
                } else {
                    String[] datos = contact.split(",");
                    contactos.add(datos[0] + ": " + datos[1]);
                }
            } while (flag);
            FileReader lector1 = new FileReader("Canciones.csv");
            BufferedReader BR1 = new BufferedReader(lector1);
            boolean flag1 = true;
            String song = "";
            do {
                song = BR1.readLine();
                if (song == null) {
                    flag = false;
                } else {
                    String[] datos = song.split(",");
                    this.playlist.add("Nombre: " + datos[0] + ", Autor: " + datos[1] + ", Duracion: " + datos[2] + " Genero: " + datos[3]);
                }
            } while (flag);
            this.cancion = this.playlist.get(index_play);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void turn() {
        if (this.turn == false) {
            this.turn = true;
            System.out.println("Se ha encendido el radio");
        } else {
            this.turn = false;
            System.out.println("Se ha apagado el radio");
        }
    }

    public void vol(boolean sentido) {
        if (sentido) {
            this.volumen = this.volumen + this.incremento_vol;
            if (this.volumen > 100) {
                this.volumen = 100;
            }
        } else {
            this.volumen = this.volumen - this.incremento_vol;
            if (this.volumen < 0) {
                this.volumen = 0;
            }
        }
        System.out.println("\nVolumen: " + this.volumen);
    }

    @Override
    public void Switch() {
        if (this.banda.equals("FM")) {
            this.banda = "AM";
            System.out.println("Se ha cambiado a banda AM");
        } else if (this.banda.equals("AM")) {
            this.banda = "FM";
            System.out.println("Se ha cambiado a banda FM");
        }
    }

    @Override
    public void cambiarEmisora(boolean sentido) {
        if (sentido) {
            this.frecuencia = this.frecuencia + 0.5;
            System.out.println("Nueva emisora: " + this.frecuencia + "MHz");
        } else {
            this.frecuencia = this.frecuencia - 0.5;
            System.out.println("Nueva emisora: " + this.frecuencia + "MHz");
        }
    }

    @Override
    public void guardarEmisora(String nombre) {
        try {
            if (this.emisoras.size() < 50) {
                String emisora = nombre + "," + this.frecuencia + ",MHz," + this.banda;
                emisoras.add(emisora);
                System.out.println("Se ha guardado: " + emisora);
            } else {
                System.out.println("Ha llenado el espacio permitido de las emisoras");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void cargarEmisora(Vista v) {
        try {
            int index = v.indexEmi(this.emisoras);
            String[] cadena = this.emisoras.get(index).split(",");
            this.frecuencia = Double.parseDouble(cadena[1]);
            this.banda = cadena[3];
            System.out.println("Se ha cargado: " + this.emisoras.get(index));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void seleccionarLista(Vista v) {
        try {
            int opcion = v.menu_play();
            this.playlist.clear();
            FileReader lector = null;
            if (opcion == 1) {
                lector = new FileReader("Canciones.csv");
            } else if(opcion == 2){
                lector = new FileReader("CancionesEspanol.csv");
            } else if(opcion == 3){
                lector = new FileReader("Listado_canciones.csv");
            } else if(opcion == 4){
                lector = new FileReader("Listado_canciones2.csv");
            }
            BufferedReader BR = new BufferedReader(lector);
            boolean flag = true;
            String song = "";
            do {
                song = BR.readLine();
                if (song == null) {
                    flag = false;
                } else {
                    String[] datos = song.split(",");
                    this.playlist.add("Nombre: " + datos[0] + ", Autor: " + datos[1] + ", Duracion: " + datos[2] + " Genero: " + datos[3]);
                }
            } while (flag);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void cambiarCancion(Vista v) {
        try{
            if(v.menu_cancion()){
                this.index_play++;
                if(this.index_play > this.playlist.size()-1){
                    this.index_play = 0;
                }
                System.out.println("Se ha cambiado a: "+playlist.get(index_play));
                this.cancion = this.playlist.get(index_play);
            } else{
                this.index_play = this.index_play-1;
                if(this.index_play < 0){
                    this.index_play = this.playlist.size()-1;
                }
                System.out.println("Se ha cambiado a: "+playlist.get(index_play));
                this.cancion = this.playlist.get(index_play);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void escucharCancion(Vista v) {
        try{
            System.out.println("\nSe esta escuchando: "+this.cancion);
            System.out.println("\n¿Que cancion desea escuchar?");
            this.cancion = this.playlist.get(v.indexArray(this.playlist));
            System.out.println("\nAhora esta escuchando: "+this.cancion);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void conec_desconec() {
        try{
            if(this.turn_tel){
                this.turn_tel = false;
                System.out.println("\nSe ha desconectado el telefono!");
            } else{
                this.turn_tel = true;
                System.out.println("\nSe ha conectado el telefono!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void mostrarC(Vista v) {
        try{
            System.out.println("\n**********Agenda**********");
            v.imprimirArray(contactos);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void llamarC(Vista v) {
        try{
            if(this.llamada == false){
            System.out.println("\n¿A que contacto desea llamar?");
            int opcion = v.indexArray(contactos);
            System.out.println("Se llamara a: "+contactos.get(opcion));
            this.llamada = true;}
            else{
                System.out.println("\nAun esta en llamada, no puede llamar");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void finC() {
        this.llamada = false;
        System.out.println("\n Ha finalizado su llamada!");
    }

    @Override
    public String toString() {
        String to = "";
        String estado = "";
        String estado2 = "";
        String estado3 = "";
        if(this.llamada){
            estado3 = "En llamada";
        } else{
            estado3 = "Sin llamdas";
        }
        if (this.turn_tel) {
            estado2 = "Conectado";
        } else {
            estado2 = "Desconectado";
        }
        if (this.turn) {
            estado = "Encendido";
        } else {
            estado = "Apagado";
        }
        to = "***********************************************************\n" + "Radio Comun\n" + "Estado: " + estado + "\nVolumen: " + this.volumen + "\nBanda: " + this.banda + "\nFrecuencia: " + this.frecuencia + "MHz\nTelefono: " + estado2 + "\nEstado de llamada:"+estado3+"\n***********************************************************";
        return to;
    }

    public boolean isTurn() {
        return turn;
    }

}
