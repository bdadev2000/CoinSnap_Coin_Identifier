package bi;

import java.io.IOException;
import java.net.ProtocolException;
import ki.k0;
import ki.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f2448b;

    /* renamed from: c, reason: collision with root package name */
    public long f2449c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2450d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2451f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a4.f f2453h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a4.f this$0, k0 delegate, long j3) {
        super(delegate);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2453h = this$0;
        this.f2448b = j3;
        this.f2450d = true;
        if (j3 == 0) {
            d(null);
        }
    }

    @Override // ki.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2452g) {
            return;
        }
        this.f2452g = true;
        try {
            super.close();
            d(null);
        } catch (IOException e2) {
            throw d(e2);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f2451f) {
            return iOException;
        }
        this.f2451f = true;
        a4.f fVar = this.f2453h;
        if (iOException == null && this.f2450d) {
            this.f2450d = false;
            y5.f fVar2 = (y5.f) fVar.f110b;
            i call = (i) fVar.a;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return fVar.a(true, false, iOException);
    }

    @Override // ki.q, ki.k0
    public final long read(ki.i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!this.f2452g) {
            try {
                long read = delegate().read(sink, j3);
                if (this.f2450d) {
                    this.f2450d = false;
                    a4.f fVar = this.f2453h;
                    y5.f fVar2 = (y5.f) fVar.f110b;
                    i call = (i) fVar.a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(call, "call");
                }
                if (read == -1) {
                    d(null);
                    return -1L;
                }
                long j10 = this.f2449c + read;
                long j11 = this.f2448b;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
                }
                this.f2449c = j10;
                if (j10 == j11) {
                    d(null);
                }
                return read;
            } catch (IOException e2) {
                throw d(e2);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
