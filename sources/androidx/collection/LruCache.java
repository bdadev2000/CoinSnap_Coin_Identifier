package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;

/* loaded from: classes3.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final Lock lock;

    @NotNull
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.collection.internal.Lock, java.lang.Object] */
    public LruCache(int i2) {
        this.maxSize = i2;
        if (i2 <= 0) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        this.map = new LruHashMap<>();
        this.lock = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        String str = "Negative size: " + obj + SignatureVisitor.INSTANCEOF + obj2;
        a.s(str, "message");
        throw new IllegalStateException(str);
    }

    @Nullable
    public V create(@NotNull K k2) {
        a.s(k2, SDKConstants.PARAM_KEY);
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean z2, @NotNull K k2, @NotNull V v2, @Nullable V v3) {
        a.s(k2, SDKConstants.PARAM_KEY);
        a.s(v2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    @Nullable
    public final V get(@NotNull K k2) {
        V v2;
        a.s(k2, SDKConstants.PARAM_KEY);
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            V v3 = (V) lruHashMap.f1620a.get(k2);
            if (v3 != null) {
                this.hitCount++;
                return v3;
            }
            this.missCount++;
            V create = create(k2);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    LruHashMap<K, V> lruHashMap2 = this.map;
                    lruHashMap2.getClass();
                    v2 = (V) lruHashMap2.f1620a.put(k2, create);
                    if (v2 != null) {
                        LruHashMap<K, V> lruHashMap3 = this.map;
                        lruHashMap3.getClass();
                        lruHashMap3.f1620a.put(k2, v2);
                    } else {
                        this.size += a(k2, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v2 != null) {
                entryRemoved(false, k2, create, v2);
                return v2;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    @Nullable
    public final V put(@NotNull K k2, @NotNull V v2) {
        V v3;
        a.s(k2, SDKConstants.PARAM_KEY);
        a.s(v2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(k2, v2);
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            v3 = (V) lruHashMap.f1620a.put(k2, v2);
            if (v3 != null) {
                this.size -= a(k2, v3);
            }
        }
        if (v3 != null) {
            entryRemoved(false, k2, v3, v2);
        }
        trimToSize(this.maxSize);
        return v3;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    @Nullable
    public final V remove(@NotNull K k2) {
        V v2;
        a.s(k2, SDKConstants.PARAM_KEY);
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            v2 = (V) lruHashMap.f1620a.remove(k2);
            if (v2 != null) {
                this.size -= a(k2, v2);
            }
        }
        if (v2 != null) {
            entryRemoved(false, k2, v2, null);
        }
        return v2;
    }

    public void resize(@IntRange int i2) {
        if (!(i2 > 0)) {
            RuntimeHelpersKt.a("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i2;
        }
        trimToSize(i2);
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(@NotNull K k2, @NotNull V v2) {
        a.s(k2, SDKConstants.PARAM_KEY);
        a.s(v2, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> entrySet = this.map.f1620a.entrySet();
            a.r(entrySet, "map.entries");
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry<K, V>> entrySet2 = this.map.f1620a.entrySet();
            a.r(entrySet2, "map.entries");
            Iterator<T> it = entrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i2 = this.hitCount;
                int i3 = this.missCount + i2;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0013, B:13:0x0020, B:15:0x0024, B:17:0x002f, B:19:0x0043, B:22:0x0061, B:24:0x0067, B:31:0x004d, B:32:0x0052, B:35:0x005d, B:42:0x0094, B:43:0x009b), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0013, B:13:0x0020, B:15:0x0024, B:17:0x002f, B:19:0x0043, B:22:0x0061, B:24:0x0067, B:31:0x004d, B:32:0x0052, B:35:0x005d, B:42:0x0094, B:43:0x009b), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[EDGE_INSN: B:41:0x0094->B:42:0x0094 BREAK  A[LOOP:0: B:1:0x0000->B:26:0x008d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.collection.internal.Lock r0 = r7.lock
            monitor-enter(r0)
            int r1 = r7.size     // Catch: java.lang.Throwable -> L18
            r2 = 0
            r3 = 1
            if (r1 < 0) goto L1d
            androidx.collection.internal.LruHashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = r1.f1620a     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.size     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1d
            goto L1b
        L18:
            r8 = move-exception
            goto L9c
        L1b:
            r1 = r3
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L94
            int r1 = r7.size     // Catch: java.lang.Throwable -> L18
            if (r1 <= r8) goto L92
            androidx.collection.internal.LruHashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = r1.f1620a     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L2f
            goto L92
        L2f:
            androidx.collection.internal.LruHashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = r1.f1620a     // Catch: java.lang.Throwable -> L18
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "map.entries"
            p0.a.r(r1, r4)     // Catch: java.lang.Throwable -> L18
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L18
            boolean r4 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L18
            r5 = 0
            if (r4 == 0) goto L52
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L18
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L4d
        L4b:
            r1 = r5
            goto L61
        L4d:
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L18
            goto L61
        L52:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L5d
            goto L4b
        L5d:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L18
        L61:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L67
            monitor-exit(r0)
            return
        L67:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L18
            androidx.collection.internal.LruHashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L18
            r4.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "key"
            p0.a.s(r2, r6)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r4 = r4.f1620a     // Catch: java.lang.Throwable -> L18
            r4.remove(r2)     // Catch: java.lang.Throwable -> L18
            int r4 = r7.size     // Catch: java.lang.Throwable -> L18
            int r6 = r7.a(r2, r1)     // Catch: java.lang.Throwable -> L18
            int r4 = r4 - r6
            r7.size = r4     // Catch: java.lang.Throwable -> L18
            int r4 = r7.evictionCount     // Catch: java.lang.Throwable -> L18
            int r4 = r4 + r3
            r7.evictionCount = r4     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            r7.entryRemoved(r3, r2, r1, r5)
            goto L0
        L92:
            monitor-exit(r0)
            return
        L94:
            java.lang.String r8 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L9c:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
