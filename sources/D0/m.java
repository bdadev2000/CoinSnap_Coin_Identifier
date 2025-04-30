package D0;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m implements H0.e, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final TreeMap f628k = new TreeMap();
    public volatile String b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f629c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f630d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f631f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[][] f632g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f633h;

    /* renamed from: i, reason: collision with root package name */
    public final int f634i;

    /* renamed from: j, reason: collision with root package name */
    public int f635j;

    public m(int i9) {
        this.f634i = i9;
        int i10 = i9 + 1;
        this.f633h = new int[i10];
        this.f629c = new long[i10];
        this.f630d = new double[i10];
        this.f631f = new String[i10];
        this.f632g = new byte[i10];
    }

    public static m c(int i9, String str) {
        TreeMap treeMap = f628k;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i9));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    m mVar = (m) ceilingEntry.getValue();
                    mVar.b = str;
                    mVar.f635j = i9;
                    return mVar;
                }
                m mVar2 = new m(i9);
                mVar2.b = str;
                mVar2.f635j = i9;
                return mVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.e
    public final void a(I0.b bVar) {
        for (int i9 = 1; i9 <= this.f635j; i9++) {
            int i10 = this.f633h[i9];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                bVar.b(i9, this.f632g[i9]);
                            }
                        } else {
                            bVar.j(i9, this.f631f[i9]);
                        }
                    } else {
                        bVar.c(i9, this.f630d[i9]);
                    }
                } else {
                    bVar.h(i9, this.f629c[i9]);
                }
            } else {
                bVar.i(i9);
            }
        }
    }

    @Override // H0.e
    public final String b() {
        return this.b;
    }

    public final void h(int i9, long j7) {
        this.f633h[i9] = 2;
        this.f629c[i9] = j7;
    }

    public final void i(int i9) {
        this.f633h[i9] = 1;
    }

    public final void j(int i9, String str) {
        this.f633h[i9] = 4;
        this.f631f[i9] = str;
    }

    public final void release() {
        TreeMap treeMap = f628k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f634i), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i9 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i9;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
