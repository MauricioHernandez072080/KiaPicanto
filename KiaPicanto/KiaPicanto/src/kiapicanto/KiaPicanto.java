/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiapicanto;

import accessories.AlarmaMatrix;
import accessories.KitBotonEncendidoAlarma;
import accessories.MallaCarga;
import accessories.PernosSeguridadStarlock;
import accessories.Portabicicletas;
import accessories.RinAluminio14;
import accessories.SensorParqueo;
import accessories.TapeteTresPiezas;
import accessories.TiroArrastre;
import component.Vehicle;
import java.text.NumberFormat;
import java.util.Locale;
import models.GTLineAT;
import models.VibrantMT;
import models.ZenithAT;
import models.ZenithMT;

public class KiaPicanto {

    private static final NumberFormat COP = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-CO"));

    private static void imprimir(Vehicle v) {
        System.out.println(v.getDescripcion());
        System.out.println("Total: " + COP.format(v.costo()) + "\n");
    }

    public static void main(String[] args) {
        
        // sin accesorios
        Vehicle v1 = new VibrantMT();
        imprimir(v1);

        //Zenith MT con malla de carga y tapete
        Vehicle v2 = new ZenithMT();
        v2 = new MallaCarga(v2);
        v2 = new TapeteTresPiezas(v2);
        imprimir(v2);

        //Zenith AT con sensor de parqueo, alarma y 4 rines grises 
        Vehicle v3 = new ZenithAT();
        v3 = new SensorParqueo(v3);
        v3 = new AlarmaMatrix(v3);
        for (int i = 0; i < 4; i++) {
            v3 = new RinAluminio14(v3, RinAluminio14.Color.GRIS);
        }
        imprimir(v3);

        //GT Line AT con 4 accesorios
        Vehicle v4 = new GTLineAT();
        v4 = new KitBotonEncendidoAlarma(v4);
        v4 = new PernosSeguridadStarlock(v4);
        v4 = new Portabicicletas(v4);
        v4 = new TiroArrastre(v4);
        imprimir(v4);
    }
}
