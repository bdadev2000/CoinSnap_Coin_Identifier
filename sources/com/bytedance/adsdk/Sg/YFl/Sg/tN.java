package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;

/* loaded from: classes.dex */
public class tN implements YFl.InterfaceC0054YFl {
    private final YFl<Float, Float> AlY;
    private boolean DSW = true;
    private final YFl<Integer, Integer> Sg;
    private final YFl.InterfaceC0054YFl YFl;
    private final YFl<Float, Float> tN;

    /* renamed from: vc, reason: collision with root package name */
    private final YFl<Float, Float> f10162vc;
    private final YFl<Float, Float> wN;

    public tN(YFl.InterfaceC0054YFl interfaceC0054YFl, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.wN.nc ncVar) {
        this.YFl = interfaceC0054YFl;
        YFl<Integer, Integer> YFl = ncVar.YFl().YFl();
        this.Sg = YFl;
        YFl.YFl(this);
        yFl.YFl(YFl);
        YFl<Float, Float> YFl2 = ncVar.Sg().YFl();
        this.tN = YFl2;
        YFl2.YFl(this);
        yFl.YFl(YFl2);
        YFl<Float, Float> YFl3 = ncVar.tN().YFl();
        this.AlY = YFl3;
        YFl3.YFl(this);
        yFl.YFl(YFl3);
        YFl<Float, Float> YFl4 = ncVar.AlY().YFl();
        this.wN = YFl4;
        YFl4.YFl(this);
        yFl.YFl(YFl4);
        YFl<Float, Float> YFl5 = ncVar.wN().YFl();
        this.f10162vc = YFl5;
        YFl5.YFl(this);
        yFl.YFl(YFl5);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.DSW = true;
        this.YFl.YFl();
    }

    public void YFl(Paint paint) {
        if (this.DSW) {
            this.DSW = false;
            double floatValue = this.AlY.DSW().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.wN.DSW().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.Sg.DSW().intValue();
            paint.setShadowLayer(this.f10162vc.DSW().floatValue(), sin, cos, Color.argb(Math.round(this.tN.DSW().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }
}
