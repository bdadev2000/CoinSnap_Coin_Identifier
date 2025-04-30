package l8;

import G7.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import w4.v0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f21642a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21643c;

    /* renamed from: d, reason: collision with root package name */
    public a f21644d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21645e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21646f;

    public b(c cVar, String str) {
        j.e(cVar, "taskRunner");
        j.e(str, "name");
        this.f21642a = cVar;
        this.b = str;
        this.f21645e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j8.b.f21214a;
        synchronized (this.f21642a) {
            if (b()) {
                this.f21642a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f21644d;
        if (aVar != null && aVar.b) {
            this.f21646f = true;
        }
        ArrayList arrayList = this.f21645e;
        int size = arrayList.size() - 1;
        boolean z8 = false;
        if (size >= 0) {
            while (true) {
                int i9 = size - 1;
                if (((a) arrayList.get(size)).b) {
                    a aVar2 = (a) arrayList.get(size);
                    if (c.f21648i.isLoggable(Level.FINE)) {
                        v0.c(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z8 = true;
                }
                if (i9 < 0) {
                    break;
                }
                size = i9;
            }
        }
        return z8;
    }

    public final void c(a aVar, long j7) {
        j.e(aVar, "task");
        synchronized (this.f21642a) {
            if (this.f21643c) {
                if (aVar.b) {
                    c cVar = c.f21647h;
                    if (c.f21648i.isLoggable(Level.FINE)) {
                        v0.c(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    c cVar2 = c.f21647h;
                    if (c.f21648i.isLoggable(Level.FINE)) {
                        v0.c(aVar, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (e(aVar, j7, false)) {
                this.f21642a.e(this);
            }
        }
    }

    public final boolean e(a aVar, long j7, boolean z8) {
        String j9;
        j.e(aVar, "task");
        b bVar = aVar.f21640c;
        if (bVar != this) {
            if (bVar == null) {
                aVar.f21640c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f21642a.f21649a.getClass();
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j7;
        ArrayList arrayList = this.f21645e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f21641d <= j10) {
                if (c.f21648i.isLoggable(Level.FINE)) {
                    v0.c(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f21641d = j10;
        if (c.f21648i.isLoggable(Level.FINE)) {
            if (z8) {
                j9 = j.j(v0.l(j10 - nanoTime), "run again after ");
            } else {
                j9 = j.j(v0.l(j10 - nanoTime), "scheduled after ");
            }
            v0.c(aVar, this, j9);
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f21641d - nanoTime > j7) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            i9 = arrayList.size();
        }
        arrayList.add(i9, aVar);
        if (i9 != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        byte[] bArr = j8.b.f21214a;
        synchronized (this.f21642a) {
            this.f21643c = true;
            if (b()) {
                this.f21642a.e(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
