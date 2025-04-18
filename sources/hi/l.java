package hi;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public m f19131b;

    public l(k socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.a = socketAdapterFactory;
    }

    @Override // hi.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.a.a(sslSocket);
    }

    @Override // hi.m
    public final boolean b() {
        return true;
    }

    @Override // hi.m
    public final String c(SSLSocket sslSocket) {
        m mVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.f19131b == null && this.a.a(sslSocket)) {
                this.f19131b = this.a.b(sslSocket);
            }
            mVar = this.f19131b;
        }
        if (mVar == null) {
            return null;
        }
        return mVar.c(sslSocket);
    }

    @Override // hi.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        m mVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            if (this.f19131b == null && this.a.a(sslSocket)) {
                this.f19131b = this.a.b(sslSocket);
            }
            mVar = this.f19131b;
        }
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }
}
