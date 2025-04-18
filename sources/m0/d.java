package m0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends t.e {

    /* renamed from: f, reason: collision with root package name */
    public final Object f21422f;

    public d(int i10) {
        super(i10, 1);
        this.f21422f = new Object();
    }

    @Override // t.e, m0.c
    public final boolean c(Object instance) {
        boolean c10;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f21422f) {
            c10 = super.c(instance);
        }
        return c10;
    }

    @Override // t.e, m0.c
    public final Object d() {
        Object d10;
        synchronized (this.f21422f) {
            d10 = super.d();
        }
        return d10;
    }
}
