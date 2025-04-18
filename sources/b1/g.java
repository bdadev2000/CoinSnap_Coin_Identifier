package b1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.g1;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.m0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends e0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile f1 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private g0 strings_ = i1.f1374f;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        e0.l(g.class, gVar);
    }

    public static void o(g gVar, Iterable iterable) {
        int i10;
        g0 g0Var = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.c) g0Var).f1353b) {
            int size = g0Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            gVar.strings_ = g0Var.mutableCopyWithCapacity(i10);
        }
        List list = gVar.strings_;
        Charset charset = h0.a;
        iterable.getClass();
        if (iterable instanceof m0) {
            List underlyingElements = ((m0) iterable).getUnderlyingElements();
            m0 m0Var = (m0) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (m0Var.size() - size2) + " is null.";
                    int size3 = m0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        } else {
                            m0Var.remove(size3);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof k) {
                    m0Var.k((k) obj);
                } else {
                    m0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof g1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        break;
                    } else {
                        list.remove(size5);
                    }
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static g p() {
        return DEFAULT_INSTANCE;
    }

    public static f r() {
        return (f) ((b0) DEFAULT_INSTANCE.e(d0.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final Object e(d0 d0Var) {
        switch (d0Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new j1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case NEW_MUTABLE_INSTANCE:
                return new g();
            case NEW_BUILDER:
                return new f();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                f1 f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (g.class) {
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

    public final g0 q() {
        return this.strings_;
    }
}
