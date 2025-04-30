package Y0;

import Q7.n0;
import V0.c;
import V0.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.o;
import d1.C2162c;
import d1.C2163d;
import d1.C2168i;
import e1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final String f3751g = o.g("SystemJobScheduler");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final JobScheduler f3752c;

    /* renamed from: d, reason: collision with root package name */
    public final k f3753d;

    /* renamed from: f, reason: collision with root package name */
    public final a f3754f;

    public b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.b = context;
        this.f3753d = kVar;
        this.f3752c = jobScheduler;
        this.f3754f = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i9) {
        try {
            jobScheduler.cancel(i9);
        } catch (Throwable th) {
            o.e().d(f3751g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i9)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.e().d(f3751g, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Override // V0.c
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // V0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.b
            android.app.job.JobScheduler r1 = r8.f3752c
            java.util.ArrayList r0 = c(r0, r1)
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
            a(r1, r2)
            goto L55
        L69:
            V0.k r0 = r8.f3753d
            androidx.work.impl.WorkDatabase r0 = r0.f3418c
            C.c r0 = r0.k()
            r0.z(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.b.d(java.lang.String):void");
    }

    @Override // V0.c
    public final void e(C2168i... c2168iArr) {
        int i9;
        int i10;
        int i11;
        C2168i[] c2168iArr2 = c2168iArr;
        k kVar = this.f3753d;
        WorkDatabase workDatabase = kVar.f3418c;
        int length = c2168iArr2.length;
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            C2168i c2168i = c2168iArr2[i13];
            workDatabase.c();
            try {
                C2168i j7 = workDatabase.n().j(c2168i.f19801a);
                String str = f3751g;
                if (j7 == null) {
                    o.e().h(str, "Skipping scheduling " + c2168i.f19801a + " because it's no longer in the DB", new Throwable[i12]);
                    workDatabase.h();
                } else if (j7.b != 1) {
                    o.e().h(str, "Skipping scheduling " + c2168i.f19801a + " because it is no longer enqueued", new Throwable[i12]);
                    workDatabase.h();
                } else {
                    C2163d s5 = workDatabase.k().s(c2168i.f19801a);
                    if (s5 != null) {
                        i11 = s5.b;
                    } else {
                        kVar.b.getClass();
                        int i14 = kVar.b.f5200g;
                        synchronized (f.class) {
                            try {
                                workDatabase.c();
                                try {
                                    Long k6 = workDatabase.j().k("next_job_scheduler_id");
                                    if (k6 != null) {
                                        i9 = k6.intValue();
                                    } else {
                                        i9 = i12;
                                    }
                                    if (i9 == Integer.MAX_VALUE) {
                                        i10 = i12;
                                    } else {
                                        i10 = i9 + 1;
                                    }
                                    try {
                                        workDatabase.j().v(new C2162c("next_job_scheduler_id", i10));
                                        workDatabase.h();
                                        try {
                                            workDatabase.f();
                                            if (i9 >= 0 && i9 <= i14) {
                                                i11 = i9;
                                            }
                                            workDatabase.j().v(new C2162c("next_job_scheduler_id", 1));
                                            i11 = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        workDatabase.f();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                    if (s5 == null) {
                        try {
                            kVar.f3418c.k().v(new C2163d(c2168i.f19801a, i11));
                        } catch (Throwable th5) {
                            th = th5;
                            workDatabase.f();
                            throw th;
                        }
                    }
                    f(c2168i, i11);
                    workDatabase.h();
                }
                workDatabase.f();
                i13++;
                c2168iArr2 = c2168iArr;
                i12 = 0;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final void f(C2168i c2168i, int i9) {
        int i10;
        boolean z8;
        int i11;
        int i12;
        JobScheduler jobScheduler = this.f3752c;
        a aVar = this.f3754f;
        aVar.getClass();
        androidx.work.c cVar = c2168i.f19809j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c2168i.f19801a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c2168i.c());
        JobInfo.Builder extras = new JobInfo.Builder(i9, aVar.f3750a).setRequiresCharging(cVar.b).setRequiresDeviceIdle(cVar.f5204c).setExtras(persistableBundle);
        int i13 = cVar.f5203a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30 && i13 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int d2 = AbstractC2965e.d(i13);
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        i10 = 3;
                        if (d2 != 3) {
                            i10 = 4;
                            if (d2 != 4 || i14 < 26) {
                                o.e().b(a.b, "API version too low. Cannot convert network type value ".concat(n0.y(i13)), new Throwable[0]);
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            extras.setRequiredNetworkType(i10);
        }
        if (!cVar.f5204c) {
            if (c2168i.l == 2) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            extras.setBackoffCriteria(c2168i.m, i12);
        }
        long max = Math.max(c2168i.a() - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c2168i.f19814q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f5209h.f5211a.size() > 0) {
            Iterator it = cVar.f5209h.f5211a.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f5210a, dVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f5207f);
            extras.setTriggerContentMaxDelay(cVar.f5208g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f5205d);
            extras.setRequiresStorageNotLow(cVar.f5206e);
        }
        if (c2168i.f19810k > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (P.b.b() && c2168i.f19814q && !z8) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        o e4 = o.e();
        String str = c2168i.f19801a;
        String str2 = f3751g;
        e4.b(str2, "Scheduling work ID " + str + " Job ID " + i9, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                o.e().h(str2, "Unable to schedule work ID " + c2168i.f19801a, new Throwable[0]);
                if (c2168i.f19814q && c2168i.f19815r == 1) {
                    c2168i.f19814q = false;
                    o.e().b(str2, "Scheduling a non-expedited job (work ID " + c2168i.f19801a + ")", new Throwable[0]);
                    f(c2168i, i9);
                }
            }
        } catch (IllegalStateException e9) {
            ArrayList c9 = c(this.b, jobScheduler);
            if (c9 != null) {
                i11 = c9.size();
            } else {
                i11 = 0;
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i11);
            k kVar = this.f3753d;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(kVar.f3418c.n().e().size()), Integer.valueOf(kVar.b.f5201h));
            o.e().d(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e9);
        } catch (Throwable th) {
            o.e().d(str2, "Unable to schedule " + c2168i, th);
        }
    }
}
