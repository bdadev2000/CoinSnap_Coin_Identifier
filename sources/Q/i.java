package Q;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f2465a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f2465a, this.b);
    }
}
