package a20_pc24.city.escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;

import java.util.ArrayList;

import a20_pc24.city._DimensionesDispositivo;
import a20_pc24.city._TamanyosEstandar;
import a20_pc24.city._Tiles;
import a20_pc24.city._Utiles;
import a20_pc24.city.sprites.ST_TileSprite;
import a20_pc24.city.sprites.S_Sprite;

//Clase que únicamente define el comportamiento general de las clases de los mapas

public class eejuego_PantallaMapeada {

    private int escenarioID;                            //Cada clase tiene un ID
    private ArrayList<S_Sprite> elementosMapa;          //Elementos mapa es el array que contiene todos los tiles que habrá en el mapa
    public static ST_TileSprite[][] mapaCoord;
    public Bitmap mapaMontado;                          //El método montar mapa genera este bitmap.
    private Point posicionInicialPersonajePrincial = new Point(2, 14);
    public float escalaEscenarioPersonajePrincipal = _TamanyosEstandar._EscalaCalleSpritePrincipal;
    public float escalaEscenarioDefecto = _TamanyosEstandar._Escala1_1;

    public float tileCentralPosXOrigen;
    public float tileCentralPosXFin;
    public float tileCentralPosYOrigen;
    public float tileCentralPosYFin;

    /**
     *
     * @return
     */

    public int getEscenarioID() {
        return escenarioID;
    }

    /**
     *
     * @param escenarioID
     */

    public void setEscenarioID(int escenarioID) {
        this.escenarioID = escenarioID;
    }

    /**
     *
     * @return
     */
    public Point getPosicionInicialPersonajePrincial() {
        return posicionInicialPersonajePrincial;
    }

    /**
     *
     * @param posicionInicialPersonajePrincial
     */
    public void setPosicionInicialPersonajePrincial(Point posicionInicialPersonajePrincial) {
        this.posicionInicialPersonajePrincial = posicionInicialPersonajePrincial;
    }

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
     *
     * @param c
     */
    public void dibujaMapa(Canvas c){

        ST_TileSprite tileCentral = this.mapaCoord[this.getPosicionInicialPersonajePrincial().x]
                [this.getPosicionInicialPersonajePrincial().y];

        c.drawColor(Color.BLACK);


        /*******************************************************/
        //Determina los 4 puntos de tileCentral

        //x
        this.tileCentralPosXOrigen =
                _Utiles.posicionaSpriteMedioX(tileCentral, this.escalaEscenarioDefecto);
        this.tileCentralPosXFin =
                tileCentralPosXOrigen+tileCentral.getSpriteDPsX();

        //y
        this.tileCentralPosYOrigen =
                _Utiles.posicionaSpriteMedioY(tileCentral, this.escalaEscenarioDefecto);
        this.tileCentralPosYFin =
                tileCentralPosYOrigen+tileCentral.getSpriteDPsY();

        /*******************************************************/
        //Determina cuántos tiles caben en el eje vertical y horizontal

        float numTilesHorizontal =
                _DimensionesDispositivo.getDpAltoF(
                        _DimensionesDispositivo.screenDPsX)/tileCentral.getSpriteDPsX();
        float numTilesVertical =
                _DimensionesDispositivo.getDpAltoF(
                        _DimensionesDispositivo.screenDPsY)/tileCentral.getSpriteDPsY();
        /*******************************************************/
        //Determina en qué coordenada empieza a dibujar
        // para poder cargar sólo los tiles visibles

        float numTilesMitadHorizontal = numTilesHorizontal/2;
        if(numTilesMitadHorizontal%2==0){
            numTilesHorizontal++;
        }

        float numTilesMitadVertical = numTilesVertical/2;
        if(numTilesMitadVertical%2==0){
            numTilesVertical++;
        }

        Log.i("Num tiles horizontal","");
        Log.i("Num tiles vertical","");

        int posicionInicioVertical =
                (int)(_DimensionesDispositivo.screenDPsX - (tileCentral.getSpriteDPsX()*numTilesHorizontal));
        int posicionInicioHorizontal =
                (int)(_DimensionesDispositivo.screenDPsY - (tileCentral.getSpriteDPsY()*numTilesVertical));
        /*******************************************************/
        //Dibujo el mapa que cabe en la pantalla

        int incremento = tileCentral.getSpriteDPsY();       //Medida del lado del Tile

        for(int i = 0, posX = posicionInicioHorizontal; i<numTilesHorizontal; i++, posX+=incremento){
            for(int j = 0, posY = posicionInicioVertical; j<numTilesVertical;j++, posY+=incremento){

            }
        }
        _Tiles.PLACEHOLDER.spriteDibujar(
                c,
                this.tileCentralPosXOrigen,
                this.tileCentralPosYOrigen,
                this.escalaEscenarioDefecto
        );
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
     */
//    public void dibujaMapa(Canvas c, float coordX, float coordY, float aumento){
//
//        c.drawColor(Color.BLACK);
//
//        float isY = coordY;
//
//        int incremento = _Tiles.PLACEHOLDER.getSpriteDPsY();        //Todos los tiles tiene las mismas dimensiones
//
//        float posicionInicioDibujoDPY = _DimensionesDispositivo.getDpAlto(_DimensionesDispositivo.pYAlto);
//        float posicionInicioDibujoDPX = _DimensionesDispositivo.getDpAlto(_DimensionesDispositivo.pXLargo);
//
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
//    }

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
