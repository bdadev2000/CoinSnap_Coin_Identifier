package com.bytedance.adsdk.Sg.DSW;

/* loaded from: classes.dex */
public class tN {
    private float Sg;
    private float YFl;

    public tN(float f10, float f11) {
        this.YFl = f10;
        this.Sg = f11;
    }

    public float Sg() {
        return this.Sg;
    }

    public float YFl() {
        return this.YFl;
    }

    public String toString() {
        return YFl() + "x" + Sg();
    }

    public boolean Sg(float f10, float f11) {
        return this.YFl == f10 && this.Sg == f11;
    }

    public void YFl(float f10, float f11) {
        this.YFl = f10;
        this.Sg = f11;
    }

    public tN() {
        this(1.0f, 1.0f);
    }
}
