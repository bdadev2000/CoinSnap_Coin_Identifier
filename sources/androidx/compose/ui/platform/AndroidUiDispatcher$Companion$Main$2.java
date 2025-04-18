package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import b1.o0;
import g1.u;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidUiDispatcher$Companion$Main$2 f16383a = new r(0);

    /* JADX WARN: Type inference failed for: r2v1, types: [j0.i, q0.p] */
    @Override // q0.a
    public final Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            h1.d dVar = o0.f22355a;
            choreographer = (Choreographer) kotlin.jvm.internal.e.z(u.f30639a, new j0.i(2, null));
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.a(Looper.getMainLooper()));
        return androidUiDispatcher.u(androidUiDispatcher.f16382m);
    }
}
