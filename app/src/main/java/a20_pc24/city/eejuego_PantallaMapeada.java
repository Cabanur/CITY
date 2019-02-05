package a20_pc24.city;

import android.graphics.Bitmap;

import java.util.ArrayList;

public abstract class eejuego_PantallaMapeada {
//Clase que únicamente define el comportamiento general de las clases de los mapas

    private double tamanyoX;
    private double tamanyoY;
    private ArrayList<S_Sprite> elementosMapa;
    private Bitmap mapaMonyado;

    /**
     * A pesar de que nunca instanciemos una clase abstracta, este constructor es la base del de los hijos
     *
     * @param tamanyoX
     * @param tamanyoY
     */

    public eejuego_PantallaMapeada(double tamanyoX, double tamanyoY) {
        this.tamanyoX = tamanyoX;
        this.tamanyoY = tamanyoY;
    }

    /**
     * Asigna una colección de elementos al atributo elementosMapa
     *
     * @param elementosMapa
     */

    public void setElementosMapa(ArrayList<S_Sprite> elementosMapa) {
        this.elementosMapa = elementosMapa;
    }

    /**
     * Añade un elemento a la colección de elementos del mapa
     *
     * @param elementosMapa
     */

    public void setElementoMapa(S_Sprite elementosMapa) {
        this.elementosMapa.add(elementosMapa);
    }

    /**
     * Devuelve la colección de objetos usados en este mapa
     *
     * @return
     */

    public ArrayList<S_Sprite> getElementosMapa() {
        return elementosMapa;
    }

    abstract void dibujaMapa();

    abstract void actualizarMapa();
}
