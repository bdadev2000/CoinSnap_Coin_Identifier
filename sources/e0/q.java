package e0;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class q extends b1.f0 {
    public static List J(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        p0.a.r(asList, "asList(...)");
        return asList;
    }

    public static y0.j K(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        return objArr.length == 0 ? y0.d.f31426a : new p(objArr, 0);
    }

    public static double L(Float[] fArr) {
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i2 = 0;
        for (Float f2 : fArr) {
            d += f2.floatValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d / i2;
    }

    public static int M(Iterable iterable, int i2) {
        p0.a.s(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static boolean N(Object[] objArr, Object obj) {
        p0.a.s(objArr, "<this>");
        return d0(objArr, obj) >= 0;
    }

    public static void O(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        p0.a.s(iArr, "<this>");
        p0.a.s(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void P(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        p0.a.s(objArr, "<this>");
        p0.a.s(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static void Q(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        p0.a.s(bArr, "<this>");
        p0.a.s(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    public static void R(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        p0.a.s(cArr, "<this>");
        p0.a.s(cArr2, "destination");
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void S(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        O(i2, 0, i3, iArr, iArr2);
    }

    public static /* synthetic */ void T(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        P(0, i2, objArr, i3, objArr2);
    }

    public static byte[] U(int i2, byte[] bArr, int i3) {
        p0.a.s(bArr, "<this>");
        b1.f0.h(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        p0.a.r(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] V(int i2, int i3, Object[] objArr) {
        p0.a.s(objArr, "<this>");
        b1.f0.h(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        p0.a.r(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void W(int i2, int i3, Object[] objArr) {
        p0.a.s(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    public static void X(int[] iArr, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        p0.a.s(iArr, "<this>");
        Arrays.fill(iArr, 0, i3, i2);
    }

    public static void Y(long[] jArr) {
        int length = jArr.length;
        p0.a.s(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static void Z(Object[] objArr) {
        int length = objArr.length;
        p0.a.s(objArr, "<this>");
        Arrays.fill(objArr, 0, length, (Object) null);
    }

    public static ArrayList a0(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object b0(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.g, w0.e] */
    public static w0.g c0(int[] iArr) {
        return new w0.e(0, iArr.length - 1, 1);
    }

    public static int d0(Object[] objArr, Object obj) {
        p0.a.s(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (p0.a.g(obj, objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static String e0(Object[] objArr, String str, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        CharSequence charSequence = (i2 & 2) != 0 ? "" : null;
        String str2 = (i2 & 4) == 0 ? null : "";
        int i3 = (i2 & 8) != 0 ? -1 : 0;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        p0.a.s(objArr, "<this>");
        p0.a.s(str, "separator");
        p0.a.s(charSequence, "prefix");
        p0.a.s(str2, "postfix");
        p0.a.s(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            p0.a.e(sb, obj, null);
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append((CharSequence) str3);
        }
        sb.append((CharSequence) str2);
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    public static int f0(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        w0.f it = new w0.e(1, iArr.length - 1, 1).iterator();
        while (it.f31411c) {
            int i3 = iArr[it.b()];
            if (i2 < i3) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static LinkedHashSet g0(Set set, Object obj) {
        p0.a.s(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.jvm.internal.q.g(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static char h0(char[] cArr) {
        p0.a.s(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List i0(Object[] objArr, w0.g gVar) {
        p0.a.s(objArr, "<this>");
        p0.a.s(gVar, "indices");
        return gVar.isEmpty() ? w.f30218a : J(V(Integer.valueOf(gVar.f31406a).intValue(), Integer.valueOf(gVar.f31407b).intValue() + 1, objArr));
    }

    public static final void j0(HashSet hashSet, Object[] objArr) {
        p0.a.s(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List k0(float[] fArr) {
        p0.a.s(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return w.f30218a;
        }
        if (length == 1) {
            return b1.f0.u(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static List l0(int[] iArr) {
        p0.a.s(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return w.f30218a;
        }
        if (length == 1) {
            return b1.f0.u(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List m0(long[] jArr) {
        p0.a.s(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return w.f30218a;
        }
        if (length == 1) {
            return b1.f0.u(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static List n0(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? p0(objArr) : b1.f0.u(objArr[0]) : w.f30218a;
    }

    public static List o0(boolean[] zArr) {
        p0.a.s(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return w.f30218a;
        }
        if (length == 1) {
            return b1.f0.u(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    public static ArrayList p0(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        return new ArrayList(new m(objArr, false));
    }

    public static Set q0(Object[] objArr) {
        p0.a.s(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return y.f30220a;
        }
        if (length == 1) {
            return b1.f0.B(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.jvm.internal.q.g(objArr.length));
        j0(linkedHashSet, objArr);
        return linkedHashSet;
    }
}
