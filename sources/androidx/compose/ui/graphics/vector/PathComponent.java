package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import b1.f0;
import d0.h;
import d0.i;
import e0.w;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PathComponent extends VNode {

    /* renamed from: b, reason: collision with root package name */
    public Brush f15331b;

    /* renamed from: c, reason: collision with root package name */
    public float f15332c = 1.0f;
    public List d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f15333f;

    /* renamed from: g, reason: collision with root package name */
    public Brush f15334g;

    /* renamed from: h, reason: collision with root package name */
    public int f15335h;

    /* renamed from: i, reason: collision with root package name */
    public int f15336i;

    /* renamed from: j, reason: collision with root package name */
    public float f15337j;

    /* renamed from: k, reason: collision with root package name */
    public float f15338k;

    /* renamed from: l, reason: collision with root package name */
    public float f15339l;

    /* renamed from: m, reason: collision with root package name */
    public float f15340m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15341n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15342o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15343p;

    /* renamed from: q, reason: collision with root package name */
    public Stroke f15344q;

    /* renamed from: r, reason: collision with root package name */
    public final AndroidPath f15345r;

    /* renamed from: s, reason: collision with root package name */
    public AndroidPath f15346s;

    /* renamed from: t, reason: collision with root package name */
    public final h f15347t;

    public PathComponent() {
        int i2 = VectorKt.f15465a;
        this.d = w.f30218a;
        this.e = 1.0f;
        this.f15335h = 0;
        this.f15336i = 0;
        this.f15337j = 4.0f;
        this.f15339l = 1.0f;
        this.f15341n = true;
        this.f15342o = true;
        AndroidPath a2 = AndroidPath_androidKt.a();
        this.f15345r = a2;
        this.f15346s = a2;
        this.f15347t = f0.s(i.f30133c, PathComponent$pathMeasure$2.f15348a);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        if (this.f15341n) {
            PathParserKt.b(this.d, this.f15345r);
            e();
        } else if (this.f15343p) {
            e();
        }
        this.f15341n = false;
        this.f15343p = false;
        Brush brush = this.f15331b;
        if (brush != null) {
            DrawScope.Y(drawScope, this.f15346s, brush, this.f15332c, null, 56);
        }
        Brush brush2 = this.f15334g;
        if (brush2 != null) {
            Stroke stroke = this.f15344q;
            if (this.f15342o || stroke == null) {
                stroke = new Stroke(this.f15333f, this.f15337j, this.f15335h, this.f15336i, 16);
                this.f15344q = stroke;
                this.f15342o = false;
            }
            DrawScope.Y(drawScope, this.f15346s, brush2, this.e, stroke, 48);
        }
    }

    public final void e() {
        float f2 = this.f15338k;
        AndroidPath androidPath = this.f15345r;
        if (f2 == 0.0f && this.f15339l == 1.0f) {
            this.f15346s = androidPath;
            return;
        }
        if (a.g(this.f15346s, androidPath)) {
            this.f15346s = AndroidPath_androidKt.a();
        } else {
            int m2 = this.f15346s.m();
            this.f15346s.j();
            this.f15346s.g(m2);
        }
        h hVar = this.f15347t;
        ((PathMeasure) hVar.getValue()).b(androidPath);
        float c2 = ((PathMeasure) hVar.getValue()).c();
        float f3 = this.f15338k;
        float f4 = this.f15340m;
        float f5 = ((f3 + f4) % 1.0f) * c2;
        float f6 = ((this.f15339l + f4) % 1.0f) * c2;
        if (f5 <= f6) {
            ((PathMeasure) hVar.getValue()).a(f5, f6, this.f15346s);
        } else {
            ((PathMeasure) hVar.getValue()).a(f5, c2, this.f15346s);
            ((PathMeasure) hVar.getValue()).a(0.0f, f6, this.f15346s);
        }
    }

    public final String toString() {
        return this.f15345r.toString();
    }
}
