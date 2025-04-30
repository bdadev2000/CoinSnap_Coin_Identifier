package m8;

import J1.B;
import java.io.IOException;
import java.net.ProtocolException;
import w8.x;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public final class c extends w8.j {

    /* renamed from: c, reason: collision with root package name */
    public final long f21760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21761d;

    /* renamed from: f, reason: collision with root package name */
    public long f21762f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B f21764h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B b, x xVar, long j7) {
        super(xVar);
        G7.j.e(b, "this$0");
        G7.j.e(xVar, "delegate");
        this.f21764h = b;
        this.f21760c = j7;
    }

    public final IOException a(IOException iOException) {
        if (this.f21761d) {
            return iOException;
        }
        this.f21761d = true;
        return this.f21764h.a(false, true, iOException);
    }

    @Override // w8.j, w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21763g) {
            return;
        }
        this.f21763g = true;
        long j7 = this.f21760c;
        if (j7 != -1 && this.f21762f != j7) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e4) {
            throw a(e4);
        }
    }

    @Override // w8.j, w8.x
    public final void d(w8.f fVar, long j7) {
        G7.j.e(fVar, "source");
        if (!this.f21763g) {
            long j9 = this.f21760c;
            if (j9 != -1 && this.f21762f + j7 > j9) {
                StringBuilder a6 = AbstractC2933a.a("expected ", j9, " bytes but received ");
                a6.append(this.f21762f + j7);
                throw new ProtocolException(a6.toString());
            }
            try {
                super.d(fVar, j7);
                this.f21762f += j7;
                return;
            } catch (IOException e4) {
                throw a(e4);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.j, w8.x, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e4) {
            throw a(e4);
        }
    }
}
