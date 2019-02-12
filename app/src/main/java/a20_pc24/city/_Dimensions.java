package a20_pc24.city;

public final class _Dimensions {

    public static float screenDPsX;
    public static float screenDPsY;
    public static float screenDpi;
    public static float pX;
    public static float pY;

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
     */
    public void setDPsY(){
        this.screenDPsY = (pY * 160) / screenDpi;
    }

    public void setDPsX(){
        this.screenDPsX = (pX * 160) / screenDpi;
    }

    /**
     * Fuente: https://code.i-harness.com/en/q/305125
     * Obtiene la cantidad de DPIs(número de píxeles que encajan en una pulgada) de la pantalla
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
     * Obtiene la cantidad de píxels correspondiente al ancho de la pantalla (Apaisada)
     * @param x
     */
    public void setPxSizeX(int x){
        this.pX = x;
    }

    /**
     * Obtiene la cantidad de píxels correspondiente al alto de la pantalla (Apaisada)
     * @param y
     */
    public void setPxSizeY(int y){
        this.pY = y;
    }


}
