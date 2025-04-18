package k9;

import n9.h0;
import s7.o2;
import s7.z2;

/* loaded from: classes3.dex */
public final class x {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final o2[] f20525b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f20526c;

    /* renamed from: d, reason: collision with root package name */
    public final z2 f20527d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20528e;

    public x(o2[] o2VarArr, q[] qVarArr, z2 z2Var, s sVar) {
        this.f20525b = o2VarArr;
        this.f20526c = (q[]) qVarArr.clone();
        this.f20527d = z2Var;
        this.f20528e = sVar;
        this.a = o2VarArr.length;
    }

    public final boolean a(x xVar, int i10) {
        if (xVar == null || !h0.a(this.f20525b[i10], xVar.f20525b[i10]) || !h0.a(this.f20526c[i10], xVar.f20526c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        return this.f20525b[i10] != null;
    }
}
