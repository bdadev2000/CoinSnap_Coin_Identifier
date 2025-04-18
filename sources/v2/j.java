package v2;

import androidx.work.impl.WorkDatabase;
import androidx.work.y;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f25990f = androidx.work.p.g("StopWorkRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final m2.k f25991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25993d;

    public j(m2.k kVar, String str, boolean z10) {
        this.f25991b = kVar;
        this.f25992c = str;
        this.f25993d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean i10;
        m2.k kVar = this.f25991b;
        WorkDatabase workDatabase = kVar.f21460k;
        m2.b bVar = kVar.f21463n;
        u2.l h10 = workDatabase.h();
        workDatabase.beginTransaction();
        try {
            String str = this.f25992c;
            synchronized (bVar.f21443m) {
                containsKey = bVar.f21438h.containsKey(str);
            }
            if (this.f25993d) {
                i10 = this.f25991b.f21463n.h(this.f25992c);
            } else {
                if (!containsKey && h10.h(this.f25992c) == y.RUNNING) {
                    h10.s(y.ENQUEUED, this.f25992c);
                }
                i10 = this.f25991b.f21463n.i(this.f25992c);
            }
            androidx.work.p.e().b(f25990f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f25992c, Boolean.valueOf(i10)), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }
}
