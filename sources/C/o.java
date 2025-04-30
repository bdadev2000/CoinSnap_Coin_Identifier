package C;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import x0.AbstractC2914a;
import z.AbstractC2965e;
import z.C2963c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f372f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f373a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f374c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f375d;

    /* renamed from: e, reason: collision with root package name */
    public int f376e;

    public final void a(ArrayList arrayList) {
        int size = this.f373a.size();
        if (this.f376e != -1 && size > 0) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                o oVar = (o) arrayList.get(i9);
                if (this.f376e == oVar.b) {
                    c(this.f374c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C2963c c2963c, int i9) {
        int n2;
        int n9;
        ArrayList arrayList = this.f373a;
        if (arrayList.size() == 0) {
            return 0;
        }
        B.e eVar = (B.e) ((B.d) arrayList.get(0)).f129T;
        c2963c.t();
        eVar.b(c2963c, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((B.d) arrayList.get(i10)).b(c2963c, false);
        }
        if (i9 == 0 && eVar.f194z0 > 0) {
            B.j.a(eVar, c2963c, arrayList, 0);
        }
        if (i9 == 1 && eVar.f174A0 > 0) {
            B.j.a(eVar, c2963c, arrayList, 1);
        }
        try {
            c2963c.p();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f375d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            B.d dVar = (B.d) arrayList.get(i11);
            L4.f fVar = new L4.f(2);
            new WeakReference(dVar);
            C2963c.n(dVar.f119I);
            C2963c.n(dVar.f120J);
            C2963c.n(dVar.f121K);
            C2963c.n(dVar.f122L);
            C2963c.n(dVar.f123M);
            this.f375d.add(fVar);
        }
        if (i9 == 0) {
            n2 = C2963c.n(eVar.f119I);
            n9 = C2963c.n(eVar.f121K);
            c2963c.t();
        } else {
            n2 = C2963c.n(eVar.f120J);
            n9 = C2963c.n(eVar.f122L);
            c2963c.t();
        }
        return n9 - n2;
    }

    public final void c(int i9, o oVar) {
        Iterator it = this.f373a.iterator();
        while (it.hasNext()) {
            B.d dVar = (B.d) it.next();
            ArrayList arrayList = oVar.f373a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i10 = oVar.b;
            if (i9 == 0) {
                dVar.f159n0 = i10;
            } else {
                dVar.f161o0 = i10;
            }
        }
        this.f376e = oVar.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i9 = this.f374c;
        if (i9 == 0) {
            str = "Horizontal";
        } else if (i9 == 1) {
            str = "Vertical";
        } else if (i9 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String g9 = AbstractC2914a.g(sb, this.b, "] <");
        Iterator it = this.f373a.iterator();
        while (it.hasNext()) {
            B.d dVar = (B.d) it.next();
            StringBuilder c9 = AbstractC2965e.c(g9, " ");
            c9.append(dVar.f149h0);
            g9 = c9.toString();
        }
        return com.mbridge.msdk.foundation.entity.o.j(g9, " >");
    }
}
