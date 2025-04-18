package v1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements z1.i, z1.h {

    /* renamed from: k, reason: collision with root package name */
    public static final TreeMap f25906k = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f25907b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f25908c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f25909d;

    /* renamed from: f, reason: collision with root package name */
    public final double[] f25910f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f25911g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f25912h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f25913i;

    /* renamed from: j, reason: collision with root package name */
    public int f25914j;

    public j0(int i10) {
        this.f25907b = i10;
        int i11 = i10 + 1;
        this.f25913i = new int[i11];
        this.f25909d = new long[i11];
        this.f25910f = new double[i11];
        this.f25911g = new String[i11];
        this.f25912h = new byte[i11];
    }

    public static final j0 j(int i10, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = f25906k;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                j0 sqliteQuery = (j0) ceilingEntry.getValue();
                sqliteQuery.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                sqliteQuery.f25908c = query;
                sqliteQuery.f25914j = i10;
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
            Unit unit = Unit.INSTANCE;
            j0 j0Var = new j0(i10);
            Intrinsics.checkNotNullParameter(query, "query");
            j0Var.f25908c = query;
            j0Var.f25914j = i10;
            return j0Var;
        }
    }

    @Override // z1.h
    public final void b(int i10, double d10) {
        this.f25913i[i10] = 3;
        this.f25910f[i10] = d10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // z1.i
    public final String d() {
        String str = this.f25908c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // z1.i
    public final void g(b0 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i10 = this.f25914j;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = this.f25913i[i11];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    byte[] bArr = this.f25912h[i11];
                                    if (bArr != null) {
                                        statement.n(i11, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f25911g[i11];
                                if (str != null) {
                                    statement.i(i11, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            statement.b(i11, this.f25910f[i11]);
                        }
                    } else {
                        statement.m(i11, this.f25909d[i11]);
                    }
                } else {
                    statement.o(i11);
                }
                if (i11 != i10) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // z1.h
    public final void i(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f25913i[i10] = 4;
        this.f25911g[i10] = value;
    }

    @Override // z1.h
    public final void m(int i10, long j3) {
        this.f25913i[i10] = 2;
        this.f25909d[i10] = j3;
    }

    @Override // z1.h
    public final void n(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f25913i[i10] = 5;
        this.f25912h[i10] = value;
    }

    @Override // z1.h
    public final void o(int i10) {
        this.f25913i[i10] = 1;
    }

    public final void release() {
        TreeMap treeMap = f25906k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f25907b), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
