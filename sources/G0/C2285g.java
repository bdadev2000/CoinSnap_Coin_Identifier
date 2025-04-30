package g0;

import androidx.datastore.preferences.protobuf.AbstractC0427b;
import androidx.datastore.preferences.protobuf.AbstractC0444t;
import androidx.datastore.preferences.protobuf.AbstractC0446v;
import androidx.datastore.preferences.protobuf.AbstractC0449y;
import androidx.datastore.preferences.protobuf.C0432g;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InterfaceC0448x;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.Z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import z.AbstractC2965e;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285g extends AbstractC0446v {
    private static final C2285g DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0448x strings_ = Y.f4539f;

    static {
        C2285g c2285g = new C2285g();
        DEFAULT_INSTANCE = c2285g;
        AbstractC0446v.h(C2285g.class, c2285g);
    }

    public static void i(C2285g c2285g, Iterable iterable) {
        int i9;
        InterfaceC0448x interfaceC0448x = c2285g.strings_;
        if (!((AbstractC0427b) interfaceC0448x).b) {
            int size = interfaceC0448x.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            c2285g.strings_ = interfaceC0448x.mutableCopyWithCapacity(i9);
        }
        List list = c2285g.strings_;
        Charset charset = AbstractC0449y.f4610a;
        iterable.getClass();
        if (iterable instanceof D) {
            List underlyingElements = ((D) iterable).getUnderlyingElements();
            D d2 = (D) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (d2.size() - size2) + " is null.";
                    for (int size3 = d2.size() - 1; size3 >= size2; size3--) {
                        d2.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0432g) {
                    d2.a((C0432g) obj);
                } else {
                    d2.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof W) {
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
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static C2285g j() {
        return DEFAULT_INSTANCE;
    }

    public static C2284f l() {
        return (C2284f) ((AbstractC0444t) DEFAULT_INSTANCE.d(5));
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
                return new Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C2285g();
            case 4:
                return new AbstractC0444t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v6 = PARSER;
                V v9 = v6;
                if (v6 == null) {
                    synchronized (C2285g.class) {
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

    public final InterfaceC0448x k() {
        return this.strings_;
    }
}
