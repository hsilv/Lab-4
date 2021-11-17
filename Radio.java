//Contiene clases para manejar la entrada/salida.//
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
    protected ArrayList<String> historial;
    protected String cancion;

    public Radio() {
        this.volumen = 10;
        this.banda = "FM";
        this.frecuencia = 105.5;
        this.turn = false;
        this.turn_tel = false;
        this.incremento_vol = 1;
        this.emisoras = new ArrayList(1);
        this.emisoras.add("La Marca,107.0,MHz,FM");
        try {
            FileReader lector = new FileReader("Lista_contactos.csv");
            BufferedReader BR = new BufferedReader(lector);
            String contacto = "";
            boolean flag = true;
            do{
                contacto = BR.readLine();
                if(contacto == null){
                    flag = false;
                } else{
                    String[] datos = contacto.split(",");
                    contactos.add(datos[0]+": "+datos[1]);
                }
            }while(flag);
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
    public void seleccionarLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarCancion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escucharCancion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conec_desconec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llamarC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String to = "";
        String estado = "";
        String estado2 = "";
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
        to = "***********************************************************\n" + "Radio Comun\n" + "Estado: " + estado + "\nVolumen: " + this.volumen + "\nBanda: " + this.banda + "\nFrecuencia: " + this.frecuencia + "MHz\nTelefono: " + estado2 + "\n***********************************************************";
        return to;
    }

    public boolean isTurn() {
        return turn;
    }

}