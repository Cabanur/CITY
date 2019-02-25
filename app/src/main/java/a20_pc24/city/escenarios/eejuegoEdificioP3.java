package a20_pc24.city.escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class eejuegoEdificioP3 extends eejuego_PantallaMapeada {
    public eejuegoEdificioP3() {


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
