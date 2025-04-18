package d1;

import g1.z;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends z {

    /* renamed from: f, reason: collision with root package name */
    public final b f30181f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceArray f30182g;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f30181f = bVar;
        this.f30182g = new AtomicReferenceArray(d.f30160b * 2);
    }

    @Override // g1.z
    public final int f() {
        return d.f30160b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        p0.a.p(r5);
        r7 = r5.f30157b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = e1.t0.i(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        kotlin.jvm.internal.e.o(r8, r7);
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
    @Override // g1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, h0.l r8) {
        /*
            r6 = this;
            int r0 = d1.d.f30160b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f30182g
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof b1.m2
            r4 = 0
            d1.b r5 = r6.f30181f
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof d1.t
            if (r3 == 0) goto L22
            goto L71
        L22:
            android.support.v4.media.session.i r3 = d1.d.f30166j
            if (r2 == r3) goto L5b
            android.support.v4.media.session.i r3 = d1.d.f30167k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            android.support.v4.media.session.i r3 = d1.d.f30163g
            if (r2 == r3) goto L12
            android.support.v4.media.session.i r3 = d1.d.f30162f
            if (r2 != r3) goto L34
            goto L12
        L34:
            android.support.v4.media.session.i r7 = d1.d.f30165i
            if (r2 == r7) goto L5a
            android.support.v4.media.session.i r7 = d1.d.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            android.support.v4.media.session.i r7 = d1.d.f30168l
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
            p0.a.p(r5)
            q0.l r7 = r5.f30157b
            if (r7 == 0) goto L70
            d0.e r7 = e1.t0.i(r7, r0, r4)
            if (r7 == 0) goto L70
            kotlin.jvm.internal.e.o(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            android.support.v4.media.session.i r3 = d1.d.f30166j
            goto L78
        L76:
            android.support.v4.media.session.i r3 = d1.d.f30167k
        L78:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            p0.a.p(r5)
            q0.l r7 = r5.f30157b
            if (r7 == 0) goto L98
            d0.e r7 = e1.t0.i(r7, r0, r4)
            if (r7 == 0) goto L98
            kotlin.jvm.internal.e.o(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.j.g(int, h0.l):void");
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f30182g;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f30182g.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f30181f;
            p0.a.p(bVar);
            bVar.G((this.f30641c * d.f30160b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f30182g.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, android.support.v4.media.session.i iVar) {
        this.f30182g.set((i2 * 2) + 1, iVar);
    }
}
