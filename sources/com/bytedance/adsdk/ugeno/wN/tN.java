package com.bytedance.adsdk.ugeno.wN;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class tN {
    int DSW;
    int EH;
    int GA;
    int NjR;
    boolean Wwa;
    int YoT;
    float eT;
    boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    float f10289nc;
    int qsH;
    int rkt;

    /* renamed from: vc, reason: collision with root package name */
    int f10290vc;
    int wN;
    int YFl = Integer.MAX_VALUE;
    int Sg = Integer.MAX_VALUE;
    int tN = Integer.MIN_VALUE;
    int AlY = Integer.MIN_VALUE;
    List<Integer> pDU = new ArrayList();

    public int Sg() {
        return this.qsH - this.NjR;
    }

    public int YFl() {
        return this.DSW;
    }

    public void YFl(View view, int i10, int i11, int i12, int i13) {
        Sg sg2 = (Sg) view.getLayoutParams();
        this.YFl = Math.min(this.YFl, (view.getLeft() - sg2.GA()) - i10);
        this.Sg = Math.min(this.Sg, (view.getTop() - sg2.pDU()) - i11);
        this.tN = Math.max(this.tN, sg2.EH() + view.getRight() + i12);
        this.AlY = Math.max(this.AlY, sg2.rkt() + view.getBottom() + i13);
    }
}
