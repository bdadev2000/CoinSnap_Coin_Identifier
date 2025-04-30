package x1;

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
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC2942a, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final v f24094e;

    /* renamed from: f, reason: collision with root package name */
    public final D1.b f24095f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f24097h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.i f24098i;

    /* renamed from: j, reason: collision with root package name */
    public final y1.i f24099j;

    /* renamed from: k, reason: collision with root package name */
    public final y1.f f24100k;
    public final ArrayList l;
    public final y1.i m;

    /* renamed from: n, reason: collision with root package name */
    public y1.r f24101n;

    /* renamed from: o, reason: collision with root package name */
    public y1.e f24102o;

    /* renamed from: p, reason: collision with root package name */
    public float f24103p;

    /* renamed from: q, reason: collision with root package name */
    public final y1.h f24104q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f24091a = new PathMeasure();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24092c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f24093d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f24096g = new ArrayList();

    public b(v vVar, D1.b bVar, Paint.Cap cap, Paint.Join join, float f9, B1.a aVar, B1.b bVar2, ArrayList arrayList, B1.b bVar3) {
        D1.i iVar = new D1.i(1, 2);
        this.f24098i = iVar;
        this.f24103p = 0.0f;
        this.f24094e = vVar;
        this.f24095f = bVar;
        iVar.setStyle(Paint.Style.STROKE);
        iVar.setStrokeCap(cap);
        iVar.setStrokeJoin(join);
        iVar.setStrokeMiter(f9);
        this.f24100k = (y1.f) aVar.g();
        this.f24099j = (y1.i) bVar2.g();
        if (bVar3 == null) {
            this.m = null;
        } else {
            this.m = (y1.i) bVar3.g();
        }
        this.l = new ArrayList(arrayList.size());
        this.f24097h = new float[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.l.add(((B1.b) arrayList.get(i9)).g());
        }
        bVar.d(this.f24100k);
        bVar.d(this.f24099j);
        for (int i10 = 0; i10 < this.l.size(); i10++) {
            bVar.d((y1.e) this.l.get(i10));
        }
        y1.i iVar2 = this.m;
        if (iVar2 != null) {
            bVar.d(iVar2);
        }
        this.f24100k.a(this);
        this.f24099j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((y1.e) this.l.get(i11)).a(this);
        }
        y1.i iVar3 = this.m;
        if (iVar3 != null) {
            iVar3.a(this);
        }
        if (bVar.l() != null) {
            y1.e g9 = ((B1.b) bVar.l().f972c).g();
            this.f24102o = g9;
            g9.a(this);
            bVar.d(this.f24102o);
        }
        if (bVar.m() != null) {
            this.f24104q = new y1.h(this, bVar, bVar.m());
        }
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24094e.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C2915a c2915a = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.f24213c == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f24096g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.f24213c == 2) {
                    if (c2915a != null) {
                        arrayList.add(c2915a);
                    }
                    C2915a c2915a2 = new C2915a(tVar3);
                    tVar3.d(this);
                    c2915a = c2915a2;
                }
            }
            if (cVar2 instanceof m) {
                if (c2915a == null) {
                    c2915a = new C2915a(tVar);
                }
                c2915a.f24090a.add((m) cVar2);
            }
        }
        if (c2915a != null) {
            arrayList.add(c2915a);
        }
    }

    @Override // x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.b;
        path.reset();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24096g;
            if (i9 < arrayList.size()) {
                C2915a c2915a = (C2915a) arrayList.get(i9);
                for (int i10 = 0; i10 < c2915a.f24090a.size(); i10++) {
                    path.addPath(((m) c2915a.f24090a.get(i10)).f(), matrix);
                }
                i9++;
            } else {
                RectF rectF2 = this.f24093d;
                path.computeBounds(rectF2, false);
                float k6 = this.f24099j.k() / 2.0f;
                rectF2.set(rectF2.left - k6, rectF2.top - k6, rectF2.right + k6, rectF2.bottom + k6);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // x1.e
    public void e(Canvas canvas, Matrix matrix, int i9) {
        float f9;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float floatValue;
        b bVar = this;
        int i10 = 1;
        float[] fArr2 = (float[]) H1.i.f1369d.get();
        boolean z8 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            y1.f fVar = bVar.f24100k;
            float k6 = (i9 / 255.0f) * fVar.k(fVar.f24290c.c(), fVar.c());
            float f12 = 100.0f;
            PointF pointF = H1.g.f1365a;
            int max = Math.max(0, Math.min(255, (int) ((k6 / 100.0f) * 255.0f)));
            D1.i iVar = bVar.f24098i;
            iVar.setAlpha(max);
            iVar.setStrokeWidth(H1.i.d(matrix) * bVar.f24099j.k());
            if (iVar.getStrokeWidth() <= 0.0f) {
                return;
            }
            ArrayList arrayList = bVar.l;
            if (!arrayList.isEmpty()) {
                float d2 = H1.i.d(matrix);
                int i11 = 0;
                while (true) {
                    int size = arrayList.size();
                    fArr = bVar.f24097h;
                    if (i11 >= size) {
                        break;
                    }
                    float floatValue2 = ((Float) ((y1.e) arrayList.get(i11)).e()).floatValue();
                    fArr[i11] = floatValue2;
                    if (i11 % 2 == 0) {
                        if (floatValue2 < 1.0f) {
                            fArr[i11] = 1.0f;
                        }
                    } else if (floatValue2 < 0.1f) {
                        fArr[i11] = 0.1f;
                    }
                    fArr[i11] = fArr[i11] * d2;
                    i11++;
                }
                y1.i iVar2 = bVar.m;
                if (iVar2 == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) iVar2.e()).floatValue() * d2;
                }
                iVar.setPathEffect(new DashPathEffect(fArr, floatValue));
            }
            y1.r rVar = bVar.f24101n;
            if (rVar != null) {
                iVar.setColorFilter((ColorFilter) rVar.e());
            }
            y1.e eVar = bVar.f24102o;
            if (eVar != null) {
                float floatValue3 = ((Float) eVar.e()).floatValue();
                if (floatValue3 == 0.0f) {
                    iVar.setMaskFilter(null);
                } else if (floatValue3 != bVar.f24103p) {
                    D1.b bVar2 = bVar.f24095f;
                    if (bVar2.f639A == floatValue3) {
                        blurMaskFilter = bVar2.f640B;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        bVar2.f640B = blurMaskFilter2;
                        bVar2.f639A = floatValue3;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    iVar.setMaskFilter(blurMaskFilter);
                }
                bVar.f24103p = floatValue3;
            }
            y1.h hVar = bVar.f24104q;
            if (hVar != null) {
                hVar.b(iVar);
            }
            int i12 = 0;
            while (true) {
                ArrayList arrayList2 = bVar.f24096g;
                if (i12 < arrayList2.size()) {
                    C2915a c2915a = (C2915a) arrayList2.get(i12);
                    t tVar = c2915a.b;
                    Path path = bVar.b;
                    ArrayList arrayList3 = c2915a.f24090a;
                    if (tVar != null) {
                        path.reset();
                        for (int size2 = arrayList3.size() - i10; size2 >= 0; size2--) {
                            path.addPath(((m) arrayList3.get(size2)).f(), matrix);
                        }
                        t tVar2 = c2915a.b;
                        float floatValue4 = ((Float) tVar2.f24214d.e()).floatValue() / f12;
                        float floatValue5 = ((Float) tVar2.f24215e.e()).floatValue() / f12;
                        float floatValue6 = ((Float) tVar2.f24216f.e()).floatValue() / 360.0f;
                        if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                            canvas.drawPath(path, iVar);
                        } else {
                            PathMeasure pathMeasure = bVar.f24091a;
                            pathMeasure.setPath(path, z8);
                            float length = pathMeasure.getLength();
                            while (pathMeasure.nextContour()) {
                                length = pathMeasure.getLength() + length;
                            }
                            float f13 = floatValue6 * length;
                            float f14 = (floatValue4 * length) + f13;
                            float min = Math.min((floatValue5 * length) + f13, (f14 + length) - 1.0f);
                            int size3 = arrayList3.size() - i10;
                            float f15 = 0.0f;
                            while (size3 >= 0) {
                                Path path2 = bVar.f24092c;
                                path2.set(((m) arrayList3.get(size3)).f());
                                path2.transform(matrix);
                                pathMeasure.setPath(path2, z8);
                                float length2 = pathMeasure.getLength();
                                if (min > length) {
                                    float f16 = min - length;
                                    if (f16 < f15 + length2 && f15 < f16) {
                                        if (f14 > length) {
                                            f11 = (f14 - length) / length2;
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        H1.i.a(path2, f11, Math.min(f16 / length2, 1.0f), 0.0f);
                                        canvas.drawPath(path2, iVar);
                                        f15 += length2;
                                        size3--;
                                        bVar = this;
                                        z8 = false;
                                    }
                                }
                                float f17 = f15 + length2;
                                if (f17 >= f14 && f15 <= min) {
                                    if (f17 <= min && f14 < f15) {
                                        canvas.drawPath(path2, iVar);
                                    } else {
                                        if (f14 < f15) {
                                            f9 = 0.0f;
                                        } else {
                                            f9 = (f14 - f15) / length2;
                                        }
                                        if (min > f17) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = (min - f15) / length2;
                                        }
                                        H1.i.a(path2, f9, f10, 0.0f);
                                        canvas.drawPath(path2, iVar);
                                    }
                                }
                                f15 += length2;
                                size3--;
                                bVar = this;
                                z8 = false;
                            }
                        }
                        i10 = 1;
                    } else {
                        path.reset();
                        i10 = 1;
                        for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                            path.addPath(((m) arrayList3.get(size4)).f(), matrix);
                        }
                        canvas.drawPath(path, iVar);
                    }
                    i12 += i10;
                    bVar = this;
                    z8 = false;
                    f12 = 100.0f;
                } else {
                    return;
                }
            }
        }
    }

    @Override // A1.f
    public void g(E1.d dVar, Object obj) {
        PointF pointF = y.f23578a;
        if (obj == 4) {
            this.f24100k.j(dVar);
            return;
        }
        if (obj == y.f23588n) {
            this.f24099j.j(dVar);
            return;
        }
        ColorFilter colorFilter = y.f23572F;
        D1.b bVar = this.f24095f;
        if (obj == colorFilter) {
            y1.r rVar = this.f24101n;
            if (rVar != null) {
                bVar.p(rVar);
            }
            if (dVar == null) {
                this.f24101n = null;
                return;
            }
            y1.r rVar2 = new y1.r(dVar, null);
            this.f24101n = rVar2;
            rVar2.a(this);
            bVar.d(this.f24101n);
            return;
        }
        if (obj == y.f23581e) {
            y1.e eVar = this.f24102o;
            if (eVar != null) {
                eVar.j(dVar);
                return;
            }
            y1.r rVar3 = new y1.r(dVar, null);
            this.f24102o = rVar3;
            rVar3.a(this);
            bVar.d(this.f24102o);
            return;
        }
        y1.h hVar = this.f24104q;
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

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
