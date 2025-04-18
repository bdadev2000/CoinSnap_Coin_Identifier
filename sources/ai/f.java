package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wh.c0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f499h = new c0(5, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final f f500i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f501j;
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public int f502b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f503c;

    /* renamed from: d, reason: collision with root package name */
    public long f504d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f505e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f506f;

    /* renamed from: g, reason: collision with root package name */
    public final e f507g;

    static {
        String name = Intrinsics.stringPlus(xh.b.f27682g, " TaskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        f500i = new f(new d(new xh.a(name, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f501j = logger;
    }

    public f(d backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.a = backend;
        this.f502b = 10000;
        this.f505e = new ArrayList();
        this.f506f = new ArrayList();
        this.f507g = new e(this);
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = xh.b.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.a);
        try {
            long a = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(a aVar, long j3) {
        boolean z10;
        byte[] bArr = xh.b.a;
        c cVar = aVar.f489c;
        Intrinsics.checkNotNull(cVar);
        if (cVar.f495d == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = cVar.f497f;
            cVar.f497f = false;
            cVar.f495d = null;
            this.f505e.remove(cVar);
            if (j3 != -1 && !z11 && !cVar.f494c) {
                cVar.e(aVar, j3, true);
            }
            if (!cVar.f496e.isEmpty()) {
                this.f506f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    public final a c() {
        boolean z10;
        byte[] bArr = xh.b.a;
        while (true) {
            ArrayList arrayList = this.f506f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.a;
            dVar.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j3 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    a aVar2 = (a) ((c) it.next()).f496e.get(0);
                    long max = Math.max(0L, aVar2.f490d - nanoTime);
                    if (max > 0) {
                        j3 = Math.min(max, j3);
                    } else {
                        if (aVar != null) {
                            z10 = true;
                            break;
                        }
                        aVar = aVar2;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = xh.b.a;
                aVar.f490d = -1L;
                c cVar = aVar.f489c;
                Intrinsics.checkNotNull(cVar);
                cVar.f496e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f495d = aVar;
                this.f505e.add(cVar);
                if (z10 || (!this.f503c && (!arrayList.isEmpty()))) {
                    e runnable = this.f507g;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    dVar.a.execute(runnable);
                }
                return aVar;
            }
            if (this.f503c) {
                if (j3 < this.f504d - nanoTime) {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    notify();
                }
                return null;
            }
            this.f503c = true;
            this.f504d = nanoTime + j3;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    long j10 = j3 / 1000000;
                    long j11 = j3 - (1000000 * j10);
                    if (j10 > 0 || j3 > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    d();
                }
                this.f503c = false;
            } catch (Throwable th2) {
                this.f503c = false;
                throw th2;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f505e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                ((c) arrayList.get(size)).b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        ArrayList arrayList2 = this.f506f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f496e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i11 >= 0) {
                size2 = i11;
            } else {
                return;
            }
        }
    }

    public final void e(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = xh.b.a;
        if (taskQueue.f495d == null) {
            boolean z10 = !taskQueue.f496e.isEmpty();
            ArrayList arrayList = this.f506f;
            if (z10) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z11 = this.f503c;
        d dVar = this.a;
        if (z11) {
            dVar.getClass();
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            dVar.getClass();
            e runnable = this.f507g;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            dVar.a.execute(runnable);
        }
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f502b;
            this.f502b = i10 + 1;
        }
        return new c(this, Intrinsics.stringPlus("Q", Integer.valueOf(i10)));
    }
}
