package androidx.lifecycle.viewmodel.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p0.a;

/* loaded from: classes2.dex */
public final class ViewModelImpl {

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedObject f20244a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20245b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f20246c = new LinkedHashSet();
    public volatile boolean d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        a.s(autoCloseable, "closeable");
        if (this.d) {
            b(autoCloseable);
            return;
        }
        synchronized (this.f20244a) {
            this.f20246c.add(autoCloseable);
        }
    }
}
