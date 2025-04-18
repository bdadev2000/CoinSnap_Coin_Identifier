package o3;

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
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class i implements f, p3.a, l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23046b;

    /* renamed from: c, reason: collision with root package name */
    public final u3.b f23047c;

    /* renamed from: d, reason: collision with root package name */
    public final r.e f23048d = new r.e();

    /* renamed from: e, reason: collision with root package name */
    public final r.e f23049e = new r.e();

    /* renamed from: f, reason: collision with root package name */
    public final Path f23050f;

    /* renamed from: g, reason: collision with root package name */
    public final n3.a f23051g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f23052h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23053i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23054j;

    /* renamed from: k, reason: collision with root package name */
    public final p3.d f23055k;

    /* renamed from: l, reason: collision with root package name */
    public final p3.d f23056l;

    /* renamed from: m, reason: collision with root package name */
    public final p3.d f23057m;

    /* renamed from: n, reason: collision with root package name */
    public final p3.d f23058n;

    /* renamed from: o, reason: collision with root package name */
    public p3.t f23059o;

    /* renamed from: p, reason: collision with root package name */
    public p3.t f23060p;

    /* renamed from: q, reason: collision with root package name */
    public final x f23061q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23062r;

    /* renamed from: s, reason: collision with root package name */
    public p3.d f23063s;

    /* renamed from: t, reason: collision with root package name */
    public float f23064t;
    public final p3.g u;

    public i(x xVar, m3.j jVar, u3.b bVar, t3.d dVar) {
        Path path = new Path();
        this.f23050f = path;
        this.f23051g = new n3.a(1);
        this.f23052h = new RectF();
        this.f23053i = new ArrayList();
        this.f23064t = 0.0f;
        this.f23047c = bVar;
        this.a = dVar.f25201g;
        this.f23046b = dVar.f25202h;
        this.f23061q = xVar;
        this.f23054j = dVar.a;
        path.setFillType(dVar.f25196b);
        this.f23062r = (int) (jVar.b() / 32.0f);
        p3.d a = dVar.f25197c.a();
        this.f23055k = a;
        a.a(this);
        bVar.f(a);
        p3.d a10 = dVar.f25198d.a();
        this.f23056l = a10;
        a10.a(this);
        bVar.f(a10);
        p3.d a11 = dVar.f25199e.a();
        this.f23057m = a11;
        a11.a(this);
        bVar.f(a11);
        p3.d a12 = dVar.f25200f.a();
        this.f23058n = a12;
        a12.a(this);
        bVar.f(a12);
        if (bVar.k() != null) {
            p3.d a13 = ((s3.a) bVar.k().f26021c).a();
            this.f23063s = a13;
            a13.a(this);
            bVar.f(this.f23063s);
        }
        if (bVar.l() != null) {
            this.u = new p3.g(this, bVar, bVar.l());
        }
    }

    @Override // p3.a
    public final void a() {
        this.f23061q.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = (d) list2.get(i10);
            if (dVar instanceof n) {
                this.f23053i.add((n) dVar);
            }
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        if (obj == a0.f21499d) {
            this.f23056l.k(cVar);
            return;
        }
        ColorFilter colorFilter = a0.K;
        u3.b bVar = this.f23047c;
        if (obj == colorFilter) {
            p3.t tVar = this.f23059o;
            if (tVar != null) {
                bVar.n(tVar);
            }
            if (cVar == null) {
                this.f23059o = null;
                return;
            }
            p3.t tVar2 = new p3.t(cVar, null);
            this.f23059o = tVar2;
            tVar2.a(this);
            bVar.f(this.f23059o);
            return;
        }
        if (obj == a0.L) {
            p3.t tVar3 = this.f23060p;
            if (tVar3 != null) {
                bVar.n(tVar3);
            }
            if (cVar == null) {
                this.f23060p = null;
                return;
            }
            this.f23048d.a();
            this.f23049e.a();
            p3.t tVar4 = new p3.t(cVar, null);
            this.f23060p = tVar4;
            tVar4.a(this);
            bVar.f(this.f23060p);
            return;
        }
        if (obj == a0.f21505j) {
            p3.d dVar = this.f23063s;
            if (dVar != null) {
                dVar.k(cVar);
                return;
            }
            p3.t tVar5 = new p3.t(cVar, null);
            this.f23063s = tVar5;
            tVar5.a(this);
            bVar.f(this.f23063s);
            return;
        }
        Integer num = a0.f21500e;
        p3.g gVar = this.u;
        if (obj == num && gVar != null) {
            gVar.f23368b.k(cVar);
            return;
        }
        if (obj == a0.G && gVar != null) {
            gVar.c(cVar);
            return;
        }
        if (obj == a0.H && gVar != null) {
            gVar.f23370d.k(cVar);
            return;
        }
        if (obj == a0.I && gVar != null) {
            gVar.f23371e.k(cVar);
        } else if (obj == a0.J && gVar != null) {
            gVar.f23372f.k(cVar);
        }
    }

    @Override // o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f23050f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23053i;
            if (i10 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i10)).z(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] f(int[] iArr) {
        p3.t tVar = this.f23060p;
        if (tVar != null) {
            Integer[] numArr = (Integer[]) tVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f23046b) {
            return;
        }
        Path path = this.f23050f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f23053i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i11)).z(), matrix);
            i11++;
        }
        path.computeBounds(this.f23052h, false);
        int i12 = this.f23054j;
        p3.d dVar = this.f23055k;
        p3.d dVar2 = this.f23058n;
        p3.d dVar3 = this.f23057m;
        if (i12 == 1) {
            long h10 = h();
            r.e eVar = this.f23048d;
            shader = (LinearGradient) eVar.d(h10, null);
            if (shader == null) {
                PointF pointF = (PointF) dVar3.f();
                PointF pointF2 = (PointF) dVar2.f();
                t3.c cVar = (t3.c) dVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f25195b), cVar.a, Shader.TileMode.CLAMP);
                eVar.f(h10, shader);
            }
        } else {
            long h11 = h();
            r.e eVar2 = this.f23049e;
            shader = (RadialGradient) eVar2.d(h11, null);
            if (shader == null) {
                PointF pointF3 = (PointF) dVar3.f();
                PointF pointF4 = (PointF) dVar2.f();
                t3.c cVar2 = (t3.c) dVar.f();
                int[] f10 = f(cVar2.f25195b);
                float[] fArr = cVar2.a;
                float f11 = pointF3.x;
                float f12 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f11, pointF4.y - f12);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f11, f12, hypot, f10, fArr, Shader.TileMode.CLAMP);
                eVar2.f(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        n3.a aVar = this.f23051g;
        aVar.setShader(shader);
        p3.t tVar = this.f23059o;
        if (tVar != null) {
            aVar.setColorFilter((ColorFilter) tVar.f());
        }
        p3.d dVar4 = this.f23063s;
        if (dVar4 != null) {
            float floatValue = ((Float) dVar4.f()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f23064t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f23064t = floatValue;
        }
        p3.g gVar = this.u;
        if (gVar != null) {
            gVar.b(aVar);
        }
        PointF pointF5 = y3.f.a;
        aVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f23056l.f()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar);
    }

    @Override // o3.d
    public final String getName() {
        return this.a;
    }

    public final int h() {
        int i10;
        float f10 = this.f23057m.f23362d;
        int i11 = this.f23062r;
        int round = Math.round(f10 * i11);
        int round2 = Math.round(this.f23058n.f23362d * i11);
        int round3 = Math.round(this.f23055k.f23362d * i11);
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
