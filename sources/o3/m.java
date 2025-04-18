package o3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m implements n, k {
    public final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f23073b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f23074c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23075d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final t3.g f23076e;

    public m(t3.g gVar) {
        gVar.getClass();
        this.f23076e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f23073b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.f23075d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path z10 = ((n) arrayList2.get(size2)).z();
                    p3.s sVar = eVar.f23026k;
                    if (sVar != null) {
                        matrix2 = sVar.d();
                    } else {
                        matrix2 = eVar.f23018c;
                        matrix2.reset();
                    }
                    z10.transform(matrix2);
                    path.addPath(z10);
                }
            } else {
                path.addPath(nVar.z());
            }
        }
        int i10 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List f10 = eVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f10;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path z11 = ((n) arrayList3.get(i10)).z();
                p3.s sVar2 = eVar2.f23026k;
                if (sVar2 != null) {
                    matrix = sVar2.d();
                } else {
                    matrix = eVar2.f23018c;
                    matrix.reset();
                }
                z11.transform(matrix);
                path2.addPath(z11);
                i10++;
            }
        } else {
            path2.set(nVar2.z());
        }
        this.f23074c.op(path2, path, op);
    }

    @Override // o3.d
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23075d;
            if (i10 < arrayList.size()) {
                ((n) arrayList.get(i10)).b(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // o3.k
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f23075d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // o3.n
    public final Path z() {
        Path path = this.f23074c;
        path.reset();
        t3.g gVar = this.f23076e;
        if (gVar.f25218b) {
            return path;
        }
        int b3 = t.h.b(gVar.a);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    if (b3 != 3) {
                        if (b3 == 4) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f23075d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((n) arrayList.get(i10)).z());
                i10++;
            }
        }
        return path;
    }
}
