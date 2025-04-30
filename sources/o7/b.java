package O7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, H7.a {
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2246c;

    /* renamed from: d, reason: collision with root package name */
    public int f2247d;

    /* renamed from: f, reason: collision with root package name */
    public L7.c f2248f;

    /* renamed from: g, reason: collision with root package name */
    public int f2249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f2250h;

    public b(c cVar) {
        this.f2250h = cVar;
        int d2 = e1.f.d(cVar.b, cVar.f2251a.length());
        this.f2246c = d2;
        this.f2247d = d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [L7.c, L7.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [L7.c, L7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f2247d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.b = r1
            r0 = 0
            r7.f2248f = r0
            goto L7b
        Lb:
            O7.c r2 = r7.f2250h
            int r3 = r2.f2252c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f2249g
            int r6 = r6 + r5
            r7.f2249g = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f2251a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            L7.c r0 = new L7.c
            int r1 = r7.f2246c
            java.lang.CharSequence r2 = r2.f2251a
            int r2 = O7.g.G(r2)
            r0.<init>(r1, r2, r5)
            r7.f2248f = r0
            r7.f2247d = r4
            goto L79
        L34:
            F7.p r0 = r2.f2253d
            java.lang.CharSequence r3 = r2.f2251a
            int r6 = r7.f2247d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.g(r3, r6)
            t7.i r0 = (t7.C2720i) r0
            if (r0 != 0) goto L58
            L7.c r0 = new L7.c
            int r1 = r7.f2246c
            java.lang.CharSequence r2 = r2.f2251a
            int r2 = O7.g.G(r2)
            r0.<init>(r1, r2, r5)
            r7.f2248f = r0
            r7.f2247d = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f23021c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f2246c
            L7.c r3 = e1.f.t(r3, r2)
            r7.f2248f = r3
            int r2 = r2 + r0
            r7.f2246c = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f2247d = r2
        L79:
            r7.b = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            L7.c cVar = this.f2248f;
            G7.j.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f2248f = null;
            this.b = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
