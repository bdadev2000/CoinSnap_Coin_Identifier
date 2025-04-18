package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RestrictTo
/* loaded from: classes2.dex */
public class WorkerWrapper implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f21976u = Logger.e("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f21977a;

    /* renamed from: b, reason: collision with root package name */
    public String f21978b;

    /* renamed from: c, reason: collision with root package name */
    public List f21979c;
    public WorkerParameters.RuntimeExtras d;

    /* renamed from: f, reason: collision with root package name */
    public WorkSpec f21980f;

    /* renamed from: g, reason: collision with root package name */
    public ListenableWorker f21981g;

    /* renamed from: h, reason: collision with root package name */
    public TaskExecutor f21982h;

    /* renamed from: i, reason: collision with root package name */
    public ListenableWorker.Result f21983i;

    /* renamed from: j, reason: collision with root package name */
    public Configuration f21984j;

    /* renamed from: k, reason: collision with root package name */
    public ForegroundProcessor f21985k;

    /* renamed from: l, reason: collision with root package name */
    public WorkDatabase f21986l;

    /* renamed from: m, reason: collision with root package name */
    public WorkSpecDao f21987m;

    /* renamed from: n, reason: collision with root package name */
    public DependencyDao f21988n;

    /* renamed from: o, reason: collision with root package name */
    public WorkTagDao f21989o;

    /* renamed from: p, reason: collision with root package name */
    public List f21990p;

    /* renamed from: q, reason: collision with root package name */
    public String f21991q;

    /* renamed from: r, reason: collision with root package name */
    public SettableFuture f21992r;

    /* renamed from: s, reason: collision with root package name */
    public ListenableFuture f21993s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f21994t;

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Context f22001a;

        /* renamed from: b, reason: collision with root package name */
        public ForegroundProcessor f22002b;

        /* renamed from: c, reason: collision with root package name */
        public TaskExecutor f22003c;
        public Configuration d;
        public WorkDatabase e;

        /* renamed from: f, reason: collision with root package name */
        public String f22004f;

        /* renamed from: g, reason: collision with root package name */
        public List f22005g;

        /* renamed from: h, reason: collision with root package name */
        public WorkerParameters.RuntimeExtras f22006h;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.impl.WorkerWrapper, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
        public final WorkerWrapper a() {
            ?? obj = new Object();
            obj.f21983i = new ListenableWorker.Result.Failure();
            obj.f21992r = new Object();
            obj.f21993s = null;
            obj.f21977a = this.f22001a;
            obj.f21982h = this.f22003c;
            obj.f21985k = this.f22002b;
            obj.f21978b = this.f22004f;
            obj.f21979c = this.f22005g;
            obj.d = this.f22006h;
            obj.f21981g = null;
            obj.f21984j = this.d;
            WorkDatabase workDatabase = this.e;
            obj.f21986l = workDatabase;
            obj.f21987m = workDatabase.h();
            obj.f21988n = workDatabase.c();
            obj.f21989o = workDatabase.i();
            return obj;
        }
    }

    public final void a(ListenableWorker.Result result) {
        boolean z2 = result instanceof ListenableWorker.Result.Success;
        String str = f21976u;
        if (!z2) {
            if (result instanceof ListenableWorker.Result.Retry) {
                Logger.c().d(str, String.format("Worker result RETRY for %s", this.f21991q), new Throwable[0]);
                d();
                return;
            }
            Logger.c().d(str, String.format("Worker result FAILURE for %s", this.f21991q), new Throwable[0]);
            if (this.f21980f.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        Logger.c().d(str, String.format("Worker result SUCCESS for %s", this.f21991q), new Throwable[0]);
        if (this.f21980f.c()) {
            e();
            return;
        }
        DependencyDao dependencyDao = this.f21988n;
        String str2 = this.f21978b;
        WorkSpecDao workSpecDao = this.f21987m;
        WorkDatabase workDatabase = this.f21986l;
        workDatabase.beginTransaction();
        try {
            workSpecDao.b(WorkInfo.State.f21899c, str2);
            workSpecDao.q(str2, ((ListenableWorker.Result.Success) this.f21983i).f21878a);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str3 : dependencyDao.b(str2)) {
                if (workSpecDao.i(str3) == WorkInfo.State.f21900f && dependencyDao.c(str3)) {
                    Logger.c().d(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                    workSpecDao.b(WorkInfo.State.f21897a, str3);
                    workSpecDao.f(currentTimeMillis, str3);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            f(false);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            f(false);
            throw th;
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkSpecDao workSpecDao = this.f21987m;
            if (workSpecDao.i(str2) != WorkInfo.State.f21901g) {
                workSpecDao.b(WorkInfo.State.d, str2);
            }
            linkedList.addAll(this.f21988n.b(str2));
        }
    }

    public final void c() {
        boolean i2 = i();
        String str = this.f21978b;
        WorkDatabase workDatabase = this.f21986l;
        if (!i2) {
            workDatabase.beginTransaction();
            try {
                WorkInfo.State i3 = this.f21987m.i(str);
                workDatabase.g().a(str);
                if (i3 == null) {
                    f(false);
                } else if (i3 == WorkInfo.State.f21898b) {
                    a(this.f21983i);
                } else if (!i3.a()) {
                    d();
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        List list = this.f21979c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).a(str);
            }
            Schedulers.a(this.f21984j, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f21978b;
        WorkSpecDao workSpecDao = this.f21987m;
        WorkDatabase workDatabase = this.f21986l;
        workDatabase.beginTransaction();
        try {
            workSpecDao.b(WorkInfo.State.f21897a, str);
            workSpecDao.f(System.currentTimeMillis(), str);
            workSpecDao.c(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(true);
        }
    }

    public final void e() {
        String str = this.f21978b;
        WorkSpecDao workSpecDao = this.f21987m;
        WorkDatabase workDatabase = this.f21986l;
        workDatabase.beginTransaction();
        try {
            workSpecDao.f(System.currentTimeMillis(), str);
            workSpecDao.b(WorkInfo.State.f21897a, str);
            workSpecDao.t(str);
            workSpecDao.c(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final void f(boolean z2) {
        ListenableWorker listenableWorker;
        WorkSpecDao workSpecDao = this.f21987m;
        WorkDatabase workDatabase = this.f21986l;
        workDatabase.beginTransaction();
        try {
            if (!workDatabase.h().s()) {
                PackageManagerHelper.a(this.f21977a, RescheduleReceiver.class, false);
            }
            String str = this.f21978b;
            if (z2) {
                workSpecDao.b(WorkInfo.State.f21897a, str);
                workSpecDao.c(-1L, str);
            }
            if (this.f21980f != null && (listenableWorker = this.f21981g) != null && listenableWorker.isRunInForeground()) {
                this.f21985k.a(str);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            this.f21992r.i(Boolean.valueOf(z2));
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public final void g() {
        WorkSpecDao workSpecDao = this.f21987m;
        String str = this.f21978b;
        WorkInfo.State i2 = workSpecDao.i(str);
        WorkInfo.State state = WorkInfo.State.f21898b;
        String str2 = f21976u;
        if (i2 == state) {
            Logger.c().a(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            Logger.c().a(str2, String.format("Status for %s is %s; not doing any work", str, i2), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f21978b;
        WorkDatabase workDatabase = this.f21986l;
        workDatabase.beginTransaction();
        try {
            b(str);
            this.f21987m.q(str, ((ListenableWorker.Result.Failure) this.f21983i).f21877a);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f21994t) {
            return false;
        }
        Logger.c().a(f21976u, String.format("Work interrupted for %s", this.f21991q), new Throwable[0]);
        if (this.f21987m.i(this.f21978b) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r0.f22154k > 0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.run():void");
    }
}
