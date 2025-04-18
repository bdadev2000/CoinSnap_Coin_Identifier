package n1;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f31148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, int i2) {
        super(0);
        this.f31147a = i2;
        this.f31148b = x0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        int i2 = this.f31147a;
        x0 x0Var = this.f31148b;
        switch (i2) {
            case 0:
                c0 c0Var = x0Var.f31151b;
                return c0Var != null ? new k1.a[]{c0Var.f31058a} : v0.f31143b;
            case 1:
                return v0.b(x0Var.f31151b != null ? new ArrayList(0) : null);
            default:
                return Integer.valueOf(e1.t0.p(x0Var, (l1.f[]) x0Var.f31157j.getValue()));
        }
    }
}
