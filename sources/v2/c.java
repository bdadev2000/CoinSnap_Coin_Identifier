package v2;

import androidx.work.impl.WorkDatabase;
import androidx.work.t;
import androidx.work.w;
import androidx.work.y;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final d3.g f25977b = new d3.g(10, (com.applovin.impl.mediation.ads.e) null);

    public static void a(m2.k kVar, String str) {
        boolean z10;
        WorkDatabase workDatabase = kVar.f21460k;
        u2.l h10 = workDatabase.h();
        u2.c c10 = workDatabase.c();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z10 = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            y h11 = h10.h(str2);
            if (h11 != y.SUCCEEDED && h11 != y.FAILED) {
                h10.s(y.CANCELLED, str2);
            }
            linkedList.addAll(c10.a(str2));
        }
        m2.b bVar = kVar.f21463n;
        synchronized (bVar.f21443m) {
            androidx.work.p.e().b(m2.b.f21432n, String.format("Processor cancelling %s", str), new Throwable[0]);
            bVar.f21441k.add(str);
            m2.m mVar = (m2.m) bVar.f21438h.remove(str);
            if (mVar != null) {
                z10 = true;
            }
            if (mVar == null) {
                mVar = (m2.m) bVar.f21439i.remove(str);
            }
            m2.b.b(str, mVar);
            if (z10) {
                bVar.g();
            }
        }
        Iterator it = kVar.f21462m.iterator();
        while (it.hasNext()) {
            ((m2.c) it.next()).a(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        d3.g gVar = this.f25977b;
        try {
            b();
            gVar.I(w.S7);
        } catch (Throwable th2) {
            gVar.I(new t(th2));
        }
    }
}
