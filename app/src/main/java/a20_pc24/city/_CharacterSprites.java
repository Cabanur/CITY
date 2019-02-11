package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;

import a20_pc24.city.sprites.ST_TileSprite;
import a20_pc24.city.sprites.SpPersonajePrincipal;

public class _CharacterSprites {

    private Context spriteContext;

    //Personaje Principal Frente
    public final SpPersonajePrincipal mainCharaFront =
        new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StaticPanda/front.png"),true, true);
    public final SpPersonajePrincipal mainCharaBack =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StaticPanda/back.png"),true, true);
    public final SpPersonajePrincipal mainCharaSideL =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StaticPanda/sideL.png"),true, true);
    public final SpPersonajePrincipal mainCharaSideR =
            new SpPersonajePrincipal(
                    this.flipBitmap(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StaticPanda/front.png")),true,true);
    //Personaje Principal Andando Espalda
    public final SpPersonajePrincipal mainCharaBackStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepBack/bs1.png"),true, true);
    public final SpPersonajePrincipal mainCharaBackStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepBack/bs2.png"),true, true);
    //Personaje Principal Andando Frente
    public final SpPersonajePrincipal mainCharaFrontStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepFront/sf1.png"),true, true);
    public final SpPersonajePrincipal mainCharaFrontStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepFront/sf2.png"),true, true);
    //Personaje Principal Andando Derecha
    public final SpPersonajePrincipal mainCharaRightStep1 =
            new SpPersonajePrincipal(
                    this.flipBitmap(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL1.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep2 =
            new SpPersonajePrincipal(
                    this.flipBitmap(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL2.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep3 =
            new SpPersonajePrincipal(
                    this.flipBitmap(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL3.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep4 =
            new SpPersonajePrincipal(
                    this.flipBitmap(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL4.png")),true, true);
    //Personaje Principal Andando Izquierda
    public final SpPersonajePrincipal mainCharaLeftStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepFront/sf1.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL2.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep3 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL3.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep4 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL4.png"),true, true);

    

    public _CharacterSprites(Context spriteContext){
        this.spriteContext = spriteContext;
    }

    public void setSpriteContext(Context spriteContext){
        this.spriteContext = spriteContext;
    }

    public Context getSpriteContext(){
        return this.spriteContext;
    }

    /**
     * Fuente: https://acomputerengineer.wordpress.com/2016/06/07/flip-imagebitmap-horizontally-and-vertically-in-android/
     *
     * @param bm bitmap que vamos a usar
     * @return bm girado horizontalmente
     */

    public Bitmap flipBitmap(Bitmap bm){
        Matrix m = new Matrix();
        m.preScale(-1.0f, 1.0f);
        Bitmap flipedBM = Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), m, true);
        return flipedBM;
    }
}
