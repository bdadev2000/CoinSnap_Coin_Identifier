package com.bytedance.adsdk.lottie;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class tG<K, V> {
    private int COT;
    private int HWF;
    private int KS;
    private int QR;
    private int jU;
    private int ku;
    private int lMd;
    private final LinkedHashMap<K, V> zp;

    public tG(int i9) {
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
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.KS + ",hits=" + this.QR + ",misses=" + this.ku + ",hitRate=" + i9 + "%]";
    }

    public final V zp(K k6) {
        V put;
        if (k6 != null) {
            synchronized (this) {
                try {
                    V v6 = this.zp.get(k6);
                    if (v6 != null) {
                        this.QR++;
                        return v6;
                    }
                    this.ku++;
                    V lMd = lMd(k6);
                    if (lMd == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.COT++;
                            put = this.zp.put(k6, lMd);
                            if (put != null) {
                                this.zp.put(k6, put);
                            } else {
                                this.lMd += KS(k6, lMd);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (put != null) {
                        return put;
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
        V put;
        if (k6 != null && v6 != null) {
            synchronized (this) {
                try {
                    this.jU++;
                    this.lMd += KS(k6, v6);
                    put = this.zp.put(k6, v6);
                    if (put != null) {
                        this.lMd -= KS(k6, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zp(this.KS);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
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
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.zp     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.lMd     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.lMd     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.zp     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.zp     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.zp     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.lMd     // Catch: java.lang.Throwable -> L12
            int r0 = r3.KS(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.lMd = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.HWF     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.HWF = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.tG.zp(int):void");
    }
}
