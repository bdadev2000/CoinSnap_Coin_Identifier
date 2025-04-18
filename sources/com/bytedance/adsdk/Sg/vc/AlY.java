package com.bytedance.adsdk.Sg.vc;

/* loaded from: classes.dex */
public class AlY {
    private int Sg;
    private float YFl;

    public void YFl(float f10) {
        float f11 = this.YFl + f10;
        this.YFl = f11;
        int i10 = this.Sg + 1;
        this.Sg = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.YFl = f11 / 2.0f;
            this.Sg = i10 / 2;
        }
    }
}
