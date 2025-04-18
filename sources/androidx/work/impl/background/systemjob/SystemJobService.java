package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import java.util.HashMap;

@RequiresApi
@RestrictTo
/* loaded from: classes4.dex */
public class SystemJobService extends JobService implements ExecutionListener {

    /* renamed from: c, reason: collision with root package name */
    public static final String f22067c = Logger.e("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public WorkManagerImpl f22068a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22069b = new HashMap();

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        JobParameters jobParameters;
        Logger.c().a(f22067c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f22069b) {
            jobParameters = (JobParameters) this.f22069b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl b2 = WorkManagerImpl.b(getApplicationContext());
            this.f22068a = b2;
            b2.f21972f.c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            Logger.c().g(f22067c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f22068a;
        if (workManagerImpl != null) {
            workManagerImpl.f21972f.g(this);
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
            androidx.work.impl.WorkManagerImpl r0 = r8.f22068a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            androidx.work.Logger r0 = androidx.work.Logger.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f22067c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
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
            androidx.work.Logger r9 = androidx.work.Logger.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f22067c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L3f:
            java.util.HashMap r3 = r8.f22069b
            monitor-enter(r3)
            java.util.HashMap r4 = r8.f22069b     // Catch: java.lang.Throwable -> L61
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L63
            androidx.work.Logger r9 = androidx.work.Logger.c()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f22067c     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = java.lang.String.format(r4, r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L61
            r9.a(r1, r0, r4)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            return r2
        L61:
            r9 = move-exception
            goto Lb5
        L63:
            androidx.work.Logger r4 = androidx.work.Logger.c()     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.f22067c     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> L61
            r4.a(r5, r6, r2)     // Catch: java.lang.Throwable -> L61
            java.util.HashMap r2 = r8.f22069b     // Catch: java.lang.Throwable -> L61
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$RuntimeExtras r3 = new androidx.work.WorkerParameters$RuntimeExtras
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L95
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f21921b = r4
        L95:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto La5
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f21920a = r4
        La5:
            r4 = 28
            if (r2 < r4) goto Laf
            android.net.Network r9 = androidx.media.a.g(r9)
            r3.f21922c = r9
        Laf:
            androidx.work.impl.WorkManagerImpl r9 = r8.f22068a
            r9.f(r0, r3)
            return r1
        Lb5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
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
            androidx.work.impl.WorkManagerImpl r0 = r6.f22068a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            androidx.work.Logger r7 = androidx.work.Logger.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f22067c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.a(r0, r3, r2)
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
            androidx.work.Logger r7 = androidx.work.Logger.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f22067c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.b(r0, r1, r3)
            return r2
        L3c:
            androidx.work.Logger r0 = androidx.work.Logger.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f22067c
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            java.util.HashMap r0 = r6.f22069b
            monitor-enter(r0)
            java.util.HashMap r3 = r6.f22069b     // Catch: java.lang.Throwable -> L79
            r3.remove(r7)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            androidx.work.impl.WorkManagerImpl r0 = r6.f22068a
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r0.d
            androidx.work.impl.utils.StopWorkRunnable r4 = new androidx.work.impl.utils.StopWorkRunnable
            r4.<init>(r0, r7, r2)
            r3.b(r4)
            androidx.work.impl.WorkManagerImpl r0 = r6.f22068a
            androidx.work.impl.Processor r0 = r0.f21972f
            java.lang.Object r2 = r0.f21935l
            monitor-enter(r2)
            java.util.HashSet r0 = r0.f21933j     // Catch: java.lang.Throwable -> L76
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            r7 = r7 ^ r1
            return r7
        L76:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r7
        L79:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
