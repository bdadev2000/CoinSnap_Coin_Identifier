package com.bytedance.adsdk.Sg.DSW;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.Sg.DSW;
import com.bytedance.component.sdk.annotation.FloatRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl<T> {
    public final Interpolator AlY;
    public Float DSW;
    private float EH;
    private int GA;
    public PointF NjR;
    public T Sg;
    public final T YFl;
    private float YoT;
    private float eT;

    /* renamed from: nc, reason: collision with root package name */
    private final DSW f10147nc;
    private int pDU;
    public PointF qsH;
    private float rkt;
    public final Interpolator tN;

    /* renamed from: vc, reason: collision with root package name */
    public final float f10148vc;
    public final Interpolator wN;

    public YFl(DSW dsw, T t5, T t10, Interpolator interpolator, float f10, Float f11) {
        this.eT = -3987645.8f;
        this.YoT = -3987645.8f;
        this.GA = 784923401;
        this.pDU = 784923401;
        this.EH = Float.MIN_VALUE;
        this.rkt = Float.MIN_VALUE;
        this.qsH = null;
        this.NjR = null;
        this.f10147nc = dsw;
        this.YFl = t5;
        this.Sg = t10;
        this.tN = interpolator;
        this.AlY = null;
        this.wN = null;
        this.f10148vc = f10;
        this.DSW = f11;
    }

    public float AlY() {
        if (this.f10147nc == null) {
            return 1.0f;
        }
        if (this.rkt == Float.MIN_VALUE) {
            if (this.DSW == null) {
                this.rkt = 1.0f;
            } else {
                this.rkt = ((this.DSW.floatValue() - this.f10148vc) / this.f10147nc.lG()) + tN();
            }
        }
        return this.rkt;
    }

    public float DSW() {
        if (this.YoT == -3987645.8f) {
            this.YoT = ((Float) this.Sg).floatValue();
        }
        return this.YoT;
    }

    public int NjR() {
        if (this.pDU == 784923401) {
            this.pDU = ((Integer) this.Sg).intValue();
        }
        return this.pDU;
    }

    public YFl<T> YFl(T t5, T t10) {
        return new YFl<>(t5, t10);
    }

    public int qsH() {
        if (this.GA == 784923401) {
            this.GA = ((Integer) this.YFl).intValue();
        }
        return this.GA;
    }

    public float tN() {
        DSW dsw = this.f10147nc;
        if (dsw == null) {
            return 0.0f;
        }
        if (this.EH == Float.MIN_VALUE) {
            this.EH = (this.f10148vc - dsw.vc()) / this.f10147nc.lG();
        }
        return this.EH;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.YFl + ", endValue=" + this.Sg + ", startFrame=" + this.f10148vc + ", endFrame=" + this.DSW + ", interpolator=" + this.tN + AbstractJsonLexerKt.END_OBJ;
    }

    public float vc() {
        if (this.eT == -3987645.8f) {
            this.eT = ((Float) this.YFl).floatValue();
        }
        return this.eT;
    }

    public boolean wN() {
        return this.tN == null && this.AlY == null && this.wN == null;
    }

    public boolean YFl(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return f10 >= tN() && f10 < AlY();
    }

    public YFl(DSW dsw, T t5, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.eT = -3987645.8f;
        this.YoT = -3987645.8f;
        this.GA = 784923401;
        this.pDU = 784923401;
        this.EH = Float.MIN_VALUE;
        this.rkt = Float.MIN_VALUE;
        this.qsH = null;
        this.NjR = null;
        this.f10147nc = dsw;
        this.YFl = t5;
        this.Sg = t10;
        this.tN = null;
        this.AlY = interpolator;
        this.wN = interpolator2;
        this.f10148vc = f10;
        this.DSW = f11;
    }

    public YFl(DSW dsw, T t5, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.eT = -3987645.8f;
        this.YoT = -3987645.8f;
        this.GA = 784923401;
        this.pDU = 784923401;
        this.EH = Float.MIN_VALUE;
        this.rkt = Float.MIN_VALUE;
        this.qsH = null;
        this.NjR = null;
        this.f10147nc = dsw;
        this.YFl = t5;
        this.Sg = t10;
        this.tN = interpolator;
        this.AlY = interpolator2;
        this.wN = interpolator3;
        this.f10148vc = f10;
        this.DSW = f11;
    }

    public YFl(T t5) {
        this.eT = -3987645.8f;
        this.YoT = -3987645.8f;
        this.GA = 784923401;
        this.pDU = 784923401;
        this.EH = Float.MIN_VALUE;
        this.rkt = Float.MIN_VALUE;
        this.qsH = null;
        this.NjR = null;
        this.f10147nc = null;
        this.YFl = t5;
        this.Sg = t5;
        this.tN = null;
        this.AlY = null;
        this.wN = null;
        this.f10148vc = Float.MIN_VALUE;
        this.DSW = Float.valueOf(Float.MAX_VALUE);
    }

    private YFl(T t5, T t10) {
        this.eT = -3987645.8f;
        this.YoT = -3987645.8f;
        this.GA = 784923401;
        this.pDU = 784923401;
        this.EH = Float.MIN_VALUE;
        this.rkt = Float.MIN_VALUE;
        this.qsH = null;
        this.NjR = null;
        this.f10147nc = null;
        this.YFl = t5;
        this.Sg = t10;
        this.tN = null;
        this.AlY = null;
        this.wN = null;
        this.f10148vc = Float.MIN_VALUE;
        this.DSW = Float.valueOf(Float.MAX_VALUE);
    }
}
