package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;

//Escenario 0

public final class eejuegoCallePrincipal extends eejuego_PantallaMapeada {

    public static ST_TileSprite[][] mapaCoordCallePrincipal = rellenador();

    public eejuegoCallePrincipal() {
        this.setEscenarioID(0);
        this.mapaCoordCallePrincipal = rellenador();
    }
//      TODO: rellenar correctamente este mapa
//     {
//      20x15
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//            {_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO,_Tiles.CALLE_SUELO},
//    };

    /**
     * Método para rellanar arrays, usado a modo de placeholder hasta tener los mapas de coordenadas correspondientes
     * @return array bidimensional correspondiente a un mapa plano e uniforme
     */

    public static ST_TileSprite[][] rellenador(){
        mapaCoordCallePrincipal = new ST_TileSprite[20][15];
        for(int i = 0; i<mapaCoordCallePrincipal.length;i++){
            for(int j = 0; j<mapaCoordCallePrincipal[i].length;j++){
                mapaCoordCallePrincipal[i][j]= _Tiles.CALLE_SUELO;
            }
        }
        return mapaCoordCallePrincipal;
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    @Override
    public Bitmap unificaMapa() {
        return this.mapaMontado;
    }

    @Override
    public void dibujaMapa(Canvas c){
        for(int i = 0, posX = 0; i < mapaCoordCallePrincipal.length; i++, posX+=64){
            for(int j = 0, posY = 0; j < mapaCoordCallePrincipal[i].length; j++, posY+=64){
                mapaCoordCallePrincipal[i][j].setSpritePosY(posY);
                mapaCoordCallePrincipal[i][j].setSpritePosX(posX);
                mapaCoordCallePrincipal[i][j].spriteDibujar(c);
            }
        }
    }

    @Override
    public void actualizarMapa() {

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

}
