package a20_pc24.city;


import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/*
   View decorView = getWindow().getDecorView();
        int opciones = View.SYSTEM_UI_FLAG_FULLSCREEN        // pone la pantalla en modo pantalla completa ocultando elementos no criticos como la barra de estado.
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  // oculta la barra de navegación
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(opciones);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        PruebaSurfaceView pantallaInicio = new PruebaSurfaceView(this);
        pantallaInicio.setKeepScreenOn(true);
*/

public class EA_EscenaActual extends SurfaceView implements SurfaceHolder.Callback{
    private SurfaceHolder surfaceHolder;      // Interfaz abstracta para manejar la superficie de dibujado
    private Context context;                  // Contexto de la aplicación

    private int anchoPantalla=1;              // Ancho de la pantalla, su valor se actualiza en el método surfaceChanged
    private int altoPantalla=1;               // Alto de la pantalla, su valor se actualiza en el método surfaceChanged
    private Hilo hilo;                        // Hilo encargado de dibujar y actualizar la física
    private boolean funcionando = false;      // Control del hilo
    EE_EsquemaEscena escenaActual;


    public EA_EscenaActual(Context context) {
        super(context);
        this.surfaceHolder = getHolder();       // Se obtiene el holder
        this.surfaceHolder.addCallback(this);   // Se indica donde van las funciones callback
        this.context = context;                 // Obtenemos el contexto
        hilo = new Hilo();                      // Inicializamos el hilo
        setFocusable(true);                     // Aseguramos que reciba eventos de toque
    }


    // Actualizamos la física de los elementos en pantalla
//    public void actualizarFisica(){
//
//    }
//
//    // Rutina de dibujo en el lienzo. Se le llamará desde el hilo
//    public void dibujar(Canvas c) {
//        try {
//
//        } catch (Exception e) {
//            Log.i("Error al dibujar",e.getLocalizedMessage());
//        }
//    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        synchronized (surfaceHolder) {
            int nuevaEscena=escenaActual.onTouchEvent(event);
            if(nuevaEscena!=escenaActual.getIdEscena()){
                switch (nuevaEscena){
                    case 0:
                        escenaActual=new EeMenu(context,nuevaEscena,anchoPantalla,altoPantalla);
                        break;
                    case 1:
                        escenaActual=new EeJuego(context,nuevaEscena,anchoPantalla,altoPantalla);
                        break;
                    case 97:
                        escenaActual=new EeOpciones(context,nuevaEscena,anchoPantalla,altoPantalla);
                        break;
                    case 98:
                        escenaActual=new EeRecords(context,nuevaEscena,anchoPantalla,altoPantalla);
                        break;
                    case 99:
                        escenaActual=new EeAyuda(context,nuevaEscena,anchoPantalla,altoPantalla);
                        break;
                }
            }
        }
        return true;
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
//        hilo.setFuncionando(true); // Se le indica al hilo que puede arrancar
//        if (hilo.getState() == Thread.State.NEW) hilo.start(); // si el hilo no ha sido creado se crea;
//        if (hilo.getState() == Thread.State.TERMINATED) {      // si el hilo ha sido finalizado se crea de nuevo;
//            hilo=new Hilo();
//            hilo.start(); // se arranca el hilo
//        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        hilo.setFuncionando(false);  // Se para el hilo
        try {
            hilo.join();   // Se espera a que finalize
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        anchoPantalla = width;               // se establece el nuevo ancho de pantalla
        altoPantalla = height;               // se establece el nuevo alto de pantalla
        escenaActual = new EeMenu(context, 0, anchoPantalla, altoPantalla);

        hilo.setSurfaceSize(width,height);   // se establece el nuevo ancho y alto de pantalla en el hilo
        hilo. setFuncionando(true);
        if(hilo.getState() == Thread.State.NEW){
            hilo.start();
        }
        if(hilo.getState() == Thread.State.NEW){
            Hilo h = new Hilo();
            h.start();
        }
    }


    // Clase Hilo en la cual implementamos el método de dibujo (y física) para que se haga en paralelo con la gestión de la interfaz de usuario
    class Hilo extends Thread {
        public Hilo(){

        }

        @Override
        public void run() {
            while (funcionando) {
                Canvas c = null; //Necesario repintar todo el lienzo
                try {
                    if (!surfaceHolder.getSurface().isValid()) continue; // si la superficie no está preparada repetimos
                    c = surfaceHolder.lockCanvas(); // Obtenemos el lienzo.  La sincronización es necesaria por ser recurso común
                    synchronized (surfaceHolder) {
                        escenaActual.actualizarFisica();  // Movimiento de los elementos
                        escenaActual.dibujar(c);              // Dibujamos los elementos
                    }
                } finally {  // Haya o no excepción, hay que liberar el lienzo
                    if (c != null) {
                        surfaceHolder.unlockCanvasAndPost(c);
                    }
                }
            }
        }

        // Activa o desactiva el funcionamiento del hilo
        void setFuncionando(boolean flag) {
            funcionando = flag;
        }

        // Función es llamada si cambia el tamaño de la pantall o la orientación
        public void setSurfaceSize(int width, int height) {
            synchronized (surfaceHolder) {  // Se recomienda realizarlo de forma atómica

            }
        }
    }
}



