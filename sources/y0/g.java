package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class g implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f31434a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f31435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f31436c;

    public g(h hVar) {
        this.f31436c = hVar;
        this.f31434a = hVar.f31437a.iterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r4 = this;
            java.util.Iterator r0 = r4.f31435b
            if (r0 == 0) goto Ld
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
            r0 = 0
            r4.f31435b = r0
        Ld:
            java.util.Iterator r0 = r4.f31435b
            r1 = 1
            if (r0 != 0) goto L38
            java.util.Iterator r0 = r4.f31434a
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            java.lang.Object r0 = r0.next()
            y0.h r2 = r4.f31436c
            q0.l r3 = r2.f31439c
            q0.l r2 = r2.f31438b
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld
            r4.f31435b = r0
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.b():boolean");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f31435b;
        p0.a.p(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
