package s8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import q4.C2643b;

/* loaded from: classes3.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f22998a = new Object();

    @Override // s8.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // s8.m
    public final boolean b() {
        boolean z8 = r8.g.f22937d;
        return r8.g.f22937d;
    }

    @Override // s8.m
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // s8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            r8.m mVar = r8.m.f22950a;
            Object[] array = C2643b.d(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
