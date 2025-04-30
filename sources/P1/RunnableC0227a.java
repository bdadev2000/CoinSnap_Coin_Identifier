package P1;

import android.os.Process;

/* renamed from: P1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f2293c;

    public /* synthetic */ RunnableC0227a(Runnable runnable, int i9) {
        this.b = i9;
        this.f2293c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Process.setThreadPriority(10);
                this.f2293c.run();
                return;
            case 1:
                try {
                    this.f2293c.run();
                    return;
                } catch (Exception e4) {
                    android.support.v4.media.session.a.n("Executor", "Background execution failure.", e4);
                    return;
                }
            default:
                this.f2293c.run();
                return;
        }
    }

    public String toString() {
        switch (this.b) {
            case 2:
                return this.f2293c.toString();
            default:
                return super.toString();
        }
    }
}
