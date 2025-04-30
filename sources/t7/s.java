package T7;

import t7.y;
import x7.EnumC2928a;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.a f3081a = new H0.a("NONE", 2);
    public static final H0.a b = new H0.a("PENDING", 2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [G7.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable a(T7.b r5, T7.c r6, w7.f r7) {
        /*
            boolean r0 = r7 instanceof T7.f
            if (r0 == 0) goto L13
            r0 = r7
            T7.f r0 = (T7.f) r0
            int r1 = r0.f3048h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3048h = r1
            goto L18
        L13:
            T7.f r0 = new T7.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3047g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f3048h
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            G7.r r5 = r0.f3046f
            t7.AbstractC2712a.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            r1 = r6
            goto L52
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            t7.AbstractC2712a.f(r7)
            G7.r r7 = new G7.r
            r7.<init>()
            T7.h r2 = new T7.h     // Catch: java.lang.Throwable -> L4f
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.f3046f = r7     // Catch: java.lang.Throwable -> L4f
            r0.f3048h = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.k(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            goto L91
        L4d:
            r1 = 0
            goto L91
        L4f:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.b
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5e
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L8e
        L5e:
            w7.k r6 = r0.f24446c
            G7.j.b(r6)
            Q7.u r7 = Q7.C0252u.f2584c
            w7.i r6 = r6.h(r7)
            Q7.U r6 = (Q7.U) r6
            if (r6 == 0) goto L8f
            Q7.d0 r6 = (Q7.d0) r6
            java.lang.Object r7 = r6.F()
            boolean r0 = r7 instanceof Q7.C0247o
            if (r0 != 0) goto L83
            boolean r0 = r7 instanceof Q7.b0
            if (r0 == 0) goto L8f
            Q7.b0 r7 = (Q7.b0) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L8f
        L83:
            java.util.concurrent.CancellationException r6 = r6.A()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L8e
            goto L8f
        L8e:
            throw r1
        L8f:
            if (r5 != 0) goto L92
        L91:
            return r1
        L92:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L9a
            t7.AbstractC2712a.a(r5, r1)
            throw r5
        L9a:
            t7.AbstractC2712a.a(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.s.a(T7.b, T7.c, w7.f):java.io.Serializable");
    }

    public static final Object b(b bVar, F7.p pVar, w7.f fVar) {
        int i9 = l.f3067a;
        k kVar = new k(pVar, null);
        w7.l lVar = w7.l.b;
        S7.a aVar = S7.a.b;
        Object k6 = ((U7.k) new U7.k(kVar, bVar, lVar, -2, aVar).v(lVar, 0, aVar)).k(U7.o.b, fVar);
        EnumC2928a enumC2928a = EnumC2928a.b;
        y yVar = y.f23029a;
        if (k6 != enumC2928a) {
            k6 = yVar;
        }
        if (k6 == enumC2928a) {
            return k6;
        }
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:23:0x0078, B:25:0x007e, B:28:0x008f, B:29:0x0097, B:30:0x0098, B:31:0x00a3, B:39:0x0048, B:41:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T7.d, w7.f] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v13, types: [S7.b] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T7.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v4, types: [S7.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [S7.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(T7.c r8, S7.o r9, boolean r10, w7.f r11) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.s.c(T7.c, S7.o, boolean, w7.f):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [G7.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(T7.b r6, w7.f r7) {
        /*
            boolean r0 = r7 instanceof T7.n
            if (r0 == 0) goto L13
            r0 = r7
            T7.n r0 = (T7.n) r0
            int r1 = r0.f3072i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3072i = r1
            goto L18
        L13:
            T7.n r0 = new T7.n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3071h
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f3072i
            H0.a r3 = U7.p.f3378a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            T7.m r6 = r0.f3070g
            G7.r r0 = r0.f3069f
            t7.AbstractC2712a.f(r7)     // Catch: U7.a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            t7.AbstractC2712a.f(r7)
            G7.r r7 = new G7.r
            r7.<init>()
            r7.b = r3
            T7.m r2 = new T7.m
            r5 = 0
            r2.<init>(r7, r5)
            r0.f3069f = r7     // Catch: U7.a -> L56
            r0.f3070g = r2     // Catch: U7.a -> L56
            r0.f3072i = r4     // Catch: U7.a -> L56
            java.lang.Object r6 = r6.k(r2, r0)     // Catch: U7.a -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            java.lang.Object r1 = r7.b
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.b
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.s.d(T7.b, w7.f):java.lang.Object");
    }
}
