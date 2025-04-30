package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4545a;
    public static final j0 b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f4546c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f4547d;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.preferences.protobuf.j0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4545a = cls;
        b = A(false);
        f4546c = A(true);
        f4547d = new Object();
    }

    public static j0 A(boolean z8) {
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
            return (j0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(j0 j0Var, Object obj, Object obj2) {
        j0Var.getClass();
        AbstractC0446v abstractC0446v = (AbstractC0446v) obj;
        i0 i0Var = abstractC0446v.unknownFields;
        i0 i0Var2 = ((AbstractC0446v) obj2).unknownFields;
        if (!i0Var2.equals(i0.f4576f)) {
            int i9 = i0Var.f4577a + i0Var2.f4577a;
            int[] copyOf = Arrays.copyOf(i0Var.b, i9);
            System.arraycopy(i0Var2.b, 0, copyOf, i0Var.f4577a, i0Var2.f4577a);
            Object[] copyOf2 = Arrays.copyOf(i0Var.f4578c, i9);
            System.arraycopy(i0Var2.f4578c, 0, copyOf2, i0Var.f4577a, i0Var2.f4577a);
            i0Var = new i0(i9, copyOf, copyOf2, true);
        }
        abstractC0446v.unknownFields = i0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void D(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11++;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.S(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.U(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void E(int i9, List list, J j7) {
        if (list != null && !list.isEmpty()) {
            j7.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((C0435j) j7.f4515a).W(i9, (C0432g) list.get(i10));
            }
        }
    }

    public static void F(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 8;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.b0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c0435j.getClass();
                c0435j.a0(i9, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
        }
    }

    public static void G(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0435j.C(((Integer) list.get(i12)).intValue());
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.d0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.c0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void H(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 4;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.Z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.Y(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void I(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 8;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.b0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.a0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void J(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 4;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.Z(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c0435j.getClass();
                c0435j.Y(i9, Float.floatToRawIntBits(floatValue));
                i10++;
            }
        }
    }

    public static void K(int i9, List list, J j7, InterfaceC0426a0 interfaceC0426a0) {
        if (list != null && !list.isEmpty()) {
            j7.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                j7.h(i9, list.get(i10), interfaceC0426a0);
            }
        }
    }

    public static void L(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0435j.C(((Integer) list.get(i12)).intValue());
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.d0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.c0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void M(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0435j.O(((Long) list.get(i12)).longValue());
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.m0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.l0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void N(int i9, List list, J j7, InterfaceC0426a0 interfaceC0426a0) {
        if (list != null && !list.isEmpty()) {
            j7.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                j7.k(i9, list.get(i10), interfaceC0426a0);
            }
        }
    }

    public static void O(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 4;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.Z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.Y(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void P(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger = C0435j.f4581h;
                    i11 += 8;
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.b0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.a0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void Q(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += C0435j.M((intValue >> 31) ^ (intValue << 1));
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    c0435j.k0((intValue2 >> 31) ^ (intValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                c0435j.j0(i9, (intValue3 >> 31) ^ (intValue3 << 1));
                i10++;
            }
        }
    }

    public static void R(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += C0435j.O((longValue >> 63) ^ (longValue << 1));
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    c0435j.m0((longValue2 >> 63) ^ (longValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                c0435j.l0(i9, (longValue3 >> 63) ^ (longValue3 << 1));
                i10++;
            }
        }
    }

    public static void S(int i9, List list, J j7) {
        if (list != null && !list.isEmpty()) {
            j7.getClass();
            boolean z8 = list instanceof D;
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                D d2 = (D) list;
                while (i10 < list.size()) {
                    Object raw = d2.getRaw(i10);
                    if (raw instanceof String) {
                        c0435j.g0(i9, (String) raw);
                    } else {
                        c0435j.W(i9, (C0432g) raw);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.g0(i9, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void T(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0435j.M(((Integer) list.get(i12)).intValue());
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.k0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.j0(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void U(int i9, List list, J j7, boolean z8) {
        if (list != null && !list.isEmpty()) {
            C0435j c0435j = (C0435j) j7.f4515a;
            int i10 = 0;
            if (z8) {
                c0435j.i0(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0435j.O(((Long) list.get(i12)).longValue());
                }
                c0435j.k0(i11);
                while (i10 < list.size()) {
                    c0435j.m0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                c0435j.l0(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static int a(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0435j.s(i9) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K5 = C0435j.K(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            K5 += C0435j.u((C0432g) list.get(i10));
        }
        return K5;
    }

    public static int d(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0447w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0435j.C(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int f(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0435j.x(i9) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0435j.y(i9) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i9, List list, InterfaceC0426a0 interfaceC0426a0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C0435j.A(i9, (AbstractC0425a) list.get(i11), interfaceC0426a0);
        }
        return i10;
    }

    public static int k(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0447w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0435j.C(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int m(int i9, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0435j.K(i9) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0435j.O(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static int o(int i9, Object obj, InterfaceC0426a0 interfaceC0426a0) {
        int K5 = C0435j.K(i9);
        int b8 = ((AbstractC0425a) obj).b(interfaceC0426a0);
        return C0435j.M(b8) + b8 + K5;
    }

    public static int p(int i9, List list, InterfaceC0426a0 interfaceC0426a0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K5 = C0435j.K(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int b8 = ((AbstractC0425a) list.get(i10)).b(interfaceC0426a0);
            K5 += C0435j.M(b8) + b8;
        }
        return K5;
    }

    public static int q(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0447w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i9 += C0435j.M((intValue >> 31) ^ (intValue << 1));
        }
        return i9;
    }

    public static int s(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i9 += C0435j.O((longValue >> 63) ^ (longValue << 1));
        }
        return i9;
    }

    public static int u(int i9, List list) {
        int J8;
        int J9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int K5 = C0435j.K(i9) * size;
        if (list instanceof D) {
            D d2 = (D) list;
            while (i10 < size) {
                Object raw = d2.getRaw(i10);
                if (raw instanceof C0432g) {
                    J9 = C0435j.u((C0432g) raw);
                } else {
                    J9 = C0435j.J((String) raw);
                }
                K5 = J9 + K5;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof C0432g) {
                    J8 = C0435j.u((C0432g) obj);
                } else {
                    J8 = C0435j.J((String) obj);
                }
                K5 = J8 + K5;
                i10++;
            }
        }
        return K5;
    }

    public static int v(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0447w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0435j.M(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int x(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0435j.K(i9) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += C0435j.O(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static Object z(int i9, List list, Object obj, j0 j0Var) {
        return obj;
    }
}
