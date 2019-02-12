package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;

import a20_pc24.city._Tiles;
import a20_pc24.city.sprites.ST_TileSprite;

public final class eejuegoEdificioPB extends eejuego_PantallaMapeada {

    public static ST_TileSprite[][] mapaCoordEdificioPB;

    public eejuegoEdificioPB() {
        this.mapaCoordEdificioPB = rellenador();
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

    public static ST_TileSprite[][] rellenador(){
        mapaCoordEdificioPB = new ST_TileSprite[20][15];
        for(int i = 0; i<mapaCoordEdificioPB.length;i++){
            for(int j = 0; j<mapaCoordEdificioPB[i].length;j++){
                mapaCoordEdificioPB[i][j]= _Tiles.EDIFICIO_SUELO;
            }
        }
        return mapaCoordEdificioPB;
    }
}
