package s8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class i implements k {
    @Override // s8.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean z8 = r8.g.f22937d;
        if (r8.e.b() && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s8.m, java.lang.Object] */
    @Override // s8.k
    public final m c(SSLSocket sSLSocket) {
        return new Object();
    }
}
