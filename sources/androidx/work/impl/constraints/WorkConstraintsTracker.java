package androidx.work.impl.constraints;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class WorkConstraintsTracker implements ConstraintController.OnConstraintUpdatedCallback {
    public static final String d = Logger.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final WorkConstraintsCallback f22073a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintController[] f22074b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22075c;

    public WorkConstraintsTracker(Context context, TaskExecutor taskExecutor, WorkConstraintsCallback workConstraintsCallback) {
        Context applicationContext = context.getApplicationContext();
        this.f22073a = workConstraintsCallback;
        this.f22074b = new ConstraintController[]{new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22095a), new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22096b), new ConstraintController(Trackers.a(applicationContext, taskExecutor).d), new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22097c), new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22097c), new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22097c), new ConstraintController(Trackers.a(applicationContext, taskExecutor).f22097c)};
        this.f22075c = new Object();
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public final void a(ArrayList arrayList) {
        synchronized (this.f22075c) {
            WorkConstraintsCallback workConstraintsCallback = this.f22073a;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.b(arrayList);
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public final void b(ArrayList arrayList) {
        synchronized (this.f22075c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        Logger.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                WorkConstraintsCallback workConstraintsCallback = this.f22073a;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.f(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this.f22075c) {
            try {
                for (ConstraintController constraintController : this.f22074b) {
                    Object obj = constraintController.f22077b;
                    if (obj != null && constraintController.c(obj) && constraintController.f22076a.contains(str)) {
                        Logger.c().a(d, String.format("Work %s constrained by %s", str, constraintController.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Collection collection) {
        synchronized (this.f22075c) {
            try {
                for (ConstraintController constraintController : this.f22074b) {
                    if (constraintController.d != null) {
                        constraintController.d = null;
                        constraintController.e(null, constraintController.f22077b);
                    }
                }
                for (ConstraintController constraintController2 : this.f22074b) {
                    constraintController2.d(collection);
                }
                for (ConstraintController constraintController3 : this.f22074b) {
                    if (constraintController3.d != this) {
                        constraintController3.d = this;
                        constraintController3.e(this, constraintController3.f22077b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f22075c) {
            try {
                for (ConstraintController constraintController : this.f22074b) {
                    ArrayList arrayList = constraintController.f22076a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        constraintController.f22078c.b(constraintController);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
