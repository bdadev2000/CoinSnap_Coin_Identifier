package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class aIu extends YFl {
    private final com.bytedance.adsdk.Sg.tN.tN.YFl AlY;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> DSW;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10175vc;
    private final String wN;

    public aIu(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.Wwa wwa) {
        super(njR, yFl, wwa.DSW().YFl(), wwa.qsH().YFl(), wwa.NjR(), wwa.tN(), wwa.AlY(), wwa.wN(), wwa.vc());
        this.AlY = yFl;
        this.wN = wwa.YFl();
        this.f10175vc = wwa.nc();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl = wwa.Sg().YFl();
        this.DSW = YFl;
        YFl.YFl(this);
        yFl.YFl(YFl);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10175vc) {
            return;
        }
        this.Sg.setColor(((com.bytedance.adsdk.Sg.YFl.Sg.Sg) this.DSW).NjR());
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.qsH;
        if (yFl != null) {
            this.Sg.setColorFilter(yFl.DSW());
        }
        super.YFl(canvas, matrix, i10);
    }
}
