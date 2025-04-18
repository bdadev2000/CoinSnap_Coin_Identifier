package o3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import m3.x;

/* loaded from: classes.dex */
public final class e implements f, n, p3.a, r3.f {
    public final n3.a a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f23017b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23018c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f23019d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f23020e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23021f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23022g;

    /* renamed from: h, reason: collision with root package name */
    public final List f23023h;

    /* renamed from: i, reason: collision with root package name */
    public final x f23024i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f23025j;

    /* renamed from: k, reason: collision with root package name */
    public final p3.s f23026k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(m3.x r8, u3.b r9, t3.m r10, m3.j r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.f25242c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r10 = r10.f25241b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            t3.b r2 = (t3.b) r2
            o3.d r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L40
            java.lang.Object r11 = r10.get(r0)
            t3.b r11 = (t3.b) r11
            boolean r1 = r11 instanceof s3.c
            if (r1 == 0) goto L3d
            s3.c r11 = (s3.c) r11
            r6 = r11
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.<init>(m3.x, u3.b, t3.m, m3.j):void");
    }

    @Override // p3.a
    public final void a() {
        this.f23024i.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f23023h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) list3.get(size2);
            dVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(dVar);
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        String str = this.f23021f;
        if (!eVar.c(i10, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            r3.e eVar3 = new r3.e(eVar2);
            eVar3.a.add(str);
            if (eVar.a(i10, str)) {
                r3.e eVar4 = new r3.e(eVar3);
                eVar4.f23991b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i10, str)) {
            int b3 = eVar.b(i10, str) + i10;
            int i11 = 0;
            while (true) {
                List list = this.f23023h;
                if (i11 < list.size()) {
                    d dVar = (d) list.get(i11);
                    if (dVar instanceof r3.f) {
                        ((r3.f) dVar).c(eVar, b3, arrayList, eVar2);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        p3.s sVar = this.f23026k;
        if (sVar != null) {
            sVar.c(cVar, obj);
        }
    }

    @Override // o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f23018c;
        matrix2.set(matrix);
        p3.s sVar = this.f23026k;
        if (sVar != null) {
            matrix2.preConcat(sVar.d());
        }
        RectF rectF2 = this.f23020e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f23023h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) list.get(size);
                if (dVar instanceof f) {
                    ((f) dVar).e(rectF2, matrix2, z10);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final List f() {
        if (this.f23025j == null) {
            this.f23025j = new ArrayList();
            int i10 = 0;
            while (true) {
                List list = this.f23023h;
                if (i10 >= list.size()) {
                    break;
                }
                d dVar = (d) list.get(i10);
                if (dVar instanceof n) {
                    this.f23025j.add((n) dVar);
                }
                i10++;
            }
        }
        return this.f23025j;
    }

    @Override // o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int intValue;
        if (this.f23022g) {
            return;
        }
        Matrix matrix2 = this.f23018c;
        matrix2.set(matrix);
        p3.s sVar = this.f23026k;
        if (sVar != null) {
            matrix2.preConcat(sVar.d());
            p3.d dVar = sVar.f23406j;
            if (dVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) dVar.f()).intValue();
            }
            i10 = (int) ((((intValue / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f23024i.u;
        boolean z12 = false;
        List list = this.f23023h;
        if (z11) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 < list.size()) {
                    if ((list.get(i11) instanceof f) && (i12 = i12 + 1) >= 2) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && i10 != 255) {
                z12 = true;
            }
        }
        if (z12) {
            RectF rectF = this.f23017b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix2, true);
            n3.a aVar = this.a;
            aVar.setAlpha(i10);
            y3.g gVar = y3.h.a;
            canvas.saveLayer(rectF, aVar);
        }
        if (z12) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof f) {
                ((f) obj).g(canvas, matrix2, i10);
            }
        }
        if (z12) {
            canvas.restore();
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23021f;
    }

    @Override // o3.n
    public final Path z() {
        Matrix matrix = this.f23018c;
        matrix.reset();
        p3.s sVar = this.f23026k;
        if (sVar != null) {
            matrix.set(sVar.d());
        }
        Path path = this.f23019d;
        path.reset();
        if (this.f23022g) {
            return path;
        }
        List list = this.f23023h;
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = (d) list.get(size);
            if (dVar instanceof n) {
                path.addPath(((n) dVar).z(), matrix);
            }
        }
        return path;
    }

    public e(x xVar, u3.b bVar, String str, boolean z10, ArrayList arrayList, s3.c cVar) {
        this.a = new n3.a();
        this.f23017b = new RectF();
        this.f23018c = new Matrix();
        this.f23019d = new Path();
        this.f23020e = new RectF();
        this.f23021f = str;
        this.f23024i = xVar;
        this.f23022g = z10;
        this.f23023h = arrayList;
        if (cVar != null) {
            p3.s sVar = new p3.s(cVar);
            this.f23026k = sVar;
            sVar.a(bVar);
            sVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof k) {
                arrayList2.add((k) dVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((k) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
            }
        }
    }
}
