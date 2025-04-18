package lc;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        Clock clock = j.f21338j;
        synchronized (j.class) {
            Iterator it = j.f21340l.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(z10);
            }
        }
    }
}
