package b1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class i extends e0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile f1 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        e0.l(i.class, iVar);
    }

    public static h G() {
        return (h) ((b0) DEFAULT_INSTANCE.e(d0.NEW_BUILDER));
    }

    public static void n(i iVar, long j3) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j3);
    }

    public static void o(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void p(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void q(i iVar, double d10) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d10);
    }

    public static void r(i iVar, j jVar) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = jVar;
    }

    public static void t(i iVar, boolean z10) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z10);
    }

    public static void u(i iVar, float f10) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f10);
    }

    public static void v(i iVar, int i10) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i10);
    }

    public static i y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final g E() {
        if (this.valueCase_ == 6) {
            return (g) this.value_;
        }
        return g.p();
    }

    public final int F() {
        switch (this.valueCase_) {
            case 0:
                return 9;
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
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final Object e(d0 d0Var) {
        switch (d0Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new j1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case NEW_MUTABLE_INSTANCE:
                return new i();
            case NEW_BUILDER:
                return new h();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                f1 f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (i.class) {
                        try {
                            f1Var = PARSER;
                            if (f1Var == null) {
                                f1Var = new c0();
                                PARSER = f1Var;
                            }
                        } finally {
                        }
                    }
                }
                return f1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final k x() {
        if (this.valueCase_ == 8) {
            return (k) this.value_;
        }
        return k.f1389c;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
