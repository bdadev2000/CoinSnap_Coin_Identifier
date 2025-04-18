package g1;

import b1.c2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.r implements q0.p {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f30596b = new c0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f30597c = new c0(1);
    public static final c0 d = new c0(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i2) {
        super(2);
        this.f30598a = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30598a) {
            case 0:
                h0.j jVar = (h0.j) obj2;
                if (!(jVar instanceof c2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? jVar : Integer.valueOf(intValue + 1);
            case 1:
                c2 c2Var = (c2) obj;
                h0.j jVar2 = (h0.j) obj2;
                if (c2Var != null) {
                    return c2Var;
                }
                return jVar2 instanceof c2 ? (c2) jVar2 : null;
            default:
                g0 g0Var = (g0) obj;
                h0.j jVar3 = (h0.j) obj2;
                if (jVar3 instanceof c2) {
                    c2 c2Var2 = (c2) jVar3;
                    Object h2 = c2Var2.h(g0Var.f30610a);
                    int i2 = g0Var.d;
                    g0Var.f30611b[i2] = h2;
                    g0Var.d = i2 + 1;
                    g0Var.f30612c[i2] = c2Var2;
                }
                return g0Var;
        }
    }
}
