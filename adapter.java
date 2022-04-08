package Adapter;

public class adapter implements clientInterface {

    private NTSC ntsc;
    private PAL pal;

    public adapter(NTSC ntsc) {
        this.ntsc = ntsc;
    }

    public adapter(PAL pal) {
        this.pal = pal;
    }

    @Override
    public void transformNTSCtoPAL() {
        double result1 = 0;
        int result2 = 0;
        result1 = (ntsc.getFps() - 4.97);
        System.out.println("NTSC adaptado a PAL |fps: " + result1);
        result2 = (ntsc.getLines() + 100);
        System.out.println("NTSC adaptado a PAL |lines: " + result2);

    }

    @Override
    public void transformPALtoNTSC() {
        double result1 = 0;
        int result2 = 0;
        result1 = (pal.getFps() + 4.97);
        System.out.println("PAL adaptado a NTSC |fps: " + result1);
        result2 = (pal.getLines() - 100);
        System.out.println("PAL adaptado a NTSC |lines: " + result2);

    }
}
