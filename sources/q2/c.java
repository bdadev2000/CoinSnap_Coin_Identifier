package q2;

import android.content.Context;
import androidx.work.p;
import java.util.ArrayList;
import java.util.Collection;
import r2.d;
import r2.e;

/* loaded from: classes.dex */
public final class c implements r2.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23677d = p.g("WorkConstraintsTracker");
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.c[] f23678b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23679c;

    public c(Context context, x2.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = bVar;
        this.f23678b = new r2.c[]{new r2.a(applicationContext, aVar, 0), new r2.a(applicationContext, aVar, 1), new r2.a(applicationContext, aVar, 4), new r2.a(applicationContext, aVar, 2), new r2.a(applicationContext, aVar, 3), new e(applicationContext, aVar), new d(applicationContext, aVar)};
        this.f23679c = new Object();
    }

    public final boolean a(String str) {
        boolean z10;
        synchronized (this.f23679c) {
            for (r2.c cVar : this.f23678b) {
                Object obj = cVar.f23965b;
                if (obj != null && cVar.b(obj) && cVar.a.contains(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    p.e().b(f23677d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f23679c) {
            for (r2.c cVar : this.f23678b) {
                if (cVar.f23967d != null) {
                    cVar.f23967d = null;
                    cVar.d(null, cVar.f23965b);
                }
            }
            for (r2.c cVar2 : this.f23678b) {
                cVar2.c(collection);
            }
            for (r2.c cVar3 : this.f23678b) {
                if (cVar3.f23967d != this) {
                    cVar3.f23967d = this;
                    cVar3.d(this, cVar3.f23965b);
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f23679c) {
            for (r2.c cVar : this.f23678b) {
                ArrayList arrayList = cVar.a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    s2.d dVar = cVar.f23966c;
                    synchronized (dVar.f24160c) {
                        if (dVar.f24161d.remove(cVar) && dVar.f24161d.isEmpty()) {
                            dVar.d();
                        }
                    }
                }
            }
        }
    }
}
