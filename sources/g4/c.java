package g4;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f18042b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18043c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f18044d;

    /* renamed from: e, reason: collision with root package name */
    public y f18045e;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(0));
        this.f18043c = new HashMap();
        this.f18044d = new ReferenceQueue();
        this.a = false;
        this.f18042b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new androidx.activity.i(this, 14));
    }

    public final synchronized void a(e4.j jVar, z zVar) {
        b bVar = (b) this.f18043c.put(jVar, new b(jVar, zVar, this.f18044d, this.a));
        if (bVar != null) {
            bVar.f18035c = null;
            bVar.clear();
        }
    }

    public final void b(b bVar) {
        g0 g0Var;
        synchronized (this) {
            this.f18043c.remove(bVar.a);
            if (bVar.f18034b && (g0Var = bVar.f18035c) != null) {
                ((r) this.f18045e).d(bVar.a, new z(g0Var, true, false, bVar.a, this.f18045e));
            }
        }
    }
}
