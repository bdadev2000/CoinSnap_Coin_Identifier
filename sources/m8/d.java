package m8;

import J1.B;
import androidx.core.app.NotificationCompat;
import i8.C2365b;
import java.io.IOException;
import java.net.ProtocolException;
import w8.y;

/* loaded from: classes3.dex */
public final class d extends w8.k {
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public long f21765c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21766d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21767f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B f21769h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(B b, y yVar, long j7) {
        super(yVar);
        G7.j.e(b, "this$0");
        G7.j.e(yVar, "delegate");
        this.f21769h = b;
        this.b = j7;
        this.f21766d = true;
        if (j7 == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f21767f) {
            return iOException;
        }
        this.f21767f = true;
        B b = this.f21769h;
        if (iOException == null && this.f21766d) {
            this.f21766d = false;
            ((C2365b) b.f1488c).getClass();
            G7.j.e((i) b.b, NotificationCompat.CATEGORY_CALL);
        }
        return b.a(true, false, iOException);
    }

    @Override // w8.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21768g) {
            return;
        }
        this.f21768g = true;
        try {
            super.close();
            a(null);
        } catch (IOException e4) {
            throw a(e4);
        }
    }

    @Override // w8.k, w8.y
    public final long read(w8.f fVar, long j7) {
        G7.j.e(fVar, "sink");
        if (!this.f21768g) {
            try {
                long read = delegate().read(fVar, j7);
                if (this.f21766d) {
                    this.f21766d = false;
                    B b = this.f21769h;
                    C2365b c2365b = (C2365b) b.f1488c;
                    i iVar = (i) b.b;
                    c2365b.getClass();
                    G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
                }
                if (read == -1) {
                    a(null);
                    return -1L;
                }
                long j9 = this.f21765c + read;
                long j10 = this.b;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + j10 + " bytes but received " + j9);
                }
                this.f21765c = j9;
                if (j9 == j10) {
                    a(null);
                }
                return read;
            } catch (IOException e4) {
                throw a(e4);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
