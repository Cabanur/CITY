package a20_pc24.city.sprites;

import android.graphics.Bitmap;

public abstract class S_Sprite{

    private Bitmap spriteIMG;
    private double spriteLargariaX;
    private double spriteLargariaY;
    private double size[];
    private boolean colisionable;
    private boolean animado;
    //Los identificadores de los tiles están declarados como final en las clase abstracta _TILES

    /**
     * A pesar de ser una clase abstracta, declaro el constructor para que sea la base de los hijos
     *
     * @param spriteIMG
     * @param colisionable
     * @param animado
     */

    public S_Sprite(Bitmap spriteIMG, boolean colisionable, boolean animado){
        this.spriteIMG = spriteIMG;
        this.spriteLargariaX = spriteIMG.getWidth();
        this.spriteLargariaY = spriteIMG.getHeight();
        this.colisionable = colisionable;
        this.animado = animado;
        this.size = new double[]{spriteLargariaX, spriteLargariaY};
    }

    public Bitmap getSpriteIMG() {
        return spriteIMG;
    }

    public void setSpriteIMG(Bitmap spriteIMG) {
        this.spriteIMG = spriteIMG;
    }

    public double getspriteLargariaX() {
        return spriteLargariaX;
    }

    public double getspriteLargariaY() {
        return spriteLargariaY;
    }

    public boolean isColisionable() {
        return colisionable;
    }

    public void setColisionable(boolean colisionable) {
        this.colisionable = colisionable;
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public double[] getSize() {
        return size;
    }

    public void setSize(double x, double y) {
        this.size = new double[]{x,y};
    }

    /**
     * Método destinado a definir el cuadro de coolisiones siempre que colisionable sea TRUE
     * No es abstracto porque es innecesario si el sprite no tiene colisiones
     */

    public void cuadroCoolision(){
    }

    public void movimiento(){
    }

    public void animacion(){

    }
}