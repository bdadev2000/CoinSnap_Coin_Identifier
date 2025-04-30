package g4;

import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2294d implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f20430a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z8) {
        synchronized (C2296f.f20432k) {
            try {
                Iterator it = new ArrayList(C2296f.l.values()).iterator();
                while (it.hasNext()) {
                    C2296f c2296f = (C2296f) it.next();
                    if (c2296f.f20436e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = c2296f.f20440i.iterator();
                        while (it2.hasNext()) {
                            C2296f c2296f2 = ((C2293c) it2.next()).f20429a;
                            if (!z8) {
                                ((L4.e) c2296f2.f20439h.get()).b();
                            } else {
                                c2296f2.getClass();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
