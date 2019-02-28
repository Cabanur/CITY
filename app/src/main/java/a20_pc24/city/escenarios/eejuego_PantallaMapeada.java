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
    public ST_TileSprite[][] mapaCoord;
    public ST_TileSprite[][] tilesVisibles;
    public Bitmap mapaMontado;                          //El método montar mapa genera este bitmap.
    private Point posicionInicialPersonajePrincial = new Point( 10, 10);
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

        c.drawColor(Color.BLACK);

        /*******************************************************/
        // Usamos las coordenadas del personaje principal
        // para determinar la posición del tile central en el array
        ST_TileSprite tileCentral = this.mapaCoord
                    [this.getPosicionInicialPersonajePrincial().x]          //Corresponde a mapaCoordenadas[x][]
                    [this.getPosicionInicialPersonajePrincial().y];         //Corresponde a mapaCoordenadas[][y]
        /*******************************************************/
        //Determina los 4 puntos de tileCentral

        //x
        tileCentral.setSpritePosX(_Utiles.posicionaSpriteMedioX(tileCentral, this.escalaEscenarioDefecto));
        this.tileCentralPosXOrigen =                                        //left
                tileCentral.getSpritePosX();
        this.tileCentralPosXFin =                                           //right
                tileCentralPosXOrigen+tileCentral.getSpriteDPsX();

        //y
        tileCentral.setSpritePosY(_Utiles.posicionaSpriteMedioY(tileCentral, this.escalaEscenarioDefecto));
        this.tileCentralPosYOrigen =                                        //top
                tileCentral.getSpritePosY();
        this.tileCentralPosYFin =                                           //bottom
                tileCentralPosYOrigen+tileCentral.getSpriteDPsY();
        Log.i("tileCentralPosXOrigen ","XIni "+tileCentralPosXOrigen);
        Log.i("tileCentralPosXFin ","XFin "+tileCentralPosXFin);
        Log.i("tileCentralPosYOrigen ","YIni "+tileCentralPosYOrigen);
        Log.i("tileCentralPosYFin ","YFin "+tileCentralPosYFin);

        tileCentral.spriteDibujar(c);
        /*******************************************************/
        //Determina cuántos tiles caben en el eje vertical y horizontal


        float numTilesHorizontal =
                        _DimensionesDispositivo.screenDPsX/tileCentral.getSpriteDPsX();
        float numTilesVertical =
                        _DimensionesDispositivo.screenDPsY/tileCentral.getSpriteDPsY();

        Log.i("Num total horizontal ","CEIL: "+Math.ceil(numTilesHorizontal)+" PLAIN: "+numTilesHorizontal);  //21
        Log.i("Num total vertical ","CEIL: "+Math.ceil(numTilesVertical)+" PLAIN: "+numTilesVertical);        //12

        /*******************************************************/
        //Determina cuántos tiles se verán

        numTilesHorizontal = (float)Math.ceil(numTilesHorizontal);
        if(Math.ceil(numTilesHorizontal)%2==0){
            numTilesHorizontal++;
        }
        int mitadExclX = (int)(numTilesHorizontal-1)/2;

        numTilesVertical = (float)Math.ceil(numTilesVertical);
        if(Math.ceil(numTilesVertical)%2==0){
            numTilesVertical++;
        }
        int mitadExclY = (int)(numTilesVertical-1)/2;

//        Log.i("Num total horizontal ","CEIL: "+Math.ceil(numTilesHorizontal)+" PLAIN: "+numTilesHorizontal);  //21
//        Log.i("Num total vertical ","CEIL: "+Math.ceil(numTilesVertical)+" PLAIN: "+numTilesVertical);        //13

