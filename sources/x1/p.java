package x1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class p implements e, m, j, InterfaceC2942a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f24190a = new Matrix();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final v f24191c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.b f24192d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24193e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24194f;

    /* renamed from: g, reason: collision with root package name */
    public final y1.i f24195g;

    /* renamed from: h, reason: collision with root package name */
    public final y1.i f24196h;

    /* renamed from: i, reason: collision with root package name */
    public final y1.q f24197i;

    /* renamed from: j, reason: collision with root package name */
    public d f24198j;

    public p(v vVar, D1.b bVar, C1.i iVar) {
        this.f24191c = vVar;
        this.f24192d = bVar;
        this.f24193e = iVar.b;
        this.f24194f = iVar.f459d;
        y1.e g9 = iVar.f458c.g();
        this.f24195g = (y1.i) g9;
        bVar.d(g9);
        g9.a(this);
        y1.e g10 = ((B1.b) iVar.f460e).g();
        this.f24196h = (y1.i) g10;
        bVar.d(g10);
        g10.a(this);
        B1.d dVar = (B1.d) iVar.f461f;
        dVar.getClass();
        y1.q qVar = new y1.q(dVar);
        this.f24197i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24191c.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        this.f24198j.b(list, list2);
    }

    @Override // x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        this.f24198j.c(rectF, matrix, z8);
    }

    @Override // x1.j
    public final void d(ListIterator listIterator) {
        if (this.f24198j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f24198j = new d(this.f24191c, this.f24192d, "Repeater", this.f24194f, arrayList, null);
    }

    @Override // x1.e
    public final void e(Canvas canvas, Matrix matrix, int i9) {
        float floatValue = ((Float) this.f24195g.e()).floatValue();
        float floatValue2 = ((Float) this.f24196h.e()).floatValue();
        y1.q qVar = this.f24197i;
        float floatValue3 = ((Float) qVar.m.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) qVar.f24331n.e()).floatValue() / 100.0f;
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f24190a;
            matrix2.set(matrix);
            float f9 = i10;
            matrix2.preConcat(qVar.f(f9 + floatValue2));
            this.f24198j.e(canvas, matrix2, (int) (H1.g.e(floatValue3, floatValue4, f9 / floatValue) * i9));
        }
    }

    @Override // x1.m
    public final Path f() {
        Path f9 = this.f24198j.f();
        Path path = this.b;
        path.reset();
        float floatValue = ((Float) this.f24195g.e()).floatValue();
        float floatValue2 = ((Float) this.f24196h.e()).floatValue();
        for (int i9 = ((int) floatValue) - 1; i9 >= 0; i9--) {
            Matrix matrix = this.f24190a;
            matrix.set(this.f24197i.f(i9 + floatValue2));
            path.addPath(f9, matrix);
        }
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        if (this.f24197i.c(dVar, obj)) {
            return;
        }
        if (obj == y.f23590p) {
            this.f24195g.j(dVar);
        } else if (obj == y.f23591q) {
            this.f24196h.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.f24193e;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
        for (int i10 = 0; i10 < this.f24198j.f24111h.size(); i10++) {
            c cVar = (c) this.f24198j.f24111h.get(i10);
            if (cVar instanceof k) {
                H1.g.f(eVar, i9, arrayList, eVar2, (k) cVar);
            }
        }
    }
}
