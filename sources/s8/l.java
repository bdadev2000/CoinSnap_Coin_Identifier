package s8;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f22999a;
    public m b;

    public l(k kVar) {
        this.f22999a = kVar;
    }

    @Override // s8.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f22999a.a(sSLSocket);
    }

    @Override // s8.m
    public final boolean b() {
        return true;
    }

    @Override // s8.m
    public final String c(SSLSocket sSLSocket) {
        m e4 = e(sSLSocket);
        if (e4 == null) {
            return null;
        }
        return e4.c(sSLSocket);
    }

    @Override // s8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        m e4 = e(sSLSocket);
        if (e4 != null) {
            e4.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.f22999a.a(sSLSocket)) {
                this.b = this.f22999a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
