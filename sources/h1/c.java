package h1;

import b1.z;
import b1.z0;
import e1.t0;
import g1.b0;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class c extends z0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f30747c = new z();
    public static final z d;

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.z, h1.c] */
    static {
        l lVar = l.f30760c;
        int i2 = b0.f30594a;
        if (64 >= i2) {
            i2 = 64;
        }
        d = lVar.k0(t0.C("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h0(h0.m.f30726a, runnable);
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        d.h0(lVar, runnable);
    }

    @Override // b1.z
    public final void i0(h0.l lVar, Runnable runnable) {
        d.i0(lVar, runnable);
    }

    @Override // b1.z
    public final z k0(int i2) {
        return l.f30760c.k0(1);
    }

    @Override // b1.z
    public final String toString() {
        return "Dispatchers.IO";
    }
}
