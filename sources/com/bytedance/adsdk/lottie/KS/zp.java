package com.bytedance.adsdk.lottie.KS;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class zp {
    private final PointF KS;
    private final PointF lMd;
    private final PointF zp;

    public zp() {
        this.zp = new PointF();
        this.lMd = new PointF();
        this.KS = new PointF();
    }

    public void KS(float f9, float f10) {
        this.KS.set(f9, f10);
    }

    public void lMd(float f9, float f10) {
        this.lMd.set(f9, f10);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.KS.x), Float.valueOf(this.KS.y), Float.valueOf(this.zp.x), Float.valueOf(this.zp.y), Float.valueOf(this.lMd.x), Float.valueOf(this.lMd.y));
    }

    public void zp(float f9, float f10) {
        this.zp.set(f9, f10);
    }

    public PointF KS() {
        return this.KS;
    }

    public PointF lMd() {
        return this.lMd;
    }

    public PointF zp() {
        return this.zp;
    }

    public zp(PointF pointF, PointF pointF2, PointF pointF3) {
        this.zp = pointF;
        this.lMd = pointF2;
        this.KS = pointF3;
    }
}
