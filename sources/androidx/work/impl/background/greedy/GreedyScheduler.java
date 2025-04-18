package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {

    /* renamed from: j, reason: collision with root package name */
    public static final String f22012j = Logger.e("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22013a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkManagerImpl f22014b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkConstraintsTracker f22015c;

    /* renamed from: f, reason: collision with root package name */
    public final DelayedWorkTracker f22016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22017g;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f22019i;
    public final HashSet d = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final Object f22018h = new Object();

    public GreedyScheduler(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkManagerImpl workManagerImpl) {
        this.f22013a = context;
        this.f22014b = workManagerImpl;
        this.f22015c = new WorkConstraintsTracker(context, workManagerTaskExecutor, this);
        this.f22016f = new DelayedWorkTracker(this, configuration.e);
    }

    @Override // androidx.work.impl.Scheduler
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f22019i;
        WorkManagerImpl workManagerImpl = this.f22014b;
        if (bool == null) {
            this.f22019i = Boolean.valueOf(ProcessUtils.a(this.f22013a, workManagerImpl.f21970b));
        }
        boolean booleanValue = this.f22019i.booleanValue();
        String str2 = f22012j;
        if (!booleanValue) {
            Logger.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f22017g) {
            workManagerImpl.f21972f.c(this);
            this.f22017g = true;
        }
        Logger.c().a(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        DelayedWorkTracker delayedWorkTracker = this.f22016f;
        if (delayedWorkTracker != null && (runnable = (Runnable) delayedWorkTracker.f22009c.remove(str)) != null) {
            delayedWorkTracker.f22008b.b(runnable);
        }
        workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, false));
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.c().a(f22012j, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f22014b;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, false));
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        if (this.f22019i == null) {
            this.f22019i = Boolean.valueOf(ProcessUtils.a(this.f22013a, this.f22014b.f21970b));
        }
        if (!this.f22019i.booleanValue()) {
            Logger.c().d(f22012j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f22017g) {
            this.f22014b.f21972f.c(this);
            this.f22017g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final WorkSpec workSpec : workSpecArr) {
            long a2 = workSpec.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (workSpec.f22147b == WorkInfo.State.f21897a) {
                if (currentTimeMillis < a2) {
                    final DelayedWorkTracker delayedWorkTracker = this.f22016f;
                    if (delayedWorkTracker != null) {
                        HashMap hashMap = delayedWorkTracker.f22009c;
                        Runnable runnable = (Runnable) hashMap.remove(workSpec.f22146a);
                        RunnableScheduler runnableScheduler = delayedWorkTracker.f22008b;
                        if (runnable != null) {
                            runnableScheduler.b(runnable);
                        }
                        Runnable runnable2 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Logger c2 = Logger.c();
                                String str = DelayedWorkTracker.d;
                                WorkSpec workSpec2 = workSpec;
                                c2.a(str, String.format("Scheduling work %s", workSpec2.f22146a), new Throwable[0]);
                                DelayedWorkTracker.this.f22007a.c(workSpec2);
                            }
                        };
                        hashMap.put(workSpec.f22146a, runnable2);
                        runnableScheduler.a(runnable2, workSpec.a() - System.currentTimeMillis());
                    }
                } else if (workSpec.b()) {
                    Constraints constraints = workSpec.f22153j;
                    if (constraints.f21856c) {
                        Logger.c().a(f22012j, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                    } else if (constraints.f21859h.f21862a.size() > 0) {
                        Logger.c().a(f22012j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.f22146a);
                    }
                } else {
                    Logger.c().a(f22012j, String.format("Starting work for %s", workSpec.f22146a), new Throwable[0]);
                    this.f22014b.f(workSpec.f22146a, null);
                }
            }
        }
        synchronized (this.f22018h) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.c().a(f22012j, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.d.addAll(hashSet);
                    this.f22015c.d(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return false;
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.f22018h) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WorkSpec workSpec = (WorkSpec) it.next();
                    if (workSpec.f22146a.equals(str)) {
                        Logger.c().a(f22012j, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.d.remove(workSpec);
                        this.f22015c.d(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.c().a(f22012j, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f22014b.f(str, null);
        }
    }
}
