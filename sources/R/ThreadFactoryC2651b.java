package r;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2651b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f22809a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f22809a.getAndIncrement());
        return thread;
    }
}
