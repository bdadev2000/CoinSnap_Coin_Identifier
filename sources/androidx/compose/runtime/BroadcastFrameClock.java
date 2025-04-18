package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import h0.g;
import h0.j;
import h0.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f13676a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f13678c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13677b = new Object();
    public List d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f13679f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInt f13680g = new AtomicInteger(0);

    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {

        /* renamed from: a, reason: collision with root package name */
        public final l f13681a;

        /* renamed from: b, reason: collision with root package name */
        public final g f13682b;

        public FrameAwaiter(l lVar, b1.l lVar2) {
            this.f13681a = lVar;
            this.f13682b = lVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.atomic.AtomicInteger, androidx.compose.runtime.AtomicInt] */
    public BroadcastFrameClock(q0.a aVar) {
        this.f13676a = aVar;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    public final void b(long j2) {
        Object d;
        synchronized (this.f13677b) {
            try {
                List list = this.d;
                this.d = this.f13679f;
                this.f13679f = list;
                this.f13680g.set(0);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    FrameAwaiter frameAwaiter = (FrameAwaiter) list.get(i2);
                    frameAwaiter.getClass();
                    try {
                        d = frameAwaiter.f13681a.invoke(Long.valueOf(j2));
                    } catch (Throwable th) {
                        d = q.d(th);
                    }
                    frameAwaiter.f13682b.resumeWith(d);
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object b0(l lVar, g gVar) {
        q0.a aVar;
        b1.l lVar2 = new b1.l(1, f0.r(gVar));
        lVar2.p();
        FrameAwaiter frameAwaiter = new FrameAwaiter(lVar, lVar2);
        synchronized (this.f13677b) {
            Throwable th = this.f13678c;
            if (th != null) {
                lVar2.resumeWith(q.d(th));
            } else {
                boolean isEmpty = this.d.isEmpty();
                boolean z2 = !isEmpty;
                this.d.add(frameAwaiter);
                if (!z2) {
                    this.f13680g.set(1);
                }
                lVar2.z(new BroadcastFrameClock$withFrameNanos$2$1(this, frameAwaiter));
                if (isEmpty && (aVar = this.f13676a) != null) {
                    try {
                        aVar.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f13677b) {
                            try {
                                if (this.f13678c == null) {
                                    this.f13678c = th2;
                                    List list = this.d;
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((FrameAwaiter) list.get(i2)).f13682b.resumeWith(q.d(th2));
                                    }
                                    this.d.clear();
                                    this.f13680g.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object o2 = lVar2.o();
        i0.a aVar2 = i0.a.f30806a;
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
