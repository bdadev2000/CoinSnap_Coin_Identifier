package P1;

import java.util.concurrent.ThreadFactory;

/* renamed from: P1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0228b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0227a(runnable, 0), "glide-active-resources");
    }
}
