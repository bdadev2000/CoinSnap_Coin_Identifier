package V7;

import Q7.AbstractC0251t;
import Q7.AbstractC0255x;
import Q7.C0247o;
import Q7.C0248p;
import Q7.C0252u;
import Q7.U;
import Q7.d0;
import Q7.l0;
import Q7.m0;
import Q7.p0;
import com.applovin.impl.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.AbstractC2712a;
import t7.C2722k;
import u7.C2814e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.a f3504a = new H0.a("NO_DECISION", 2);
    public static final H0.a b = new H0.a("CLOSED", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final H0.a f3505c = new H0.a("UNDEFINED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final H0.a f3506d = new H0.a("REUSABLE_CLAIMED", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final H0.a f3507e = new H0.a("CONDITION_FALSE", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final H0.a f3508f = new H0.a("NO_THREAD_ELEMENTS", 2);

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.RuntimeException, G1.a] */
    public static final G1.a a(F7.l lVar, Object obj, G1.a aVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (aVar != null && aVar.getCause() != th) {
                AbstractC2712a.a(aVar, th);
            } else {
                return new RuntimeException(L.i(obj, "Exception in undelivered element handler for "), th);
            }
        }
        return aVar;
    }

    public static final Object b(u uVar, long j7, F7.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f3540d >= j7 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.b.get(uVar);
            H0.a aVar = b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.g(Long.valueOf(uVar.f3540d + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.b;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void d(Throwable th, w7.k kVar) {
        Throwable runtimeException;
        Iterator it = f.f3512a.iterator();
        while (it.hasNext()) {
            try {
                ((R7.b) it.next()).j(th, kVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2712a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC2712a.a(th, new g(kVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == b) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(w7.k kVar, Object obj) {
        if (obj == f3508f) {
            return;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            l0[] l0VarArr = zVar.b;
            int length = l0VarArr.length - 1;
            if (length < 0) {
                return;
            }
            l0 l0Var = l0VarArr[length];
            G7.j.b(null);
            Object obj2 = zVar.f3547a[length];
            throw null;
        }
        Object b8 = kVar.b(null, x.f3544d);
        G7.j.c(b8, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        com.mbridge.msdk.foundation.entity.o.v(b8);
        throw null;
    }

    public static final void h(w7.f fVar, Object obj, F7.l lVar) {
        Object c0247o;
        p0 p0Var;
        if (fVar instanceof h) {
            h hVar = (h) fVar;
            Throwable a6 = C2722k.a(obj);
            if (a6 == null) {
                if (lVar != null) {
                    c0247o = new C0248p(obj, lVar);
                } else {
                    c0247o = obj;
                }
            } else {
                c0247o = new C0247o(false, a6);
            }
            w7.f fVar2 = hVar.f3515g;
            fVar2.getContext();
            AbstractC0251t abstractC0251t = hVar.f3514f;
            if (abstractC0251t.k()) {
                hVar.f3516h = c0247o;
                hVar.f2528d = 1;
                abstractC0251t.j(fVar2.getContext(), hVar);
                return;
            }
            Q7.L a9 = m0.a();
            if (a9.f2535d >= 4294967296L) {
                hVar.f3516h = c0247o;
                hVar.f2528d = 1;
                C2814e c2814e = a9.f2537g;
                if (c2814e == null) {
                    c2814e = new C2814e();
                    a9.f2537g = c2814e;
                }
                c2814e.addLast(hVar);
                return;
            }
            a9.o(true);
            try {
                U u8 = (U) fVar2.getContext().h(C0252u.f2584c);
                if (u8 != null && !u8.isActive()) {
                    CancellationException A8 = ((d0) u8).A();
                    hVar.b(c0247o, A8);
                    hVar.e(AbstractC2712a.b(A8));
                } else {
                    Object obj2 = hVar.f3517i;
                    w7.k context = fVar2.getContext();
                    Object l = l(context, obj2);
                    if (l != f3508f) {
                        p0Var = AbstractC0255x.r(fVar2, context, l);
                    } else {
                        p0Var = null;
                    }
                    try {
                        fVar2.e(obj);
                    } finally {
                        if (p0Var == null || p0Var.Y()) {
                            g(context, l);
                        }
                    }
                }
                do {
                } while (a9.q());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        fVar.e(obj);
    }

    public static final long i(long j7, long j9, long j10, String str) {
        String str2;
        int i9 = w.f3542a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long w2 = O7.n.w(str2);
            if (w2 != null) {
                long longValue = w2.longValue();
                if (j9 <= longValue && longValue <= j10) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j7;
    }

    public static int j(String str, int i9, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return (int) i(i9, i10, i11, str);
    }

    public static final Object k(w7.k kVar) {
        Object b8 = kVar.b(0, x.f3543c);
        G7.j.b(b8);
        return b8;
    }

    public static final Object l(w7.k kVar, Object obj) {
        if (obj == null) {
            obj = k(kVar);
        }
        if (obj == 0) {
            return f3508f;
        }
        if (obj instanceof Integer) {
            return kVar.b(new z(((Number) obj).intValue(), kVar), x.f3545f);
        }
        com.mbridge.msdk.foundation.entity.o.v(obj);
        throw null;
    }
}
