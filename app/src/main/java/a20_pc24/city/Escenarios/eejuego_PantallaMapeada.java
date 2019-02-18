package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

import a20_pc24.city._Dimensiones;
import a20_pc24.city._Utiles;
import a20_pc24.city.sprites.S_Sprite;

//Clase que únicamente define el comportamiento general de las clases de los mapas

public class eejuego_PantallaMapeada {

    /**************************************************************************************/
    private int escenarioID;                         //Cada clase tiene un ID

    public int getEscenarioID() {
        return escenarioID;
    }
    public void setEscenarioID(int escenarioID) {
        this.escenarioID = escenarioID;
    }
    /**************************************************************************************/

    private ArrayList<S_Sprite> elementosMapa;      //Elementos mapa es el array que contiene todos los tiles que habrá en el mapa
    public Bitmap mapaMontado;                      //El método montar mapa genera este bitmap.
    public Paint mapaPaint;



    public eejuego_PantallaMapeada(){
        mapaPaint = new Paint();
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

    /**
     *      Aquí se creará el Bitmap del mapa a partir del array bidimensional correspondiente.
     *      El contenido serán los elementos de @param elementosMapa
     *      el array determinará las posiciones mediante sus índices [0,0],[0,1], etc.
     *      el contenido de las variables del array serán los tiles
     *      los tiles contienen su tamaño, calculado en relación al alto del móvil apaisado
     *
     *      source: http://www.androidsnippets.com/combine-multiple-bitmap-into-one.html
     *
     * @return this.mapaMontado
     */
    public Bitmap unificaMapa(){
        return this.mapaMontado;
    }

    /**
     *      Pintará el bitmap @mapaMontado tomando como referencia la posición
     */

    public void dibujaMapa(Canvas c){
        for(int i = 0; i < _Dimensiones.screenDPsX;i+=64){
            for(int j = 0; j < _Dimensiones.screenDPsY;j+=64){
                c.drawBitmap(_Utiles.getBitmapFromAsset("placeholder.png"),i,j,this.mapaPaint);
            }
        }
    }

    public void actualizarMapa(){

    }
}
