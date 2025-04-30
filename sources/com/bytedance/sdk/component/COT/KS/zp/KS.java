package com.bytedance.sdk.component.COT.KS.zp;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class KS<K, V> {
    private int COT;
    private int HWF;
    private int KS;
    private int QR;
    private int jU;
    private int ku;
    private int lMd;
    private final LinkedHashMap<K, SoftReference<V>> zp;

    public KS(int i9) {
        if (i9 > 0) {
            this.KS = i9;
            this.zp = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int KS(K k6, V v6) {
        int lMd = lMd(k6, v6);
        if (lMd >= 0) {
            return lMd;
        }
        throw new IllegalStateException("Negative size: " + k6 + "=" + v6);
    }

    public int lMd(K k6, V v6) {
        return 1;
    }

    public final synchronized String toString() {
        int i9;
        try {
            int i10 = this.QR;
            int i11 = this.ku + i10;
            if (i11 != 0) {
                i9 = (i10 * 100) / i11;
            } else {
                i9 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.KS), Integer.valueOf(this.QR), Integer.valueOf(this.ku), Integer.valueOf(i9));
    }

    public final V zp(K k6) {
        V v6;
        if (k6 != null) {
            synchronized (this) {
                try {
                    SoftReference<V> softReference = this.zp.get(k6);
                    if (softReference != null) {
                        v6 = softReference.get();
                        if (v6 != null) {
                            this.QR++;
                            return v6;
                        }
                        this.zp.remove(k6);
                    } else {
                        v6 = null;
                    }
                    this.ku++;
                    V lMd = lMd(k6);
                    if (lMd == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.COT++;
                            SoftReference<V> put = this.zp.put(k6, new SoftReference<>(lMd));
                            if (put != null) {
                                v6 = put.get();
                            }
                            if (v6 != null) {
                                this.zp.put(k6, put);
                            } else {
                                this.lMd += KS(k6, lMd);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (v6 != null) {
                        return v6;
                    }
                    zp(this.KS);
                    return lMd;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public V lMd(K k6) {
        return null;
    }

    public final V zp(K k6, V v6) {
        V v9;
        if (k6 != null && v6 != null) {
            synchronized (this) {
                try {
                    this.jU++;
                    this.lMd += KS(k6, v6);
                    SoftReference<V> put = this.zp.put(k6, new SoftReference<>(v6));
                    if (put != null) {
                        v9 = put.get();
                        if (v9 != null) {
                            this.lMd -= KS(k6, v9);
                        }
                    } else {
                        v9 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zp(this.KS);
            return v9;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.lMd + ", maxSize: " + r4);
        r3.lMd = 0;
        r3.zp.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.lMd     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L54
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.zp     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.lMd     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            goto L54
        L12:
            r4 = move-exception
            goto L7b
        L14:
            int r0 = r3.lMd     // Catch: java.lang.Throwable -> L12
            if (r0 > r4) goto L1a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L1a:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.zp     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L2e:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.zp     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            int r2 = r3.lMd     // Catch: java.lang.Throwable -> L12
            int r0 = r3.KS(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.lMd = r2     // Catch: java.lang.Throwable -> L12
        L4c:
            int r0 = r3.HWF     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.HWF = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L54:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.lMd     // Catch: java.lang.Throwable -> L12
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 0
            r3.lMd = r4     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.zp     // Catch: java.lang.Throwable -> L12
            r4.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L7b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.COT.KS.zp.KS.zp(int):void");
    }
}
