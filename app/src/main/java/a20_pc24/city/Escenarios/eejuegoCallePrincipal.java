package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;

import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;

//Escenario 0

public final class eejuegoCallePrincipal extends eejuego_PantallaMapeada {
    PointF posicionInicialPersonajePrincial = new PointF(2, 14);
    public eejuegoCallePrincipal() {
        this.setEscenarioID(0);
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


    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     *
     * @return
     */
    @Override
    public Bitmap unificaMapa() {
        return this.mapaMontado;
    }

    /**
     * Gestionado correctamente en eejuego_PantallaMapeada
     * ya que es un método genérico para todos los escenarios
     */
    @Override
    public void dibujaMapa(Canvas c){
        super.dibujaMapa(c);
    }

    /**
     *
     */
    @Override
    public void actualizarMapa() {

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

}
