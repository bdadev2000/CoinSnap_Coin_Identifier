package androidx.compose.runtime;

import android.view.Choreographer;
import b1.f0;
import b1.o0;
import g1.u;
import h0.g;
import h0.j;
import h0.k;
import h1.d;
import j0.i;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultChoreographerFrameClock f13779a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Choreographer f13780b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.DefaultChoreographerFrameClock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [j0.i, q0.p] */
    static {
        d dVar = o0.f22355a;
        f13780b = (Choreographer) e.z(((c1.e) u.f30639a).f22411g, new i(2, null));
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object b0(final l lVar, g gVar) {
        final b1.l lVar2 = new b1.l(1, f0.r(gVar));
        lVar2.p();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                Object d;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f13779a;
                try {
                    d = lVar.invoke(Long.valueOf(j2));
                } catch (Throwable th) {
                    d = q.d(th);
                }
                lVar2.resumeWith(d);
            }
        };
        f13780b.postFrameCallback(frameCallback);
        lVar2.z(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object o2 = lVar2.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
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
