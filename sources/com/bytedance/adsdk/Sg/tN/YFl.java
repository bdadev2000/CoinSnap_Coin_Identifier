package com.bytedance.adsdk.Sg.tN;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class YFl {
    private final PointF Sg;
    private final PointF YFl;
    private final PointF tN;

    public YFl() {
        this.YFl = new PointF();
        this.Sg = new PointF();
        this.tN = new PointF();
    }

    public void Sg(float f10, float f11) {
        this.Sg.set(f10, f11);
    }

    public void YFl(float f10, float f11) {
        this.YFl.set(f10, f11);
    }

    public void tN(float f10, float f11) {
        this.tN.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.tN.x), Float.valueOf(this.tN.y), Float.valueOf(this.YFl.x), Float.valueOf(this.YFl.y), Float.valueOf(this.Sg.x), Float.valueOf(this.Sg.y));
    }

    public PointF Sg() {
        return this.Sg;
    }

    public PointF YFl() {
        return this.YFl;
    }

    public PointF tN() {
        return this.tN;
    }

    public YFl(PointF pointF, PointF pointF2, PointF pointF3) {
        this.YFl = pointF;
        this.Sg = pointF2;
        this.tN = pointF3;
    }
}
