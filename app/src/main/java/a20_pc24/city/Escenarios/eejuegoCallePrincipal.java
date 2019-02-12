package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;

import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;

public final class eejuegoCallePrincipal extends eejuego_PantallaMapeada {

    public static ST_TileSprite[][] mapaCoordCallePrincipal = rellenador();

    public eejuegoCallePrincipal() {
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



    @Override
    public Bitmap unificaMapa() {
        return this.mapaMontado;
    }

    @Override
    public void dibujaMapa(){}

    @Override
    void actualizarMapa() {

    }
}
