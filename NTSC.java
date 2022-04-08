package Adapter;

public class NTSC {
    private double fps = 29.97;
    private int lines = 525;
    private String type = "NTSC";

    public double getFps() {
        return fps;
    }

    public int getLines() {
        return lines;
    }

    public String getType() {
        return type;
    }

    public NTSC() {
    }

    // public NTSC(double fps, int lines) {
    // this.fps = fps;
    // this.lines = lines;
    // }
}
