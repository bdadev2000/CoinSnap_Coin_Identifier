package ki;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f20990c;

    public /* synthetic */ h(j jVar, int i10) {
        this.f20989b = i10;
        this.f20990c = jVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f20989b) {
            case 0:
                return;
            default:
                ((d0) this.f20990c).close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f20989b) {
            case 0:
                return;
            default:
                d0 d0Var = (d0) this.f20990c;
                if (!d0Var.f20967d) {
                    d0Var.flush();
                    return;
                }
                return;
        }
    }

    public final String toString() {
        int i10 = this.f20989b;
        j jVar = this.f20990c;
        switch (i10) {
            case 0:
                return ((i) jVar) + ".outputStream()";
            default:
                return ((d0) jVar) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i10, int i11) {
        int i12 = this.f20989b;
        j jVar = this.f20990c;
        switch (i12) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                ((i) jVar).u(i10, i11, data);
                return;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                d0 d0Var = (d0) jVar;
                if (!d0Var.f20967d) {
                    d0Var.f20966c.u(i10, i11, data);
                    d0Var.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        int i11 = this.f20989b;
        j jVar = this.f20990c;
        switch (i11) {
            case 0:
                ((i) jVar).w(i10);
                return;
            default:
                d0 d0Var = (d0) jVar;
                if (!d0Var.f20967d) {
                    d0Var.f20966c.w((byte) i10);
                    d0Var.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
        }
    }
}
