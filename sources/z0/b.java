package z0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f31461a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f31462b;

    /* renamed from: c, reason: collision with root package name */
    public int f31463c;
    public w0.g d;

    /* renamed from: f, reason: collision with root package name */
    public int f31464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f31465g;

    public b(c cVar) {
        this.f31465g = cVar;
        int A = p0.a.A(cVar.f31467b, 0, cVar.f31466a.length());
        this.f31462b = A;
        this.f31463c = A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [w0.g, w0.e] */
    /* JADX WARN: Type inference failed for: r0v8, types: [w0.g, w0.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.f31463c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f31461a = r1
            r0 = 0
            r7.d = r0
            goto L7b
        Lb:
            z0.c r2 = r7.f31465g
            int r3 = r2.f31468c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f31464f
            int r6 = r6 + r5
            r7.f31464f = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f31466a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            w0.g r0 = new w0.g
            int r1 = r7.f31462b
            java.lang.CharSequence r2 = r2.f31466a
            int r2 = z0.m.T0(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.f31463c = r4
            goto L79
        L34:
            q0.p r0 = r2.d
            java.lang.CharSequence r3 = r2.f31466a
            int r6 = r7.f31463c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            d0.k r0 = (d0.k) r0
            if (r0 != 0) goto L58
            w0.g r0 = new w0.g
            int r1 = r7.f31462b
            java.lang.CharSequence r2 = r2.f31466a
            int r2 = z0.m.T0(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.f31463c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f30134a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f30135b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f31462b
            w0.g r3 = p0.a.F0(r3, r2)
            r7.d = r3
            int r2 = r2 + r0
            r7.f31462b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f31463c = r2
        L79:
            r7.f31461a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.b.b():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31461a == -1) {
            b();
        }
        return this.f31461a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31461a == -1) {
            b();
        }
        if (this.f31461a == 0) {
            throw new NoSuchElementException();
        }
        w0.g gVar = this.d;
        p0.a.q(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f31461a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
