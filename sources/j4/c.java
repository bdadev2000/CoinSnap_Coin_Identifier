package j4;

import androidx.appcompat.widget.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {
    public final ThreadFactory a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19751b;

    /* renamed from: c, reason: collision with root package name */
    public final d f19752c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19753d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f19754e;

    public c(g4.a aVar, String str, boolean z10) {
        com.facebook.b bVar = d.f19755f8;
        this.f19754e = new AtomicInteger();
        this.a = aVar;
        this.f19751b = str;
        this.f19752c = bVar;
        this.f19753d = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(new j(14, this, runnable));
        newThread.setName("glide-" + this.f19751b + "-thread-" + this.f19754e.getAndIncrement());
        return newThread;
    }
}
