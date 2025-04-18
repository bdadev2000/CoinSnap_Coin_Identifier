package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SchemaUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f19346a;

    /* renamed from: b, reason: collision with root package name */
    public static final UnknownFieldSchema f19347b;

    /* renamed from: c, reason: collision with root package name */
    public static final UnknownFieldSchema f19348c;
    public static final UnknownFieldSetLiteSchema d;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.preferences.protobuf.UnknownFieldSetLiteSchema, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f19346a = cls;
        f19347b = A(false);
        f19348c = A(true);
        d = new Object();
    }

    public static UnknownFieldSchema A(boolean z2) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (UnknownFieldSchema) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        SmallSortedMap smallSortedMap;
        FieldSet c2 = extensionSchema.c(obj2);
        if (c2.f19214a.isEmpty()) {
            return;
        }
        FieldSet d2 = extensionSchema.d(obj);
        d2.getClass();
        int i2 = 0;
        while (true) {
            smallSortedMap = c2.f19214a;
            if (i2 >= smallSortedMap.f19351b.size()) {
                break;
            }
            d2.m(smallSortedMap.d(i2));
            i2++;
        }
        Iterator it = smallSortedMap.e().iterator();
        while (it.hasNext()) {
            d2.m((Map.Entry) it.next());
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object D(int i2, int i3, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (obj == null) {
            obj = unknownFieldSchema.m();
        }
        unknownFieldSchema.e(i2, i3, obj);
        return obj;
    }

    public static void E(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.I(i2, list, z2);
    }

    public static void F(int i2, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.P(i2, list);
    }

    public static void G(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i2, list, z2);
    }

    public static void H(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.r(i2, list, z2);
    }

    public static void I(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.m(i2, list, z2);
    }

    public static void J(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i2, list, z2);
    }

    public static void K(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i2, list, z2);
    }

    public static void L(int i2, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.e(i2, list, schema);
    }

    public static void M(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i2, list, z2);
    }

    public static void N(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.M(i2, list, z2);
    }

    public static void O(int i2, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.z(i2, list, schema);
    }

    public static void P(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.H(i2, list, z2);
    }

    public static void Q(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i2, list, z2);
    }

    public static void R(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.K(i2, list, z2);
    }

    public static void S(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.o(i2, list, z2);
    }

    public static void T(int i2, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.d(i2, list);
    }

    public static void U(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.n(i2, list, z2);
    }

    public static void V(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.w(i2, list, z2);
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.S(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = CodedOutputStream.k0(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((ByteString) list.get(i3)).size();
            k02 += CodedOutputStream.m0(size2) + size2;
        }
        return k02;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + e(list);
    }

    public static int e(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.b0(intArrayList.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.b0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.W(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.X(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += CodedOutputStream.Z(i2, (MessageLite) list.get(i4), schema);
        }
        return i3;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + l(list);
    }

    public static int l(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.b0(intArrayList.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.b0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(longArrayList.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int o(int i2, Schema schema, Object obj) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.d0((LazyFieldLite) obj) + CodedOutputStream.k0(i2);
        }
        int k02 = CodedOutputStream.k0(i2);
        int j2 = ((AbstractMessageLite) ((MessageLite) obj)).j(schema);
        return CodedOutputStream.m0(j2) + j2 + k02;
    }

    public static int p(int i2, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = CodedOutputStream.k0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof LazyFieldLite) {
                k02 = CodedOutputStream.d0((LazyFieldLite) obj) + k02;
            } else {
                int j2 = ((AbstractMessageLite) ((MessageLite) obj)).j(schema);
                k02 = CodedOutputStream.m0(j2) + j2 + k02;
            }
        }
        return k02;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + r(list);
    }

    public static int r(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m0(CodedOutputStream.p0(intArrayList.d(i3)));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m0(CodedOutputStream.p0(((Integer) list.get(i3)).intValue()));
                i3++;
            }
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + t(list);
    }

    public static int t(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(CodedOutputStream.q0(longArrayList.d(i3)));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(CodedOutputStream.q0(((Long) list.get(i3)).longValue()));
                i3++;
            }
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int k02 = CodedOutputStream.k0(i2) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < size) {
                Object F = lazyStringList.F(i3);
                if (F instanceof ByteString) {
                    int size2 = ((ByteString) F).size();
                    k02 = CodedOutputStream.m0(size2) + size2 + k02;
                } else {
                    k02 = CodedOutputStream.j0((String) F) + k02;
                }
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    k02 = CodedOutputStream.m0(size3) + size3 + k02;
                } else {
                    k02 = CodedOutputStream.j0((String) obj) + k02;
                }
                i3++;
            }
        }
        return k02;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + w(list);
    }

    public static int w(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m0(intArrayList.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.k0(i2) * size) + y(list);
    }

    public static int y(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(longArrayList.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static Object z(int i2, List list, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                if (enumVerifier.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    obj = D(i2, intValue, obj, unknownFieldSchema);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(intValue2)) {
                    obj = D(i2, intValue2, obj, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
