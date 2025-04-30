package com.bytedance.adsdk.lottie.KS;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;
import x0.AbstractC2914a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class lMd {
    public boolean Bj;
    public int COT;
    public float HWF;
    public float KS;
    public float QR;

    @ColorInt
    public int YW;
    public float dT;
    public zp jU;

    @ColorInt
    public int ku;
    public String lMd;
    public PointF tG;
    public PointF vDp;
    public String zp;

    /* loaded from: classes.dex */
    public enum zp {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public lMd(String str, String str2, float f9, zp zpVar, int i9, float f10, float f11, @ColorInt int i10, @ColorInt int i11, float f12, boolean z8, PointF pointF, PointF pointF2) {
        zp(str, str2, f9, zpVar, i9, f10, f11, i10, i11, f12, z8, pointF, pointF2);
    }

    public int hashCode() {
        int ordinal = ((this.jU.ordinal() + (((int) (AbstractC2914a.b(this.zp.hashCode() * 31, 31, this.lMd) + this.KS)) * 31)) * 31) + this.COT;
        long floatToRawIntBits = Float.floatToRawIntBits(this.HWF);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.ku;
    }

    public void zp(String str, String str2, float f9, zp zpVar, int i9, float f10, float f11, @ColorInt int i10, @ColorInt int i11, float f12, boolean z8, PointF pointF, PointF pointF2) {
        this.zp = str;
        this.lMd = str2;
        this.KS = f9;
        this.jU = zpVar;
        this.COT = i9;
        this.HWF = f10;
        this.QR = f11;
        this.ku = i10;
        this.YW = i11;
        this.dT = f12;
        this.Bj = z8;
        this.vDp = pointF;
        this.tG = pointF2;
    }

    public lMd() {
    }
}
