package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f14066a = new AtomicReference(ThreadMap_jvmKt.f14488a);

    /* renamed from: b, reason: collision with root package name */
    public final Object f14067b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Object f14068c;

    public final Object a() {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.f13672a) {
            return this.f14068c;
        }
        ThreadMap threadMap = (ThreadMap) this.f14066a.get();
        int a2 = threadMap.a(id);
        if (a2 >= 0) {
            return threadMap.f14487c[a2];
        }
        return null;
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.f13672a) {
            this.f14068c = obj;
            return;
        }
        synchronized (this.f14067b) {
            ThreadMap threadMap = (ThreadMap) this.f14066a.get();
            int a2 = threadMap.a(id);
            if (a2 < 0) {
                this.f14066a.set(threadMap.b(id, obj));
            } else {
                threadMap.f14487c[a2] = obj;
            }
        }
    }
}
