package bi;

import java.io.IOException;
import java.net.ProtocolException;
import ki.i0;
import ki.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends p {

    /* renamed from: c, reason: collision with root package name */
    public final long f2443c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2444d;

    /* renamed from: f, reason: collision with root package name */
    public long f2445f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a4.f f2447h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a4.f this$0, i0 delegate, long j3) {
        super(delegate);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2447h = this$0;
        this.f2443c = j3;
    }

    @Override // ki.p, ki.i0
    public final void a(ki.i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f2446g) {
            long j10 = this.f2443c;
            if (j10 != -1 && this.f2445f + j3 > j10) {
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("expected ", j10, " bytes but received ");
                o10.append(this.f2445f + j3);
                throw new ProtocolException(o10.toString());
            }
            try {
                super.a(source, j3);
                this.f2445f += j3;
                return;
            } catch (IOException e2) {
                throw d(e2);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.p, ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2446g) {
            return;
        }
        this.f2446g = true;
        long j3 = this.f2443c;
        if (j3 != -1 && this.f2445f != j3) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            d(null);
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f2444d) {
            return iOException;
        }
        this.f2444d = true;
        return this.f2447h.a(false, true, iOException);
    }

    @Override // ki.p, ki.i0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            throw d(e2);
        }
    }
}
