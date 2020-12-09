package main.java;

public class Desc {
    private float[] loc;
    private String lable;

    public Desc(float[] loc, String lable) {
        this.loc = loc;
        this.lable = lable;
    }

    public float[] getLoc() {
        return loc;
    }

    public void setLoc(float[] loc) {
        this.loc = loc;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