//        Log.i("DEBUG ","Num exclusivo mitad tiles horizontal "+mitadExclX);
//        Log.i("DEBUG ","Num exclusivo mitad tiles vertical "+mitadExclY);
            //   6
            //10 1 10
            //   6
        int idxPrimerTileVisibleX =
                (int)tileCentral.getSpritePosX()-mitadExclX;
        int idxPrimerTileVisibleY =
                (int)tileCentral.getSpritePosY()-mitadExclY;

        Log.i("idxPrimerTileVisibleX ","X "+idxPrimerTileVisibleX);
        Log.i("idxPrimerTileVisibleY ","Y "+idxPrimerTileVisibleY);

        /*******************************************************/
        //Construye array de visibilidad
        Log.i("DEBUG ","Primer tile visible X "+(int)numTilesVertical);
        Log.i("DEBUG ","Primer tile visible Y "+(int)numTilesHorizontal);

        this.tilesVisibles = new ST_TileSprite
                                    [(int)numTilesVertical]              //13
                                    [(int)numTilesHorizontal];           //21

        for(int i = 0; i<this.tilesVisibles.length;i++){
            for(int j = 0; j<this.tilesVisibles[i].length;j++) {
                try {
                    this.tilesVisibles[i][j] = this.mapaCoord
                                                    [idxPrimerTileVisibleX + i]
                                                    [idxPrimerTileVisibleY + j];
                    Log.i("POSITION ",
                            "NEW ARRAY x:"+i+" y:"+j
                               + "\n OLDY ARRAY x:"+(idxPrimerTileVisibleX + i)
                                             +" y:"+(idxPrimerTileVisibleY + j)+" TILE");
                }catch(IndexOutOfBoundsException iobe){
                    this.tilesVisibles[i][j] = _Tiles.PLACEHOLDER;
//                    Log.i("POSITION ",
//                            "NEW ARRAY x:"+i+" y:"+j
//                                    + "\n OLDY ARRAY x:"+(primerTileVisibleX + i)+" y:"+(primerTileVisibleY + j)+" PLACEHOLDER");
                }
            }
        }
        /*******************************************************/
        // Calcula la posición X - Y para empezar a dibujar
        // en relación al tile central

        Log.i("IMPORTANTE",""+_DimensionesDispositivo.screenDPsX);

        float posIniDibX;
        if((Math.ceil(tileCentralPosXOrigen/tileCentral.getSpriteDPsX()))%2==0){
            posIniDibX = (float)((_DimensionesDispositivo.screenDPsX/2) -
                              ((Math.ceil(tileCentralPosXOrigen/tileCentral.getSpriteDPsX())+1)
                              *tileCentral.getSpriteDPsX()));
        }else{
            posIniDibX = (float)((_DimensionesDispositivo.screenDPsX/2) -
                                ((Math.ceil(tileCentralPosXOrigen/tileCentral.getSpriteDPsX()))
                                *tileCentral.getSpriteDPsX()));
        }
        float posIniDibY;
        if((Math.ceil(tileCentralPosYOrigen/tileCentral.getSpriteDPsY()))%2==0){
            posIniDibY = (float)((_DimensionesDispositivo.screenDPsY/2) -
                                ((Math.ceil(tileCentralPosYOrigen/tileCentral.getSpriteDPsY())+1)
                                *tileCentral.getSpriteDPsY()));
        }else{
            posIniDibY = (float)((_DimensionesDispositivo.screenDPsY/2) -
                                (Math.ceil(tileCentralPosYOrigen/tileCentral.getSpriteDPsY())
                                *tileCentral.getSpriteDPsY()));
        }

        Log.i("posIniDibX ",""+posIniDibX);
        Log.i("posIniDibY ",""+posIniDibY);

        /*******************************************************/
        //Dibujo el mapa que cabe en la pantalla
        int incremento = tileCentral.getSpriteDPsY();       //Medida del lado del Tile
        float isY = posIniDibY;

        Log.i("tilesVisibles.length",""+this.tilesVisibles.length);
        Log.i("tilesVisibles[0].length",""+this.tilesVisibles[0].length);


//        this.tilesVisibles[0][0].setSpritePosY(posIniDibY);
//        this.tilesVisibles[0][0].setSpritePosX(posIniDibX);
//        this.tilesVisibles[0][0].spriteDibujar(c);
        for(float i = 0, posY = posIniDibY;i<this.tilesVisibles.length;i++, posY+=incremento){
            for(float j = 0, posX = posIniDibX;j<this.tilesVisibles[(int)i].length;j++, posX+=incremento) {
                Log.i("posY ",""+posY);
                Log.i("posX ",""+posX);
                Log.i("i ",""+i);
                Log.i("j ",""+j);
                if(i==tileCentral.getSpritePosX()){
                    tileCentral.spriteDibujar(c);
                }
                else{
                    this.tilesVisibles[(int)i][(int)j].setSpritePosY(posY);
                    this.tilesVisibles[(int)i][(int)j].setSpritePosX(posX);
                    this.tilesVisibles[(int)i][(int)j].spriteDibujar(c);
                }
            }
        }

//        tileCentral.spriteDibujar(
//                c);
//        ,
//                this.tileCentralPosXOrigen,
//                this.tileCentralPosYOrigen,
//                this.escalaEscenarioDefecto
//        );
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
        this.mapaCoord = new ST_TileSprite[20][20];
        for(int i = 0; i<this.mapaCoord.length;i++){
            for(int j = 0; j<this.mapaCoord[i].length;j++){
                this.mapaCoord[i][j]= _Tiles.EDIFICIO_SUELO;
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
