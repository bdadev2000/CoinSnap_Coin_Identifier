package y3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f27891d = new AtomicInteger(1);
    public final ThreadGroup a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f27892b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f27893c;

    public c() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.a = threadGroup;
        this.f27893c = "lottie-" + f27891d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.a, runnable, this.f27893c + this.f27892b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
