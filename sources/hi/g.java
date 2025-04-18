package hi;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19126b;

    private static boolean c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (gi.d.f18493d.z() && (sslSocket instanceof BCSSLSocket)) {
            return true;
        }
        return false;
    }

    private static boolean d(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        boolean z10 = gi.g.f18496d;
        if (gi.e.b() && Conscrypt.isConscrypt(sslSocket)) {
            return true;
        }
        return false;
    }

    @Override // hi.k
    public final boolean a(SSLSocket sSLSocket) {
        switch (this.f19126b) {
            case 0:
                return c(sSLSocket);
            default:
                return d(sSLSocket);
        }
    }

    @Override // hi.k
    public final m b(SSLSocket sslSocket) {
        switch (this.f19126b) {
            case 0:
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return new h();
            default:
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return new j();
        }
    }
}
