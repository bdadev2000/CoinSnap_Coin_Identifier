package kotlin.jvm.internal;

import b1.a2;
import b1.d1;
import b1.d2;
import b1.f1;
import b1.h1;
import b1.j0;
import b1.k2;
import b1.m0;
import b1.n0;
import b1.o0;
import b1.s1;
import b1.t1;
import b1.y0;
import e1.t0;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f30926a = new Object[0];

    public static Object A(q0.a aVar, j0.c cVar) {
        return G(cVar, h0.m.f30726a, new f1(aVar, null));
    }

    public static void B(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.compose.foundation.text.input.a.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        p0.a.v0(e.class.getName(), classCastException);
        throw classCastException;
    }

    public static final Object[] C(Collection collection) {
        p0.a.s(collection, "collection");
        int size = collection.size();
        Object[] objArr = f30926a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
                p0.a.r(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i3);
                p0.a.r(copyOf, "copyOf(...)");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static final Object[] D(Collection collection, Object[] objArr) {
        Object[] objArr2;
        p0.a.s(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            p0.a.q(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
                p0.a.r(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i3);
                p0.a.r(copyOf, "copyOf(...)");
                return copyOf;
            }
            i2 = i3;
        }
    }

    public static final long E(int i2, a1.c cVar) {
        p0.a.s(cVar, "unit");
        if (cVar.compareTo(a1.c.d) > 0) {
            return F(i2, cVar);
        }
        long H = p0.a.H(i2, cVar, a1.c.f62b) << 1;
        int i3 = a1.a.d;
        int i4 = a1.b.f61a;
        return H;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [w0.j, w0.h] */
    public static final long F(long j2, a1.c cVar) {
        p0.a.s(cVar, "unit");
        a1.c cVar2 = a1.c.f62b;
        long H = p0.a.H(4611686018426999999L, cVar2, cVar);
        if (!new w0.h(-H, H).b(j2)) {
            a1.c cVar3 = a1.c.f63c;
            p0.a.s(cVar3, "targetUnit");
            return k(p0.a.B(cVar3.f68a.convert(j2, cVar.f68a), -4611686018427387903L, 4611686018427387903L));
        }
        long H2 = p0.a.H(j2, cVar, cVar2) << 1;
        int i2 = a1.a.d;
        int i3 = a1.b.f61a;
        return H2;
    }

    public static final Object G(h0.g gVar, h0.l lVar, q0.p pVar) {
        Object I;
        h0.l context = gVar.getContext();
        h0.l u2 = !((Boolean) lVar.H(Boolean.FALSE, b1.w.f22385c)).booleanValue() ? context.u(lVar) : p0.a.g0(context, lVar, false);
        l(u2);
        if (u2 == context) {
            g1.y yVar = new g1.y(gVar, u2);
            I = t0.A(yVar, yVar, pVar);
        } else {
            h0.h hVar = h0.h.f30725a;
            if (p0.a.g(u2.i(hVar), context.i(hVar))) {
                k2 k2Var = new k2(gVar, u2);
                h0.l lVar2 = k2Var.f22283c;
                Object e = g1.a.e(lVar2, null);
                try {
                    Object A = t0.A(k2Var, k2Var, pVar);
                    g1.a.b(lVar2, e);
                    I = A;
                } catch (Throwable th) {
                    g1.a.b(lVar2, e);
                    throw th;
                }
            } else {
                g1.y yVar2 = new g1.y(gVar, u2);
                t0.z(pVar, yVar2, yVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m0.f22345f;
                    int i2 = atomicIntegerFieldUpdater.get(yVar2);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                        I = b1.f0.I(yVar2.T());
                        if (I instanceof b1.u) {
                            throw ((b1.u) I).f22378a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(yVar2, 0, 1)) {
                        I = i0.a.f30806a;
                        break;
                    }
                }
            }
        }
        i0.a aVar = i0.a.f30806a;
        return I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.l, b1.n2, h0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(h0.g r7) {
        /*
            h0.l r0 = r7.getContext()
            l(r0)
            h0.g r7 = b1.f0.r(r7)
            boolean r1 = r7 instanceof g1.i
            r2 = 0
            if (r1 == 0) goto L13
            g1.i r7 = (g1.i) r7
            goto L14
        L13:
            r7 = r2
        L14:
            d0.b0 r1 = d0.b0.f30125a
            if (r7 != 0) goto L1a
        L18:
            r7 = r1
            goto L7c
        L1a:
            b1.z r3 = r7.d
            boolean r4 = r3.j0(r0)
            r5 = 1
            if (r4 == 0) goto L2b
            r7.f30617g = r1
            r7.f22348c = r5
            r3.i0(r0, r7)
            goto L7a
        L2b:
            b1.n2 r4 = new b1.n2
            b1.a0 r6 = b1.n2.f22353c
            r4.<init>(r6)
            h0.l r0 = r0.u(r4)
            r7.f30617g = r1
            r7.f22348c = r5
            r3.i0(r0, r7)
            boolean r0 = r4.f22354b
            if (r0 == 0) goto L7a
            b1.y0 r0 = b1.d2.a()
            e0.n r3 = r0.f22398f
            if (r3 == 0) goto L18
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L50
            goto L18
        L50:
            boolean r3 = r0.p0()
            if (r3 == 0) goto L60
            r7.f30617g = r1
            r7.f22348c = r5
            r0.m0(r7)
            i0.a r7 = i0.a.f30806a
            goto L7c
        L60:
            r0.o0(r5)
            r7.run()     // Catch: java.lang.Throwable -> L70
        L66:
            boolean r3 = r0.r0()     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L66
        L6c:
            r0.l0(r5)
            goto L18
        L70:
            r3 = move-exception
            r7.f(r3, r2)     // Catch: java.lang.Throwable -> L75
            goto L6c
        L75:
            r7 = move-exception
            r0.l0(r5)
            throw r7
        L7a:
            i0.a r7 = i0.a.f30806a
        L7c:
            i0.a r0 = i0.a.f30806a
            if (r7 != r0) goto L81
            return r7
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.e.H(h0.g):java.lang.Object");
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(e1.k1 r4, q0.q r5, java.lang.Throwable r6, h0.g r7) {
        /*
            boolean r0 = r7 instanceof e1.n
            if (r0 == 0) goto L13
            r0 = r7
            e1.n r0 = (e1.n) r0
            int r1 = r0.f30307c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30307c = r1
            goto L18
        L13:
            e1.n r0 = new e1.n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30306b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30307c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f30305a
            kotlin.jvm.internal.q.m(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.jvm.internal.q.m(r7)
            r0.f30305a = r6     // Catch: java.lang.Throwable -> L29
            r0.f30307c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            d0.b0 r1 = d0.b0.f30125a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            kotlin.jvm.internal.q.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.e.b(e1.k1, q0.q, java.lang.Throwable, h0.g):java.lang.Object");
    }

    public static Collection c(AbstractSet abstractSet) {
        if (!(abstractSet instanceof r0.a) || (abstractSet instanceof r0.b)) {
            return abstractSet;
        }
        B(abstractSet, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List d(Object obj) {
        if ((obj instanceof r0.a) && !(obj instanceof r0.c)) {
            B(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            p0.a.v0(e.class.getName(), e);
            throw e;
        }
    }

    public static Map e(AbstractMap abstractMap) {
        if (!(abstractMap instanceof r0.a) || (abstractMap instanceof r0.e)) {
            return abstractMap;
        }
        B(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [b1.j0, b1.a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static j0 f(b1.d0 d0Var, c1.e eVar, q0.p pVar, int i2) {
        h0.l lVar = eVar;
        if ((i2 & 1) != 0) {
            lVar = h0.m.f30726a;
        }
        int i3 = (i2 & 2) != 0 ? 1 : 0;
        h0.l q02 = p0.a.q0(d0Var, lVar);
        ?? s1Var = i3 == 2 ? new s1(q02, pVar) : new b1.a(q02, true);
        s1Var.o0(i3, s1Var, pVar);
        return s1Var;
    }

    public static void g(int i2, Object obj) {
        if (obj == null || r(i2, obj)) {
            return;
        }
        B(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final void h(h0.l lVar, CancellationException cancellationException) {
        h1 h1Var = (h1) lVar.i(b1.a0.f22285b);
        if (h1Var != null) {
            h1Var.a(cancellationException);
        }
    }

    public static final Object i(h1 h1Var, h0.g gVar) {
        h1Var.a(null);
        Object v2 = h1Var.v(gVar);
        return v2 == i0.a.f30806a ? v2 : d0.b0.f30125a;
    }

    public static final void j(d1.r rVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = a("Channel was consumed, consumer had failed", th);
            }
        }
        rVar.a(r0);
    }

    public static final long k(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = a1.a.d;
        int i3 = a1.b.f61a;
        return j3;
    }

    public static final void l(h0.l lVar) {
        h1 h1Var = (h1) lVar.i(b1.a0.f22285b);
        if (h1Var != null && !h1Var.isActive()) {
            throw h1Var.n();
        }
    }

    public static final h1 m(h0.l lVar) {
        h1 h1Var = (h1) lVar.i(b1.a0.f22285b);
        if (h1Var != null) {
            return h1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + lVar).toString());
    }

    public static final b1.l n(h0.g gVar) {
        b1.l lVar;
        b1.l lVar2;
        if (!(gVar instanceof g1.i)) {
            return new b1.l(1, gVar);
        }
        g1.i iVar = (g1.i) gVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.i.f30615i;
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            android.support.v4.media.session.i iVar2 = g1.a.d;
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(iVar, iVar2);
                lVar2 = null;
                break;
            }
            if (obj instanceof b1.l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, iVar2)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                        break;
                    }
                }
                lVar2 = (b1.l) obj;
                break loop0;
            }
            if (obj != iVar2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b1.l.f22338h;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof b1.t) || ((b1.t) obj2).d == null) {
                b1.l.f22337g.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b1.b.f22287a);
                lVar = lVar2;
            } else {
                lVar2.k();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new b1.l(2, gVar);
    }

    public static final void o(h0.l lVar, Throwable th) {
        try {
            b1.b0 b0Var = (b1.b0) lVar.i(b1.a0.f22284a);
            if (b0Var != null) {
                b0Var.F(lVar, th);
            } else {
                t0.o(lVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                q.a(runtimeException, th);
                th = runtimeException;
            }
            t0.o(lVar, th);
        }
    }

    public static final boolean p(h0.l lVar) {
        h1 h1Var = (h1) lVar.i(b1.a0.f22285b);
        if (h1Var != null) {
            return h1Var.isActive();
        }
        return true;
    }

    public static final boolean q(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static boolean r(int i2, Object obj) {
        if (obj instanceof d0.c) {
            return (obj instanceof m ? ((m) obj).getArity() : obj instanceof q0.a ? 0 : obj instanceof q0.l ? 1 : obj instanceof q0.p ? 2 : obj instanceof q0.q ? 3 : obj instanceof q0.r ? 4 : obj instanceof q0.s ? 5 : obj instanceof q0.t ? 6 : obj instanceof q0.u ? 7 : obj instanceof q0.v ? 8 : obj instanceof q0.w ? 9 : obj instanceof q0.b ? 10 : obj instanceof q0.c ? 11 : obj instanceof q0.e ? 13 : obj instanceof q0.f ? 14 : obj instanceof q0.g ? 15 : obj instanceof q0.h ? 16 : obj instanceof q0.i ? 17 : obj instanceof q0.j ? 18 : obj instanceof q0.k ? 19 : obj instanceof q0.m ? 20 : obj instanceof q0.n ? 21 : -1) == i2;
        }
        return false;
    }

    public static boolean s(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof r0.a) || (obj instanceof r0.d));
    }

    public static final e0.c t(Object[] objArr) {
        p0.a.s(objArr, "array");
        return new e0.c(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h0.g, y0.k, java.lang.Object] */
    public static y0.k u(q0.p pVar) {
        p0.a.s(pVar, "block");
        ?? obj = new Object();
        obj.d = b1.f0.j(obj, obj, pVar);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [b1.a2, b1.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static a2 v(b1.d0 d0Var, h0.l lVar, int i2, q0.p pVar, int i3) {
        if ((i3 & 1) != 0) {
            lVar = h0.m.f30726a;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        h0.l q02 = p0.a.q0(d0Var, lVar);
        ?? t1Var = i2 == 2 ? new t1(q02, pVar) : new b1.a(q02, true);
        t1Var.o0(i2, t1Var, pVar);
        return t1Var;
    }

    public static final int w(u0.e eVar, w0.g gVar) {
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + gVar);
        }
        int i2 = gVar.f31406a;
        int i3 = gVar.f31407b;
        if (i3 < Integer.MAX_VALUE) {
            return u0.f.f31371b.d(i2, i3 + 1);
        }
        if (i2 <= Integer.MIN_VALUE) {
            return u0.f.f31371b.b();
        }
        return u0.f.f31371b.d(i2 - 1, i3) + 1;
    }

    public static final Object x(Object obj) {
        return obj instanceof b1.u ? q.d(((b1.u) obj).f22378a) : obj;
    }

    public static final void y(n0 n0Var, h0.g gVar, boolean z2) {
        Object g2 = n0Var.g();
        Throwable d = n0Var.d(g2);
        Object d2 = d != null ? q.d(d) : n0Var.e(g2);
        if (!z2) {
            gVar.resumeWith(d2);
            return;
        }
        p0.a.q(gVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        g1.i iVar = (g1.i) gVar;
        h0.g gVar2 = iVar.f30616f;
        h0.l context = gVar2.getContext();
        Object e = g1.a.e(context, iVar.f30618h);
        k2 G0 = e != g1.a.f30591f ? p0.a.G0(gVar2, context, e) : null;
        try {
            gVar2.resumeWith(d2);
        } finally {
            if (G0 == null || G0.p0()) {
                g1.a.b(context, e);
            }
        }
    }

    public static final Object z(h0.l lVar, q0.p pVar) {
        y0 y0Var;
        h0.l g02;
        Thread currentThread = Thread.currentThread();
        h0.k kVar = h0.h.f30725a;
        h0.i iVar = (h0.i) lVar.i(kVar);
        h0.m mVar = h0.m.f30726a;
        if (iVar == null) {
            y0Var = d2.a();
            g02 = p0.a.g0(mVar, lVar.u(y0Var), true);
            h1.d dVar = o0.f22355a;
            if (g02 != dVar && g02.i(kVar) == null) {
                g02 = g02.u(dVar);
            }
        } else {
            if (iVar instanceof y0) {
            }
            y0Var = (y0) d2.f22296a.get();
            g02 = p0.a.g0(mVar, lVar, true);
            h1.d dVar2 = o0.f22355a;
            if (g02 != dVar2 && g02.i(kVar) == null) {
                g02 = g02.u(dVar2);
            }
        }
        b1.g gVar = new b1.g(g02, currentThread, y0Var);
        gVar.o0(1, gVar, pVar);
        y0 y0Var2 = gVar.f22319f;
        if (y0Var2 != null) {
            int i2 = y0.f22396g;
            y0Var2.o0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long q02 = y0Var2 != null ? y0Var2.q0() : Long.MAX_VALUE;
                if (!(gVar.T() instanceof d1)) {
                    if (y0Var2 != null) {
                        int i3 = y0.f22396g;
                        y0Var2.l0(false);
                    }
                    Object I = b1.f0.I(gVar.T());
                    b1.u uVar = I instanceof b1.u ? (b1.u) I : null;
                    if (uVar == null) {
                        return I;
                    }
                    throw uVar.f22378a;
                }
                LockSupport.parkNanos(gVar, q02);
            } catch (Throwable th) {
                if (y0Var2 != null) {
                    int i4 = y0.f22396g;
                    y0Var2.l0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gVar.w(interruptedException);
        throw interruptedException;
    }
}
