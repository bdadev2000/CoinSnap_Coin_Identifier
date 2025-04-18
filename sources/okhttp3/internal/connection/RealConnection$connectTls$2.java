package okhttp3.internal.connection;

import e0.q;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import okhttp3.Handshake;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class RealConnection$connectTls$2 extends r implements a {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // q0.a
    @NotNull
    public final List<X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        p0.a.p(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(q.M(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            p0.a.q(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
