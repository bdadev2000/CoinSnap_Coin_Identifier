package H1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f1350d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f1351a;
    public final AtomicInteger b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f1352c;

    public d() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f1351a = threadGroup;
        this.f1352c = "lottie-" + f1350d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f1351a, runnable, this.f1352c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
