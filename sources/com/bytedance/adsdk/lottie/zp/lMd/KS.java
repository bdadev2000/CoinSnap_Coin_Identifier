package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.lottie.zp.lMd.zp;

/* loaded from: classes.dex */
public class KS implements zp.InterfaceC0063zp {
    private final zp<Float, Float> COT;
    private final zp<Float, Float> HWF;
    private final zp<Float, Float> KS;
    private boolean QR = true;
    private final zp<Float, Float> jU;
    private final zp<Integer, Integer> lMd;
    private final zp.InterfaceC0063zp zp;

    public KS(zp.InterfaceC0063zp interfaceC0063zp, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.COT.dT dTVar) {
        this.zp = interfaceC0063zp;
        zp<Integer, Integer> zp = dTVar.zp().zp();
        this.lMd = zp;
        zp.zp(this);
        zpVar.zp(zp);
        zp<Float, Float> zp2 = dTVar.lMd().zp();
        this.KS = zp2;
        zp2.zp(this);
        zpVar.zp(zp2);
        zp<Float, Float> zp3 = dTVar.KS().zp();
        this.jU = zp3;
        zp3.zp(this);
        zpVar.zp(zp3);
        zp<Float, Float> zp4 = dTVar.jU().zp();
        this.COT = zp4;
        zp4.zp(this);
        zpVar.zp(zp4);
        zp<Float, Float> zp5 = dTVar.COT().zp();
        this.HWF = zp5;
        zp5.zp(this);
        zpVar.zp(zp5);
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.QR = true;
        this.zp.zp();
    }

    public void zp(Paint paint) {
        if (this.QR) {
            this.QR = false;
            double floatValue = this.jU.QR().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.COT.QR().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.lMd.QR().intValue();
            paint.setShadowLayer(this.HWF.QR().floatValue(), sin, cos, Color.argb(Math.round(this.KS.QR().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }
}
