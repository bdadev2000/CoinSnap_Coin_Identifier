package gi;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f18506c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0.intValue() >= 9) goto L12;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
        Le:
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L24
            goto L23
        L1a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L24
            r0.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L24
        L23:
            r1 = 1
        L24:
            gi.j.f18506c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.j.<clinit>():void");
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = a0.h(protocols).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        String applicationProtocol;
        boolean areEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(applicationProtocol, "");
            }
        } catch (UnsupportedOperationException unused) {
        }
        if (areEqual) {
            return null;
        }
        return applicationProtocol;
    }
}
