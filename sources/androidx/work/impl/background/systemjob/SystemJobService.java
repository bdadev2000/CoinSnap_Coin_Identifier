package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import androidx.work.p;
import java.util.HashMap;
import m2.a;
import m2.b;
import m2.k;

@RequiresApi(23)
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f2211d = p.g("SystemJobService");

    /* renamed from: b, reason: collision with root package name */
    public k f2212b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2213c = new HashMap();

    @Override // m2.a
    public final void d(String str, boolean z10) {
        JobParameters jobParameters;
        p.e().b(f2211d, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2213c) {
            jobParameters = (JobParameters) this.f2213c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k v10 = k.v(getApplicationContext());
            this.f2212b = v10;
            v10.f21463n.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                p.e().h(f2211d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f2212b;
        if (kVar != null) {
            b bVar = kVar.f21463n;
            synchronized (bVar.f21443m) {
                bVar.f21442l.remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            m2.k r0 = r8.f2212b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            androidx.work.p r0 = androidx.work.p.e()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f2211d
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.b(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L17:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2a
            if (r3 == 0) goto L2a
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L2a
            if (r4 == 0) goto L2a
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L3f
            androidx.work.p r9 = androidx.work.p.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2211d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.c(r0, r1, r3)
            return r2
        L3f:
            java.util.HashMap r3 = r8.f2213c
            monitor-enter(r3)
            java.util.HashMap r4 = r8.f2213c     // Catch: java.lang.Throwable -> Lb5
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L61
            androidx.work.p r9 = androidx.work.p.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = androidx.work.impl.background.systemjob.SystemJobService.f2211d     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb5
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb5
            r9.b(r4, r0, r1)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb5
            return r2
        L61:
            androidx.work.p r4 = androidx.work.p.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.f2211d     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb5
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Throwable[] r7 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb5
            r4.b(r5, r6, r7)     // Catch: java.lang.Throwable -> Lb5
            java.util.HashMap r4 = r8.f2213c     // Catch: java.lang.Throwable -> Lb5
            r4.put(r0, r9)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb5
            int r3 = android.os.Build.VERSION.SDK_INT
            h.c r4 = new h.c
            r5 = 9
            r4.<init>(r5, r2)
            android.net.Uri[] r2 = r9.getTriggeredContentUris()
            if (r2 == 0) goto L95
            android.net.Uri[] r2 = r9.getTriggeredContentUris()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r4.f18524d = r2
        L95:
            java.lang.String[] r2 = r9.getTriggeredContentAuthorities()
            if (r2 == 0) goto La5
            java.lang.String[] r2 = r9.getTriggeredContentAuthorities()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r4.f18523c = r2
        La5:
            r2 = 28
            if (r3 < r2) goto Laf
            android.net.Network r9 = p2.c.b(r9)
            r4.f18525f = r9
        Laf:
            m2.k r9 = r8.f2212b
            r9.z(r0, r4)
            return r1
        Lb5:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb5
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
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            m2.k r0 = r6.f2212b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            androidx.work.p r7 = androidx.work.p.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2211d
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.b(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            androidx.work.p r7 = androidx.work.p.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2211d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.c(r0, r1, r3)
            return r2
        L3c:
            androidx.work.p r0 = androidx.work.p.e()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f2211d
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.b(r3, r4, r2)
            java.util.HashMap r0 = r6.f2213c
            monitor-enter(r0)
            java.util.HashMap r2 = r6.f2213c     // Catch: java.lang.Throwable -> L72
            r2.remove(r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            m2.k r0 = r6.f2212b
            r0.A(r7)
            m2.k r0 = r6.f2212b
            m2.b r0 = r0.f21463n
            java.lang.Object r2 = r0.f21443m
            monitor-enter(r2)
            java.util.HashSet r0 = r0.f21441k     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            r7 = r7 ^ r1
            return r7
        L6f:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            throw r7
        L72:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
