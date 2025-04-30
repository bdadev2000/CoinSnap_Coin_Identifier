package k5;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f21485a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z8) {
        Clock clock = k.f21486j;
        synchronized (k.class) {
            Iterator it = k.l.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).e(z8);
            }
        }
    }
}
