package I1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import v1.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f1408a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1409c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f1410d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f1411e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f1412f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1413g;

    /* renamed from: h, reason: collision with root package name */
    public Float f1414h;

    /* renamed from: i, reason: collision with root package name */
    public float f1415i;

    /* renamed from: j, reason: collision with root package name */
    public float f1416j;

    /* renamed from: k, reason: collision with root package name */
    public int f1417k;
    public int l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f1418n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f1419o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f1420p;

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f9, Float f10) {
        this.f1415i = -3987645.8f;
        this.f1416j = -3987645.8f;
        this.f1417k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f1418n = Float.MIN_VALUE;
        this.f1419o = null;
        this.f1420p = null;
        this.f1408a = iVar;
        this.b = obj;
        this.f1409c = obj2;
        this.f1410d = interpolator;
        this.f1411e = null;
        this.f1412f = null;
        this.f1413g = f9;
        this.f1414h = f10;
    }

    public final float a() {
        i iVar = this.f1408a;
        if (iVar == null) {
            return 1.0f;
        }
        if (this.f1418n == Float.MIN_VALUE) {
            if (this.f1414h == null) {
                this.f1418n = 1.0f;
            } else {
                this.f1418n = ((this.f1414h.floatValue() - this.f1413g) / (iVar.m - iVar.l)) + b();
            }
        }
        return this.f1418n;
    }

    public final float b() {
        i iVar = this.f1408a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            float f9 = iVar.l;
            this.m = (this.f1413g - f9) / (iVar.m - f9);
        }
        return this.m;
    }

    public final boolean c() {
        if (this.f1410d == null && this.f1411e == null && this.f1412f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f1409c + ", startFrame=" + this.f1413g + ", endFrame=" + this.f1414h + ", interpolator=" + this.f1410d + '}';
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f9) {
        this.f1415i = -3987645.8f;
        this.f1416j = -3987645.8f;
        this.f1417k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f1418n = Float.MIN_VALUE;
        this.f1419o = null;
        this.f1420p = null;
        this.f1408a = iVar;
        this.b = obj;
        this.f1409c = obj2;
        this.f1410d = null;
        this.f1411e = interpolator;
        this.f1412f = interpolator2;
        this.f1413g = f9;
        this.f1414h = null;
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f9, Float f10) {
        this.f1415i = -3987645.8f;
        this.f1416j = -3987645.8f;
        this.f1417k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f1418n = Float.MIN_VALUE;
        this.f1419o = null;
        this.f1420p = null;
        this.f1408a = iVar;
        this.b = obj;
        this.f1409c = obj2;
        this.f1410d = interpolator;
        this.f1411e = interpolator2;
        this.f1412f = interpolator3;
        this.f1413g = f9;
        this.f1414h = f10;
    }

    public a(Object obj) {
        this.f1415i = -3987645.8f;
        this.f1416j = -3987645.8f;
        this.f1417k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f1418n = Float.MIN_VALUE;
        this.f1419o = null;
        this.f1420p = null;
        this.f1408a = null;
        this.b = obj;
        this.f1409c = obj;
        this.f1410d = null;
        this.f1411e = null;
        this.f1412f = null;
        this.f1413g = Float.MIN_VALUE;
        this.f1414h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(C1.c cVar, C1.c cVar2) {
        this.f1415i = -3987645.8f;
        this.f1416j = -3987645.8f;
        this.f1417k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f1418n = Float.MIN_VALUE;
        this.f1419o = null;
        this.f1420p = null;
        this.f1408a = null;
        this.b = cVar;
        this.f1409c = cVar2;
        this.f1410d = null;
        this.f1411e = null;
        this.f1412f = null;
        this.f1413g = Float.MIN_VALUE;
        this.f1414h = Float.valueOf(Float.MAX_VALUE);
    }
}
