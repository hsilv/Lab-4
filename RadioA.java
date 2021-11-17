import java.io.*;
import java.util.ArrayList;

public class RadioA extends Radio {

    private String contacto;
    private ArrayList<String> tarjetas;

    public RadioA() {
        super();
        this.contacto = this.contactos.get(2);
        tarjetas = new ArrayList(1);
        try {
            FileReader lector = new FileReader("Lista_contactos.csv");
            BufferedReader BR = new BufferedReader(lector);
            String info = "";
            boolean flag = true;
            do {
                info = BR.readLine();
                if (info == null) {
                    flag = false;
                } else {
                    String[] datos = info.split(",");
                    tarjetas.add("Nombre: " + datos[0] + ", Numero: " + datos[1] + ", " + datos[2] + " en " + datos[3]);
                }
            } while (flag);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void llam_ult() {
        try {
            if (this.llamada) {
                System.out.println("\nNo puede llamar a otra persona, ya esta en una llamada");
            } else {
                System.out.println("\nSe llamra a: " + this.contacto);
                this.llamada = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void tarjetas(Vista v) {
        try {
            v.imprimirArray(tarjetas);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}