package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {

    /* renamed from: g, reason: collision with root package name */
    public static final String f22267g = Logger.e("ConstraintTrkngWrkr");

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f22268a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22269b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f22270c;
    public final SettableFuture d;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f22271f;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f22268a = workerParameters;
        this.f22269b = new Object();
        this.f22270c = false;
        this.d = new Object();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        Logger.c().a(f22267g, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f22269b) {
            this.f22270c = true;
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final TaskExecutor getTaskExecutor() {
        return WorkManagerImpl.b(getApplicationContext()).d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f22271f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f22271f;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f22271f.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker.1
            @Override // java.lang.Runnable
            public final void run() {
                final ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                String b2 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(b2)) {
                    Logger.c().b(ConstraintTrackingWorker.f22267g, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.d.i(new ListenableWorker.Result.Failure());
                    return;
                }
                ListenableWorker b3 = constraintTrackingWorker.getWorkerFactory().b(constraintTrackingWorker.getApplicationContext(), b2, constraintTrackingWorker.f22268a);
                constraintTrackingWorker.f22271f = b3;
                if (b3 == null) {
                    Logger.c().a(ConstraintTrackingWorker.f22267g, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.d.i(new ListenableWorker.Result.Failure());
                    return;
                }
                WorkSpec j2 = WorkManagerImpl.b(constraintTrackingWorker.getApplicationContext()).f21971c.h().j(constraintTrackingWorker.getId().toString());
                if (j2 == null) {
                    constraintTrackingWorker.d.i(new ListenableWorker.Result.Failure());
                    return;
                }
                WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                workConstraintsTracker.d(Collections.singletonList(j2));
                if (!workConstraintsTracker.c(constraintTrackingWorker.getId().toString())) {
                    Logger.c().a(ConstraintTrackingWorker.f22267g, String.format("Constraints not met for delegate %s. Requesting retry.", b2), new Throwable[0]);
                    constraintTrackingWorker.d.i(new Object());
                    return;
                }
                Logger.c().a(ConstraintTrackingWorker.f22267g, String.format("Constraints met for delegate %s", b2), new Throwable[0]);
                try {
                    final ListenableFuture startWork = constraintTrackingWorker.f22271f.startWork();
                    startWork.addListener(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (ConstraintTrackingWorker.this.f22269b) {
                                try {
                                    if (ConstraintTrackingWorker.this.f22270c) {
                                        ConstraintTrackingWorker constraintTrackingWorker2 = ConstraintTrackingWorker.this;
                                        constraintTrackingWorker2.d.i(new Object());
                                    } else {
                                        ConstraintTrackingWorker.this.d.k(startWork);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, constraintTrackingWorker.getBackgroundExecutor());
                } catch (Throwable th) {
                    Logger c2 = Logger.c();
                    String str = ConstraintTrackingWorker.f22267g;
                    c2.a(str, String.format("Delegated worker %s threw exception in startWork.", b2), th);
                    synchronized (constraintTrackingWorker.f22269b) {
                        try {
                            if (constraintTrackingWorker.f22270c) {
                                Logger.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.d.i(new Object());
                            } else {
                                constraintTrackingWorker.d.i(new ListenableWorker.Result.Failure());
                            }
                        } finally {
                        }
                    }
                }
            }
        });
        return this.d;
    }
}
