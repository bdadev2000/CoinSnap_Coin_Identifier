package g0;

import androidx.datastore.preferences.protobuf.AbstractC0444t;
import androidx.datastore.preferences.protobuf.AbstractC0446v;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.Z;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class i extends AbstractC0446v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile V PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC0446v.h(i.class, iVar);
    }

    public static void i(i iVar, long j7) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j7);
    }

    public static void j(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void k(i iVar, C2284f c2284f) {
        iVar.getClass();
        iVar.value_ = c2284f.a();
        iVar.valueCase_ = 6;
    }

    public static void l(i iVar, double d2) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d2);
    }

    public static void m(i iVar, boolean z8) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z8);
    }

    public static void n(i iVar, float f9) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f9);
    }

    public static void o(i iVar, int i9) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i9);
    }

    public static i q() {
        return DEFAULT_INSTANCE;
    }

    public static h y() {
        return (h) ((AbstractC0444t) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.V] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0446v
    public final Object d(int i9) {
        switch (AbstractC2965e.d(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Z(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C2285g.class});
            case 3:
                return new i();
            case 4:
                return new AbstractC0444t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v6 = PARSER;
                V v9 = v6;
                if (v6 == null) {
                    synchronized (i.class) {
                        try {
                            V v10 = PARSER;
                            V v11 = v10;
                            if (v10 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                v11 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return v9;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final C2285g w() {
        if (this.valueCase_ == 6) {
            return (C2285g) this.value_;
        }
        return C2285g.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
