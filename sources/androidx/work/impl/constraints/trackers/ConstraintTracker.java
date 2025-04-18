package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class ConstraintTracker<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f22084f = Logger.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final TaskExecutor f22085a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22086b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22087c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        this.f22086b = context.getApplicationContext();
        this.f22085a = taskExecutor;
    }

    public abstract Object a();

    public final void b(ConstraintController constraintController) {
        synchronized (this.f22087c) {
            try {
                if (this.d.remove(constraintController) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f22087c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    final ArrayList arrayList = new ArrayList(this.d);
                    this.f22085a.a().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ConstraintListener) it.next()).a(ConstraintTracker.this.e);
                            }
                        }
                    });
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
