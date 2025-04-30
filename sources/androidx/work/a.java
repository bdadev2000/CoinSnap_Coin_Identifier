package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5194a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public a(boolean z8) {
        this.b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder b = AbstractC2965e.b(str);
        b.append(this.f5194a.incrementAndGet());
        return new Thread(runnable, b.toString());
    }
}
