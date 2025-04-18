package androidx.work;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Worker f2185b;

    public b0(Worker worker) {
        this.f2185b = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f2185b;
        try {
            worker.mFuture.h(worker.doWork());
        } catch (Throwable th2) {
            worker.mFuture.i(th2);
        }
    }
}
