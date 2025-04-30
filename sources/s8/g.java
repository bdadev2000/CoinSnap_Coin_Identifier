package s8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import q4.C2643b;

/* loaded from: classes3.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final f f22995a = new Object();

    @Override // s8.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // s8.m
    public final boolean b() {
        boolean z8 = r8.d.f22934d;
        return r8.d.f22934d;
    }

    @Override // s8.m
    public final String c(SSLSocket sSLSocket) {
        boolean a6;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            a6 = true;
        } else {
            a6 = G7.j.a(applicationProtocol, "");
        }
        if (a6) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // s8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            r8.m mVar = r8.m.f22950a;
            Object[] array = C2643b.d(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
