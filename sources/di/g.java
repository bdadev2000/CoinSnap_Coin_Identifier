package di;

import ki.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends b {

    /* renamed from: f, reason: collision with root package name */
    public boolean f17059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h this$0) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17044c) {
            return;
        }
        if (!this.f17059f) {
            d();
        }
        this.f17044c = true;
    }

    @Override // di.b, ki.k0
    public final long read(i sink, long j3) {
        boolean z10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f17044c) {
                if (this.f17059f) {
                    return -1L;
                }
                long read = super.read(sink, j3);
                if (read == -1) {
                    this.f17059f = true;
                    d();
                    return -1L;
                }
                return read;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j3)).toString());
    }
}
