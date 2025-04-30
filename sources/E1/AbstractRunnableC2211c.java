package e1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2211c implements Runnable {
    public final E1.d b = new E1.d(15);

    public static void a(V0.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f3418c;
        B4.c n2 = workDatabase.n();
        a7.b i9 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int g9 = n2.g(str2);
            if (g9 != 3 && g9 != 4) {
                n2.q(6, str2);
            }
            linkedList.addAll(i9.p(str2));
        }
        V0.b bVar = kVar.f3421f;
        synchronized (bVar.m) {
            try {
                boolean z8 = false;
                androidx.work.o.e().b(V0.b.f3391n, "Processor cancelling " + str, new Throwable[0]);
                bVar.f3399k.add(str);
                V0.l lVar = (V0.l) bVar.f3396h.remove(str);
                if (lVar != null) {
                    z8 = true;
                }
                if (lVar == null) {
                    lVar = (V0.l) bVar.f3397i.remove(str);
                }
                V0.b.b(str, lVar);
                if (z8) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f3420e.iterator();
        while (it.hasNext()) {
            ((V0.c) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        E1.d dVar = this.b;
        try {
            b();
            dVar.B(androidx.work.t.f5251Y7);
        } catch (Throwable th) {
            dVar.B(new androidx.work.q(th));
        }
    }
}
