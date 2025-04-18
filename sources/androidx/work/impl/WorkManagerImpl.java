package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabaseMigrations;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p0.a;

@RestrictTo
/* loaded from: classes.dex */
public class WorkManagerImpl extends WorkManager {

    /* renamed from: j, reason: collision with root package name */
    public static WorkManagerImpl f21966j;

    /* renamed from: k, reason: collision with root package name */
    public static WorkManagerImpl f21967k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f21968l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21969a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f21970b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f21971c;
    public final TaskExecutor d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final Processor f21972f;

    /* renamed from: g, reason: collision with root package name */
    public final PreferenceUtils f21973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21974h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f21975i;

    /* renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r1 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkManagerImpl.AnonymousClass1.run():void");
        }
    }

    /* renamed from: androidx.work.impl.WorkManagerImpl$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).a();
        }
    }

    static {
        Logger.e("WorkManagerImpl");
        f21966j = null;
        f21967k = null;
        f21968l = new Object();
    }

    public WorkManagerImpl(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor) {
        RoomDatabase.Builder a2;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        final Context applicationContext = context.getApplicationContext();
        SerialExecutor serialExecutor = workManagerTaskExecutor.f22263a;
        int i2 = WorkDatabase.f21949b;
        if (z2) {
            a.s(applicationContext, "context");
            a2 = new RoomDatabase.Builder(applicationContext, WorkDatabase.class, null);
            a2.f21329j = true;
        } else {
            String str = WorkDatabasePathHelper.f21958a;
            a2 = Room.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            a2.f21328i = new SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase.1

                /* renamed from: a */
                public final /* synthetic */ Context f21950a;

                public AnonymousClass1(final Context applicationContext2) {
                    r1 = applicationContext2;
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory, java.lang.Object] */
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                public final SupportSQLiteOpenHelper a(SupportSQLiteOpenHelper.Configuration configuration2) {
                    SupportSQLiteOpenHelper.Configuration.Builder a3 = SupportSQLiteOpenHelper.Configuration.Companion.a(r1);
                    a3.f21463b = configuration2.f21460b;
                    SupportSQLiteOpenHelper.Callback callback = configuration2.f21461c;
                    a.s(callback, "callback");
                    a3.f21464c = callback;
                    a3.d = true;
                    return new Object().a(a3.a());
                }
            };
        }
        a.s(serialExecutor, "executor");
        a2.f21326g = serialExecutor;
        a2.d.add(new Object());
        a2.a(WorkDatabaseMigrations.f21951a);
        a2.a(new WorkDatabaseMigrations.RescheduleMigration(applicationContext2, 2, 3));
        a2.a(WorkDatabaseMigrations.f21952b);
        a2.a(WorkDatabaseMigrations.f21953c);
        a2.a(new WorkDatabaseMigrations.RescheduleMigration(applicationContext2, 5, 6));
        a2.a(WorkDatabaseMigrations.d);
        a2.a(WorkDatabaseMigrations.e);
        a2.a(WorkDatabaseMigrations.f21954f);
        a2.a(new WorkDatabaseMigrations.WorkMigration9To10(applicationContext2));
        a2.a(new WorkDatabaseMigrations.RescheduleMigration(applicationContext2, 10, 11));
        a2.a(WorkDatabaseMigrations.f21955g);
        a2.f21331l = false;
        a2.f21332m = true;
        WorkDatabase workDatabase = (WorkDatabase) a2.b();
        Context applicationContext2 = context.getApplicationContext();
        Logger.LogcatLogger logcatLogger = new Logger.LogcatLogger(configuration.f21848f);
        synchronized (Logger.class) {
            Logger.f21879a = logcatLogger;
        }
        String str2 = Schedulers.f21939a;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(applicationContext2, this);
        PackageManagerHelper.a(applicationContext2, SystemJobService.class, true);
        Logger.c().a(Schedulers.f21939a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List asList = Arrays.asList(systemJobScheduler, new GreedyScheduler(applicationContext2, configuration, workManagerTaskExecutor, this));
        Processor processor = new Processor(context, configuration, workManagerTaskExecutor, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f21969a = applicationContext3;
        this.f21970b = configuration;
        this.d = workManagerTaskExecutor;
        this.f21971c = workDatabase;
        this.e = asList;
        this.f21972f = processor;
        this.f21973g = new PreferenceUtils(workDatabase);
        this.f21974h = false;
        if (applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.b(new ForceStopRunnable(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl b(Context context) {
        WorkManagerImpl workManagerImpl;
        Object obj = f21968l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    workManagerImpl = f21966j;
                    if (workManagerImpl == null) {
                        workManagerImpl = f21967k;
                    }
                }
                return workManagerImpl;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (workManagerImpl == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.Provider)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((Configuration.Provider) applicationContext).a());
            workManagerImpl = b(applicationContext);
        }
        return workManagerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.WorkManagerImpl.f21967k != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.WorkManagerImpl.f21967k = new androidx.work.impl.WorkManagerImpl(r4, r5, new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor(r5.f21846b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.WorkManagerImpl.f21966j = androidx.work.impl.WorkManagerImpl.f21967k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r4, androidx.work.Configuration r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.WorkManagerImpl.f21968l
            monitor-enter(r0)
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.f21966j     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.f21967k     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L34
        L16:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.f21967k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2e
            androidx.work.impl.WorkManagerImpl r1 = new androidx.work.impl.WorkManagerImpl     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor r2 = new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r3 = r5.f21846b     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl.f21967k = r1     // Catch: java.lang.Throwable -> L14
        L2e:
            androidx.work.impl.WorkManagerImpl r4 = androidx.work.impl.WorkManagerImpl.f21967k     // Catch: java.lang.Throwable -> L14
            androidx.work.impl.WorkManagerImpl.f21966j = r4     // Catch: java.lang.Throwable -> L14
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkManagerImpl.c(android.content.Context, androidx.work.Configuration):void");
    }

    public final OperationImpl a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        WorkContinuationImpl workContinuationImpl = new WorkContinuationImpl(this, list);
        if (workContinuationImpl.f21946h) {
            Logger.c().g(WorkContinuationImpl.f21940j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", workContinuationImpl.e)), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(workContinuationImpl);
            this.d.b(enqueueRunnable);
            workContinuationImpl.f21947i = enqueueRunnable.f22187b;
        }
        return workContinuationImpl.f21947i;
    }

    public final void d() {
        synchronized (f21968l) {
            try {
                this.f21974h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f21975i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f21975i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList e;
        Context context = this.f21969a;
        String str = SystemJobScheduler.f22063f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e = SystemJobScheduler.e(context, jobScheduler)) != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                SystemJobScheduler.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.f21971c.h().m();
        Schedulers.a(this.f21970b, this.f21971c, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.work.impl.utils.StartWorkRunnable, java.lang.Object, java.lang.Runnable] */
    public final void f(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        TaskExecutor taskExecutor = this.d;
        ?? obj = new Object();
        obj.f22202a = this;
        obj.f22203b = str;
        obj.f22204c = runtimeExtras;
        taskExecutor.b(obj);
    }
}
