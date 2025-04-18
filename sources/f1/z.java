package f1;

import b1.h1;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f30502a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(2);
        this.f30502a = wVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        h0.j jVar = (h0.j) obj2;
        h0.k key = jVar.getKey();
        h0.j i2 = this.f30502a.f30497b.i(key);
        if (key != b1.a0.f22285b) {
            return Integer.valueOf(jVar != i2 ? Integer.MIN_VALUE : intValue + 1);
        }
        h1 h1Var = (h1) i2;
        h1 h1Var2 = (h1) jVar;
        while (true) {
            if (h1Var2 != null) {
                if (h1Var2 == h1Var || !(h1Var2 instanceof g1.y)) {
                    break;
                }
                h1Var2 = h1Var2.getParent();
            } else {
                h1Var2 = null;
                break;
            }
        }
        if (h1Var2 == h1Var) {
            if (h1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + h1Var2 + ", expected child of " + h1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
