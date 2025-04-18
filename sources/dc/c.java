package dc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class c implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
    }
}
