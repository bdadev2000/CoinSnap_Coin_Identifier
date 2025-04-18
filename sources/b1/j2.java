package b1;

/* loaded from: classes4.dex */
public final class j2 extends z {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22334c = 0;

    static {
        new z();
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        n2 n2Var = (n2) lVar.i(n2.f22353c);
        if (n2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        n2Var.f22354b = true;
    }

    @Override // b1.z
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
