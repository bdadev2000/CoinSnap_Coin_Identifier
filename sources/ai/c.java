package ai;

import com.facebook.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wh.c0;

/* loaded from: classes5.dex */
public final class c {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final String f493b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f494c;

    /* renamed from: d, reason: collision with root package name */
    public a f495d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f497f;

    public c(f taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = taskRunner;
        this.f493b = name;
        this.f496e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = xh.b.a;
        synchronized (this.a) {
            if (b()) {
                this.a.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean b() {
        a aVar = this.f495d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f488b) {
                this.f497f = true;
            }
        }
        ArrayList arrayList = this.f496e;
        int size = arrayList.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (((a) arrayList.get(size)).f488b) {
                    a aVar2 = (a) arrayList.get(size);
                    c0 c0Var = f.f499h;
                    if (f.f501j.isLoggable(Level.FINE)) {
                        i.e(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final void c(a task, long j3) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.a) {
            if (this.f494c) {
                if (task.f488b) {
                    f.f499h.getClass();
                    if (f.f501j.isLoggable(Level.FINE)) {
                        i.e(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    f.f499h.getClass();
                    if (f.f501j.isLoggable(Level.FINE)) {
                        i.e(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (e(task, j3, false)) {
                this.a.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean e(a task, long j3, boolean z10) {
        boolean z11;
        String stringPlus;
        boolean z12;
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f489c;
        if (cVar != this) {
            if (cVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                task.f489c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.a.a.getClass();
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j3;
        ArrayList arrayList = this.f496e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f490d <= j10) {
                c0 c0Var = f.f499h;
                if (f.f501j.isLoggable(Level.FINE)) {
                    i.e(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f490d = j10;
        c0 c0Var2 = f.f499h;
        if (f.f501j.isLoggable(Level.FINE)) {
            if (z10) {
                stringPlus = Intrinsics.stringPlus("run again after ", i.q(j10 - nanoTime));
            } else {
                stringPlus = Intrinsics.stringPlus("scheduled after ", i.q(j10 - nanoTime));
            }
            i.e(task, this, stringPlus);
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f490d - nanoTime > j3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = arrayList.size();
        }
        arrayList.add(i10, task);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = xh.b.a;
        synchronized (this.a) {
            this.f494c = true;
            if (b()) {
                this.a.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String toString() {
        return this.f493b;
    }
}
