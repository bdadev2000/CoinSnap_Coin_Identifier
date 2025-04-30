package x;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<Object, Object> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public g(int i9) {
        if (i9 > 0) {
            this.maxSize = i9;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    @Nullable
    public Object create(@NonNull Object obj) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    @Nullable
    public final Object get(@NonNull Object obj) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.map.get(obj);
                    if (obj2 != null) {
                        this.hitCount++;
                        return obj2;
                    }
                    this.missCount++;
                    Object create = create(obj);
                    if (create == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.createCount++;
                            put = this.map.put(obj, create);
                            if (put != null) {
                                this.map.put(obj, put);
                            } else {
                                this.size += a(obj, create);
                            }
                        } finally {
                        }
                    }
                    if (put != null) {
                        entryRemoved(false, obj, create, put);
                        return put;
                    }
                    trimToSize(this.maxSize);
                    return create;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    @Nullable
    public final Object put(@NonNull Object obj, @NonNull Object obj2) {
        Object put;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                try {
                    this.putCount++;
                    this.size += a(obj, obj2);
                    put = this.map.put(obj, obj2);
                    if (put != null) {
                        this.size -= a(obj, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, obj, put, obj2);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    @Nullable
    public final Object remove(@NonNull Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                try {
                    remove = this.map.remove(obj);
                    if (remove != null) {
                        this.size -= a(obj, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                entryRemoved(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int i9) {
        if (i9 > 0) {
            synchronized (this) {
                this.maxSize = i9;
            }
            trimToSize(i9);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(@NonNull Object obj, @NonNull Object obj2) {
        return 1;
    }

    public final synchronized Map<Object, Object> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i9;
        try {
            int i10 = this.hitCount;
            int i11 = this.missCount + i10;
            if (i11 != 0) {
                i9 = (i10 * 100) / i11;
            } else {
                i9 = 0;
            }
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i9 + "%]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.size     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.size     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.size     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r2 = r4.map     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.size     // Catch: java.lang.Throwable -> L12
            int r3 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.size = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.evictionCount     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.evictionCount = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.entryRemoved(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g.trimToSize(int):void");
    }

    public void entryRemoved(boolean z8, @NonNull Object obj, @NonNull Object obj2, @Nullable Object obj3) {
    }
}
