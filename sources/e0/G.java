package e0;

import Q7.AbstractC0255x;
import Q7.C0247o;
import Q7.C0252u;
import Q7.InterfaceC0253v;
import Q7.P;
import Q7.T;
import Q7.U;
import Q7.Z;
import Q7.d0;
import h0.C2315e;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import t7.AbstractC2712a;
import t7.C2724m;
import u7.AbstractC2816g;

/* loaded from: classes.dex */
public final class G implements InterfaceC2208i {

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f19951j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f19952k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final F7.a f19953a;
    public final h0.j b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2201b f19954c;

    /* renamed from: d, reason: collision with root package name */
    public final E1.c f19955d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19956e;

    /* renamed from: f, reason: collision with root package name */
    public final C2724m f19957f;

    /* renamed from: g, reason: collision with root package name */
    public final T7.r f19958g;

    /* renamed from: h, reason: collision with root package name */
    public List f19959h;

    /* renamed from: i, reason: collision with root package name */
    public final U4.y f19960i;

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, U4.y] */
    public G(C2315e c2315e, List list, InterfaceC2201b interfaceC2201b, InterfaceC0253v interfaceC0253v) {
        h0.j jVar = h0.j.f20580a;
        G7.j.e(interfaceC0253v, "scope");
        this.f19953a = c2315e;
        this.b = jVar;
        this.f19954c = interfaceC2201b;
        this.f19955d = new E1.c(new u(this, null), 19);
        this.f19956e = ".tmp";
        this.f19957f = AbstractC2712a.d(new a8.e(this, 3));
        this.f19958g = new T7.r(I.f19961a);
        this.f19959h = AbstractC2816g.T(list);
        G7.w wVar = new G7.w(this, 8);
        r rVar = new r(this, null);
        G7.j.e(interfaceC0253v, "scope");
        ?? obj = new Object();
        obj.f3334a = interfaceC0253v;
        obj.b = rVar;
        obj.f3335c = S7.j.a(Integer.MAX_VALUE, null, 6);
        obj.f3336d = new AtomicInteger(0);
        U u8 = (U) interfaceC0253v.k().h(C0252u.f2584c);
        if (u8 != null) {
            ((d0) u8).J(false, true, new V7.p(wVar, obj));
        }
        this.f19960i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(e0.G r8, e0.n r9, w7.f r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.b(e0.G, e0.n, w7.f):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q7.m, Q7.d0] */
    @Override // e0.InterfaceC2208i
    public final Object a(F7.p pVar, w7.f fVar) {
        Object F4;
        ?? d0Var = new d0(true);
        d0Var.I(null);
        this.f19960i.h(new n(pVar, d0Var, (H) this.f19958g.getValue(), fVar.getContext()));
        do {
            F4 = d0Var.F();
            if (!(F4 instanceof P)) {
                if (!(F4 instanceof C0247o)) {
                    return AbstractC0255x.q(F4);
                }
                throw ((C0247o) F4).f2575a;
            }
        } while (d0Var.S(F4) < 0);
        Z z8 = new Z(F2.h.x(fVar), d0Var);
        z8.t();
        z8.v(new Q7.H(d0Var.J(false, true, new T(z8, 1)), 0));
        return z8.s();
    }

    public final File c() {
        return (File) this.f19957f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v8, types: [G7.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(w7.f r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.d(w7.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(w7.f r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.z
            if (r0 == 0) goto L13
            r0 = r5
            e0.z r0 = (e0.z) r0
            int r1 = r0.f20022i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20022i = r1
            goto L18
        L13:
            e0.z r0 = new e0.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20020g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f20022i
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e0.G r0 = r0.f20019f
            t7.AbstractC2712a.f(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            t7.AbstractC2712a.f(r5)
            r0.f20019f = r4     // Catch: java.lang.Throwable -> L44
            r0.f20022i = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            t7.y r5 = t7.y.f23029a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            T7.r r0 = r0.f19958g
            e0.k r1 = new e0.k
            r1.<init>(r5)
            r0.getClass()
            r2 = 0
            r0.c(r2, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.e(w7.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(w7.f r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.C2199A
            if (r0 == 0) goto L13
            r0 = r5
            e0.A r0 = (e0.C2199A) r0
            int r1 = r0.f19925i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19925i = r1
            goto L18
        L13:
            e0.A r0 = new e0.A
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19923g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f19925i
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e0.G r0 = r0.f19922f
            t7.AbstractC2712a.f(r5)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            t7.AbstractC2712a.f(r5)
            r0.f19922f = r4     // Catch: java.lang.Throwable -> L41
            r0.f19925i = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L51
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            T7.r r0 = r0.f19958g
            e0.k r1 = new e0.k
            r1.<init>(r5)
            r0.getClass()
            r5 = 0
            r0.c(r5, r1)
        L51:
            t7.y r5 = t7.y.f23029a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.f(w7.f):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [e0.G] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.B] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [e0.G] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(w7.f r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0.B
            if (r0 == 0) goto L13
            r0 = r5
            e0.B r0 = (e0.B) r0
            int r1 = r0.f19930j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19930j = r1
            goto L18
        L13:
            e0.B r0 = new e0.B
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19928h
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f19930j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f19927g
            e0.G r0 = r0.f19926f
            t7.AbstractC2712a.f(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            t7.AbstractC2712a.f(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            h0.j r2 = r4.b     // Catch: java.lang.Throwable -> L5e
            r0.f19926f = r4     // Catch: java.lang.Throwable -> L5e
            r0.f19927g = r5     // Catch: java.lang.Throwable -> L5e
            r0.f19930j = r3     // Catch: java.lang.Throwable -> L5e
            h0.b r0 = r2.a(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            android.support.v4.media.session.a.f(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L68
        L5a:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L60
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            android.support.v4.media.session.a.f(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7d
            h0.j r5 = r0.b
            r5.getClass()
            h0.b r5 = new h0.b
            r5.<init>(r3)
            return r5
        L7d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.g(w7.f):java.lang.Object");
    }

    @Override // e0.InterfaceC2208i
    public final T7.b getData() {
        return this.f19955d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(w7.f r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e0.C
            if (r0 == 0) goto L13
            r0 = r8
            e0.C r0 = (e0.C) r0
            int r1 = r0.f19935j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19935j = r1
            goto L18
        L13:
            e0.C r0 = new e0.C
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f19933h
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f19935j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f19932g
            java.lang.Object r0 = r0.f19931f
            e0.a r0 = (e0.C2200a) r0
            t7.AbstractC2712a.f(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f19932g
            e0.a r2 = (e0.C2200a) r2
            java.lang.Object r4 = r0.f19931f
            e0.G r4 = (e0.G) r4
            t7.AbstractC2712a.f(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f19931f
            e0.G r2 = (e0.G) r2
            t7.AbstractC2712a.f(r8)     // Catch: e0.C2200a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            t7.AbstractC2712a.f(r8)
            r0.f19931f = r7     // Catch: e0.C2200a -> L62
            r0.f19935j = r5     // Catch: e0.C2200a -> L62
            java.lang.Object r8 = r7.g(r0)     // Catch: e0.C2200a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            e0.b r5 = r2.f19954c
            r0.f19931f = r2
            r0.f19932g = r8
            r0.f19935j = r4
            java.lang.Object r4 = r5.k(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f19931f = r2     // Catch: java.io.IOException -> L86
            r0.f19932g = r8     // Catch: java.io.IOException -> L86
            r0.f19935j = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            t7.AbstractC2712a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.h(w7.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(F7.p r8, w7.f r9, w7.k r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e0.D
            if (r0 == 0) goto L13
            r0 = r9
            e0.D r0 = (e0.D) r0
            int r1 = r0.f19941k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19941k = r1
            goto L18
        L13:
            e0.D r0 = new e0.D
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f19939i
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f19941k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f19937g
            e0.G r10 = r0.f19936f
            t7.AbstractC2712a.f(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f19938h
            java.lang.Object r10 = r0.f19937g
            e0.c r10 = (e0.C2202c) r10
            e0.G r2 = r0.f19936f
            t7.AbstractC2712a.f(r9)
            goto L6b
        L43:
            t7.AbstractC2712a.f(r9)
            T7.r r9 = r7.f19958g
            java.lang.Object r9 = r9.getValue()
            e0.c r9 = (e0.C2202c) r9
            r9.a()
            e0.E r2 = new e0.E
            java.lang.Object r6 = r9.f19962a
            r2.<init>(r8, r6, r5)
            r0.f19936f = r7
            r0.f19937g = r9
            r0.f19938h = r6
            r0.f19941k = r4
            java.lang.Object r8 = Q7.AbstractC0255x.s(r2, r0, r10)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r7
            r10 = r9
            r9 = r8
            r8 = r6
        L6b:
            r10.a()
            boolean r10 = G7.j.a(r8, r9)
            if (r10 == 0) goto L75
            goto L9b
        L75:
            r0.f19936f = r2
            r0.f19937g = r9
            r0.f19938h = r5
            r0.f19941k = r3
            java.lang.Object r8 = r2.j(r9, r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            r8 = r9
            r10 = r2
        L86:
            T7.r r9 = r10.f19958g
            e0.c r10 = new e0.c
            if (r8 == 0) goto L91
            int r0 = r8.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r8, r0)
            r9.getClass()
            r9.c(r5, r10)
        L9b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.i(F7.p, w7.f, w7.k):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: IOException -> 0x00b8, TryCatch #0 {IOException -> 0x00b8, blocks: (B:15:0x0093, B:19:0x00a1, B:20:0x00b7, B:27:0x00c0, B:28:0x00c3, B:38:0x006c, B:24:0x00be), top: B:7:0x0023, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r9, w7.f r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof e0.F
            if (r1 == 0) goto L15
            r1 = r10
            e0.F r1 = (e0.F) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            e0.F r1 = new e0.F
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f19949j
            x7.a r2 = x7.EnumC2928a.b
            int r3 = r1.l
            t7.y r4 = t7.y.f23029a
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 != r5) goto L36
            java.io.FileOutputStream r9 = r1.f19948i
            java.io.FileOutputStream r2 = r1.f19947h
            java.io.File r3 = r1.f19946g
            e0.G r1 = r1.f19945f
            t7.AbstractC2712a.f(r10)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r9 = move-exception
            goto Lbe
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            t7.AbstractC2712a.f(r10)
            java.io.File r10 = r8.c()
            java.io.File r3 = r10.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L50
            goto L59
        L50:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lce
        L59:
            java.io.File r3 = new java.io.File
            java.io.File r10 = r8.c()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.f19956e
            java.lang.String r10 = G7.j.j(r6, r10)
            r3.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb8
            r10.<init>(r3)     // Catch: java.io.IOException -> Lb8
            h0.j r6 = r8.b     // Catch: java.lang.Throwable -> Lbc
            e0.p r7 = new e0.p     // Catch: java.lang.Throwable -> Lbc
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lbc
            r1.f19945f = r8     // Catch: java.lang.Throwable -> Lbc
            r1.f19946g = r3     // Catch: java.lang.Throwable -> Lbc
            r1.f19947h = r10     // Catch: java.lang.Throwable -> Lbc
            r1.f19948i = r10     // Catch: java.lang.Throwable -> Lbc
            r1.l = r5     // Catch: java.lang.Throwable -> Lbc
            r6.b(r9, r7)     // Catch: java.lang.Throwable -> Lbc
            if (r4 != r2) goto L88
            return r2
        L88:
            r1 = r8
            r9 = r10
            r2 = r9
        L8b:
            java.io.FileDescriptor r9 = r9.getFD()     // Catch: java.lang.Throwable -> L33
            r9.sync()     // Catch: java.lang.Throwable -> L33
            r9 = 0
            android.support.v4.media.session.a.f(r2, r9)     // Catch: java.io.IOException -> Lb8
            java.io.File r9 = r1.c()     // Catch: java.io.IOException -> Lb8
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lb8
            if (r9 == 0) goto La1
            return r4
        La1:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lb8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb8
            r10.<init>(r0)     // Catch: java.io.IOException -> Lb8
            r10.append(r3)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lb8
            r9.<init>(r10)     // Catch: java.io.IOException -> Lb8
            throw r9     // Catch: java.io.IOException -> Lb8
        Lb8:
            r9 = move-exception
            goto Lc4
        Lba:
            r2 = r10
            goto Lbe
        Lbc:
            r9 = move-exception
            goto Lba
        Lbe:
            throw r9     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
            android.support.v4.media.session.a.f(r2, r9)     // Catch: java.io.IOException -> Lb8
            throw r10     // Catch: java.io.IOException -> Lb8
        Lc4:
            boolean r10 = r3.exists()
            if (r10 == 0) goto Lcd
            r3.delete()
        Lcd:
            throw r9
        Lce:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r10 = G7.j.j(r10, r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.G.j(java.lang.Object, w7.f):java.lang.Object");
    }
}
