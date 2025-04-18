package di;

import ki.i;
import ki.i0;
import ki.m0;
import ki.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final r f17046b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f17048d;

    public c(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17048d = this$0;
        this.f17046b = new r(this$0.f17062d.timeout());
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f17047c) {
            if (j3 == 0) {
                return;
            }
            h hVar = this.f17048d;
            hVar.f17062d.writeHexadecimalUnsignedLong(j3);
            hVar.f17062d.writeUtf8("\r\n");
            hVar.f17062d.a(source, j3);
            hVar.f17062d.writeUtf8("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f17047c) {
            return;
        }
        this.f17047c = true;
        this.f17048d.f17062d.writeUtf8("0\r\n\r\n");
        h.f(this.f17048d, this.f17046b);
        this.f17048d.f17063e = 3;
    }

    @Override // ki.i0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f17047c) {
            return;
        }
        this.f17048d.f17062d.flush();
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f17046b;
    }
}
