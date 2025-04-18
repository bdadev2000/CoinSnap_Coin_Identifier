package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@RequiresApi
@RestrictTo
/* loaded from: classes4.dex */
public class SystemJobScheduler implements Scheduler {

    /* renamed from: f, reason: collision with root package name */
    public static final String f22063f = Logger.e("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22064a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f22065b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkManagerImpl f22066c;
    public final SystemJobInfoConverter d;

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        SystemJobInfoConverter systemJobInfoConverter = new SystemJobInfoConverter(context);
        this.f22064a = context;
        this.f22066c = workManagerImpl;
        this.f22065b = jobScheduler;
        this.d = systemJobInfoConverter;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            Logger.c().b(f22063f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Logger.c().b(f22063f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // androidx.work.impl.Scheduler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f22064a
            android.app.job.JobScheduler r1 = r8.f22065b
            java.util.ArrayList r0 = e(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L74
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L74
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            b(r1, r2)
            goto L55
        L69:
            androidx.work.impl.WorkManagerImpl r0 = r8.f22066c
            androidx.work.impl.WorkDatabase r0 = r0.f21971c
            androidx.work.impl.model.SystemIdInfoDao r0 = r0.e()
            r0.d(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobScheduler.a(java.lang.String):void");
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        int i2;
        WorkManagerImpl workManagerImpl = this.f22066c;
        WorkDatabase workDatabase = workManagerImpl.f21971c;
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.beginTransaction();
            try {
                WorkSpec j2 = workDatabase.h().j(workSpec.f22146a);
                String str = f22063f;
                if (j2 == null) {
                    Logger.c().g(str, "Skipping scheduling " + workSpec.f22146a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (j2.f22147b != WorkInfo.State.f21897a) {
                    Logger.c().g(str, "Skipping scheduling " + workSpec.f22146a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    SystemIdInfo a2 = workDatabase.e().a(workSpec.f22146a);
                    if (a2 != null) {
                        i2 = a2.f22132b;
                    } else {
                        workManagerImpl.f21970b.getClass();
                        int i3 = workManagerImpl.f21970b.f21849g;
                        synchronized (IdGenerator.class) {
                            int a3 = idGenerator.a("next_job_scheduler_id");
                            i2 = (a3 >= 0 && a3 <= i3) ? a3 : 0;
                            idGenerator.f22193a.d().a(new Preference("next_job_scheduler_id", 1));
                        }
                    }
                    if (a2 == null) {
                        workManagerImpl.f21971c.e().c(new SystemIdInfo(workSpec.f22146a, i2));
                    }
                    f(workSpec, i2);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(WorkSpec workSpec, int i2) {
        int i3;
        JobScheduler jobScheduler = this.f22065b;
        SystemJobInfoConverter systemJobInfoConverter = this.d;
        systemJobInfoConverter.getClass();
        Constraints constraints = workSpec.f22153j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.f22146a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.c());
        JobInfo.Builder extras = new JobInfo.Builder(i2, systemJobInfoConverter.f22061a).setRequiresCharging(constraints.f21855b).setRequiresDeviceIdle(constraints.f21856c).setExtras(persistableBundle);
        NetworkType networkType = constraints.f21854a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || networkType != NetworkType.f21885g) {
            int ordinal = networkType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i3 = 2;
                    if (ordinal != 2) {
                        i3 = 3;
                        if (ordinal != 3) {
                            i3 = 4;
                            if (ordinal != 4) {
                                Logger.c().a(SystemJobInfoConverter.f22060b, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                            }
                        }
                    }
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!constraints.f21856c) {
            extras.setBackoffCriteria(workSpec.f22156m, workSpec.f22155l == BackoffPolicy.f21843b ? 0 : 1);
        }
        long max = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        if (i4 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.f22160q) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.f21859h.f21862a.size() > 0) {
            Iterator it = constraints.f21859h.f21862a.iterator();
            while (it.hasNext()) {
                ContentUriTriggers.Trigger trigger = (ContentUriTriggers.Trigger) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(trigger.f21863a, trigger.f21864b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.f21857f);
            extras.setTriggerContentMaxDelay(constraints.f21858g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(constraints.d);
        extras.setRequiresStorageNotLow(constraints.e);
        byte b2 = workSpec.f22154k > 0;
        if (BuildCompat.b() && workSpec.f22160q && b2 == false) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str = f22063f;
        Logger.c().a(str, String.format("Scheduling work ID %s Job ID %s", workSpec.f22146a, Integer.valueOf(i2)), new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                Logger.c().g(str, String.format("Unable to schedule work ID %s", workSpec.f22146a), new Throwable[0]);
                if (workSpec.f22160q && workSpec.f22161r == OutOfQuotaPolicy.f21890a) {
                    workSpec.f22160q = false;
                    Logger.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f22146a), new Throwable[0]);
                    f(workSpec, i2);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList e2 = e(this.f22064a, jobScheduler);
            int size = e2 != null ? e2.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            WorkManagerImpl workManagerImpl = this.f22066c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(workManagerImpl.f21971c.h().g().size()), Integer.valueOf(workManagerImpl.f21970b.f21850h));
            Logger.c().b(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            Logger.c().b(str, String.format("Unable to schedule %s", workSpec), th);
        }
    }
}
