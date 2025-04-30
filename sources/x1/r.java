package x1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import v1.v;
import v1.y;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class r implements m, InterfaceC2942a, k {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24202c;

    /* renamed from: d, reason: collision with root package name */
    public final v f24203d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.n f24204e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24205f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24201a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final J1.k f24206g = new J1.k(4);

    public r(v vVar, D1.b bVar, C1.n nVar) {
        this.b = nVar.f472a;
        this.f24202c = nVar.f474d;
        this.f24203d = vVar;
        y1.n nVar2 = new y1.n((List) nVar.f473c.f273c);
        this.f24204e = nVar2;
        bVar.d(nVar2);
        nVar2.a(this);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24205f = false;
        this.f24203d.invalidateSelf();
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i9 < arrayList2.size()) {
                c cVar = (c) arrayList2.get(i9);
                if (cVar instanceof t) {
                    t tVar = (t) cVar;
                    if (tVar.f24213c == 1) {
                        this.f24206g.f1526a.add(tVar);
                        tVar.d(this);
                        i9++;
                    }
                }
                if (cVar instanceof q) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((q) cVar);
                }
                i9++;
            } else {
                this.f24204e.m = arrayList;
                return;
            }
        }
    }

    @Override // x1.m
    public final Path f() {
        boolean z8 = this.f24205f;
        y1.n nVar = this.f24204e;
        Path path = this.f24201a;
        if (z8 && nVar.f24292e == null) {
            return path;
        }
        path.reset();
        if (this.f24202c) {
            this.f24205f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f24206g.d(path);
        this.f24205f = true;
        return path;
    }

    @Override // A1.f
    public final void g(E1.d dVar, Object obj) {
        if (obj == y.f23577K) {
            this.f24204e.j(dVar);
        }
    }

    @Override // x1.c
    public final String getName() {
        return this.b;
    }

    @Override // A1.f
    public final void h(A1.e eVar, int i9, ArrayList arrayList, A1.e eVar2) {
        H1.g.f(eVar, i9, arrayList, eVar2, this);
    }
}
