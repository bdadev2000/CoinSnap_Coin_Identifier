package o3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class q implements f, n, k, p3.a, l {
    public final Matrix a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23104b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final x f23105c;

    /* renamed from: d, reason: collision with root package name */
    public final u3.b f23106d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23107e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23108f;

    /* renamed from: g, reason: collision with root package name */
    public final p3.h f23109g;

    /* renamed from: h, reason: collision with root package name */
    public final p3.h f23110h;

    /* renamed from: i, reason: collision with root package name */
    public final p3.s f23111i;

    /* renamed from: j, reason: collision with root package name */
    public e f23112j;

    public q(x xVar, u3.b bVar, t3.i iVar) {
        this.f23105c = xVar;
        this.f23106d = bVar;
        this.f23107e = iVar.f25229b;
        this.f23108f = iVar.f25231d;
        p3.d a = iVar.f25230c.a();
        this.f23109g = (p3.h) a;
        bVar.f(a);
        a.a(this);
        p3.d a10 = ((s3.a) iVar.f25232e).a();
        this.f23110h = (p3.h) a10;
        bVar.f(a10);
        a10.a(this);
        s3.c cVar = (s3.c) iVar.f25233f;
        cVar.getClass();
        p3.s sVar = new p3.s(cVar);
        this.f23111i = sVar;
        sVar.a(bVar);
        sVar.b(this);
    }

    @Override // p3.a
    public final void a() {
        this.f23105c.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        this.f23112j.b(list, list2);
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
        for (int i11 = 0; i11 < this.f23112j.f23023h.size(); i11++) {
            d dVar = (d) this.f23112j.f23023h.get(i11);
            if (dVar instanceof l) {
                y3.f.e(eVar, i10, arrayList, eVar2, (l) dVar);
            }
        }
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        if (this.f23111i.c(cVar, obj)) {
            return;
        }
        if (obj == a0.u) {
            this.f23109g.k(cVar);
        } else if (obj == a0.f21516v) {
            this.f23110h.k(cVar);
        }
    }

    @Override // o3.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f23112j.e(rectF, matrix, z10);
    }

    @Override // o3.k
    public final void f(ListIterator listIterator) {
        if (this.f23112j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f23112j = new e(this.f23105c, this.f23106d, "Repeater", this.f23108f, arrayList, null);
    }

    @Override // o3.f
    public final void g(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f23109g.f()).floatValue();
        float floatValue2 = ((Float) this.f23110h.f()).floatValue();
        p3.s sVar = this.f23111i;
        float floatValue3 = ((Float) sVar.f23409m.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) sVar.f23410n.f()).floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                Matrix matrix2 = this.a;
                matrix2.set(matrix);
                float f10 = i11;
                matrix2.preConcat(sVar.e(f10 + floatValue2));
                PointF pointF = y3.f.a;
                this.f23112j.g(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f10 / floatValue)) + floatValue3) * i10));
            } else {
                return;
            }
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23107e;
    }

    @Override // o3.n
    public final Path z() {
        Path z10 = this.f23112j.z();
        Path path = this.f23104b;
        path.reset();
        float floatValue = ((Float) this.f23109g.f()).floatValue();
        float floatValue2 = ((Float) this.f23110h.f()).floatValue();
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 >= 0) {
                Matrix matrix = this.a;
                matrix.set(this.f23111i.e(i10 + floatValue2));
                path.addPath(z10, matrix);
            } else {
                return path;
            }
        }
    }
}
