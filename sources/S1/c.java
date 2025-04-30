package S1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f2792a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2794d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2795e;

    public c(b bVar, String str, boolean z8) {
        d dVar = d.f2796a;
        this.f2795e = new AtomicInteger();
        this.f2792a = bVar;
        this.b = str;
        this.f2793c = dVar;
        this.f2794d = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f2792a.newThread(new f4.b(8, this, runnable, false));
        newThread.setName("glide-" + this.b + "-thread-" + this.f2795e.getAndIncrement());
        return newThread;
    }
}
