package e1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class q implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f20060a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f20060a);
        this.f20060a = this.f20060a + 1;
        return newThread;
    }
}
