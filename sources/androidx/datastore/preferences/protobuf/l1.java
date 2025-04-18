package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l1 {
    public static final Class a;

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f1423b;

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f1424c;

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f1425d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        f1423b = A(false);
        f1424c = A(true);
        f1425d = new t1();
    }

    public static t1 A(boolean z10) {
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
            return (t1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(t1 t1Var, Object obj, Object obj2) {
        t1Var.getClass();
        e0 e0Var = (e0) obj;
        s1 s1Var = e0Var.unknownFields;
        s1 s1Var2 = ((e0) obj2).unknownFields;
        s1 s1Var3 = s1.f1462f;
        if (!s1Var3.equals(s1Var2)) {
            if (s1Var3.equals(s1Var)) {
                int i10 = s1Var.a + s1Var2.a;
                int[] copyOf = Arrays.copyOf(s1Var.f1463b, i10);
                System.arraycopy(s1Var2.f1463b, 0, copyOf, s1Var.a, s1Var2.a);
                Object[] copyOf2 = Arrays.copyOf(s1Var.f1464c, i10);
                System.arraycopy(s1Var2.f1464c, 0, copyOf2, s1Var.a, s1Var2.a);
                s1Var = new s1(i10, copyOf, copyOf2, true);
            } else {
                s1Var.getClass();
                if (!s1Var2.equals(s1Var3)) {
                    if (s1Var.f1466e) {
                        int i11 = s1Var.a + s1Var2.a;
                        s1Var.a(i11);
                        System.arraycopy(s1Var2.f1463b, 0, s1Var.f1463b, s1Var.a, s1Var2.a);
                        System.arraycopy(s1Var2.f1464c, 0, s1Var.f1464c, s1Var.a, s1Var2.a);
                        s1Var.a = i11;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        e0Var.unknownFields = s1Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = r.f1459p;
                    i12++;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).k0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).l0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void E(int i10, List list, fb.c cVar) {
        if (list != null && !list.isEmpty()) {
            cVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((r) cVar.f17773c).n0(i10, (k) list.get(i11));
            }
        }
    }

    public static void F(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = r.f1459p;
                    i12 += 8;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    r rVar = (r) cVar.f17773c;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    rVar.getClass();
                    rVar.s0(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                r rVar2 = (r) cVar.f17773c;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                rVar2.getClass();
                rVar2.r0(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void G(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += r.W(((Integer) list.get(i13)).intValue());
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).u0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).t0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = r.f1459p;
                    i12 += 4;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).q0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = r.f1459p;
                    i12 += 8;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).s0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = r.f1459p;
                    i12 += 4;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    r rVar = (r) cVar.f17773c;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    rVar.getClass();
                    rVar.q0(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                r rVar2 = (r) cVar.f17773c;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                rVar2.getClass();
                rVar2.p0(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void K(int i10, List list, fb.c cVar, k1 k1Var) {
        if (list != null && !list.isEmpty()) {
            cVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                cVar.E(i10, k1Var, list.get(i11));
            }
        }
    }

    public static void L(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += r.W(((Integer) list.get(i13)).intValue());
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).u0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).t0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += r.i0(((Long) list.get(i13)).longValue());
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).D0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).C0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void N(int i10, List list, fb.c cVar, k1 k1Var) {
        if (list != null && !list.isEmpty()) {
            cVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                cVar.H(i10, k1Var, list.get(i11));
            }
        }
    }

    public static void O(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = r.f1459p;
                    i12 += 4;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).q0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = r.f1459p;
                    i12 += 8;
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).s0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += r.g0((intValue >> 31) ^ (intValue << 1));
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    r rVar = (r) cVar.f17773c;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    rVar.B0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                r rVar2 = (r) cVar.f17773c;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                rVar2.A0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += r.i0((longValue >> 63) ^ (longValue << 1));
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    r rVar = (r) cVar.f17773c;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    rVar.D0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                r rVar2 = (r) cVar.f17773c;
                long longValue3 = ((Long) list.get(i11)).longValue();
                rVar2.C0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, fb.c cVar) {
        if (list != null && !list.isEmpty()) {
            cVar.getClass();
            int i11 = 0;
            if (list instanceof m0) {
                m0 m0Var = (m0) list;
                while (i11 < list.size()) {
                    Object raw = m0Var.getRaw(i11);
                    if (raw instanceof String) {
                        ((r) cVar.f17773c).x0(i10, (String) raw);
                    } else {
                        ((r) cVar.f17773c).n0(i10, (k) raw);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                ((r) cVar.f17773c).x0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += r.g0(((Integer) list.get(i13)).intValue());
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).B0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).A0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, fb.c cVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((r) cVar.f17773c).z0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += r.i0(((Long) list.get(i13)).longValue());
                }
                ((r) cVar.f17773c).B0(i12);
                while (i11 < list.size()) {
                    ((r) cVar.f17773c).D0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            cVar.getClass();
            while (i11 < list.size()) {
                ((r) cVar.f17773c).C0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.N(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e02 = r.e0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = ((k) list.get(i11)).size();
            e02 += r.g0(size2) + size2;
        }
        return e02;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r.W(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.R(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r.S(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, k1 k1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += r.U(i10, (b) list.get(i12), k1Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r.W(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (r.e0(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r.i0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int o(int i10, k1 k1Var, Object obj) {
        int e02 = r.e0(i10);
        int a10 = ((b) obj).a(k1Var);
        return r.g0(a10) + a10 + e02;
    }

    public static int p(int i10, List list, k1 k1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e02 = r.e0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int a10 = ((b) list.get(i11)).a(k1Var);
            e02 += r.g0(a10) + a10;
        }
        return e02;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = ((Integer) list.get(i11)).intValue();
            i10 += r.g0((intValue >> 31) ^ (intValue << 1));
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += r.i0((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int d02;
        int d03;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int e02 = r.e0(i10) * size;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            while (i11 < size) {
                Object raw = m0Var.getRaw(i11);
                if (raw instanceof k) {
                    int size2 = ((k) raw).size();
                    d03 = r.g0(size2) + size2;
                } else {
                    d03 = r.d0((String) raw);
                }
                e02 += d03;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof k) {
                    int size3 = ((k) obj).size();
                    d02 = r.g0(size3) + size3;
                } else {
                    d02 = r.d0((String) obj);
                }
                e02 += d02;
                i11++;
            }
        }
        return e02;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r.g0(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (r.e0(i10) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof q0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r.i0(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static Object z(Object obj, int i10, List list, Object obj2, t1 t1Var) {
        return obj2;
    }
}
