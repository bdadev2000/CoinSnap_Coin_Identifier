package e1;

import Q7.n0;
import android.content.Context;
import c1.C0588c;
import f1.C2252a;
import f1.C2262k;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ C2262k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f20052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.h f20053d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f20054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f20055g;

    public n(o oVar, C2262k c2262k, UUID uuid, androidx.work.h hVar, Context context) {
        this.f20055g = oVar;
        this.b = c2262k;
        this.f20052c = uuid;
        this.f20053d = hVar;
        this.f20054f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.b.b instanceof C2252a)) {
                String uuid = this.f20052c.toString();
                int g9 = this.f20055g.f20057c.g(uuid);
                if (g9 != 0 && !n0.b(g9)) {
                    ((V0.b) this.f20055g.b).f(uuid, this.f20053d);
                    this.f20054f.startService(C0588c.b(this.f20054f, uuid, this.f20053d));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.b.i(null);
        } catch (Throwable th) {
            this.b.j(th);
        }
    }
}
