package v2;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class n implements androidx.work.j {
    public final x2.a a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.a f26005b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.l f26006c;

    static {
        androidx.work.p.g("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, t2.a aVar, x2.a aVar2) {
        this.f26005b = aVar;
        this.a = aVar2;
        this.f26006c = workDatabase.h();
    }
}
