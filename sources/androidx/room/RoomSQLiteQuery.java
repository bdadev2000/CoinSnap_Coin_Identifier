package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@RestrictTo
/* loaded from: classes2.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f21367j = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f21368a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f21369b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f21370c;
    public final double[] d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f21371f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[][] f21372g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f21373h;

    /* renamed from: i, reason: collision with root package name */
    public int f21374i;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Binding {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public RoomSQLiteQuery(int i2) {
        this.f21368a = i2;
        int i3 = i2 + 1;
        this.f21373h = new int[i3];
        this.f21370c = new long[i3];
        this.d = new double[i3];
        this.f21371f = new String[i3];
        this.f21372g = new byte[i3];
    }

    public static final RoomSQLiteQuery e(int i2, String str) {
        p0.a.s(str, "query");
        TreeMap treeMap = f21367j;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2);
                roomSQLiteQuery.f21369b = str;
                roomSQLiteQuery.f21374i = i2;
                return roomSQLiteQuery;
            }
            treeMap.remove(ceilingEntry.getKey());
            RoomSQLiteQuery roomSQLiteQuery2 = (RoomSQLiteQuery) ceilingEntry.getValue();
            roomSQLiteQuery2.getClass();
            roomSQLiteQuery2.f21369b = str;
            roomSQLiteQuery2.f21374i = i2;
            return roomSQLiteQuery2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void L(int i2, String str) {
        p0.a.s(str, "value");
        this.f21373h[i2] = 4;
        this.f21371f[i2] = str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Q(int i2, long j2) {
        this.f21373h[i2] = 2;
        this.f21370c[i2] = j2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void T(int i2, byte[] bArr) {
        this.f21373h[i2] = 5;
        this.f21372g[i2] = bArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Z(double d, int i2) {
        this.f21373h[i2] = 3;
        this.d[i2] = d;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String a() {
        String str = this.f21369b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void a0(int i2) {
        this.f21373h[i2] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void c(SupportSQLiteProgram supportSQLiteProgram) {
        int i2 = this.f21374i;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.f21373h[i3];
            if (i4 == 1) {
                supportSQLiteProgram.a0(i3);
            } else if (i4 == 2) {
                supportSQLiteProgram.Q(i3, this.f21370c[i3]);
            } else if (i4 == 3) {
                supportSQLiteProgram.Z(this.d[i3], i3);
            } else if (i4 == 4) {
                String str = this.f21371f[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                supportSQLiteProgram.L(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.f21372g[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                supportSQLiteProgram.T(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void release() {
        TreeMap treeMap = f21367j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f21368a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                p0.a.r(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }
}
