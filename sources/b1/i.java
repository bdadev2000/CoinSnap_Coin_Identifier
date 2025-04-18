package b1;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22328a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22329b;

    public i(Object obj, int i2) {
        this.f22328a = i2;
        this.f22329b = obj;
    }

    @Override // b1.j
    public final void b(Throwable th) {
        int i2 = this.f22328a;
        Object obj = this.f22329b;
        switch (i2) {
            case 0:
                if (th != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            case 1:
                ((q0) obj).dispose();
                return;
            default:
                ((q0.l) obj).invoke(th);
                return;
        }
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d0.b0 b0Var = d0.b0.f30125a;
        switch (this.f22328a) {
            case 0:
                b((Throwable) obj);
                return b0Var;
            case 1:
                b((Throwable) obj);
                return b0Var;
            default:
                b((Throwable) obj);
                return b0Var;
        }
    }

    public final String toString() {
        int i2 = this.f22328a;
        Object obj = this.f22329b;
        switch (i2) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "DisposeOnCancel[" + ((q0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((q0.l) obj).getClass().getSimpleName() + '@' + f0.o(this) + ']';
        }
    }
}
