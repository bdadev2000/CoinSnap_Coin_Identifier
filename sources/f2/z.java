package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class z extends t {
    public int F;
    public ArrayList D = new ArrayList();
    public boolean E = true;
    public boolean G = false;
    public int H = 0;

    @Override // f2.t
    public final void A(View view) {
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            ((t) this.D.get(i10)).A(view);
        }
        this.f17643h.remove(view);
    }

    @Override // f2.t
    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).B(viewGroup);
        }
    }

    @Override // f2.t
    public final void C() {
        if (this.D.isEmpty()) {
            J();
            m();
            return;
        }
        y yVar = new y(this, 1);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(yVar);
        }
        this.F = this.D.size();
        if (!this.E) {
            for (int i10 = 1; i10 < this.D.size(); i10++) {
                ((t) this.D.get(i10 - 1)).a(new v(1, this, (t) this.D.get(i10)));
            }
            t tVar = (t) this.D.get(0);
            if (tVar != null) {
                tVar.C();
                return;
            }
            return;
        }
        Iterator it2 = this.D.iterator();
        while (it2.hasNext()) {
            ((t) it2.next()).C();
        }
    }

    @Override // f2.t
    public final void D(long j3) {
        ArrayList arrayList;
        this.f17640d = j3;
        if (j3 >= 0 && (arrayList = this.D) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.D.get(i10)).D(j3);
            }
        }
    }

    @Override // f2.t
    public final void E(va.b bVar) {
        this.f17658x = bVar;
        this.H |= 8;
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).E(bVar);
        }
    }

    @Override // f2.t
    public final void F(TimeInterpolator timeInterpolator) {
        this.H |= 1;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.D.get(i10)).F(timeInterpolator);
            }
        }
        this.f17641f = timeInterpolator;
    }

    @Override // f2.t
    public final void G(com.facebook.b bVar) {
        super.G(bVar);
        this.H |= 4;
        if (this.D != null) {
            for (int i10 = 0; i10 < this.D.size(); i10++) {
                ((t) this.D.get(i10)).G(bVar);
            }
        }
    }

    @Override // f2.t
    public final void H() {
        this.H |= 2;
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).H();
        }
    }

    @Override // f2.t
    public final void I(long j3) {
        this.f17639c = j3;
    }

    @Override // f2.t
    public final String K(String str) {
        String K = super.K(str);
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            StringBuilder n10 = eb.j.n(K, "\n");
            n10.append(((t) this.D.get(i10)).K(str + "  "));
            K = n10.toString();
        }
        return K;
    }

    public final void L(t tVar) {
        this.D.add(tVar);
        tVar.f17646k = this;
        long j3 = this.f17640d;
        if (j3 >= 0) {
            tVar.D(j3);
        }
        if ((this.H & 1) != 0) {
            tVar.F(this.f17641f);
        }
        if ((this.H & 2) != 0) {
            tVar.H();
        }
        if ((this.H & 4) != 0) {
            tVar.G(this.f17659y);
        }
        if ((this.H & 8) != 0) {
            tVar.E(this.f17658x);
        }
    }

    @Override // f2.t
    public final void a(r rVar) {
        super.a(rVar);
    }

    @Override // f2.t
    public final void b(View view) {
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            ((t) this.D.get(i10)).b(view);
        }
        this.f17643h.add(view);
    }

    @Override // f2.t
    public final void cancel() {
        super.cancel();
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).cancel();
        }
    }

    @Override // f2.t
    public final void d(c0 c0Var) {
        View view = c0Var.f17585b;
        if (u(view)) {
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.u(view)) {
                    tVar.d(c0Var);
                    c0Var.f17586c.add(tVar);
                }
            }
        }
    }

    @Override // f2.t
    public final void f(c0 c0Var) {
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).f(c0Var);
        }
    }

    @Override // f2.t
    public final void g(c0 c0Var) {
        View view = c0Var.f17585b;
        if (u(view)) {
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.u(view)) {
                    tVar.g(c0Var);
                    c0Var.f17586c.add(tVar);
                }
            }
        }
    }

    @Override // f2.t
    /* renamed from: j */
    public final t clone() {
        z zVar = (z) super.clone();
        zVar.D = new ArrayList();
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            t clone = ((t) this.D.get(i10)).clone();
            zVar.D.add(clone);
            clone.f17646k = zVar;
        }
        return zVar;
    }

    @Override // f2.t
    public final void l(ViewGroup viewGroup, ic.t tVar, ic.t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j3 = this.f17639c;
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar3 = (t) this.D.get(i10);
            if (j3 > 0 && (this.E || i10 == 0)) {
                long j10 = tVar3.f17639c;
                if (j10 > 0) {
                    tVar3.I(j10 + j3);
                } else {
                    tVar3.I(j3);
                }
            }
            tVar3.l(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // f2.t
    public final boolean s() {
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            if (((t) this.D.get(i10)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // f2.t
    public final void y(View view) {
        super.y(view);
        int size = this.D.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.D.get(i10)).y(view);
        }
    }

    @Override // f2.t
    public final t z(r rVar) {
        super.z(rVar);
        return this;
    }
}
