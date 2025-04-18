package ki;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f20995m;

    public j0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f20995m = socket;
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
        Socket socket = this.f20995m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (a6.k.E(e2)) {
                y.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                return;
            }
            throw e2;
        } catch (Exception e10) {
            y.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
