package v1;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2843d implements x {
    @Override // v1.x
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C2843d c2843d = LottieAnimationView.f5597p;
        H1.h hVar = H1.i.f1367a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        H1.c.c("Unable to load composition.", th);
    }
}
