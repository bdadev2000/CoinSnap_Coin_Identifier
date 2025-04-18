package h1;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30729j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f30730a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f30731b;

    /* renamed from: c, reason: collision with root package name */
    public int f30732c;
    public long d;

    /* renamed from: f, reason: collision with root package name */
    public long f30733f;

    /* renamed from: g, reason: collision with root package name */
    public int f30734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f30736i;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public a(b bVar, int i2) {
        this.f30736i = bVar;
        setDaemon(true);
        this.f30730a = new m();
        this.f30731b = new Object();
        this.f30732c = 4;
        this.nextParkedWorker = b.f30740l;
        u0.f.f31370a.getClass();
        this.f30734g = u0.f.f31371b.b();
        f(i2);
    }

    public final h a(boolean z2) {
        h e;
        h e2;
        long j2;
        int i2 = this.f30732c;
        b bVar = this.f30736i;
        h hVar = null;
        m mVar = this.f30730a;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f30738j;
            do {
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f30761b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null || hVar2.f30751b.f30752a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i3 = m.d.get(mVar);
                    int i4 = m.f30762c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f30745g.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f30738j.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f30732c = 1;
        }
        if (z2) {
            boolean z3 = d(bVar.f30741a * 2) == 0;
            if (z3 && (e2 = e()) != null) {
                return e2;
            }
            mVar.getClass();
            h hVar4 = (h) m.f30761b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e = e()) != null) {
                return e;
            }
        } else {
            h e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f30734g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f30734g = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i2;
    }

    public final h e() {
        int d = d(2);
        b bVar = this.f30736i;
        if (d == 0) {
            h hVar = (h) bVar.f30744f.d();
            return hVar != null ? hVar : (h) bVar.f30745g.d();
        }
        h hVar2 = (h) bVar.f30745g.d();
        return hVar2 != null ? hVar2 : (h) bVar.f30744f.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30736i.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f30732c;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f30738j.addAndGet(this.f30736i, 4398046511104L);
        }
        if (i3 != i2) {
            this.f30732c = i2;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h1.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.i(int):h1.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.run():void");
    }
}
