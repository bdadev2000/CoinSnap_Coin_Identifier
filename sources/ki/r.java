package ki;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public m0 f21014e;

    public r(m0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21014e = delegate;
    }

    @Override // ki.m0
    public final m0 a() {
        return this.f21014e.a();
    }

    @Override // ki.m0
    public final m0 b() {
        return this.f21014e.b();
    }

    @Override // ki.m0
    public final long c() {
        return this.f21014e.c();
    }

    @Override // ki.m0
    public final m0 d(long j3) {
        return this.f21014e.d(j3);
    }

    @Override // ki.m0
    public final boolean e() {
        return this.f21014e.e();
    }

    @Override // ki.m0
    public final void f() {
        this.f21014e.f();
    }

    @Override // ki.m0
    public final m0 g(long j3, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f21014e.g(j3, unit);
    }
}
