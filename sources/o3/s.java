package o3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import m3.a0;
import m3.x;

/* loaded from: classes.dex */
public final class s implements n, p3.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f23115b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23116c;

    /* renamed from: d, reason: collision with root package name */
    public final x f23117d;

    /* renamed from: e, reason: collision with root package name */
    public final p3.o f23118e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23119f;
    public final Path a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f23120g = new c(0);

    public s(x xVar, u3.b bVar, t3.n nVar) {
        this.f23115b = nVar.a;
        this.f23116c = nVar.f25245d;
        this.f23117d = xVar;
        p3.o oVar = new p3.o((List) nVar.f25244c.f21106c);
        this.f23118e = oVar;
        bVar.f(oVar);
        oVar.a(this);
    }

    @Override // p3.a
    public final void a() {
        this.f23119f = false;
        this.f23117d.invalidateSelf();
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 < arrayList2.size()) {
                d dVar = (d) arrayList2.get(i10);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f23126c == 1) {
                        this.f23120g.a.add(uVar);
                        uVar.c(this);
                        i10++;
                    }
                }
                if (dVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((r) dVar);
                }
                i10++;
            } else {
                this.f23118e.f23388m = arrayList;
                return;
            }
        }
    }

    @Override // r3.f
    public final void c(r3.e eVar, int i10, ArrayList arrayList, r3.e eVar2) {
        y3.f.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // r3.f
    public final void d(h.c cVar, Object obj) {
        if (obj == a0.P) {
            this.f23118e.k(cVar);
        }
    }

    @Override // o3.d
    public final String getName() {
        return this.f23115b;
    }

    @Override // o3.n
    public final Path z() {
        boolean z10;
        boolean z11 = this.f23119f;
        p3.o oVar = this.f23118e;
        Path path = this.a;
        if (z11) {
            if (oVar.f23363e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return path;
            }
        }
        path.reset();
        if (this.f23116c) {
            this.f23119f = true;
            return path;
        }
        Path path2 = (Path) oVar.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f23120g.a(path);
        this.f23119f = true;
        return path;
    }
}
