package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2175b;

    public a(boolean z10) {
        this.f2175b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f2175b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder m10 = eb.j.m(str);
        m10.append(this.a.incrementAndGet());
        return new Thread(runnable, m10.toString());
    }
}
