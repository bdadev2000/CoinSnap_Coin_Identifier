package g0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0444t;
import androidx.datastore.preferences.protobuf.AbstractC0446v;
import androidx.datastore.preferences.protobuf.C0433h;
import androidx.datastore.preferences.protobuf.C0438m;
import androidx.datastore.preferences.protobuf.InterfaceC0426a0;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.h0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import z.AbstractC2965e;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2283e extends AbstractC0446v {
    private static final C2283e DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L preferences_ = L.f4518c;

    static {
        C2283e c2283e = new C2283e();
        DEFAULT_INSTANCE = c2283e;
        AbstractC0446v.h(C2283e.class, c2283e);
    }

    public static L i(C2283e c2283e) {
        L l = c2283e.preferences_;
        if (!l.b) {
            c2283e.preferences_ = l.b();
        }
        return c2283e.preferences_;
    }

    public static C2281c k() {
        return (C2281c) ((AbstractC0444t) DEFAULT_INSTANCE.d(5));
    }

    public static C2283e l(FileInputStream fileInputStream) {
        C2283e c2283e = DEFAULT_INSTANCE;
        C0433h c0433h = new C0433h(fileInputStream);
        C0438m a6 = C0438m.a();
        AbstractC0446v abstractC0446v = (AbstractC0446v) c2283e.d(4);
        try {
            X x9 = X.f4537c;
            x9.getClass();
            InterfaceC0426a0 a9 = x9.a(abstractC0446v.getClass());
            J5.a aVar = c0433h.f4568d;
            if (aVar == null) {
                aVar = new J5.a(c0433h);
            }
            a9.b(abstractC0446v, aVar, a6);
            a9.makeImmutable(abstractC0446v);
            if (abstractC0446v.g()) {
                return (C2283e) abstractC0446v;
            }
            throw new IOException(new h0().getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof A) {
                throw ((A) e4.getCause());
            }
            throw new IOException(e4.getMessage());
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof A) {
                throw ((A) e9.getCause());
            }
            throw e9;
        }
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
                return new Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC2282d.f20418a});
            case 3:
                return new C2283e();
            case 4:
                return new AbstractC0444t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v6 = PARSER;
                V v9 = v6;
                if (v6 == null) {
                    synchronized (C2283e.class) {
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

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
