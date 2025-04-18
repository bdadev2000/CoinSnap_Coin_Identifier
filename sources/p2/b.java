package p2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import androidx.work.q;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m2.k;
import u2.d;
import u2.e;
import u2.j;
import v1.f0;
import v2.f;

/* loaded from: classes.dex */
public final class b implements m2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final String f23351g = p.g("SystemJobScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f23352b;

    /* renamed from: c, reason: collision with root package name */
    public final JobScheduler f23353c;

    /* renamed from: d, reason: collision with root package name */
    public final k f23354d;

    /* renamed from: f, reason: collision with root package name */
    public final a f23355f;

    public b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f23352b = context;
        this.f23354d = kVar;
        this.f23353c = jobScheduler;
        this.f23355f = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            p.e().c(f23351g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            p.e().c(f23351g, "getAllPendingJobs() is not reliable on this device.", th2);
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
    @Override // m2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f23352b
            android.app.job.JobScheduler r1 = r8.f23353c
            java.util.ArrayList r0 = d(r0, r1)
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
            m2.k r0 = r8.f23354d
            androidx.work.impl.WorkDatabase r0 = r0.f21460k
            h.c r0 = r0.e()
            r0.F(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.b.a(java.lang.String):void");
    }

    @Override // m2.c
    public final boolean c() {
        return true;
    }

    @Override // m2.c
    public final void e(j... jVarArr) {
        u2.c d10;
        d dVar;
        f0 f0Var;
        int i10;
        k kVar = this.f23354d;
        WorkDatabase workDatabase = kVar.f21460k;
        f fVar = new f(workDatabase);
        for (j jVar : jVarArr) {
            workDatabase.beginTransaction();
            try {
                j k10 = workDatabase.h().k(jVar.a);
                String str = f23351g;
                if (k10 == null) {
                    p.e().h(str, "Skipping scheduling " + jVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (k10.f25452b != y.ENQUEUED) {
                    p.e().h(str, "Skipping scheduling " + jVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    e y4 = workDatabase.e().y(jVar.a);
                    if (y4 != null) {
                        i10 = y4.f25447b;
                    } else {
                        kVar.f21459j.getClass();
                        int i11 = kVar.f21459j.f2183g;
                        synchronized (f.class) {
                            int a = fVar.a("next_job_scheduler_id");
                            try {
                                if (a >= 0 && a <= i11) {
                                    i10 = a;
                                }
                                d10.f25445b.insert(dVar);
                                f0Var.setTransactionSuccessful();
                                f0Var.endTransaction();
                                i10 = 0;
                            } finally {
                            }
                            d10 = fVar.a.d();
                            dVar = new d("next_job_scheduler_id", 1);
                            f0Var = d10.a;
                            f0Var.assertNotSuspendingTransaction();
                            f0Var.beginTransaction();
                        }
                    }
                    if (y4 == null) {
                        kVar.f21460k.e().C(new e(jVar.a, i10));
                    }
                    f(jVar, i10);
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(j jVar, int i10) {
        int i11;
        byte b3;
        byte b10;
        int i12;
        int i13;
        JobScheduler jobScheduler = this.f23353c;
        a aVar = this.f23355f;
        aVar.getClass();
        androidx.work.d dVar = jVar.f25460j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.a).setRequiresCharging(dVar.f2188b).setRequiresDeviceIdle(dVar.f2189c).setExtras(persistableBundle);
        q qVar = dVar.a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30 && qVar == q.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int ordinal = qVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            i11 = 4;
                            if (ordinal != 4 || i14 < 26) {
                                p.e().b(a.f23350b, String.format("API version too low. Cannot convert network type value %s", qVar), new Throwable[0]);
                            }
                        } else {
                            i11 = 3;
                        }
                    } else {
                        i11 = 2;
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!dVar.f2189c) {
            if (jVar.f25462l == 2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(jVar.f25463m, i13);
        }
        long max = Math.max(jVar.a() - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!jVar.f25467q) {
            extras.setImportantWhileForeground(true);
        }
        if (dVar.f2194h.a.size() > 0) {
            b3 = true;
        } else {
            b3 = false;
        }
        if (b3 != false) {
            Iterator it = dVar.f2194h.a.iterator();
            while (it.hasNext()) {
                androidx.work.e eVar = (androidx.work.e) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(eVar.a, eVar.f2195b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f2192f);
            extras.setTriggerContentMaxDelay(dVar.f2193g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f2190d);
            extras.setRequiresStorageNotLow(dVar.f2191e);
        }
        if (jVar.f25461k > 0) {
            b10 = true;
        } else {
            b10 = false;
        }
        if (j0.b.b() && jVar.f25467q && b10 == false) {
            com.google.android.gms.internal.ads.b.q(extras);
        }
        JobInfo build = extras.build();
        p e2 = p.e();
        Object[] objArr = {jVar.a, Integer.valueOf(i10)};
        String str = f23351g;
        e2.b(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                p.e().h(str, String.format("Unable to schedule work ID %s", jVar.a), new Throwable[0]);
                if (jVar.f25467q && jVar.f25468r == 1) {
                    jVar.f25467q = false;
                    p.e().b(str, String.format("Scheduling a non-expedited job (work ID %s)", jVar.a), new Throwable[0]);
                    f(jVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList d10 = d(this.f23352b, jobScheduler);
            if (d10 != null) {
                i12 = d10.size();
            } else {
                i12 = 0;
            }
            Locale locale = Locale.getDefault();
            k kVar = this.f23354d;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i12), Integer.valueOf(kVar.f21460k.h().g().size()), Integer.valueOf(kVar.f21459j.f2184h));
            p.e().c(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            p.e().c(str, String.format("Unable to schedule %s", jVar), th2);
        }
    }
}
