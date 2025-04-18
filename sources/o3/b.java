package o3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public abstract class b implements p3.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final x f23004e;

    /* renamed from: f, reason: collision with root package name */
    public final u3.b f23005f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23007h;

    /* renamed from: i, reason: collision with root package name */
    public final n3.a f23008i;

    /* renamed from: j, reason: collision with root package name */
    public final p3.h f23009j;

    /* renamed from: k, reason: collision with root package name */
    public final p3.d f23010k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f23011l;

    /* renamed from: m, reason: collision with root package name */
    public final p3.h f23012m;

    /* renamed from: n, reason: collision with root package name */
    public p3.t f23013n;

    /* renamed from: o, reason: collision with root package name */
    public p3.d f23014o;

    /* renamed from: p, reason: collision with root package name */
    public float f23015p;

    /* renamed from: q, reason: collision with root package name */
    public final p3.g f23016q;
    public final PathMeasure a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23001b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f23002c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f23003d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23006g = new ArrayList();

    public b(x xVar, u3.b bVar, Paint.Cap cap, Paint.Join join, float f10, h4.c cVar, s3.a aVar, List list, s3.a aVar2) {
        n3.a aVar3 = new n3.a(1);
        this.f23008i = aVar3;
        this.f23015p = 0.0f;
        this.f23004e = xVar;
        this.f23005f = bVar;
        aVar3.setStyle(Paint.Style.STROKE);
        aVar3.setStrokeCap(cap);
        aVar3.setStrokeJoin(join);
        aVar3.setStrokeMiter(f10);
        this.f23010k = cVar.a();
        this.f23009j = (p3.h) aVar.a();
        if (aVar2 == null) {
            this.f23012m = null;
        } else {
            this.f23012m = (p3.h) aVar2.a();
        }
        this.f23011l = new ArrayList(list.size());
        this.f23007h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f23011l.add(((s3.a) list.get(i10)).a());
        }
        bVar.f(this.f23010k);
        bVar.f(this.f23009j);
        for (int i11 = 0; i11 < this.f23011l.size(); i11++) {
            bVar.f((p3.d) this.f23011l.get(i11));
        }
        p3.h hVar = this.f23012m;
        if (hVar != null) {
            bVar.f(hVar);
        }
        this.f23010k.a(this);
        this.f23009j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((p3.d) this.f23011l.get(i12)).a(this);
        }
        p3.h hVar2 = this.f23012m;
        if (hVar2 != null) {
            hVar2.a(this);
        }
        if (bVar.k() != null) {
            p3.d a = ((s3.a) bVar.k().f26021c).a();
            this.f23014o = a;
            a.a(this);
            bVar.f(this.f23014o);
        }
        if (bVar.l() != null) {
            this.f23016q = new p3.g(this, bVar, bVar.l());
        }
    }

    @Override // p3.a
    public final void a() {
        this.f23004e.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        u uVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList2.get(size);
            if (dVar instanceof u) {
                u uVar2 = (u) dVar;
                if (uVar2.f23126c == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f23006g;
            if (size2 < 0) {
                break;
            }
            d dVar2 = (d) list2.get(size2);
            if (dVar2 instanceof u) {
                u uVar3 = (u) dVar2;
                if (uVar3.f23126c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(uVar3);
                    uVar3.c(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(uVar);
                }
                aVar.a.add((n) dVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // r3.f
    public void d(h.c cVar, Object obj) {
        if (obj == a0.f21499d) {
            this.f23010k.k(cVar);
            return;
        }
        if (obj == a0.f21514s) {
            this.f23009j.k(cVar);
            return;
        }
        ColorFilter colorFilter = a0.K;
        u3.b bVar = this.f23005f;
        if (obj == colorFilter) {
            p3.t tVar = this.f23013n;
            if (tVar != null) {
                bVar.n(tVar);
            }
            if (cVar == null) {
                this.f23013n = null;
                return;
            }
            p3.t tVar2 = new p3.t(cVar, null);
            this.f23013n = tVar2;
            tVar2.a(this);
            bVar.f(this.f23013n);
            return;
        }
        if (obj == a0.f21505j) {
            p3.d dVar = this.f23014o;
            if (dVar != null) {
                dVar.k(cVar);
                return;
            }
            p3.t tVar3 = new p3.t(cVar, null);
            this.f23014o = tVar3;
            tVar3.a(this);
            bVar.f(this.f23014o);
            return;
        }
        Integer num = a0.f21500e;
        p3.g gVar = this.f23016q;
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
        Path path = this.f23001b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23006g;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                for (int i11 = 0; i11 < aVar.a.size(); i11++) {
                    path.addPath(((n) aVar.a.get(i11)).z(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.f23003d;
                path.computeBounds(rectF2, false);
                float l10 = this.f23009j.l() / 2.0f;
                rectF2.set(rectF2.left - l10, rectF2.top - l10, rectF2.right + l10, rectF2.bottom + l10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // o3.f
    public void g(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float floatValue;
        b bVar = this;
        float[] fArr2 = (float[]) y3.h.f27910d.get();
        boolean z12 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        p3.j jVar = (p3.j) bVar.f23010k;
        float l10 = (i10 / 255.0f) * jVar.l(jVar.b(), jVar.d());
        float f13 = 100.0f;
        PointF pointF = y3.f.a;
        int max = Math.max(0, Math.min(255, (int) ((l10 / 100.0f) * 255.0f)));
        n3.a aVar = bVar.f23008i;
        aVar.setAlpha(max);
        aVar.setStrokeWidth(y3.h.d(matrix) * bVar.f23009j.l());
        if (aVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = bVar.f23011l;
        if (!arrayList.isEmpty()) {
            float d10 = y3.h.d(matrix);
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f23007h;
                if (i11 >= size) {
                    break;
                }
                float floatValue2 = ((Float) ((p3.d) arrayList.get(i11)).f()).floatValue();
                fArr[i11] = floatValue2;
                if (i11 % 2 == 0) {
                    if (floatValue2 < 1.0f) {
                        fArr[i11] = 1.0f;
                    }
                } else if (floatValue2 < 0.1f) {
                    fArr[i11] = 0.1f;
                }
                fArr[i11] = fArr[i11] * d10;
                i11++;
            }
            p3.h hVar = bVar.f23012m;
            if (hVar == null) {
                floatValue = 0.0f;
            } else {
                floatValue = ((Float) hVar.f()).floatValue() * d10;
            }
            aVar.setPathEffect(new DashPathEffect(fArr, floatValue));
        }
        p3.t tVar = bVar.f23013n;
        if (tVar != null) {
            aVar.setColorFilter((ColorFilter) tVar.f());
        }
        p3.d dVar = bVar.f23014o;
        if (dVar != null) {
            float floatValue3 = ((Float) dVar.f()).floatValue();
            if (floatValue3 == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue3 != bVar.f23015p) {
                u3.b bVar2 = bVar.f23005f;
                if (bVar2.A == floatValue3) {
                    blurMaskFilter = bVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar2.B = blurMaskFilter2;
                    bVar2.A = floatValue3;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            bVar.f23015p = floatValue3;
        }
        p3.g gVar = bVar.f23016q;
        if (gVar != null) {
            gVar.b(aVar);
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f23006g;
            if (i12 < arrayList2.size()) {
                a aVar2 = (a) arrayList2.get(i12);
                u uVar = aVar2.f23000b;
                Path path = bVar.f23001b;
                ArrayList arrayList3 = aVar2.a;
                if (uVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else {
                            path.addPath(((n) arrayList3.get(size2)).z(), matrix);
                        }
                    }
                    u uVar2 = aVar2.f23000b;
                    float floatValue4 = ((Float) uVar2.f23127d.f()).floatValue() / f13;
                    float floatValue5 = ((Float) uVar2.f23128e.f()).floatValue() / f13;
                    float floatValue6 = ((Float) uVar2.f23129f.f()).floatValue() / 360.0f;
                    if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                        canvas.drawPath(path, aVar);
                    } else {
                        PathMeasure pathMeasure = bVar.a;
                        pathMeasure.setPath(path, z12);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length = pathMeasure.getLength() + length;
                        }
                        float f14 = floatValue6 * length;
                        float f15 = (floatValue4 * length) + f14;
                        float min = Math.min((floatValue5 * length) + f14, (f15 + length) - 1.0f);
                        int size3 = arrayList3.size() - 1;
                        float f16 = 0.0f;
                        while (size3 >= 0) {
                            Path path2 = bVar.f23002c;
                            path2.set(((n) arrayList3.get(size3)).z());
                            path2.transform(matrix);
                            pathMeasure.setPath(path2, z12);
                            float length2 = pathMeasure.getLength();
                            if (min > length) {
                                float f17 = min - length;
                                if (f17 < f16 + length2 && f16 < f17) {
                                    if (f15 > length) {
                                        f12 = (f15 - length) / length2;
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    y3.h.a(path2, f12, Math.min(f17 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(path2, aVar);
                                    f16 += length2;
                                    size3--;
                                    bVar = this;
                                    z12 = false;
                                }
                            }
                            float f18 = f16 + length2;
                            if (f18 >= f15 && f16 <= min) {
                                if (f18 <= min && f15 < f16) {
                                    canvas.drawPath(path2, aVar);
                                } else {
                                    if (f15 < f16) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = (f15 - f16) / length2;
                                    }
                                    if (min > f18) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = (min - f16) / length2;
                                    }
                                    y3.h.a(path2, f10, f11, 0.0f);
                                    canvas.drawPath(path2, aVar);
                                }
                            }
                            f16 += length2;
                            size3--;
                            bVar = this;
                            z12 = false;
                        }
                    }
                    z11 = true;
                } else {
                    path.reset();
                    z11 = true;
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((n) arrayList3.get(size4)).z(), matrix);
                    }
                    canvas.drawPath(path, aVar);
                }
                i12++;
                bVar = this;
                z12 = false;
                f13 = 100.0f;
            } else {
                return;
            }
        }
    }
}
