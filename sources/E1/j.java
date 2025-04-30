package e1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20040f = androidx.work.o.g("StopWorkRunnable");
    public final V0.k b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20041c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20042d;

    public j(V0.k kVar, String str, boolean z8) {
        this.b = kVar;
        this.f20041c = str;
        this.f20042d = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j7;
        V0.k kVar = this.b;
        WorkDatabase workDatabase = kVar.f3418c;
        V0.b bVar = kVar.f3421f;
        B4.c n2 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f20041c;
            synchronized (bVar.m) {
                containsKey = bVar.f3396h.containsKey(str);
            }
            if (this.f20042d) {
                j7 = this.b.f3421f.i(this.f20041c);
            } else {
                if (!containsKey && n2.g(this.f20041c) == 2) {
                    n2.q(1, this.f20041c);
                }
                j7 = this.b.f3421f.j(this.f20041c);
            }
            androidx.work.o.e().b(f20040f, "StopWorkRunnable for " + this.f20041c + "; Processor.stopWork = " + j7, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
