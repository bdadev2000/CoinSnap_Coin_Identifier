package e1;

/* loaded from: classes.dex */
public final class s implements Runnable {
    public final t b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20061c;

    public s(t tVar, String str) {
        this.b = tVar;
        this.f20061c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.f20065d) {
            try {
                if (((s) this.b.b.remove(this.f20061c)) != null) {
                    r rVar = (r) this.b.f20064c.remove(this.f20061c);
                    if (rVar != null) {
                        String str = this.f20061c;
                        androidx.work.o.e().b(X0.e.l, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((X0.e) rVar).e();
                    }
                } else {
                    androidx.work.o.e().b("WrkTimerRunnable", "Timer with " + this.f20061c + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
