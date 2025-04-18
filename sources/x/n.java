package x;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f27288f;

    /* renamed from: b, reason: collision with root package name */
    public final int f27289b;

    /* renamed from: c, reason: collision with root package name */
    public int f27290c;
    public final ArrayList a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f27291d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f27292e = -1;

    public n(int i10) {
        this.f27289b = -1;
        int i11 = f27288f;
        f27288f = i11 + 1;
        this.f27289b = i11;
        this.f27290c = i10;
    }

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.f27292e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = (n) arrayList.get(i10);
                if (this.f27292e == nVar.f27289b) {
                    c(this.f27290c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(t.d dVar, int i10) {
        int n10;
        int n11;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.f fVar = (w.f) ((w.e) arrayList.get(0)).T;
        dVar.t();
        fVar.c(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((w.e) arrayList.get(i11)).c(dVar, false);
        }
        if (i10 == 0 && fVar.f26628z0 > 0) {
            com.bumptech.glide.c.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.A0 > 0) {
            com.bumptech.glide.c.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f27291d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f27291d.add(new m(this, (w.e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            n10 = t.d.n(fVar.I);
            n11 = t.d.n(fVar.K);
            dVar.t();
        } else {
            n10 = t.d.n(fVar.J);
            n11 = t.d.n(fVar.L);
            dVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i10, n nVar) {
        Iterator it = this.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i11 = nVar.f27289b;
            if (hasNext) {
                w.e eVar = (w.e) it.next();
                ArrayList arrayList = nVar.a;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(eVar);
                }
                if (i10 == 0) {
                    eVar.f26606n0 = i11;
                } else {
                    eVar.f26608o0 = i11;
                }
            } else {
                this.f27292e = i11;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f27290c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String g10 = vd.e.g(sb2, this.f27289b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            w.e eVar = (w.e) it.next();
            StringBuilder n10 = eb.j.n(g10, " ");
            n10.append(eVar.f26594h0);
            g10 = n10.toString();
        }
        return eb.j.k(g10, " >");
    }
}
