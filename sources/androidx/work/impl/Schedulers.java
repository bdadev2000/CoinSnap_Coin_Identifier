package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public class Schedulers {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21939a = Logger.e("Schedulers");

    public static void a(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao h2 = workDatabase.h();
        workDatabase.beginTransaction();
        try {
            ArrayList p2 = h2.p(configuration.f21850h);
            ArrayList n2 = h2.n();
            if (p2 != null && p2.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = p2.iterator();
                while (it.hasNext()) {
                    h2.c(currentTimeMillis, ((WorkSpec) it.next()).f22146a);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (p2 != null && p2.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) p2.toArray(new WorkSpec[p2.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler = (Scheduler) it2.next();
                    if (scheduler.d()) {
                        scheduler.c(workSpecArr);
                    }
                }
            }
            if (n2 == null || n2.size() <= 0) {
                return;
            }
            WorkSpec[] workSpecArr2 = (WorkSpec[]) n2.toArray(new WorkSpec[n2.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Scheduler scheduler2 = (Scheduler) it3.next();
                if (!scheduler2.d()) {
                    scheduler2.c(workSpecArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
