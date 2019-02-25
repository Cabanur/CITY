package a20_pc24.city;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Clase de apoyo
 * Determinamos las dimensiones de la pantalla
 * para poder acceder a ellas de forma estática en caso de ser necesario
 */

public class _DimensionesDispositivo {

    public static float screenDPsX;
    public static float screenDPsY;
    public static float screenDpi;
    public static float pXLargo;
    public static float pYAlto;

    public static float screenMiddleDPsX;
    public static float screenMiddleDPsY;

    /**
     * Una vez se crea "_DimensionesDispositivo" lanza los métodos que dan valor a las medidas
     *
     * @param cntxt recursos básicos de la aplicación
     * @param display objeto correspondiente a la pantalla donde sucede la activity
     */

    public _DimensionesDispositivo(Context cntxt, Display display){

        this.setDpi((float)cntxt.getResources().getDisplayMetrics().densityDpi);

        Point p = new Point();
        display.getRealSize(p);

        this.setPxSizeY(p.y);
        this.setPxSizeX(p.x);

        this.screenDPsX = _DimensionesDispositivo.getDpAltoF(pXLargo);
        this.screenDPsY = _DimensionesDispositivo.getDpAltoF(pYAlto);

        this.screenMiddleDPsX = screenDPsX/2;
        this.screenMiddleDPsY = screenDPsY/2;
//        this.setDPsX();
//        this.setDPsY();
    }

    /**
     * Fuente: https://desarrollador-android.com/material-design/diseno-material-design/layouts/unidades-y-medidas/#Densidad_independiente_de_pixeles_dp
     * Calcula la DP (densidad independiente de píxeles).
     * En función a esta medida reescalamos los gráficos
     *
     * Para calcular la DP esto primero hemos de obtener los DPI y el tamaño en px de la altura dle móvil.
     * Usamos pY para este cálculo porque estamos trabajando respecto a la altura del dispositivo apaisado
     *
     *
     * Más información sobre Dp vs DPI vs px https://medium.com/@euryperez/android-pearls-set-size-to-a-view-in-dp-programatically-71d22eed7fc0
     * @version 1.0 Usando código de Javi
     */

    public void setDPsY(){
//        this.screenDPsY = pYAlto * (this.screenDpi / DisplayMetrics.DENSITY_DEFAULT);
        this.screenDPsY = this.getDpAltoF(this.pYAlto);
    }

    public void setDPsX(){
//        this.screenDPsX = pXLargo * (this.screenDpi / DisplayMetrics.DENSITY_DEFAULT);
        this.screenDPsX = this.getDpAltoF(this.pXLargo);
    }

    /**
     * Fuente: https://code.i-harness.com/en/q/305125
     * Asigna la cantidad de DPIs(número de píxeles que encajan en una pulgada) de la pantalla
     * @param densidad
     * Su valor también corresponde a:
     * dpi = anchura de la pantalla (o altura) en píxeles/ancho de la pantalla (o altura) en pulgadas
     */

    public void setDpi(float densidad){
        if (densidad== 0.75f)
        {
            // LDPI
        }
        else if (densidad>= 1.0f && densidad< 1.5f)
        {
            // MDPI
        }
        else if (densidad== 1.5f)
        {
            // HDPI
        }
        else if (densidad> 1.5f && densidad<= 2.0f)
        {
            // XHDPI
        }
        else if (densidad> 2.0f && densidad<= 3.0f)
        {
            // XXHDPI
        }
        else
        {
            // XXXHDPI
        }
        this.screenDpi=densidad;
    }

    /**
     * Asigna el número de píxels correspondiente al ancho de la pantalla (Apaisada)
     * @param x largo en px de la pantalla
     */
    public void setPxSizeX(int x){
        this.pXLargo = x;
    }

    /**
     * Asigna el número de píxels correspondiente al alto de la pantalla (Apaisada)
     * @param y
     */
    public void setPxSizeY(int y){
        this.pYAlto = y;
    }

    /******************************************************************************/
    /******************************************************************************/
    /**MÉTODOS DE JAVI PARA LA GESTIÓN DE DPs**************************************/
    /******************************************ALTO EDITION************************/
    /******************************************************************************/

    /**
     * Calculo de las coordenada y en relacion al una pantalla de 1208x775
     * @param pixels INT coordenada en pixses en realcion a una pantalla de 1208x775
     * @return FLOAT coordenada adaptada a la resolucion del dispositivo
     */
    public static float getDpAltoF(int pixels){
        return (float)((pixels/7.75)*_DimensionesDispositivo.pYAlto)/100;
    }

    /**
     * Calculo de las coordenada y en relacion al una pantalla de 1208x775
     * @param pixels FLOAT coordenada en pixses en realcion a una pantalla de 1208x775
     * @return FLOAT coordenada adaptada a la resolucion del dispositivo
     */
    public static float getDpAltoF(float pixels){
        return (float)((pixels/7.75)*_DimensionesDispositivo.pYAlto)/100;
    }

    /**
     * Calculo de las coordenada y en relacion al una pantalla de 1208x775
     * @param pixels INT coordenada en pixses en realcion a una pantalla de 1208x775
     * @return INT coordenada adaptada a la resolucion del dispositivo
     */
    public static int getDpAlto(int pixels){
        return (int)((pixels/7.75)*_DimensionesDispositivo.pYAlto)/100;
    }

    /**
     *  Calculo de las coordenada y en relacion al una pantalla de 1208x775
     * @param pixels FLOAT coordenada en pixses en realcion a una pantalla de 1208x775
     * @return INT coordenada adaptada a la resolucion del dispositivo
     */
    public static int getDpAlto(float pixels){
        return (int)((pixels/7.75)*_DimensionesDispositivo.pYAlto)/100;
    }

}
