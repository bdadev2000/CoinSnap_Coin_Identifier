package m9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x extends com.google.common.collect.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f21783b;

    public x(Map map) {
        this.f21783b = map;
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r1.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3.equals(r1.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000f, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            com.google.common.collect.l2 r0 = (com.google.common.collect.l2) r0
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.n1 r1 = new com.google.common.collect.n1
            r1.<init>(r0)
            if (r3 != 0) goto L1e
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            if (r3 != 0) goto L11
            goto L2e
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
        L2e:
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.x.containsValue(java.lang.Object):boolean");
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final Set entrySet() {
        return c6.c.l(super.entrySet(), new l9.t(3));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && c6.k.m(this, obj);
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c6.c.r(entrySet());
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final Set keySet() {
        return c6.c.l(super.keySet(), new l9.t(2));
    }

    @Override // com.google.common.collect.i0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
