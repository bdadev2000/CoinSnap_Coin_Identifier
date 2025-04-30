package x1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class h implements e, InterfaceC2942a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f24132a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.b f24133c;

    /* renamed from: d, reason: collision with root package name */
    public final x.f f24134d = new x.f();

    /* renamed from: e, reason: collision with root package name */
    public final x.f f24135e = new x.f();

    /* renamed from: f, reason: collision with root package name */
    public final Path f24136f;

    /* renamed from: g, reason: collision with root package name */
    public final D1.i f24137g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f24138h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24139i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24140j;

    /* renamed from: k, reason: collision with root package name */
    public final y1.j f24141k;
    public final y1.f l;
    public final y1.j m;

    /* renamed from: n, reason: collision with root package name */
    public final y1.j f24142n;

    /* renamed from: o, reason: collision with root package name */
    public y1.r f24143o;

    /* renamed from: p, reason: collision with root package name */
    public y1.r f24144p;

    /* renamed from: q, reason: collision with root package name */
    public final v f24145q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24146r;

    /* renamed from: s, reason: collision with root package name */
    public y1.e f24147s;

    /* renamed from: t, reason: collision with root package name */
    public float f24148t;

    /* renamed from: u, reason: collision with root package name */
    public final y1.h f24149u;

    public h(v vVar, v1.i iVar, D1.b bVar, C1.d dVar) {
        Path path = new Path();
        this.f24136f = path;
        this.f24137g = new D1.i(1, 2);
        this.f24138h = new RectF();
        this.f24139i = new ArrayList();
        this.f24148t = 0.0f;
        this.f24133c = bVar;
        this.f24132a = dVar.f431g;
        this.b = dVar.f432h;
        this.f24145q = vVar;
        this.f24140j = dVar.f426a;
        path.setFillType(dVar.b);
        this.f24146r = (int) (iVar.b() / 32.0f);
        y1.e g9 = dVar.f427c.g();
        this.f24141k = (y1.j) g9;
        g9.a(this);
        bVar.d(g9);
        y1.e g10 = dVar.f428d.g();
        this.l = (y1.f) g10;
        g10.a(this);
        bVar.d(g10);
        y1.e g11 = dVar.f429e.g();
        this.m = (y1.j) g11;
        g11.a(this);
        bVar.d(g11);
        y1.e g12 = dVar.f430f.g();
        this.f24142n = (y1.j) g12;
        g12.a(this);
        bVar.d(g12);
        if (bVar.l() != null) {
            y1.e g13 = ((B1.b) bVar.l().f972c).g();
            this.f24147s = g13;
            g13.a(this);
            bVar.d(this.f24147s);
        }
        if (bVar.m() != null) {
            this.f24149u = new y1.h(this, bVar, bVar.m());
        }
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24145q.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        for (int i9 = 0; i9 < list2.size(); i9++) {
            c cVar = (c) list2.get(i9);
            if (cVar instanceof m) {
                this.f24139i.add((m) cVar);
            }
        }
    }

    @Override // x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f24136f;
        path.reset();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24139i;
            if (i9 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i9)).f(), matrix);
                i9++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] d(int[] iArr) {
        y1.r rVar = this.f24144p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i9 = 0;
            if (iArr.length == numArr.length) {
                while (i9 < iArr.length) {
                    iArr[i9] = numArr[i9].intValue();
                    i9++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i9 < numArr.length) {
                    iArr[i9] = numArr[i9].intValue();
                    i9++;
                }
            }
        }
        return iArr;
    }

    @Override // x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        Shader shader;
        if (this.b) {
            return;
        }
        Path path = this.f24136f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24139i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i10)).f(), matrix);
            i10++;
        }
        path.computeBounds(this.f24138h, false);
        int i11 = this.f24140j;
        y1.j jVar = this.f24141k;
        y1.j jVar2 = this.f24142n;
        y1.j jVar3 = this.m;
        if (i11 == 1) {
            long i12 = i();
            x.f fVar = this.f24134d;
            shader = (LinearGradient) fVar.d(null, i12);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                C1.c cVar = (C1.c) jVar.e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(cVar.b), cVar.f425a, Shader.TileMode.CLAMP);
                fVar.f(i12, linearGradient);
                shader = linearGradient;
            }
        } else {
            long i13 = i();
            x.f fVar2 = this.f24135e;
            shader = (RadialGradient) fVar2.d(null, i13);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                C1.c cVar2 = (C1.c) jVar.e();
                int[] d2 = d(cVar2.b);
                float f9 = pointF3.x;
                float f10 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f9, pointF4.y - f10);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f9, f10, hypot, d2, cVar2.f425a, Shader.TileMode.CLAMP);
                fVar2.f(i13, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        D1.i iVar = this.f24137g;
        iVar.setShader(shader);
        y1.r rVar = this.f24143o;
        if (rVar != null) {
            iVar.setColorFilter((ColorFilter) rVar.e());
        }
        y1.e eVar = this.f24147s;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == 0.0f) {
                iVar.setMaskFilter(null);
            } else if (floatValue != this.f24148t) {
                iVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f24148t = floatValue;
        }
        y1.h hVar = this.f24149u;
        if (hVar != null) {
            hVar.b(iVar);
        }
        PointF pointF5 = H1.g.f1365a;
        iVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i9 / 255.0f) * ((Integer) this.l.e()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, iVar);
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        PointF pointF = y.f23578a;
        if (obj == 4) {
            this.l.j(dVar);
            return;
        }
        ColorFilter colorFilter = y.f23572F;
        D1.b bVar = this.f24133c;
        if (obj == colorFilter) {
            y1.r rVar = this.f24143o;
            if (rVar != null) {
                bVar.p(rVar);
            }
            if (dVar == null) {
                this.f24143o = null;
                return;
            }
            y1.r rVar2 = new y1.r(dVar, null);
            this.f24143o = rVar2;
            rVar2.a(this);
            bVar.d(this.f24143o);
            return;
        }
        if (obj == y.f23573G) {
            y1.r rVar3 = this.f24144p;
            if (rVar3 != null) {
                bVar.p(rVar3);
            }
            if (dVar == null) {
                this.f24144p = null;
                return;
            }
            this.f24134d.a();
            this.f24135e.a();
            y1.r rVar4 = new y1.r(dVar, null);
            this.f24144p = rVar4;
            rVar4.a(this);
            bVar.d(this.f24144p);
            return;
        }
        if (obj == y.f23581e) {
            y1.e eVar = this.f24147s;
            if (eVar != null) {
                eVar.j(dVar);
                return;
            }
            y1.r rVar5 = new y1.r(dVar, null);
            this.f24147s = rVar5;
            rVar5.a(this);
            bVar.d(this.f24147s);
            return;
        }
        y1.h hVar = this.f24149u;
        if (obj == 5 && hVar != null) {
            hVar.b.j(dVar);
            return;
        }
        if (obj == y.f23568B && hVar != null) {
            hVar.c(dVar);
            return;
        }
        if (obj == y.f23569C && hVar != null) {
            hVar.f24300d.j(dVar);
            return;
        }
        if (obj == y.f23570D && hVar != null) {
            hVar.f24301e.j(dVar);
        } else if (obj == y.f23571E && hVar != null) {
            hVar.f24302f.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24132a;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }

    public final int i() {
        int i9;
        float f9 = this.m.f24291d;
        float f10 = this.f24146r;
        int round = Math.round(f9 * f10);
        int round2 = Math.round(this.f24142n.f24291d * f10);
        int round3 = Math.round(this.f24141k.f24291d * f10);
        if (round != 0) {
            i9 = 527 * round;
        } else {
            i9 = 17;
        }
        if (round2 != 0) {
            i9 = i9 * 31 * round2;
        }
        if (round3 != 0) {
            return i9 * 31 * round3;
        }
        return i9;
    }
}
