package b1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.r1;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends e0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile f1 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private v0 preferences_ = v0.f1473c;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        e0.l(e.class, eVar);
    }

    public static v0 o(e eVar) {
        v0 v0Var = eVar.preferences_;
        if (!v0Var.f1474b) {
            eVar.preferences_ = v0Var.b();
        }
        return eVar.preferences_;
    }

    public static c q() {
        return (c) ((b0) DEFAULT_INSTANCE.e(d0.NEW_BUILDER));
    }

    public static e r(InputStream inputStream) {
        n mVar;
        e eVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = h0.f1371b;
            int length = bArr.length;
            mVar = new l(bArr, 0, length, false);
            try {
                mVar.e(length);
            } catch (j0 e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            mVar = new m(inputStream);
        }
        u a = u.a();
        e0 e0Var = (e0) eVar.f();
        try {
            h1 h1Var = h1.f1372c;
            h1Var.getClass();
            k1 a10 = h1Var.a(e0Var.getClass());
            o oVar = mVar.f1443d;
            if (oVar == null) {
                oVar = new o(mVar);
            }
            a10.b(e0Var, oVar, a);
            a10.makeImmutable(e0Var);
            if (e0.i(e0Var, true)) {
                return (e) e0Var;
            }
            throw new j0(new r1().getMessage());
        } catch (j0 e10) {
            if (e10.f1379b) {
                throw new j0(e10);
            }
            throw e10;
        } catch (r1 e11) {
            throw new j0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof j0) {
                throw ((j0) e12.getCause());
            }
            throw new j0(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof j0) {
                throw ((j0) e13.getCause());
            }
            throw e13;
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
                return new j1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.a});
            case NEW_MUTABLE_INSTANCE:
                return new e();
            case NEW_BUILDER:
                return new c();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                f1 f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
