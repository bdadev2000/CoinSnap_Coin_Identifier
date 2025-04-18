package vc;

import java.net.InetAddress;

/* loaded from: classes3.dex */
public final class m0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return InetAddress.getByName(aVar.Z());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String hostAddress;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            hostAddress = null;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        bVar.X(hostAddress);
    }
}
