package com.bytedance.sdk.component.wN.tN.YFl;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class tN<K, V> {
    private int AlY;
    private int DSW;
    private int Sg;
    private final LinkedHashMap<K, SoftReference<V>> YFl;
    private int qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10478vc;
    private int wN;

    public tN(int i10) {
        if (i10 > 0) {
            this.tN = i10;
            this.YFl = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int tN(K k10, V v10) {
        int Sg = Sg(k10, v10);
        if (Sg >= 0) {
            return Sg;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public int Sg(K k10, V v10) {
        return 1;
    }

    public final V YFl(K k10) {
        V v10;
        if (k10 != null) {
            synchronized (this) {
                SoftReference<V> softReference = this.YFl.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.DSW++;
                        return v10;
                    }
                    this.YFl.remove(k10);
                } else {
                    v10 = null;
                }
                this.qsH++;
                V Sg = Sg(k10);
                if (Sg == null) {
                    return null;
                }
                synchronized (this) {
                    this.wN++;
                    SoftReference<V> put = this.YFl.put(k10, new SoftReference<>(Sg));
                    if (put != null) {
                        v10 = put.get();
                    }
                    if (v10 != null) {
                        this.YFl.put(k10, put);
                    } else {
                        this.Sg += tN(k10, Sg);
                    }
                }
                if (v10 != null) {
                    return v10;
                }
                YFl(this.tN);
                return Sg;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i10;
        int i11 = this.DSW;
        int i12 = this.qsH + i11;
        if (i12 != 0) {
            i10 = (i11 * 100) / i12;
        } else {
            i10 = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.tN), Integer.valueOf(this.DSW), Integer.valueOf(this.qsH), Integer.valueOf(i10));
    }

    public V Sg(K k10) {
        return null;
    }

    public final V YFl(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.AlY++;
                this.Sg += tN(k10, v10);
                SoftReference<V> put = this.YFl.put(k10, new SoftReference<>(v10));
                if (put != null) {
                    v11 = put.get();
                    if (v11 != null) {
                        this.Sg -= tN(k10, v11);
                    }
                } else {
                    v11 = null;
                }
            }
            YFl(this.tN);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.Sg + ", maxSize: " + r4);
        r3.Sg = 0;
        r3.YFl.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L79
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.YFl     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L79
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.YFl     // Catch: java.lang.Throwable -> L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L79
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.YFl     // Catch: java.lang.Throwable -> L79
            r2.remove(r1)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L79
            int r2 = r3.Sg     // Catch: java.lang.Throwable -> L79
            int r0 = r3.tN(r1, r0)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 - r0
            r3.Sg = r2     // Catch: java.lang.Throwable -> L79
        L4a:
            int r0 = r3.f10478vc     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 1
            r3.f10478vc = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            goto L0
        L52:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r3.Sg     // Catch: java.lang.Throwable -> L79
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L79
            r1.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r3.Sg = r4     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.YFl     // Catch: java.lang.Throwable -> L79
            r4.clear()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.wN.tN.YFl.tN.YFl(int):void");
    }
}
