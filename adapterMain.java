package Adapter;

public class adapterMain {

    public static void main(String[] args) {

        // NTSC juego1 = new NTSC();
        PAL juego2 = new PAL();

        // adapter adaptador = new adapter(juego1);
        adapter adaptador = new adapter(juego2);

        // adaptador.transformNTSCtoPAL();
        adaptador.transformPALtoNTSC();
        System.out.println("CAMBIADO");

    }
}
