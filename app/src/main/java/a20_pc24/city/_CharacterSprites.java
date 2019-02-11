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
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StaticPanda/front.png")),true,true);
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
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL1.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep2 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL2.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep3 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL3.png")),true, true);
    public final SpPersonajePrincipal mainCharaRightStep4 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL4.png")),true, true);
    //Personaje Principal Andando Izquierda
    public final SpPersonajePrincipal mainCharaLeftStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepFront/sf1.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL2.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep3 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL3.png"),true, true);
    public final SpPersonajePrincipal mainCharaLeftStep4 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset(this.getSpriteContext(),"panda/StepLeft/sL4.png"),true, true);

    public void setSpriteContext(Context spriteContext){
        this.spriteContext = spriteContext;
    }

    public Context getSpriteContext(){
        return this.spriteContext;
    }
}
