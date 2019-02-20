package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;


public class eejuegoEdificioSotano extends eejuego_PantallaMapeada {

    public static ST_TileSprite[][] mapaCoordEdificioPB;

    public eejuegoEdificioSotano() {

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
        super.dibujaMapa(c);
    }

    @Override
    public void actualizarMapa() {

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/
}
