package a20_pc24.city.escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import a20_pc24.city.sprites.ST_TileSprite;


public final class eejuegoEdificioSotano extends eejuego_PantallaMapeada {

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

    /**
     * Gestionado correctamente en eejuego_PantallaMapeada
     * ya que es un método genérico para todos los escenarios
     */
    @Override
    public void dibujaMapa(Canvas c, float aumento){
        super.dibujaMapa(c, aumento);
    }

    @Override
    public void actualizarMapa() {

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/
}
