package l8;

import B3.k;
import G7.j;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f21647h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f21648i;

    /* renamed from: a, reason: collision with root package name */
    public final f f21649a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21650c;

    /* renamed from: d, reason: collision with root package name */
    public long f21651d;
    public int b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21652e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21653f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final k f21654g = new k(this, 18);

    static {
        String j7 = j.j(" TaskRunner", j8.b.f21219g);
        j.e(j7, "name");
        f21647h = new c(new f(new j8.a(j7, true)));
        Logger logger = Logger.getLogger(c.class.getName());
        j.d(logger, "getLogger(TaskRunner::class.java.name)");
        f21648i = logger;
    }

    public c(f fVar) {
        this.f21649a = fVar;
    }

    public static final void a(c cVar, a aVar) {
        cVar.getClass();
        byte[] bArr = j8.b.f21214a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f21639a);
        try {
            long a6 = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, a6);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j7) {
        byte[] bArr = j8.b.f21214a;
        b bVar = aVar.f21640c;
        j.b(bVar);
        if (bVar.f21644d == aVar) {
            boolean z8 = bVar.f21646f;
            bVar.f21646f = false;
            bVar.f21644d = null;
            this.f21652e.remove(bVar);
            if (j7 != -1 && !z8 && !bVar.f21643c) {
                bVar.e(aVar, j7, true);
            }
            if (!bVar.f21645e.isEmpty()) {
                this.f21653f.add(bVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final a c() {
        boolean z8;
        boolean z9;
        long j7;
        long j9;
        byte[] bArr = j8.b.f21214a;
        while (true) {
            ArrayList arrayList = this.f21653f;
            if (arrayList.isEmpty()) {
                return null;
            }
            f fVar = this.f21649a;
            fVar.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j10 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    a aVar2 = (a) ((b) it.next()).f21645e.get(0);
                    long max = Math.max(0L, aVar2.f21641d - nanoTime);
                    if (max > 0) {
                        j10 = Math.min(max, j10);
                    } else {
                        if (aVar != null) {
                            z8 = true;
                            break;
                        }
                        aVar = aVar2;
                    }
                } else {
                    z8 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = j8.b.f21214a;
                aVar.f21641d = -1L;
                b bVar = aVar.f21640c;
                j.b(bVar);
                bVar.f21645e.remove(aVar);
                arrayList.remove(bVar);
                bVar.f21644d = aVar;
                this.f21652e.add(bVar);
                if (z8 || (!this.f21650c && (!arrayList.isEmpty()))) {
                    k kVar = this.f21654g;
                    j.e(kVar, "runnable");
                    ((ThreadPoolExecutor) fVar.f12819c).execute(kVar);
                }
                return aVar;
            }
            if (this.f21650c) {
                if (j10 < this.f21651d - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f21650c = true;
            this.f21651d = nanoTime + j10;
            try {
                try {
                    j7 = j10 / 1000000;
                    j9 = j10 - (1000000 * j7);
                } catch (InterruptedException unused) {
                    d();
                    z9 = false;
                }
                if (j7 <= 0) {
                    if (j10 > 0) {
                    }
                    z9 = false;
                    this.f21650c = z9;
                }
                wait(j7, (int) j9);
                z9 = false;
                this.f21650c = z9;
            } catch (Throwable th) {
                this.f21650c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f21652e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i9 = size - 1;
                ((b) arrayList.get(size)).b();
                if (i9 < 0) {
                    break;
                } else {
                    size = i9;
                }
            }
        }
        ArrayList arrayList2 = this.f21653f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i10 = size2 - 1;
            b bVar = (b) arrayList2.get(size2);
            bVar.b();
            if (bVar.f21645e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i10 >= 0) {
                size2 = i10;
            } else {
                return;
            }
        }
    }

    public final void e(b bVar) {
        j.e(bVar, "taskQueue");
        byte[] bArr = j8.b.f21214a;
        if (bVar.f21644d == null) {
            boolean z8 = !bVar.f21645e.isEmpty();
            ArrayList arrayList = this.f21653f;
            if (z8) {
                j.e(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            } else {
                arrayList.remove(bVar);
            }
        }
        boolean z9 = this.f21650c;
        f fVar = this.f21649a;
        if (z9) {
            fVar.getClass();
            notify();
        } else {
            fVar.getClass();
            k kVar = this.f21654g;
            j.e(kVar, "runnable");
            ((ThreadPoolExecutor) fVar.f12819c).execute(kVar);
        }
    }

    public final b f() {
        int i9;
        synchronized (this) {
            i9 = this.b;
            this.b = i9 + 1;
        }
        return new b(this, j.j(Integer.valueOf(i9), "Q"));
    }
}
