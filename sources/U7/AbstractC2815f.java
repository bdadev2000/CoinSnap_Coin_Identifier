package u7;

import a.AbstractC0325a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import x0.AbstractC2914a;

/* renamed from: u7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2815f extends AbstractC0325a {
    public static int A(Object[] objArr, Object obj) {
        G7.j.e(objArr, "<this>");
        int i9 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i9 < length) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i9 < length2) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static char B(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void C(Object[] objArr, HashSet hashSet) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List D(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C2813d(objArr, false));
            }
            return android.support.v4.media.session.a.w(objArr[0]);
        }
        return C2824o.b;
    }

    public static List t(Object[] objArr) {
        G7.j.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        G7.j.d(asList, "asList(...)");
        return asList;
    }

    public static boolean u(long[] jArr, long j7) {
        int length = jArr.length;
        int i9 = 0;
        while (true) {
            if (i9 < length) {
                if (j7 == jArr[i9]) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 < 0) {
            return false;
        }
        return true;
    }

    public static void v(byte[] bArr, int i9, int i10, byte[] bArr2, int i11) {
        G7.j.e(bArr, "<this>");
        G7.j.e(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i9, i11 - i10);
    }

    public static final void w(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        G7.j.e(objArr, "<this>");
        G7.j.e(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i9, i11 - i10);
    }

    public static byte[] x(int i9, int i10, byte[] bArr) {
        G7.j.e(bArr, "<this>");
        int length = bArr.length;
        if (i10 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i9, i10);
            G7.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException(AbstractC2914a.c(i10, length, "toIndex (", ") is greater than size (", ")."));
    }

    public static void y(Object[] objArr, int i9, int i10) {
        G7.j.e(objArr, "<this>");
        Arrays.fill(objArr, i9, i10, (Object) null);
    }

    public static ArrayList z(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
