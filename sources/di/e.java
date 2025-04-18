package di;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import ki.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: f, reason: collision with root package name */
    public long f17053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f17054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h this$0, long j3) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17054g = this$0;
        this.f17053f = j3;
        if (j3 == 0) {
            d();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17044c) {
            return;
        }
        if (this.f17053f != 0 && !xh.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f17054g.f17060b.k();
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
                long j10 = this.f17053f;
                if (j10 == 0) {
                    return -1L;
                }
                long read = super.read(sink, Math.min(j10, j3));
                if (read != -1) {
                    long j11 = this.f17053f - read;
                    this.f17053f = j11;
                    if (j11 == 0) {
                        d();
                    }
                    return read;
                }
                this.f17054g.f17060b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j3)).toString());
    }
}
