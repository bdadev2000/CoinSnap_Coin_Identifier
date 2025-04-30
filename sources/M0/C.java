package M0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import q4.C2645d;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class C extends w {

    /* renamed from: I, reason: collision with root package name */
    public int f1841I;

    /* renamed from: G, reason: collision with root package name */
    public ArrayList f1839G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    public boolean f1840H = true;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1842J = false;

    /* renamed from: K, reason: collision with root package name */
    public int f1843K = 0;

    @Override // M0.w
    public final w A(u uVar) {
        super.A(uVar);
        return this;
    }

    @Override // M0.w
    public final void B(View view) {
        for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
            ((w) this.f1839G.get(i9)).B(view);
        }
        this.f1923h.remove(view);
    }

    @Override // M0.w
    public final void C(View view) {
        super.C(view);
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).C(view);
        }
    }

    @Override // M0.w
    public final void D() {
        if (this.f1839G.isEmpty()) {
            L();
            m();
            return;
        }
        B b = new B();
        b.b = this;
        Iterator it = this.f1839G.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(b);
        }
        this.f1841I = this.f1839G.size();
        if (!this.f1840H) {
            for (int i9 = 1; i9 < this.f1839G.size(); i9++) {
                ((w) this.f1839G.get(i9 - 1)).a(new B((w) this.f1839G.get(i9), 2));
            }
            w wVar = (w) this.f1839G.get(0);
            if (wVar != null) {
                wVar.D();
                return;
            }
            return;
        }
        Iterator it2 = this.f1839G.iterator();
        while (it2.hasNext()) {
            ((w) it2.next()).D();
        }
    }

    @Override // M0.w
    public final void E(long j7, long j9) {
        boolean z8;
        long j10 = this.f1939z;
        if (this.f1926k != null) {
            if (j7 >= 0 || j9 >= 0) {
                if (j7 > j10 && j9 > j10) {
                    return;
                }
            } else {
                return;
            }
        }
        if (j7 < j9) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((j7 >= 0 && j9 < 0) || (j7 <= j10 && j9 > j10)) {
            this.f1933t = false;
            x(this, v.f1908R7, z8);
        }
        if (this.f1840H) {
            for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
                ((w) this.f1839G.get(i9)).E(j7, j9);
            }
        } else {
            int i10 = 1;
            while (true) {
                if (i10 < this.f1839G.size()) {
                    if (((w) this.f1839G.get(i10)).f1918B > j9) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = this.f1839G.size();
                    break;
                }
            }
            int i11 = i10 - 1;
            if (j7 >= j9) {
                while (i11 < this.f1839G.size()) {
                    w wVar = (w) this.f1839G.get(i11);
                    long j11 = wVar.f1918B;
                    int i12 = i11;
                    long j12 = j7 - j11;
                    if (j12 < 0) {
                        break;
                    }
                    wVar.E(j12, j9 - j11);
                    i11 = i12 + 1;
                }
            } else {
                while (i11 >= 0) {
                    w wVar2 = (w) this.f1839G.get(i11);
                    long j13 = wVar2.f1918B;
                    long j14 = j7 - j13;
                    wVar2.E(j14, j9 - j13);
                    if (j14 >= 0) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
        }
        if (this.f1926k != null) {
            if ((j7 > j10 && j9 <= j10) || (j7 < 0 && j9 >= 0)) {
                if (j7 > j10) {
                    this.f1933t = true;
                }
                x(this, v.f1909S7, z8);
            }
        }
    }

    @Override // M0.w
    public final void F(long j7) {
        ArrayList arrayList;
        this.f1920d = j7;
        if (j7 >= 0 && (arrayList = this.f1839G) != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((w) this.f1839G.get(i9)).F(j7);
            }
        }
    }

    @Override // M0.w
    public final void G(C0219j c0219j) {
        this.f1937x = c0219j;
        this.f1843K |= 8;
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).G(c0219j);
        }
    }

    @Override // M0.w
    public final void H(TimeInterpolator timeInterpolator) {
        this.f1843K |= 1;
        ArrayList arrayList = this.f1839G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((w) this.f1839G.get(i9)).H(timeInterpolator);
            }
        }
        this.f1921f = timeInterpolator;
    }

    @Override // M0.w
    public final void I(C2645d c2645d) {
        super.I(c2645d);
        this.f1843K |= 4;
        if (this.f1839G != null) {
            for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
                ((w) this.f1839G.get(i9)).I(c2645d);
            }
        }
    }

    @Override // M0.w
    public final void J() {
        this.f1843K |= 2;
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).J();
        }
    }

    @Override // M0.w
    public final void K(long j7) {
        this.f1919c = j7;
    }

    @Override // M0.w
    public final String M(String str) {
        String M8 = super.M(str);
        for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
            StringBuilder c9 = AbstractC2965e.c(M8, "\n");
            c9.append(((w) this.f1839G.get(i9)).M(str + "  "));
            M8 = c9.toString();
        }
        return M8;
    }

    public final void N(w wVar) {
        this.f1839G.add(wVar);
        wVar.f1926k = this;
        long j7 = this.f1920d;
        if (j7 >= 0) {
            wVar.F(j7);
        }
        if ((this.f1843K & 1) != 0) {
            wVar.H(this.f1921f);
        }
        if ((this.f1843K & 2) != 0) {
            wVar.J();
        }
        if ((this.f1843K & 4) != 0) {
            wVar.I(this.f1938y);
        }
        if ((this.f1843K & 8) != 0) {
            wVar.G(this.f1937x);
        }
    }

    public final w O(int i9) {
        if (i9 >= 0 && i9 < this.f1839G.size()) {
            return (w) this.f1839G.get(i9);
        }
        return null;
    }

    @Override // M0.w
    public final void b(View view) {
        for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
            ((w) this.f1839G.get(i9)).b(view);
        }
        this.f1923h.add(view);
    }

    @Override // M0.w
    public final void cancel() {
        super.cancel();
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).cancel();
        }
    }

    @Override // M0.w
    public final void d(F f9) {
        if (v(f9.b)) {
            Iterator it = this.f1839G.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar.v(f9.b)) {
                    wVar.d(f9);
                    f9.f1846c.add(wVar);
                }
            }
        }
    }

    @Override // M0.w
    public final void f(F f9) {
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).f(f9);
        }
    }

    @Override // M0.w
    public final void g(F f9) {
        if (v(f9.b)) {
            Iterator it = this.f1839G.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar.v(f9.b)) {
                    wVar.g(f9);
                    f9.f1846c.add(wVar);
                }
            }
        }
    }

    @Override // M0.w
    /* renamed from: j */
    public final w clone() {
        C c9 = (C) super.clone();
        c9.f1839G = new ArrayList();
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            w clone = ((w) this.f1839G.get(i9)).clone();
            c9.f1839G.add(clone);
            clone.f1926k = c9;
        }
        return c9;
    }

    @Override // M0.w
    public final void l(ViewGroup viewGroup, b1.h hVar, b1.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j7 = this.f1919c;
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            w wVar = (w) this.f1839G.get(i9);
            if (j7 > 0 && (this.f1840H || i9 == 0)) {
                long j9 = wVar.f1919c;
                if (j9 > 0) {
                    wVar.K(j9 + j7);
                } else {
                    wVar.K(j7);
                }
            }
            wVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // M0.w
    public final boolean s() {
        for (int i9 = 0; i9 < this.f1839G.size(); i9++) {
            if (((w) this.f1839G.get(i9)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // M0.w
    public final boolean t() {
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!((w) this.f1839G.get(i9)).t()) {
                return false;
            }
        }
        return true;
    }

    @Override // M0.w
    public final void y(View view) {
        super.y(view);
        int size = this.f1839G.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((w) this.f1839G.get(i9)).y(view);
        }
    }

    @Override // M0.w
    public final void z() {
        this.f1939z = 0L;
        int i9 = 0;
        B b = new B(this, i9);
        while (i9 < this.f1839G.size()) {
            w wVar = (w) this.f1839G.get(i9);
            wVar.a(b);
            wVar.z();
            long j7 = wVar.f1939z;
            if (this.f1840H) {
                this.f1939z = Math.max(this.f1939z, j7);
            } else {
                long j9 = this.f1939z;
                wVar.f1918B = j9;
                this.f1939z = j9 + j7;
            }
            i9++;
        }
    }
}
