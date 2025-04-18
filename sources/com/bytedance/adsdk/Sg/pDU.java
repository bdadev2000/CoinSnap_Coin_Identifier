package com.bytedance.adsdk.Sg;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class pDU<K, V> {
    private int AlY;
    private int DSW;
    private int Sg;
    private final LinkedHashMap<K, V> YFl;
    private int qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10187vc;
    private int wN;

    public pDU(int i10) {
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
        V put;
        if (k10 != null) {
            synchronized (this) {
                V v10 = this.YFl.get(k10);
                if (v10 != null) {
                    this.DSW++;
                    return v10;
                }
                this.qsH++;
                V Sg = Sg(k10);
                if (Sg == null) {
                    return null;
                }
                synchronized (this) {
                    this.wN++;
                    put = this.YFl.put(k10, Sg);
                    if (put != null) {
                        this.YFl.put(k10, put);
                    } else {
                        this.Sg += tN(k10, Sg);
                    }
                }
                if (put != null) {
                    return put;
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
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.tN), Integer.valueOf(this.DSW), Integer.valueOf(this.qsH), Integer.valueOf(i10));
    }

    public V Sg(K k10) {
        return null;
    }

    public final V YFl(K k10, V v10) {
        V put;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.AlY++;
                this.Sg += tN(k10, v10);
                put = this.YFl.put(k10, v10);
                if (put != null) {
                    this.Sg -= tN(k10, put);
                }
            }
            YFl(this.tN);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
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
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.YFl     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.Sg     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.YFl     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.YFl     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.YFl     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.Sg     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.tN(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.Sg = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.f10187vc     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.f10187vc = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.pDU.YFl(int):void");
    }
}
