package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;

/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$currentThread$1 extends ThreadLocal<h0.l> {
    @Override // java.lang.ThreadLocal
    public final h0.l initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException("no Looper on this thread".toString());
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.a(myLooper));
        return androidUiDispatcher.u(androidUiDispatcher.f16382m);
    }
}
