package x1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24161a = new Path();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24162c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24163d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final C1.g f24164e;

    public l(C1.g gVar) {
        gVar.getClass();
        this.f24164e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.b;
        path.reset();
        Path path2 = this.f24161a;
        path2.reset();
        ArrayList arrayList = this.f24163d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f9 = ((m) arrayList2.get(size2)).f();
                    y1.q qVar = dVar.f24114k;
                    if (qVar != null) {
                        matrix2 = qVar.e();
                    } else {
                        matrix2 = dVar.f24106c;
                        matrix2.reset();
                    }
                    f9.transform(matrix2);
                    path.addPath(f9);
                }
            } else {
                path.addPath(mVar.f());
            }
        }
        int i9 = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List d2 = dVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) d2;
                if (i9 >= arrayList3.size()) {
                    break;
                }
                Path f10 = ((m) arrayList3.get(i9)).f();
                y1.q qVar2 = dVar2.f24114k;
                if (qVar2 != null) {
                    matrix = qVar2.e();
                } else {
                    matrix = dVar2.f24106c;
                    matrix.reset();
                }
                f10.transform(matrix);
                path2.addPath(f10);
                i9++;
            }
        } else {
            path2.set(mVar2.f());
        }
        this.f24162c.op(path2, path, op);
    }

    @Override // x1.c
    public final void b(List list, List list2) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24163d;
            if (i9 < arrayList.size()) {
                ((m) arrayList.get(i9)).b(list, list2);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // x1.j
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f24163d.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // x1.m
    public final Path f() {
        Path path = this.f24162c;
        path.reset();
        C1.g gVar = this.f24164e;
        if (gVar.b) {
            return path;
        }
        int d2 = AbstractC2965e.d(gVar.f446a);
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 != 2) {
                    if (d2 != 3) {
                        if (d2 == 4) {
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
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f24163d;
                if (i9 >= arrayList.size()) {
                    break;
                }
                path.addPath(((m) arrayList.get(i9)).f());
                i9++;
            }
        }
        return path;
    }
}
