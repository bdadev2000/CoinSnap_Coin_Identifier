package g1;

import b1.d2;
import b1.n0;
import b1.y0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class i extends n0 implements j0.d, h0.g {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30615i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation");

    @Nullable
    private volatile Object _reusableCancellableContinuation;
    public final b1.z d;

    /* renamed from: f, reason: collision with root package name */
    public final h0.g f30616f;

    /* renamed from: g, reason: collision with root package name */
    public Object f30617g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f30618h;

    public i(b1.z zVar, h0.g gVar) {
        super(-1);
        this.d = zVar;
        this.f30616f = gVar;
        this.f30617g = a.f30590c;
        this.f30618h = a.d(gVar.getContext());
    }

    @Override // b1.n0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof b1.v) {
            ((b1.v) obj).f22381b.invoke(cancellationException);
        }
    }

    @Override // b1.n0
    public final h0.g c() {
        return this;
    }

    @Override // b1.n0
    public final Object g() {
        Object obj = this.f30617g;
        this.f30617g = a.f30590c;
        return obj;
    }

    @Override // j0.d
    public final j0.d getCallerFrame() {
        h0.g gVar = this.f30616f;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // h0.g
    public final h0.l getContext() {
        return this.f30616f.getContext();
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        h0.g gVar = this.f30616f;
        h0.l context = gVar.getContext();
        Throwable a2 = d0.n.a(obj);
        Object uVar = a2 == null ? obj : new b1.u(false, a2);
        b1.z zVar = this.d;
        if (zVar.j0(context)) {
            this.f30617g = uVar;
            this.f22348c = 0;
            zVar.h0(context, this);
            return;
        }
        y0 a3 = d2.a();
        if (a3.p0()) {
            this.f30617g = uVar;
            this.f22348c = 0;
            a3.m0(this);
            return;
        }
        a3.o0(true);
        try {
            h0.l context2 = gVar.getContext();
            Object e = a.e(context2, this.f30618h);
            try {
                gVar.resumeWith(obj);
                do {
                } while (a3.r0());
            } finally {
                a.b(context2, e);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + b1.f0.F(this.f30616f) + ']';
    }
}
