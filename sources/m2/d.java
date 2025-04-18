package m2;

import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    public static final String a = p.g("Schedulers");

    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            u2.l h10 = workDatabase.h();
            workDatabase.beginTransaction();
            try {
                ArrayList e2 = h10.e(bVar.f2184h);
                ArrayList c10 = h10.c();
                if (e2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = e2.iterator();
                    while (it.hasNext()) {
                        h10.n(currentTimeMillis, ((u2.j) it.next()).a);
                    }
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (e2.size() > 0) {
                    u2.j[] jVarArr = (u2.j[]) e2.toArray(new u2.j[e2.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c cVar = (c) it2.next();
                        if (cVar.c()) {
                            cVar.e(jVarArr);
                        }
                    }
                }
                if (c10.size() > 0) {
                    u2.j[] jVarArr2 = (u2.j[]) c10.toArray(new u2.j[c10.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c cVar2 = (c) it3.next();
                        if (!cVar2.c()) {
                            cVar2.e(jVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }
}
