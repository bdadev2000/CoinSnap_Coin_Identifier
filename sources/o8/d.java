package o8;

import G7.j;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m8.k;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public long f22017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P4.a f22018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(P4.a aVar, long j7) {
        super(aVar);
        j.e(aVar, "this$0");
        this.f22018g = aVar;
        this.f22017f = j7;
        if (j7 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22009c) {
            return;
        }
        if (this.f22017f != 0 && !j8.b.g(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f22018g.f2416c).k();
            a();
        }
        this.f22009c = true;
    }

    @Override // o8.a, w8.y
    public final long read(w8.f fVar, long j7) {
        j.e(fVar, "sink");
        if (j7 >= 0) {
            if (!this.f22009c) {
                long j9 = this.f22017f;
                if (j9 == 0) {
                    return -1L;
                }
                long read = super.read(fVar, Math.min(j9, j7));
                if (read != -1) {
                    long j10 = this.f22017f - read;
                    this.f22017f = j10;
                    if (j10 == 0) {
                        a();
                    }
                    return read;
                }
                ((k) this.f22018g.f2416c).k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }
}
