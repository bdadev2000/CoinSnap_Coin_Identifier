package okhttp3;

import e0.w;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class Handshake$peerCertificates$2 extends r implements a {
    final /* synthetic */ a $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(a aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    @Override // q0.a
    @NotNull
    public final List<Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return w.f30218a;
        }
    }
}
