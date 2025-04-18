package androidx.compose.runtime;

import b1.f0;
import b1.o0;
import g1.u;
import h0.g;
import h0.j;
import h0.k;
import h1.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {

    /* renamed from: a, reason: collision with root package name */
    public static final SdkStubsFallbackFrameClock f13973a = new Object();

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object b0(l lVar, g gVar) {
        d dVar = o0.f22355a;
        return e.G(gVar, u.f30639a, new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, null));
    }

    @Override // h0.l
    public final j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public final h0.l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final h0.l u(h0.l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
