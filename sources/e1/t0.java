package e1;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30345a = new android.support.v4.media.session.i("NO_VALUE");

    /* renamed from: b, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30346b = new android.support.v4.media.session.i("NONE");

    /* renamed from: c, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30347c = new android.support.v4.media.session.i("PENDING");

    public static final Object A(g1.y yVar, g1.y yVar2, q0.p pVar) {
        Object uVar;
        Object a02;
        try {
            kotlin.jvm.internal.e.g(2, pVar);
            uVar = pVar.invoke(yVar2, yVar);
        } catch (Throwable th) {
            uVar = new b1.u(false, th);
        }
        i0.a aVar = i0.a.f30806a;
        if (uVar == aVar || (a02 = yVar.a0(uVar)) == b1.f0.e) {
            return aVar;
        }
        if (a02 instanceof b1.u) {
            throw ((b1.u) a02).f22378a;
        }
        return b1.f0.I(a02);
    }

    public static final long B(long j2, long j3, long j4, String str) {
        String str2;
        int i2 = g1.b0.f30594a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        Long K0 = z0.j.K0(str2);
        if (K0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = K0.longValue();
        if (j3 <= longValue && longValue <= j4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
    }

    public static int C(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) B(i2, i3, i4, str);
    }

    public static final Object E(h0.l lVar, Object obj, Object obj2, q0.p pVar, h0.g gVar) {
        Object e = g1.a.e(lVar, obj2);
        try {
            f1.b0 b0Var = new f1.b0(gVar, lVar);
            kotlin.jvm.internal.e.g(2, pVar);
            Object invoke = pVar.invoke(obj, b0Var);
            g1.a.b(lVar, e);
            if (invoke == i0.a.f30806a) {
                p0.a.s(gVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            g1.a.b(lVar, e);
            throw th;
        }
    }

    public static final n1.b0 a(String str, k1.a aVar) {
        return new n1.b0(str, new n1.c0(aVar));
    }

    public static s0 b(int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("replay cannot be negative, but was ", i2).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("extraBufferCapacity cannot be negative, but was ", i3).toString());
        }
        if (i2 <= 0 && i3 <= 0 && i4 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(com.applovin.impl.adview.t.D(i4)).toString());
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return new s0(i2, i6, i4);
    }

    public static final i1 c(Object obj) {
        if (obj == null) {
            obj = f1.c.f30458b;
        }
        return new i1(obj);
    }

    public static final void d(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final Object e(Task task, j0.c cVar) {
        if (!task.isComplete()) {
            b1.l lVar = new b1.l(1, b1.f0.r(cVar));
            lVar.p();
            task.addOnCompleteListener(j1.a.f30861a, new j1.b(lVar));
            Object o2 = lVar.o();
            i0.a aVar = i0.a.f30806a;
            return o2;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final g.i0 f(q0.l lVar, Object obj, h0.l lVar2) {
        return new g.i0(lVar, 4, obj, lVar2);
    }

    public static final l1.g g(String str, l1.f[] fVarArr, q0.l lVar) {
        if (!(!z0.m.Z0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        l1.a aVar = new l1.a(str);
        lVar.invoke(aVar);
        return new l1.g(str, l1.c.f31020b, aVar.f31013c.size(), e0.q.n0(fVarArr), aVar);
    }

    public static final l1.g h(String str, l1.l lVar, l1.f[] fVarArr, q0.l lVar2) {
        p0.a.s(str, "serialName");
        p0.a.s(lVar2, "builder");
        if (!(!z0.m.Z0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!p0.a.g(lVar, l1.c.f31020b))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        l1.a aVar = new l1.a(str);
        lVar2.invoke(aVar);
        return new l1.g(str, lVar, aVar.f31013c.size(), e0.q.n0(fVarArr), aVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.RuntimeException, d0.e] */
    public static final d0.e i(q0.l lVar, Object obj, d0.e eVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (eVar == null || eVar.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            kotlin.jvm.internal.q.a(eVar, th);
        }
        return eVar;
    }

    public static final void j(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Expected positive parallelism level, but got ", i2).toString());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:49|(1:(2:51|(1:54)(1:53))(2:116|117))|(9:105|106|107|108|109|110|111|(10:74|75|(1:(3:77|(1:100)(1:(1:83)(2:80|81))|82)(2:101|(1:103)))|84|(2:86|(7:88|89|90|91|(2:93|94)|96|94))|99|91|(0)|96|94)(1:61)|(1:73)(2:63|(2:69|70)(2:71|72)))|56|57|(1:59)|74|75|(2:(0)(0)|82)|84|(0)|99|91|(0)|96|94|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ce, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0148, code lost:
    
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00fd, code lost:
    
        if (r12 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7 A[Catch: NoSuchFieldException -> 0x01ce, TryCatch #2 {NoSuchFieldException -> 0x01ce, blocks: (B:75:0x01ab, B:77:0x01b7, B:86:0x01d5, B:82:0x01cb), top: B:74:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5 A[Catch: NoSuchFieldException -> 0x01ce, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01ce, blocks: (B:75:0x01ab, B:77:0x01b7, B:86:0x01d5, B:82:0x01cb), top: B:74:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7 A[Catch: NoSuchFieldException -> 0x01ea, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x01ea, blocks: (B:90:0x01dc, B:91:0x01e3, B:93:0x01e7), top: B:89:0x01dc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k1.a k(x0.c r16, k1.a... r17) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.t0.k(x0.c, k1.a[]):k1.a");
    }

    public static final x0.c l(l1.f fVar) {
        p0.a.s(fVar, "<this>");
        if (fVar instanceof l1.b) {
            return ((l1.b) fVar).f31017b;
        }
        if (fVar instanceof n1.d1) {
            return l(((n1.d1) fVar).f31062a);
        }
        return null;
    }

    public static final k1.a m(k1.a aVar) {
        return aVar.b().b() ? aVar : new n1.s0(aVar);
    }

    public static final g1.z n(Object obj) {
        if (obj != g1.a.f30589b) {
            return (g1.z) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void o(h0.l lVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = g1.g.f30609a.iterator();
        while (it.hasNext()) {
            try {
                ((b1.b0) it.next()).F(lVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    kotlin.jvm.internal.q.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            kotlin.jvm.internal.q.a(th, new g1.h(lVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final int p(l1.f fVar, l1.f[] fVarArr) {
        p0.a.s(fVar, "<this>");
        p0.a.s(fVarArr, "typeParams");
        int hashCode = (fVar.g().hashCode() * 31) + Arrays.hashCode(fVarArr);
        l1.h hVar = new l1.h(fVar, 0);
        int i2 = 1;
        int i3 = 1;
        while (hVar.hasNext()) {
            int i4 = i3 * 31;
            String g2 = ((l1.f) hVar.next()).g();
            i3 = i4 + (g2 != null ? g2.hashCode() : 0);
        }
        l1.h hVar2 = new l1.h(fVar, 0);
        while (hVar2.hasNext()) {
            int i5 = i2 * 31;
            l1.l c2 = ((l1.f) hVar2.next()).c();
            i2 = i5 + (c2 != null ? c2.hashCode() : 0);
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }

    public static final k1.a q(Object obj, k1.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = k1.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof k1.a) {
                return (k1.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean r(Object obj) {
        return obj == g1.a.f30589b;
    }

    public static final k1.a s(x0.c cVar, ArrayList arrayList, k1.f fVar) {
        k1.a cVar2;
        k1.a c1Var;
        k1.a h1Var;
        p0.a.s(cVar, "<this>");
        if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(Collection.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(List.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(List.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(ArrayList.class))) {
            cVar2 = new n1.c((k1.a) arrayList.get(0), 0);
        } else if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(HashSet.class))) {
            cVar2 = new n1.c((k1.a) arrayList.get(0), 1);
        } else if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(Set.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(Set.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(LinkedHashSet.class))) {
            cVar2 = new n1.c((k1.a) arrayList.get(0), 2);
        } else if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(HashMap.class))) {
            cVar2 = new n1.a0((k1.a) arrayList.get(0), (k1.a) arrayList.get(1), 0);
        } else if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(Map.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(Map.class)) || p0.a.g(cVar, kotlin.jvm.internal.g0.a(LinkedHashMap.class))) {
            cVar2 = new n1.a0((k1.a) arrayList.get(0), (k1.a) arrayList.get(1), 1);
        } else {
            if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(Map.Entry.class))) {
                k1.a aVar = (k1.a) arrayList.get(0);
                k1.a aVar2 = (k1.a) arrayList.get(1);
                p0.a.s(aVar, "keySerializer");
                p0.a.s(aVar2, "valueSerializer");
                c1Var = new n1.l0(aVar, aVar2, 0);
            } else {
                if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(d0.k.class))) {
                    k1.a aVar3 = (k1.a) arrayList.get(0);
                    k1.a aVar4 = (k1.a) arrayList.get(1);
                    p0.a.s(aVar3, "keySerializer");
                    p0.a.s(aVar4, "valueSerializer");
                    h1Var = new n1.l0(aVar3, aVar4, 1);
                } else if (p0.a.g(cVar, kotlin.jvm.internal.g0.a(d0.q.class))) {
                    k1.a aVar5 = (k1.a) arrayList.get(0);
                    k1.a aVar6 = (k1.a) arrayList.get(1);
                    k1.a aVar7 = (k1.a) arrayList.get(2);
                    p0.a.s(aVar5, "aSerializer");
                    p0.a.s(aVar6, "bSerializer");
                    p0.a.s(aVar7, "cSerializer");
                    h1Var = new n1.h1(aVar5, aVar6, aVar7);
                } else if (p0.a.i0(cVar).isArray()) {
                    Object invoke = fVar.invoke();
                    p0.a.q(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    k1.a aVar8 = (k1.a) arrayList.get(0);
                    p0.a.s(aVar8, "elementSerializer");
                    c1Var = new n1.c1((x0.c) invoke, aVar8);
                } else {
                    cVar2 = null;
                }
                cVar2 = h1Var;
            }
            cVar2 = c1Var;
        }
        if (cVar2 != null) {
            return cVar2;
        }
        k1.a[] aVarArr = (k1.a[]) arrayList.toArray(new k1.a[0]);
        return k(cVar, (k1.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public static final Object t(Object obj, Object obj2) {
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

    public static final k1.a u(x0.c cVar) {
        p0.a.s(cVar, "<this>");
        k1.a x = x(cVar);
        if (x != null) {
            return x;
        }
        n1.v0.d(cVar);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k1.a v(o1.a r5, x0.o r6, boolean r7) {
        /*
            x0.c r0 = n1.v0.c(r6)
            n1.f0 r6 = (n1.f0) r6
            boolean r1 = r6.c()
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = e0.q.M(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            r4 = 0
            if (r3 != 0) goto La7
            boolean r6 = r2.isEmpty()
            java.lang.String r3 = "clazz"
            if (r6 == 0) goto L47
            n1.m r6 = k1.i.f30908a
            p0.a.s(r0, r3)
            if (r1 != 0) goto L40
            n1.m r6 = k1.i.f30908a
            k1.a r6 = r6.a(r0)
            if (r6 == 0) goto L3e
            goto L62
        L3e:
            r6 = r4
            goto L62
        L40:
            n1.m r6 = k1.i.f30909b
            k1.a r6 = r6.a(r0)
            goto L62
        L47:
            n1.m r6 = k1.i.f30908a
            p0.a.s(r0, r3)
            if (r1 != 0) goto L55
            n1.o r6 = k1.i.f30910c
            java.lang.Object r6 = r6.a(r0, r2)
            goto L5b
        L55:
            n1.o r6 = k1.i.d
            java.lang.Object r6 = r6.a(r0, r2)
        L5b:
            boolean r3 = r6 instanceof d0.m
            if (r3 == 0) goto L60
            r6 = r4
        L60:
            k1.a r6 = (k1.a) r6
        L62:
            if (r6 == 0) goto L65
            return r6
        L65:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L7e
            r5.getClass()
            java.lang.String r6 = "kClass"
            p0.a.s(r0, r6)
            java.util.Map r5 = r5.f31204a
            java.lang.Object r5 = r5.get(r0)
            android.support.v4.media.d.C(r5)
        L7c:
            r6 = r4
            goto L9b
        L7e:
            java.util.ArrayList r6 = y(r5, r2, r7)
            if (r6 != 0) goto L85
            return r4
        L85:
            k1.f r7 = new k1.f
            r3 = 2
            r7.<init>(r2, r3)
            k1.a r6 = s(r0, r6, r7)
            if (r6 != 0) goto L9b
            java.util.Map r5 = r5.f31204a
            java.lang.Object r5 = r5.get(r0)
            android.support.v4.media.d.C(r5)
            goto L7c
        L9b:
            if (r6 == 0) goto La6
            if (r1 == 0) goto La5
            k1.a r5 = m(r6)
            r4 = r5
            goto La6
        La5:
            r4 = r6
        La6:
            return r4
        La7:
            java.lang.Object r5 = r6.next()
            android.support.v4.media.d.C(r5)
            java.lang.String r5 = "<this>"
            p0.a.s(r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.t0.v(o1.a, x0.o, boolean):k1.a");
    }

    public static final k1.a w(o1.a aVar, x0.o oVar) {
        p0.a.s(aVar, "<this>");
        p0.a.s(oVar, "type");
        return v(aVar, oVar, false);
    }

    public static final k1.a x(x0.c cVar) {
        p0.a.s(cVar, "<this>");
        k1.a k2 = k(cVar, new k1.a[0]);
        return k2 == null ? (k1.a) n1.b1.f31056a.get(cVar) : k2;
    }

    public static final ArrayList y(o1.a aVar, List list, boolean z2) {
        ArrayList arrayList;
        p0.a.s(aVar, "<this>");
        p0.a.s(list, "typeArguments");
        if (z2) {
            List<x0.o> list2 = list;
            arrayList = new ArrayList(e0.q.M(list2, 10));
            for (x0.o oVar : list2) {
                p0.a.s(oVar, "type");
                k1.a v2 = v(aVar, oVar, true);
                if (v2 == null) {
                    x0.c c2 = n1.v0.c(oVar);
                    p0.a.s(c2, "<this>");
                    n1.v0.d(c2);
                    throw null;
                }
                arrayList.add(v2);
            }
        } else {
            List list3 = list;
            arrayList = new ArrayList(e0.q.M(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                k1.a w = w(aVar, (x0.o) it.next());
                if (w == null) {
                    return null;
                }
                arrayList.add(w);
            }
        }
        return arrayList;
    }

    public static void z(q0.p pVar, b1.a aVar, b1.a aVar2) {
        try {
            g1.a.c(b1.f0.r(b1.f0.j(aVar, aVar2, pVar)), d0.b0.f30125a, null);
        } catch (Throwable th) {
            aVar2.resumeWith(kotlin.jvm.internal.q.d(th));
            throw th;
        }
    }
}
