package j0;

/* loaded from: classes.dex */
public final class e {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public d f19709b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19710c;

    public final void a(d dVar) {
        synchronized (this) {
            while (this.f19710c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f19709b == dVar) {
                return;
            }
            this.f19709b = dVar;
            if (this.a) {
                dVar.d();
            }
        }
    }
}
