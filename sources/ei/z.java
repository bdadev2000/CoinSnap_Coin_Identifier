package ei;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends ki.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f17507m;

    public z(a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17507m = this$0;
    }

    @Override // ki.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ki.e
    public final void k() {
        this.f17507m.e(b.CANCEL);
        t tVar = this.f17507m.f17362b;
        synchronized (tVar) {
            long j3 = tVar.f17471r;
            long j10 = tVar.f17470q;
            if (j3 >= j10) {
                tVar.f17470q = j10 + 1;
                tVar.f17472s = System.nanoTime() + 1000000000;
                Unit unit = Unit.INSTANCE;
                tVar.f17464k.c(new ai.b(Intrinsics.stringPlus(tVar.f17459f, " ping"), 1, tVar), 0L);
            }
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
