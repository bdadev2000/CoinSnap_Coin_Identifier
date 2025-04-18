package f1;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final h0.l f30468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30470c;

    public g(h0.l lVar, int i2, int i3) {
        this.f30468a = lVar;
        this.f30469b = i2;
        this.f30470c = i3;
    }

    public String a() {
        return null;
    }

    public abstract Object c(d1.q qVar, h0.g gVar);

    @Override // e1.h
    public Object collect(e1.i iVar, h0.g gVar) {
        Object J = p0.a.J(new e(null, iVar, this), gVar);
        return J == i0.a.f30806a ? J : d0.b0.f30125a;
    }

    public abstract g d(h0.l lVar, int i2, int i3);

    public e1.h e() {
        return null;
    }

    public d1.r f(b1.d0 d0Var) {
        int i2 = this.f30469b;
        if (i2 == -3) {
            i2 = -2;
        }
        q0.p fVar = new f(this, null);
        d1.p pVar = new d1.p(p0.a.q0(d0Var, this.f30468a), p0.a.a(i2, this.f30470c, 4));
        pVar.o0(3, pVar, fVar);
        return pVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String a2 = a();
        if (a2 != null) {
            arrayList.add(a2);
        }
        h0.m mVar = h0.m.f30726a;
        h0.l lVar = this.f30468a;
        if (lVar != mVar) {
            arrayList.add("context=" + lVar);
        }
        int i2 = this.f30469b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f30470c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(com.applovin.impl.adview.t.D(i3)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return android.support.v4.media.d.q(sb, e0.u.K0(arrayList, ", ", null, null, null, 62), ']');
    }
}
