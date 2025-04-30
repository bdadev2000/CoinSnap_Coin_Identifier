package X7;

import Q7.AbstractC0251t;
import Q7.M;
import V7.w;
import com.mbridge.msdk.foundation.entity.o;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d extends M implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final d f3728d = new AbstractC0251t();

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0251t f3729f;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q7.t, X7.d] */
    static {
        AbstractC0251t abstractC0251t = l.f3742d;
        int i9 = w.f3542a;
        if (64 >= i9) {
            i9 = 64;
        }
        int j7 = V7.a.j("kotlinx.coroutines.io.parallelism", i9, 0, 0, 12);
        abstractC0251t.getClass();
        if (j7 >= 1) {
            if (j7 < k.f3737d) {
                if (j7 >= 1) {
                    abstractC0251t = new V7.i(abstractC0251t, j7);
                } else {
                    throw new IllegalArgumentException(o.h(j7, "Expected positive parallelism level, but got ").toString());
                }
            }
            f3729f = abstractC0251t;
            return;
        }
        throw new IllegalArgumentException(o.h(j7, "Expected positive parallelism level, but got ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(w7.l.b, runnable);
    }

    @Override // Q7.AbstractC0251t
    public final void j(w7.k kVar, Runnable runnable) {
        f3729f.j(kVar, runnable);
    }

    @Override // Q7.AbstractC0251t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
