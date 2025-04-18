package k0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import v2.r;

/* loaded from: classes.dex */
public final class j implements ThreadFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f20209b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20210c;

    public j(r rVar) {
        this.a = 1;
        this.f20210c = rVar;
        this.f20209b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new i(runnable, (String) this.f20210c, this.f20209b);
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f20209b);
                this.f20209b = this.f20209b + 1;
                return newThread;
        }
    }

    public j() {
        this.a = 0;
        this.f20210c = "fonts-androidx";
        this.f20209b = 10;
    }
}
