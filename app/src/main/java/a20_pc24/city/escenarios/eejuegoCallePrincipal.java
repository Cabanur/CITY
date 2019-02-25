package a20_pc24.city.escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;

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
    public void dibujaMapa(Canvas c, float aumento){
        super.dibujaMapa(c, aumento);
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
