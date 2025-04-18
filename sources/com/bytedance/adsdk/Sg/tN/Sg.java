package com.bytedance.adsdk.Sg.tN;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;
import vd.e;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Sg {
    public YFl AlY;
    public float DSW;
    public PointF GA;

    @ColorInt
    public int NjR;
    public String Sg;
    public String YFl;
    public PointF YoT;
    public boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    public float f10189nc;

    @ColorInt
    public int qsH;
    public float tN;

    /* renamed from: vc, reason: collision with root package name */
    public float f10190vc;
    public int wN;

    /* loaded from: classes.dex */
    public enum YFl {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public Sg(String str, String str2, float f10, YFl yFl, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        YFl(str, str2, f10, yFl, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void YFl(String str, String str2, float f10, YFl yFl, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.YFl = str;
        this.Sg = str2;
        this.tN = f10;
        this.AlY = yFl;
        this.wN = i10;
        this.f10190vc = f11;
        this.DSW = f12;
        this.qsH = i11;
        this.NjR = i12;
        this.f10189nc = f13;
        this.eT = z10;
        this.YoT = pointF;
        this.GA = pointF2;
    }

    public int hashCode() {
        int ordinal = ((this.AlY.ordinal() + (((int) (e.c(this.Sg, this.YFl.hashCode() * 31, 31) + this.tN)) * 31)) * 31) + this.wN;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f10190vc);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.qsH;
    }

    public Sg() {
    }
}
