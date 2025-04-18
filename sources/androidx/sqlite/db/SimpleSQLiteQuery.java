package androidx.sqlite.db;

import p0.a;

/* loaded from: classes2.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* renamed from: a, reason: collision with root package name */
    public final String f21456a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f21457b;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static void a(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                if (obj == null) {
                    supportSQLiteProgram.a0(i2);
                } else if (obj instanceof byte[]) {
                    supportSQLiteProgram.T(i2, (byte[]) obj);
                } else if (obj instanceof Float) {
                    supportSQLiteProgram.Z(((Number) obj).floatValue(), i2);
                } else if (obj instanceof Double) {
                    supportSQLiteProgram.Z(((Number) obj).doubleValue(), i2);
                } else if (obj instanceof Long) {
                    supportSQLiteProgram.Q(i2, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    supportSQLiteProgram.Q(i2, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    supportSQLiteProgram.Q(i2, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    supportSQLiteProgram.Q(i2, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    supportSQLiteProgram.L(i2, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    supportSQLiteProgram.Q(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public SimpleSQLiteQuery(String str, Object[] objArr) {
        a.s(str, "query");
        this.f21456a = str;
        this.f21457b = objArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String a() {
        return this.f21456a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void c(SupportSQLiteProgram supportSQLiteProgram) {
        Companion.a(supportSQLiteProgram, this.f21457b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(String str) {
        this(str, null);
        a.s(str, "query");
    }
}
