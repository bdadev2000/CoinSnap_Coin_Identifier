package androidx.work.impl.background.systemjob;

import V0.a;
import V0.k;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import androidx.work.o;
import java.util.HashMap;

@RequiresApi(23)
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f5230d = o.g("SystemJobService");
    public k b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5231c = new HashMap();

    @Override // V0.a
    public final void c(String str, boolean z8) {
        JobParameters jobParameters;
        o.e().b(f5230d, com.mbridge.msdk.foundation.entity.o.j(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f5231c) {
            jobParameters = (JobParameters) this.f5231c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z8);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k v6 = k.v(getApplicationContext());
            this.b = v6;
            v6.f3421f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                o.e().h(f5230d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.b;
        if (kVar != null) {
            kVar.f3421f.e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            V0.k r2 = r8.b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            androidx.work.o r0 = androidx.work.o.e()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f5230d
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.b(r1, r2, r5)
            r8.jobFinished(r9, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2e
            if (r5 == 0) goto L2e
            boolean r6 = r5.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2e
            if (r6 == 0) goto L2e
            java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.NullPointerException -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L43
            androidx.work.o r9 = androidx.work.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f5230d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r9.d(r0, r1, r2)
            return r4
        L43:
            java.util.HashMap r5 = r8.f5231c
            monitor-enter(r5)
            java.util.HashMap r6 = r8.f5231c     // Catch: java.lang.Throwable -> L67
            boolean r6 = r6.containsKey(r2)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            androidx.work.o r9 = androidx.work.o.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f5230d     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r3.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r9.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            return r4
        L67:
            r9 = move-exception
            goto Lc0
        L69:
            androidx.work.o r1 = androidx.work.o.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = androidx.work.impl.background.systemjob.SystemJobService.f5230d     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L67
            r7.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r1.b(r6, r0, r4)     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = r8.f5231c     // Catch: java.lang.Throwable -> L67
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            int r0 = android.os.Build.VERSION.SDK_INT
            C.c r1 = new C.c
            r4 = 15
            r5 = 0
            r1.<init>(r5, r4)
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto La0
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r1.f348d = r4
        La0:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto Lb0
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r1.f347c = r4
        Lb0:
            r4 = 28
            if (r0 < r4) goto Lba
            android.net.Network r9 = V1.b.n(r9)
            r1.f349f = r9
        Lba:
            V0.k r9 = r8.b
            r9.z(r2, r1)
            return r3
        Lc0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            V0.k r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            androidx.work.o r6 = androidx.work.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f5230d
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.b(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            androidx.work.o r6 = androidx.work.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f5230d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.d(r0, r1, r3)
            return r2
        L3c:
            androidx.work.o r0 = androidx.work.o.e()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f5230d
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = x0.AbstractC2914a.d(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.b(r3, r4, r2)
            java.util.HashMap r0 = r5.f5231c
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f5231c     // Catch: java.lang.Throwable -> L6e
            r2.remove(r6)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            V0.k r0 = r5.b
            r0.A(r6)
            V0.k r0 = r5.b
            V0.b r0 = r0.f3421f
            java.lang.Object r2 = r0.m
            monitor-enter(r2)
            java.util.HashSet r0 = r0.f3399k     // Catch: java.lang.Throwable -> L6b
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            r6 = r6 ^ r1
            return r6
        L6b:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            throw r6
        L6e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
