package a20_pc24.city;

public class _Dimensions {

    public double screenDPs;
    public double screenDpi;
    public double pX;
    public double pY;

    /**
     * Fuente: https://desarrollador-android.com/material-design/diseno-material-design/layouts/unidades-y-medidas/#Densidad_independiente_de_pixeles_dp
     * Densidad independiente de píxeles(en función a esto reescalamos los gráficos)
     *
     * Para calcular esto primero hemos de obtener los DPI y el tamaño en px de la altura dle móvil.
     * Usamos pY para este cálculo porque estamos trabajando respecto a la altura del dispositivo apaisado
     */
    public void setDPs(){
        this.screenDPs = (pY * 160) / screenDpi;
    }

    /**
     * Fuente: https://code.i-harness.com/en/q/305125
     * número de píxeles que encajan en una pulgada
     */

    public void setDpi(double densidad){
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
    }

    public void setPxSizeX(int x){
        this.pX = x;
    }

    public void setPxSizeY(int y){
        this.pY = y;
    }


}
