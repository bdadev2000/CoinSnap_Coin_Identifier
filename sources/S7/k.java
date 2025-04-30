package S7;

import V7.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class k extends u {

    /* renamed from: g, reason: collision with root package name */
    public final c f2843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2844h;

    public k(long j7, k kVar, c cVar, int i9) {
        super(j7, kVar, i9);
        this.f2843g = cVar;
        this.f2844h = new AtomicReferenceArray(e.b * 2);
    }

    @Override // V7.u
    public final int f() {
        return e.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        G7.j.b(r5);
        r7 = r5.f2821c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = V7.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        Q7.AbstractC0255x.i(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // V7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, w7.k r8) {
        /*
            r6 = this;
            int r0 = S7.e.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f2844h
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof Q7.r0
            r4 = 0
            S7.c r5 = r6.f2843g
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof S7.s
            if (r3 == 0) goto L22
            goto L71
        L22:
            H0.a r3 = S7.e.f2831j
            if (r2 == r3) goto L5b
            H0.a r3 = S7.e.f2832k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            H0.a r3 = S7.e.f2828g
            if (r2 == r3) goto L12
            H0.a r3 = S7.e.f2827f
            if (r2 != r3) goto L34
            goto L12
        L34:
            H0.a r7 = S7.e.f2830i
            if (r2 == r7) goto L5a
            H0.a r7 = S7.e.f2825d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            H0.a r7 = S7.e.l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L70
            G7.j.b(r5)
            F7.l r7 = r5.f2821c
            if (r7 == 0) goto L70
            G1.a r7 = V7.a.a(r7, r0, r4)
            if (r7 == 0) goto L70
            Q7.AbstractC0255x.i(r7, r8)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            H0.a r3 = S7.e.f2831j
            goto L78
        L76:
            H0.a r3 = S7.e.f2832k
        L78:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            G7.j.b(r5)
            F7.l r7 = r5.f2821c
            if (r7 == 0) goto L98
            G1.a r7 = V7.a.a(r7, r0, r4)
            if (r7 == 0) goto L98
            Q7.AbstractC0255x.i(r7, r8)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.k.g(int, w7.k):void");
    }

    public final boolean j(int i9, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2844h;
        int i10 = (i9 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i9) {
        return this.f2844h.get((i9 * 2) + 1);
    }

    public final void l(int i9, boolean z8) {
        if (z8) {
            c cVar = this.f2843g;
            G7.j.b(cVar);
            cVar.F((this.f3540d * e.b) + i9);
        }
        h();
    }

    public final void m(int i9, Object obj) {
        this.f2844h.set(i9 * 2, obj);
    }

    public final void n(int i9, Object obj) {
        this.f2844h.set((i9 * 2) + 1, obj);
    }
}
