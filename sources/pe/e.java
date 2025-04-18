package pe;

import com.google.android.gms.tasks.Task;
import he.a0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: e, reason: collision with root package name */
    public static final fe.c f23610e = new fe.c(e.class.getSimpleName());
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f23611b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f23612c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23613d = new Object();

    public e(hb.d dVar) {
        this.a = dVar;
    }

    public static void a(e eVar, d dVar) {
        if (eVar.f23612c) {
            eVar.f23612c = false;
            eVar.f23611b.remove(dVar);
            ((a0) ((hb.d) eVar.a).f19011c).a.f25394c.postDelayed(new a(eVar, 0), 0L);
            return;
        }
        throw new IllegalStateException("mJobRunning was not true after completing job=" + dVar.a);
    }

    public final Task b(long j3, String str, Callable callable, boolean z10) {
        int i10 = 0;
        f23610e.a(1, str.toUpperCase(), "- Scheduling.");
        d dVar = new d(str, callable, z10, System.currentTimeMillis() + j3);
        synchronized (this.f23613d) {
            this.f23611b.addLast(dVar);
            ((a0) ((hb.d) this.a).f19011c).a.f25394c.postDelayed(new a(this, i10), j3);
        }
        return dVar.f23606b.getTask();
    }

    public final void c(int i10, String str) {
        synchronized (this.f23613d) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f23611b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.a.equals(str)) {
                    arrayList.add(dVar);
                }
            }
            f23610e.a(0, "trim: name=", str, "scheduled=", Integer.valueOf(arrayList.size()), "allowed=", Integer.valueOf(i10));
            int max = Math.max(arrayList.size() - i10, 0);
            if (max > 0) {
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.subList(0, max).iterator();
                while (it2.hasNext()) {
                    this.f23611b.remove((d) it2.next());
                }
            }
        }
    }
}
