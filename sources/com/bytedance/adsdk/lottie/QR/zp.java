package com.bytedance.adsdk.lottie.QR;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.lottie.HWF;
import com.bytedance.component.sdk.annotation.FloatRange;

/* loaded from: classes.dex */
public class zp<T> {
    private float Bj;
    public final Interpolator COT;
    public final float HWF;
    public final Interpolator KS;
    private float KVG;
    public Float QR;
    public PointF YW;
    private float dQp;
    private final HWF dT;
    public final Interpolator jU;
    public PointF ku;
    public T lMd;
    private int rV;
    private int tG;
    private float vDp;
    public final T zp;

    public zp(HWF hwf, T t9, T t10, Interpolator interpolator, float f9, Float f10) {
        this.Bj = -3987645.8f;
        this.vDp = -3987645.8f;
        this.tG = 784923401;
        this.rV = 784923401;
        this.dQp = Float.MIN_VALUE;
        this.KVG = Float.MIN_VALUE;
        this.ku = null;
        this.YW = null;
        this.dT = hwf;
        this.zp = t9;
        this.lMd = t10;
        this.KS = interpolator;
        this.jU = null;
        this.COT = null;
        this.HWF = f9;
        this.QR = f10;
    }

    public boolean COT() {
        if (this.KS == null && this.jU == null && this.COT == null) {
            return true;
        }
        return false;
    }

    public float HWF() {
        if (this.Bj == -3987645.8f) {
            this.Bj = ((Float) this.zp).floatValue();
        }
        return this.Bj;
    }

    public float KS() {
        HWF hwf = this.dT;
        if (hwf == null) {
            return 0.0f;
        }
        if (this.dQp == Float.MIN_VALUE) {
            this.dQp = (this.HWF - hwf.HWF()) / this.dT.tG();
        }
        return this.dQp;
    }

    public float QR() {
        if (this.vDp == -3987645.8f) {
            this.vDp = ((Float) this.lMd).floatValue();
        }
        return this.vDp;
    }

    public int YW() {
        if (this.rV == 784923401) {
            this.rV = ((Integer) this.lMd).intValue();
        }
        return this.rV;
    }

    public float jU() {
        if (this.dT == null) {
            return 1.0f;
        }
        if (this.KVG == Float.MIN_VALUE) {
            if (this.QR == null) {
                this.KVG = 1.0f;
            } else {
                this.KVG = ((this.QR.floatValue() - this.HWF) / this.dT.tG()) + KS();
            }
        }
        return this.KVG;
    }

    public int ku() {
        if (this.tG == 784923401) {
            this.tG = ((Integer) this.zp).intValue();
        }
        return this.tG;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.zp + ", endValue=" + this.lMd + ", startFrame=" + this.HWF + ", endFrame=" + this.QR + ", interpolator=" + this.KS + '}';
    }

    public zp<T> zp(T t9, T t10) {
        return new zp<>(t9, t10);
    }

    public boolean zp(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        return f9 >= KS() && f9 < jU();
    }

    public zp(HWF hwf, T t9, T t10, Interpolator interpolator, Interpolator interpolator2, float f9, Float f10) {
        this.Bj = -3987645.8f;
        this.vDp = -3987645.8f;
        this.tG = 784923401;
        this.rV = 784923401;
        this.dQp = Float.MIN_VALUE;
        this.KVG = Float.MIN_VALUE;
        this.ku = null;
        this.YW = null;
        this.dT = hwf;
        this.zp = t9;
        this.lMd = t10;
        this.KS = null;
        this.jU = interpolator;
        this.COT = interpolator2;
        this.HWF = f9;
        this.QR = f10;
    }

    public zp(HWF hwf, T t9, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f9, Float f10) {
        this.Bj = -3987645.8f;
        this.vDp = -3987645.8f;
        this.tG = 784923401;
        this.rV = 784923401;
        this.dQp = Float.MIN_VALUE;
        this.KVG = Float.MIN_VALUE;
        this.ku = null;
        this.YW = null;
        this.dT = hwf;
        this.zp = t9;
        this.lMd = t10;
        this.KS = interpolator;
        this.jU = interpolator2;
        this.COT = interpolator3;
        this.HWF = f9;
        this.QR = f10;
    }

    public zp(T t9) {
        this.Bj = -3987645.8f;
        this.vDp = -3987645.8f;
        this.tG = 784923401;
        this.rV = 784923401;
        this.dQp = Float.MIN_VALUE;
        this.KVG = Float.MIN_VALUE;
        this.ku = null;
        this.YW = null;
        this.dT = null;
        this.zp = t9;
        this.lMd = t9;
        this.KS = null;
        this.jU = null;
        this.COT = null;
        this.HWF = Float.MIN_VALUE;
        this.QR = Float.valueOf(Float.MAX_VALUE);
    }

    private zp(T t9, T t10) {
        this.Bj = -3987645.8f;
        this.vDp = -3987645.8f;
        this.tG = 784923401;
        this.rV = 784923401;
        this.dQp = Float.MIN_VALUE;
        this.KVG = Float.MIN_VALUE;
        this.ku = null;
        this.YW = null;
        this.dT = null;
        this.zp = t9;
        this.lMd = t10;
        this.KS = null;
        this.jU = null;
        this.COT = null;
        this.HWF = Float.MIN_VALUE;
        this.QR = Float.valueOf(Float.MAX_VALUE);
    }
}
