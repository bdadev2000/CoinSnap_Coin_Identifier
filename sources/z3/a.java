package z3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.j;

/* loaded from: classes.dex */
public class a {
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28472b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28473c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f28474d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f28475e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f28476f;

    /* renamed from: g, reason: collision with root package name */
    public final float f28477g;

    /* renamed from: h, reason: collision with root package name */
    public Float f28478h;

    /* renamed from: i, reason: collision with root package name */
    public float f28479i;

    /* renamed from: j, reason: collision with root package name */
    public float f28480j;

    /* renamed from: k, reason: collision with root package name */
    public int f28481k;

    /* renamed from: l, reason: collision with root package name */
    public int f28482l;

    /* renamed from: m, reason: collision with root package name */
    public float f28483m;

    /* renamed from: n, reason: collision with root package name */
    public float f28484n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f28485o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f28486p;

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f28479i = -3987645.8f;
        this.f28480j = -3987645.8f;
        this.f28481k = 784923401;
        this.f28482l = 784923401;
        this.f28483m = Float.MIN_VALUE;
        this.f28484n = Float.MIN_VALUE;
        this.f28485o = null;
        this.f28486p = null;
        this.a = jVar;
        this.f28472b = obj;
        this.f28473c = obj2;
        this.f28474d = interpolator;
        this.f28475e = null;
        this.f28476f = null;
        this.f28477g = f10;
        this.f28478h = f11;
    }

    public final float a() {
        j jVar = this.a;
        if (jVar == null) {
            return 1.0f;
        }
        if (this.f28484n == Float.MIN_VALUE) {
            if (this.f28478h == null) {
                this.f28484n = 1.0f;
            } else {
                this.f28484n = ((this.f28478h.floatValue() - this.f28477g) / (jVar.f21562m - jVar.f21561l)) + b();
            }
        }
        return this.f28484n;
    }

    public final float b() {
        j jVar = this.a;
        if (jVar == null) {
            return 0.0f;
        }
        if (this.f28483m == Float.MIN_VALUE) {
            float f10 = jVar.f21561l;
            this.f28483m = (this.f28477g - f10) / (jVar.f21562m - f10);
        }
        return this.f28483m;
    }

    public final boolean c() {
        return this.f28474d == null && this.f28475e == null && this.f28476f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f28472b + ", endValue=" + this.f28473c + ", startFrame=" + this.f28477g + ", endFrame=" + this.f28478h + ", interpolator=" + this.f28474d + AbstractJsonLexerKt.END_OBJ;
    }

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f28479i = -3987645.8f;
        this.f28480j = -3987645.8f;
        this.f28481k = 784923401;
        this.f28482l = 784923401;
        this.f28483m = Float.MIN_VALUE;
        this.f28484n = Float.MIN_VALUE;
        this.f28485o = null;
        this.f28486p = null;
        this.a = jVar;
        this.f28472b = obj;
        this.f28473c = obj2;
        this.f28474d = null;
        this.f28475e = interpolator;
        this.f28476f = interpolator2;
        this.f28477g = f10;
        this.f28478h = null;
    }

    public a(j jVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f28479i = -3987645.8f;
        this.f28480j = -3987645.8f;
        this.f28481k = 784923401;
        this.f28482l = 784923401;
        this.f28483m = Float.MIN_VALUE;
        this.f28484n = Float.MIN_VALUE;
        this.f28485o = null;
        this.f28486p = null;
        this.a = jVar;
        this.f28472b = pointF;
        this.f28473c = pointF2;
        this.f28474d = interpolator;
        this.f28475e = interpolator2;
        this.f28476f = interpolator3;
        this.f28477g = f10;
        this.f28478h = f11;
    }

    public a(Object obj) {
        this.f28479i = -3987645.8f;
        this.f28480j = -3987645.8f;
        this.f28481k = 784923401;
        this.f28482l = 784923401;
        this.f28483m = Float.MIN_VALUE;
        this.f28484n = Float.MIN_VALUE;
        this.f28485o = null;
        this.f28486p = null;
        this.a = null;
        this.f28472b = obj;
        this.f28473c = obj;
        this.f28474d = null;
        this.f28475e = null;
        this.f28476f = null;
        this.f28477g = Float.MIN_VALUE;
        this.f28478h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(t3.c cVar, t3.c cVar2) {
        this.f28479i = -3987645.8f;
        this.f28480j = -3987645.8f;
        this.f28481k = 784923401;
        this.f28482l = 784923401;
        this.f28483m = Float.MIN_VALUE;
        this.f28484n = Float.MIN_VALUE;
        this.f28485o = null;
        this.f28486p = null;
        this.a = null;
        this.f28472b = cVar;
        this.f28473c = cVar2;
        this.f28474d = null;
        this.f28475e = null;
        this.f28476f = null;
        this.f28477g = Float.MIN_VALUE;
        this.f28478h = Float.valueOf(Float.MAX_VALUE);
    }
}
