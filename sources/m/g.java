package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class g implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public c f21417b;

    /* renamed from: c, reason: collision with root package name */
    public c f21418c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f21419d = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f21420f = 0;

    public c a(Object obj) {
        c cVar = this.f21417b;
        while (cVar != null && !cVar.f21408b.equals(obj)) {
            cVar = cVar.f21410d;
        }
        return cVar;
    }

    public Object b(Object obj, Object obj2) {
        c a = a(obj);
        if (a != null) {
            return a.f21409c;
        }
        c cVar = new c(obj, obj2);
        this.f21420f++;
        c cVar2 = this.f21418c;
        if (cVar2 == null) {
            this.f21417b = cVar;
            this.f21418c = cVar;
            return null;
        }
        cVar2.f21410d = cVar;
        cVar.f21411f = cVar2;
        this.f21418c = cVar;
        return null;
    }

    public Object c(Object obj) {
        c a = a(obj);
        if (a == null) {
            return null;
        }
        this.f21420f--;
        WeakHashMap weakHashMap = this.f21419d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(a);
            }
        }
        c cVar = a.f21411f;
        if (cVar != null) {
            cVar.f21410d = a.f21410d;
        } else {
            this.f21417b = a.f21410d;
        }
        c cVar2 = a.f21410d;
        if (cVar2 != null) {
            cVar2.f21411f = cVar;
        } else {
            this.f21418c = cVar;
        }
        a.f21410d = null;
        a.f21411f = null;
        return a.f21409c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof m.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.g r7 = (m.g) r7
            int r1 = r6.f21420f
            int r3 = r7.f21420f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            m.e r3 = (m.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            m.e r4 = (m.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            m.e r7 = (m.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f21417b, this.f21418c, 0);
        this.f21419d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
