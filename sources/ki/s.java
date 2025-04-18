package ki;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f21015b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f21016c;

    /* renamed from: d, reason: collision with root package name */
    public final di.f f21017d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21018f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f21019g;

    public s(i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        d0 d0Var = new d0(sink);
        this.f21015b = d0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f21016c = deflater;
        this.f21017d = new di.f(d0Var, deflater);
        this.f21019g = new CRC32();
        i iVar = d0Var.f20966c;
        iVar.V(8075);
        iVar.w(8);
        iVar.w(0);
        iVar.U(0);
        iVar.w(0);
        iVar.w(0);
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        boolean z10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j3 == 0) {
                return;
            }
            f0 f0Var = source.f20993b;
            Intrinsics.checkNotNull(f0Var);
            long j10 = j3;
            while (j10 > 0) {
                int min = (int) Math.min(j10, f0Var.f20980c - f0Var.f20979b);
                this.f21019g.update(f0Var.a, f0Var.f20979b, min);
                j10 -= min;
                f0Var = f0Var.f20983f;
                Intrinsics.checkNotNull(f0Var);
            }
            this.f21017d.a(source, j3);
            return;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f21016c;
        d0 d0Var = this.f21015b;
        if (this.f21018f) {
            return;
        }
        try {
            di.f fVar = this.f21017d;
            ((Deflater) fVar.f17058f).finish();
            fVar.d(false);
            d0Var.j((int) this.f21019g.getValue());
            d0Var.j((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            d0Var.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f21018f = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        this.f21017d.flush();
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f21015b.timeout();
    }
}
