package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public JobServiceEngineImpl f18404a;

    /* renamed from: b, reason: collision with root package name */
    public CommandProcessor f18405b;

    /* loaded from: classes.dex */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r5) {
            /*
                r4 = this;
                java.lang.Void[] r5 = (java.lang.Void[]) r5
            L2:
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                androidx.core.app.JobIntentService$JobServiceEngineImpl r0 = r5.f18404a
                r0.getClass()
                androidx.core.app.JobIntentService$JobServiceEngineImpl r5 = r5.f18404a
                java.lang.Object r0 = r5.f18408b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.f18409c     // Catch: java.lang.Throwable -> L16
                r2 = 0
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            L14:
                r0 = r2
                goto L31
            L16:
                r5 = move-exception
                goto L55
            L18:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                if (r1 == 0) goto L14
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r3 = r5.f18407a
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r0.setExtrasClassLoader(r3)
                androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
            L31:
                if (r0 == 0) goto L54
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                android.app.job.JobWorkItem r1 = r0.f18410a
                r1.getIntent()
                r5.a()
                androidx.core.app.JobIntentService$JobServiceEngineImpl r5 = androidx.core.app.JobIntentService.JobServiceEngineImpl.this
                java.lang.Object r5 = r5.f18408b
                monitor-enter(r5)
                androidx.core.app.JobIntentService$JobServiceEngineImpl r1 = androidx.core.app.JobIntentService.JobServiceEngineImpl.this     // Catch: java.lang.Throwable -> L4e
                android.app.job.JobParameters r1 = r1.f18409c     // Catch: java.lang.Throwable -> L4e
                if (r1 == 0) goto L50
                android.app.job.JobWorkItem r0 = r0.f18410a     // Catch: java.lang.Throwable -> L4e
                r1.completeWork(r0)     // Catch: java.lang.Throwable -> L4e
                goto L50
            L4e:
                r0 = move-exception
                goto L52
            L50:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                goto L2
            L52:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
                throw r0
            L54:
                return r2
            L55:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.CommandProcessor.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.getClass();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public interface CompatJobEngine {
    }

    /* loaded from: classes.dex */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
    }

    /* loaded from: classes.dex */
    public final class CompatWorkItem implements GenericWorkItem {
    }

    /* loaded from: classes.dex */
    public interface GenericWorkItem {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f18407a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f18408b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f18409c;

        /* loaded from: classes.dex */
        public final class WrapperWorkItem implements GenericWorkItem {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f18410a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f18410a = jobWorkItem;
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f18408b = new Object();
            this.f18407a = jobIntentService;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f18409c = jobParameters;
            JobIntentService jobIntentService = this.f18407a;
            if (jobIntentService.f18405b != null) {
                return true;
            }
            CommandProcessor commandProcessor = new CommandProcessor();
            jobIntentService.f18405b = commandProcessor;
            commandProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.f18407a.f18405b;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.f18408b) {
                this.f18409c = null;
            }
            return true;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    /* loaded from: classes.dex */
    public static abstract class WorkEnqueuer {
    }

    static {
        new HashMap();
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineImpl jobServiceEngineImpl = this.f18404a;
        if (jobServiceEngineImpl != null) {
            return jobServiceEngineImpl.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f18404a = new JobServiceEngineImpl(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        return 2;
    }
}
