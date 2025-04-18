package v2;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final r f26009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26010c;

    public q(r rVar, String str) {
        this.f26009b = rVar;
        this.f26010c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26009b.f26014d) {
            if (((q) this.f26009b.f26012b.remove(this.f26010c)) != null) {
                p pVar = (p) this.f26009b.f26013c.remove(this.f26010c);
                if (pVar != null) {
                    androidx.work.p.e().b(o2.e.f22977l, String.format("Exceeded time limits on execution for %s", this.f26010c), new Throwable[0]);
                    ((o2.e) pVar).e();
                }
            } else {
                androidx.work.p.e().b("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f26010c), new Throwable[0]);
            }
        }
    }
}
