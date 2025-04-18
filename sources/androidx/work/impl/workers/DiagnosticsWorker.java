package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22275a = Logger.e("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            SystemIdInfo a2 = systemIdInfoDao.a(workSpec.f22146a);
            Integer valueOf = a2 != null ? Integer.valueOf(a2.f22132b) : null;
            sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.f22146a, workSpec.f22148c, valueOf, workSpec.f22147b.name(), TextUtils.join(",", workNameDao.b(workSpec.f22146a)), TextUtils.join(",", workTagDao.a(workSpec.f22146a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        WorkDatabase workDatabase = WorkManagerImpl.b(getApplicationContext()).f21971c;
        WorkSpecDao h2 = workDatabase.h();
        WorkNameDao f2 = workDatabase.f();
        WorkTagDao i2 = workDatabase.i();
        SystemIdInfoDao e = workDatabase.e();
        ArrayList d = h2.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList r2 = h2.r();
        ArrayList n2 = h2.n();
        String str = f22275a;
        if (d != null && !d.isEmpty()) {
            Logger.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
            Logger.c().d(str, a(f2, i2, e, d), new Throwable[0]);
        }
        if (r2 != null && !r2.isEmpty()) {
            Logger.c().d(str, "Running work:\n\n", new Throwable[0]);
            Logger.c().d(str, a(f2, i2, e, r2), new Throwable[0]);
        }
        if (n2 != null && !n2.isEmpty()) {
            Logger.c().d(str, "Enqueued work:\n\n", new Throwable[0]);
            Logger.c().d(str, a(f2, i2, e, n2), new Throwable[0]);
        }
        return new ListenableWorker.Result.Success(Data.f21866c);
    }
}
