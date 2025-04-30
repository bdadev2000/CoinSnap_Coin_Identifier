package m8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p8.EnumC2574b;
import p8.s;
import p8.z;
import w8.p;

/* loaded from: classes3.dex */
public final class h extends w8.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21782k;
    public final Object l;

    public /* synthetic */ h(Object obj, int i9) {
        this.f21782k = i9;
        this.l = obj;
    }

    @Override // w8.c
    public IOException j(IOException iOException) {
        switch (this.f21782k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.j(iOException);
        }
    }

    @Override // w8.c
    public final void k() {
        switch (this.f21782k) {
            case 0:
                ((i) this.l).cancel();
                return;
            case 1:
                ((z) this.l).e(EnumC2574b.CANCEL);
                s sVar = ((z) this.l).b;
                synchronized (sVar) {
                    long j7 = sVar.f22460r;
                    long j9 = sVar.f22459q;
                    if (j7 >= j9) {
                        sVar.f22459q = j9 + 1;
                        sVar.f22461s = System.nanoTime() + 1000000000;
                        sVar.f22455k.c(new k8.g(G7.j.j(" ping", sVar.f22450f), sVar, 3), 0L);
                        return;
                    }
                    return;
                }
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e4) {
                    if (r8.k.p(e4)) {
                        p.f24030a.log(Level.WARNING, G7.j.j(socket, "Failed to close timed out socket "), (Throwable) e4);
                        return;
                    }
                    throw e4;
                } catch (Exception e9) {
                    p.f24030a.log(Level.WARNING, G7.j.j(socket, "Failed to close timed out socket "), (Throwable) e9);
                    return;
                }
        }
    }

    public void l() {
        if (!i()) {
        } else {
            throw j(null);
        }
    }

    public h(z zVar) {
        this.f21782k = 1;
        G7.j.e(zVar, "this$0");
        this.l = zVar;
    }
}
