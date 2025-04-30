package x1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class d implements e, m, InterfaceC2942a, A1.f {

    /* renamed from: a, reason: collision with root package name */
    public final D1.i f24105a;
    public final RectF b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f24106c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f24107d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f24108e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24109f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24110g;

    /* renamed from: h, reason: collision with root package name */
    public final List f24111h;

    /* renamed from: i, reason: collision with root package name */
    public final v f24112i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f24113j;

    /* renamed from: k, reason: collision with root package name */
    public final y1.q f24114k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(v1.v r8, D1.b r9, C1.m r10, v1.i r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f470a
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r0 = r10.b
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        Lf:
            int r4 = r0.size()
            if (r2 >= r4) goto L27
            java.lang.Object r4 = r0.get(r2)
            C1.b r4 = (C1.b) r4
            x1.c r4 = r4.a(r8, r11, r9)
            if (r4 == 0) goto L24
            r5.add(r4)
        L24:
            int r2 = r2 + 1
            goto Lf
        L27:
            int r11 = r0.size()
            if (r1 >= r11) goto L3e
            java.lang.Object r11 = r0.get(r1)
            C1.b r11 = (C1.b) r11
            boolean r2 = r11 instanceof B1.d
            if (r2 == 0) goto L3b
            B1.d r11 = (B1.d) r11
        L39:
            r6 = r11
            goto L40
        L3b:
            int r1 = r1 + 1
            goto L27
        L3e:
            r11 = 0
            goto L39
        L40:
            boolean r4 = r10.f471c
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.d.<init>(v1.v, D1.b, C1.m, v1.i):void");
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24112i.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f24111h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) list3.get(size2);
            cVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    @Override // x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        Matrix matrix2 = this.f24106c;
        matrix2.set(matrix);
        y1.q qVar = this.f24114k;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f24108e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f24111h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(rectF2, matrix2, z8);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.f24113j == null) {
            this.f24113j = new ArrayList();
            int i9 = 0;
            while (true) {
                List list = this.f24111h;
                if (i9 >= list.size()) {
                    break;
                }
                c cVar = (c) list.get(i9);
                if (cVar instanceof m) {
                    this.f24113j.add((m) cVar);
                }
                i9++;
            }
        }
        return this.f24113j;
    }

    @Override // x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        int intValue;
        if (this.f24110g) {
            return;
        }
        Matrix matrix2 = this.f24106c;
        matrix2.set(matrix);
        y1.q qVar = this.f24114k;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
            y1.e eVar = qVar.f24329j;
            if (eVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) eVar.e()).intValue();
            }
            i9 = (int) ((((intValue / 100.0f) * i9) / 255.0f) * 255.0f);
        }
        boolean z8 = this.f24112i.f23556u;
        boolean z9 = false;
        List list = this.f24111h;
        if (z8) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if ((list.get(i10) instanceof e) && (i11 = i11 + 1) >= 2) {
                    if (i9 != 255) {
                        z9 = true;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (z9) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix2, true);
            D1.i iVar = this.f24105a;
            iVar.setAlpha(i9);
            H1.h hVar = H1.i.f1367a;
            canvas.saveLayer(rectF, iVar);
        }
        if (z9) {
            i9 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof e) {
                ((e) obj).e(canvas, matrix2, i9);
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    @Override // x1.m
    public final Path f() {
        Matrix matrix = this.f24106c;
        matrix.reset();
        y1.q qVar = this.f24114k;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f24107d;
        path.reset();
        if (this.f24110g) {
            return path;
        }
        List list = this.f24111h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof m) {
                path.addPath(((m) cVar).f(), matrix);
            }
        }
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        y1.q qVar = this.f24114k;
        if (qVar != null) {
            qVar.c(dVar, obj);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24109f;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        String str = this.f24109f;
        if (!eVar.c(i9, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            A1.e eVar3 = new A1.e(eVar2);
            eVar3.f22a.add(str);
            if (eVar.a(i9, str)) {
                A1.e eVar4 = new A1.e(eVar3);
                eVar4.b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i9, str)) {
            int b = eVar.b(i9, str) + i9;
            int i10 = 0;
            while (true) {
                List list = this.f24111h;
                if (i10 < list.size()) {
                    c cVar = (c) list.get(i10);
                    if (cVar instanceof A1.f) {
                        ((A1.f) cVar).h(eVar, b, arrayList, eVar2);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public d(v vVar, D1.b bVar, String str, boolean z8, ArrayList arrayList, B1.d dVar) {
        this.f24105a = new D1.i();
        this.b = new RectF();
        this.f24106c = new Matrix();
        this.f24107d = new Path();
        this.f24108e = new RectF();
        this.f24109f = str;
        this.f24112i = vVar;
        this.f24110g = z8;
        this.f24111h = arrayList;
        if (dVar != null) {
            y1.q qVar = new y1.q(dVar);
            this.f24114k = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
