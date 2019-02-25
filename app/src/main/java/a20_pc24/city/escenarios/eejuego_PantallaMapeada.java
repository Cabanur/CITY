package a20_pc24.city.escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;

import java.util.ArrayList;

import a20_pc24.city._DimensionesDispositivo;
import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;
import a20_pc24.city.sprites.S_Sprite;

//Clase que únicamente define el comportamiento general de las clases de los mapas

public class eejuego_PantallaMapeada {

    private int escenarioID;                            //Cada clase tiene un ID
    public int getEscenarioID() {
        return escenarioID;
    }
    public void setEscenarioID(int escenarioID) {
        this.escenarioID = escenarioID;
    }

    /**************************************************************************************/
    /**************************************************************************************/
    /**************************************************************************************/

    private ArrayList<S_Sprite> elementosMapa;          //Elementos mapa es el array que contiene todos los tiles que habrá en el mapa
    public Bitmap mapaMontado;                          //El método montar mapa genera este bitmap.
    public static ST_TileSprite[][] mapaCoord;

    PointF posicionInicialPersonajePrincial = new PointF(2, 14);

    public eejuego_PantallaMapeada(){
        ST_TileSprite[][] mapaCoord = this.rellenador();
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


    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

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

    public void dibujaMapa(Canvas c, float aumento){

        c.drawColor(Color.BLACK);
        int incremento = _Tiles.PLACEHOLDER.getSpriteDPsY();        //Dibujamos en función de la altura

        for(int i = 0, posX = 0; i < this.mapaCoord.length; i++, posX+=incremento){
            for(int j = 0, posY = 0; j < this.mapaCoord[i].length; j++, posY+=incremento){
                this.mapaCoord[i][j].setSpritePosY(posY);
                this.mapaCoord[i][j].setSpritePosX(posX);
                this.mapaCoord[i][j].spriteDibujar(c, aumento);
            }
        }
    }

    /**
     * Tomando como centro [coordX, coordY] dibuja el mapa
     * @param c
     * @param coordX
     * @param coordY
     * @param aumento
     */
    public void dibujaMapa(Canvas c, float coordX, float coordY, float aumento){

        c.drawColor(Color.BLACK);

        float isY = coordY;

        int incremento = _Tiles.PLACEHOLDER.getSpriteDPsY();        //Todos los tiles tiene las mismas dimensiones

        float posicionInicioDibujoDPY = _DimensionesDispositivo.getDpAlto(_DimensionesDispositivo.pYAlto);
        float posicionInicioDibujoDPX = _DimensionesDispositivo.getDpAlto(_DimensionesDispositivo.pXLargo);

//        for(int i = 0; i < this.mapaCoord.length; i++, coordX+=incremento){
//            for(int j = 0; j < this.mapaCoord[i].length; j++, coordY+=incremento){
//                Log.i("COORDS","COORDX "+coordX+" COORDY "+coordY);
//                Log.i("index","i  "+i+" j "+j);
//                this.mapaCoord[i][j].setSpritePosY(coordY);
//                this.mapaCoord[i][j].setSpritePosX(coordX);
//                this.mapaCoord[i][j].spriteDibujar(c);
//            }
//            coordY = isY;
//        }
    }

    public void actualizarMapa(){

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * Método para rellanar arrays, usado a modo de placeholder hasta tener los mapas de coordenadas correspondientes
     * @return array bidimensional correspondiente a un mapa plano e uniforme
     */

    public ST_TileSprite[][] rellenador(){
        this.mapaCoord = new ST_TileSprite[20][15];
        for(int i = 0; i<this.mapaCoord.length;i++){
            for(int j = 0; j<this.mapaCoord[i].length;j++){
                this.mapaCoord[i][j]= _Tiles.PLACEHOLDER;
            }
        }
        return this.mapaCoord;
    }

    /**
     *
     * @param event
     * @return
     */
    public int onTouchEvent(MotionEvent event) {
        return 0;
    }
}
