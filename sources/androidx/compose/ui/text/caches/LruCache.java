package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.LinkedHashSet;

@StabilityInferred
/* loaded from: classes4.dex */
public class LruCache<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedObject f17175a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17176b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f17177c;
    public int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f17178f;

    /* renamed from: g, reason: collision with root package name */
    public int f17179g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.ui.text.platform.SynchronizedObject] */
    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.e = i2;
        this.f17176b = new HashMap(0, 0.75f);
        this.f17177c = new LinkedHashSet();
    }

    public final Object a(Object obj) {
        synchronized (this.f17175a) {
            Object obj2 = this.f17176b.get(obj);
            if (obj2 == null) {
                this.f17179g++;
                return null;
            }
            this.f17177c.remove(obj);
            this.f17177c.add(obj);
            this.f17178f++;
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto Lbc
            if (r7 == 0) goto Lbc
            androidx.compose.ui.text.platform.SynchronizedObject r1 = r5.f17175a
            monitor-enter(r1)
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + 1
            r5.d = r2     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r2 = r5.f17176b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r7 = r2.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            if (r7 == 0) goto L24
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + (-1)
            r5.d = r2     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r6 = move-exception
            goto Lba
        L24:
            java.util.LinkedHashSet r2 = r5.f17177c     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.contains(r6)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L31
            java.util.LinkedHashSet r2 = r5.f17177c     // Catch: java.lang.Throwable -> L21
            r2.remove(r6)     // Catch: java.lang.Throwable -> L21
        L31:
            java.util.LinkedHashSet r2 = r5.f17177c     // Catch: java.lang.Throwable -> L21
            r2.add(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            int r6 = r5.e
        L39:
            androidx.compose.ui.text.platform.SynchronizedObject r1 = r5.f17175a
            monitor-enter(r1)
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 < 0) goto Lb0
            java.util.HashMap r2 = r5.f17176b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L53
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto Lb0
            goto L53
        L51:
            r6 = move-exception
            goto Lb8
        L53:
            java.util.HashMap r2 = r5.f17176b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            java.util.LinkedHashSet r3 = r5.f17177c     // Catch: java.lang.Throwable -> L51
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 != r3) goto Lb0
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 <= r6) goto La1
            java.util.HashMap r2 = r5.f17176b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto La1
            java.util.LinkedHashSet r2 = r5.f17177c     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = e0.u.D0(r2)     // Catch: java.lang.Throwable -> L51
            java.util.HashMap r3 = r5.f17176b     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L99
            java.util.HashMap r4 = r5.f17176b     // Catch: java.lang.Throwable -> L51
            kotlin.jvm.internal.e.e(r4)     // Catch: java.lang.Throwable -> L51
            r4.remove(r2)     // Catch: java.lang.Throwable -> L51
            java.util.LinkedHashSet r4 = r5.f17177c     // Catch: java.lang.Throwable -> L51
            kotlin.jvm.internal.e.c(r4)     // Catch: java.lang.Throwable -> L51
            r4.remove(r2)     // Catch: java.lang.Throwable -> L51
            int r4 = r5.d()     // Catch: java.lang.Throwable -> L51
            p0.a.p(r2)     // Catch: java.lang.Throwable -> L51
            int r4 = r4 + (-1)
            r5.d = r4     // Catch: java.lang.Throwable -> L51
            goto La3
        L99:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "inconsistent state"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L51
            throw r6     // Catch: java.lang.Throwable -> L51
        La1:
            r2 = r0
            r3 = r2
        La3:
            monitor-exit(r1)
            if (r2 != 0) goto La9
            if (r3 != 0) goto La9
            return r7
        La9:
            p0.a.p(r2)
            p0.a.p(r3)
            goto L39
        Lb0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "map/keySet size inconsistency"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L51
            throw r6     // Catch: java.lang.Throwable -> L51
        Lb8:
            monitor-exit(r1)
            throw r6
        Lba:
            monitor-exit(r1)
            throw r6
        Lbc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f17175a) {
            remove = this.f17176b.remove(obj);
            this.f17177c.remove(obj);
            if (remove != null) {
                this.d = d() - 1;
            }
        }
        return remove;
    }

    public final int d() {
        int i2;
        synchronized (this.f17175a) {
            i2 = this.d;
        }
        return i2;
    }

    public final String toString() {
        String str;
        synchronized (this.f17175a) {
            try {
                int i2 = this.f17178f;
                int i3 = this.f17179g + i2;
                str = "LruCache[maxSize=" + this.e + ",hits=" + this.f17178f + ",misses=" + this.f17179g + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
