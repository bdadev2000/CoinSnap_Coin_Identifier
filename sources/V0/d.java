package V0;

import androidx.work.impl.WorkDatabase;
import androidx.work.o;
import d1.C2168i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3400a = o.g("Schedulers");

    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            B4.c n2 = workDatabase.n();
            workDatabase.c();
            try {
                ArrayList c9 = n2.c(bVar.f5201h);
                ArrayList a6 = n2.a();
                if (c9.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c9.iterator();
                    while (it.hasNext()) {
                        n2.m(currentTimeMillis, ((C2168i) it.next()).f19801a);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (c9.size() > 0) {
                    C2168i[] c2168iArr = (C2168i[]) c9.toArray(new C2168i[c9.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c cVar = (c) it2.next();
                        if (cVar.b()) {
                            cVar.e(c2168iArr);
                        }
                    }
                }
                if (a6.size() > 0) {
                    C2168i[] c2168iArr2 = (C2168i[]) a6.toArray(new C2168i[a6.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c cVar2 = (c) it3.next();
                        if (!cVar2.b()) {
                            cVar2.e(c2168iArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
