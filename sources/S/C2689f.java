package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2689f implements Iterable {
    public C2686c b;

    /* renamed from: c, reason: collision with root package name */
    public C2686c f22959c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f22960d = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f22961f = 0;

    public C2686c b(Object obj) {
        C2686c c2686c = this.b;
        while (c2686c != null && !c2686c.b.equals(obj)) {
            c2686c = c2686c.f22955d;
        }
        return c2686c;
    }

    public Object c(Object obj) {
        C2686c b = b(obj);
        if (b == null) {
            return null;
        }
        this.f22961f--;
        WeakHashMap weakHashMap = this.f22960d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2688e) it.next()).a(b);
            }
        }
        C2686c c2686c = b.f22956f;
        if (c2686c != null) {
            c2686c.f22955d = b.f22955d;
        } else {
            this.b = b.f22955d;
        }
        C2686c c2686c2 = b.f22955d;
        if (c2686c2 != null) {
            c2686c2.f22956f = c2686c;
        } else {
            this.f22959c = c2686c;
        }
        b.f22955d = null;
        b.f22956f = null;
        return b.f22954c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((s.C2685b) r7).hasNext() != false) goto L28;
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
            boolean r1 = r7 instanceof s.C2689f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.f r7 = (s.C2689f) r7
            int r1 = r6.f22961f
            int r3 = r7.f22961f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            s.b r3 = (s.C2685b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            s.b r4 = (s.C2685b) r4
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
            s.b r7 = (s.C2685b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C2689f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i9 = 0;
        while (true) {
            C2685b c2685b = (C2685b) it;
            if (c2685b.hasNext()) {
                i9 += ((Map.Entry) c2685b.next()).hashCode();
            } else {
                return i9;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2685b c2685b = new C2685b(this.b, this.f22959c, 0);
        this.f22960d.put(c2685b, Boolean.FALSE);
        return c2685b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2685b c2685b = (C2685b) it;
            if (c2685b.hasNext()) {
                sb.append(((Map.Entry) c2685b.next()).toString());
                if (c2685b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
