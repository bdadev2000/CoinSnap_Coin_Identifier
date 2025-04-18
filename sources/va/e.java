package va;

import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        synchronized (g.f26386k) {
            Iterator it = new ArrayList(g.f26387l.values()).iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.f26391e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = gVar.f26395i.iterator();
                    while (it2.hasNext()) {
                        g gVar2 = ((d) it2.next()).a;
                        if (!z10) {
                            ((ac.d) gVar2.f26394h.get()).b();
                        } else {
                            gVar2.getClass();
                        }
                    }
                }
            }
        }
    }
}
