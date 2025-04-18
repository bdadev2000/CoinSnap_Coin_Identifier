package ki;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20962b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20963c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20964d;

    public d(InputStream input, m0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f20963c = input;
        this.f20964d = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f20962b;
        Object obj = this.f20963c;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                k0 k0Var = (k0) this.f20964d;
                eVar.h();
                try {
                    k0Var.close();
                    Unit unit = Unit.INSTANCE;
                    if (!eVar.i()) {
                        return;
                    } else {
                        throw eVar.j(null);
                    }
                } catch (IOException e2) {
                    if (!eVar.i()) {
                        throw e2;
                    }
                    throw eVar.j(e2);
                } finally {
                    eVar.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // ki.k0
    public final long read(i sink, long j3) {
        boolean z10;
        int i10 = this.f20962b;
        Object obj = this.f20964d;
        Object obj2 = this.f20963c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                e eVar = (e) obj2;
                k0 k0Var = (k0) obj;
                eVar.h();
                try {
                    long read = k0Var.read(sink, j3);
                    if (!eVar.i()) {
                        return read;
                    }
                    throw eVar.j(null);
                } catch (IOException e2) {
                    if (!eVar.i()) {
                        throw e2;
                    }
                    throw eVar.j(e2);
                } finally {
                    eVar.i();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    try {
                        ((m0) obj).f();
                        f0 t5 = sink.t(1);
                        int read2 = ((InputStream) obj2).read(t5.a, t5.f20980c, (int) Math.min(j3, 8192 - t5.f20980c));
                        if (read2 == -1) {
                            if (t5.f20979b == t5.f20980c) {
                                sink.f20993b = t5.a();
                                g0.a(t5);
                            }
                            return -1L;
                        }
                        t5.f20980c += read2;
                        long j10 = read2;
                        sink.f20994c += j10;
                        return j10;
                    } catch (AssertionError e10) {
                        if (a6.k.E(e10)) {
                            throw new IOException(e10);
                        }
                        throw e10;
                    }
                }
                throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
        }
    }

    @Override // ki.k0
    public final m0 timeout() {
        switch (this.f20962b) {
            case 0:
                return (e) this.f20963c;
            default:
                return (m0) this.f20964d;
        }
    }

    public final String toString() {
        switch (this.f20962b) {
            case 0:
                return "AsyncTimeout.source(" + ((k0) this.f20964d) + ')';
            default:
                return "source(" + ((InputStream) this.f20963c) + ')';
        }
    }

    public d(j0 j0Var, d dVar) {
        this.f20963c = j0Var;
        this.f20964d = dVar;
    }
}
