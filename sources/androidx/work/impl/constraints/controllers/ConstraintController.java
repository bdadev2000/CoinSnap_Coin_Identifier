package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22076a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f22077b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintTracker f22078c;
    public OnConstraintUpdatedCallback d;

    /* loaded from: classes2.dex */
    public interface OnConstraintUpdatedCallback {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList);
    }

    public ConstraintController(ConstraintTracker constraintTracker) {
        this.f22078c = constraintTracker;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public final void a(Object obj) {
        this.f22077b = obj;
        e(this.d, obj);
    }

    public abstract boolean b(WorkSpec workSpec);

    public abstract boolean c(Object obj);

    public final void d(Collection collection) {
        this.f22076a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            if (b(workSpec)) {
                this.f22076a.add(workSpec.f22146a);
            }
        }
        if (this.f22076a.isEmpty()) {
            this.f22078c.b(this);
        } else {
            ConstraintTracker constraintTracker = this.f22078c;
            synchronized (constraintTracker.f22087c) {
                try {
                    if (constraintTracker.d.add(this)) {
                        if (constraintTracker.d.size() == 1) {
                            constraintTracker.e = constraintTracker.a();
                            Logger.c().a(ConstraintTracker.f22084f, String.format("%s: initial state = %s", constraintTracker.getClass().getSimpleName(), constraintTracker.e), new Throwable[0]);
                            constraintTracker.d();
                        }
                        a(constraintTracker.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.d, this.f22077b);
    }

    public final void e(OnConstraintUpdatedCallback onConstraintUpdatedCallback, Object obj) {
        ArrayList arrayList = this.f22076a;
        if (arrayList.isEmpty() || onConstraintUpdatedCallback == null) {
            return;
        }
        if (obj == null || c(obj)) {
            onConstraintUpdatedCallback.a(arrayList);
        } else {
            onConstraintUpdatedCallback.b(arrayList);
        }
    }
}
