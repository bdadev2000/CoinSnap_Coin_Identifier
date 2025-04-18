package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import kotlin.jvm.internal.q;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f16385a;

    /* renamed from: b, reason: collision with root package name */
    public final AndroidUiDispatcher f16386b;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.f16385a = choreographer;
        this.f16386b = androidUiDispatcher;
    }

    @Override // h0.l
    public final Object H(Object obj, q0.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object b0(final q0.l lVar, h0.g gVar) {
        AndroidUiDispatcher androidUiDispatcher = this.f16386b;
        if (androidUiDispatcher == null) {
            h0.j i2 = gVar.getContext().i(h0.h.f30725a);
            androidUiDispatcher = i2 instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) i2 : null;
        }
        final b1.l lVar2 = new b1.l(1, f0.r(gVar));
        lVar2.p();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback(lVar2, this, lVar) { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b1.k f16391a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0.l f16392b;

            {
                this.f16392b = lVar;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                Object d;
                try {
                    d = this.f16392b.invoke(Long.valueOf(j2));
                } catch (Throwable th) {
                    d = q.d(th);
                }
                this.f16391a.resumeWith(d);
            }
        };
        if (androidUiDispatcher == null || !p0.a.g(androidUiDispatcher.f16374c, this.f16385a)) {
            this.f16385a.postFrameCallback(frameCallback);
            lVar2.z(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        } else {
            synchronized (androidUiDispatcher.f16375f) {
                androidUiDispatcher.f16377h.add(frameCallback);
                if (!androidUiDispatcher.f16380k) {
                    androidUiDispatcher.f16380k = true;
                    androidUiDispatcher.f16374c.postFrameCallback(androidUiDispatcher.f16381l);
                }
            }
            lVar2.z(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        }
        Object o2 = lVar2.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    @Override // h0.l
    public final h0.j i(h0.k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public final h0.l s(h0.k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final h0.l u(h0.l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
