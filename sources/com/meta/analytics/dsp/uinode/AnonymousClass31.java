package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.31, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass31<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"BrVHgBkmBksyBnnjIq0pHnqXAu9AUg3j", "iIth6RrlZFIJsCIcgsKekGbs32ChyRjv", "Uwdt1z4SmD1Mf7UvGeSYdNXOfhFYTYnY", "QITUqyWPG2VnlGrB2a6hYhF3R3KaavLD", "arDW8RiIBmWFNCZvgTvY8WvuJ76u3VTs", "pOGA2rk9V0ZEl", "438Cia9wbNYnLnXWpHR8BTCUnyjltaF2", "slnYcYZFDBEgJMtczrpzy3D6NQdPiCOq"};
    public int[] A01 = AbstractC08542r.A00;
    public Object[] A02 = AbstractC08542r.A02;
    public int A00 = 0;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A08[5].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "Xtbm9MFCOkvOfDux5Me3XhO5K6Bs7EUd";
        strArr[1] = "PZcI0QBOeZ0LYFf6gJzuFWLZdUoY6utj";
        A07 = new byte[]{-69, 7, -5, -4, 6, -77, -32, -12, 3, -68, -62, -74, 3, 5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final V A0A(int i9) {
        int i10;
        Object[] objArr = this.A02;
        V v6 = (V) objArr[(i9 << 1) + 1];
        int i11 = this.A00;
        if (i11 <= 1) {
            A06(this.A01, objArr, i11);
            this.A01 = AbstractC08542r.A00;
            this.A02 = AbstractC08542r.A02;
            i10 = 0;
        } else {
            i10 = i11 - 1;
            int[] iArr = this.A01;
            if (iArr.length <= 8 || this.A00 >= iArr.length / 3) {
                if (i9 < i10) {
                    System.arraycopy(iArr, i9 + 1, iArr, i9, i10 - i9);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, (i9 + 1) << 1, objArr2, i9 << 1, (i10 - i9) << 1);
                }
                Object[] objArr3 = this.A02;
                objArr3[i10 << 1] = null;
                objArr3[(i10 << 1) + 1] = null;
            } else {
                int i12 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArr2 = this.A01;
                Object[] objArr4 = this.A02;
                A05(i12);
                if (i11 != this.A00) {
                    throw new ConcurrentModificationException();
                }
                if (i9 > 0) {
                    System.arraycopy(iArr2, 0, this.A01, 0, i9);
                    System.arraycopy(objArr4, 0, this.A02, 0, i9 << 1);
                }
                if (i9 < i10) {
                    System.arraycopy(iArr2, i9 + 1, this.A01, i9, i10 - i9);
                    System.arraycopy(objArr4, (i9 + 1) << 1, this.A02, i9 << 1, (i10 - i9) << 1);
                }
            }
        }
        int i13 = this.A00;
        String[] strArr = A08;
        if (strArr[0].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[0] = "xFHRCOjHDqSI1UlNRZSx5FadcPcGQITj";
        strArr2[1] = "4ZMke5GLOi53P3lo3UgzHK3l5Qzb3367";
        if (i11 != i13) {
            throw new ConcurrentModificationException();
        }
        this.A00 = i10;
        return v6;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass31) {
            AnonymousClass31 anonymousClass31 = (AnonymousClass31) obj;
            if (size() != anonymousClass31.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.A00; i9++) {
                try {
                    K A09 = A09(i9);
                    V A0B = A0B(i9);
                    Object obj2 = anonymousClass31.get(A09);
                    if (A0B == null) {
                        if (obj2 == null && anonymousClass31.containsKey(A09)) {
                        }
                        return false;
                    }
                    if (!A0B.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.A00; i10++) {
            try {
                K A092 = A09(i10);
                V A0B2 = A0B(i10);
                Object obj3 = map.get(A092);
                if (A0B2 == null) {
                    if (obj3 == null && map.containsKey(A092)) {
                    }
                    return false;
                }
                if (!A0B2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        int i12 = this.A00;
        while (i10 < i12) {
            Object obj = objArr[i11];
            i9 += iArr[i10] ^ (obj == null ? 0 : obj.hashCode());
            i10++;
            i11 += 2;
        }
        return i9;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final V put(K k6, V v6) {
        int hashCode;
        int A01;
        int i9 = this.A00;
        if (k6 == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k6.hashCode();
            A01 = A01(k6, hashCode);
        }
        if (A01 >= 0) {
            int i10 = (A01 << 1) + 1;
            Object[] objArr = this.A02;
            V v9 = (V) objArr[i10];
            objArr[i10] = v6;
            return v9;
        }
        int i11 = A01 ^ (-1);
        if (i9 >= this.A01.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            int[] iArr = this.A01;
            Object[] objArr2 = this.A02;
            A05(i12);
            if (i9 != this.A00) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.A01;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
            }
            A06(iArr, objArr2, i9);
        }
        if (i11 < i9) {
            int[] iArr3 = this.A01;
            System.arraycopy(iArr3, i11, iArr3, i11 + 1, i9 - i11);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i11 << 1, objArr3, (i11 + 1) << 1, (this.A00 - i11) << 1);
        }
        int i13 = this.A00;
        if (i9 == i13) {
            int[] iArr4 = this.A01;
            if (i11 < iArr4.length) {
                iArr4[i11] = hashCode;
                Object[] objArr4 = this.A02;
                objArr4[i11 << 1] = k6;
                objArr4[(i11 << 1) + 1] = v6;
                this.A00 = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int i9 = this.A00;
        if (i9 == 0) {
            return -1;
        }
        int A02 = A02(this.A01, i9, 0);
        if (A02 < 0) {
            return A02;
        }
        int N8 = A02 << 1;
        if (this.A02[N8] == null) {
            return A02;
        }
        int i10 = A02 + 1;
        while (i10 < i9) {
            int N9 = this.A01[i10];
            if (N9 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[2];
            String str2 = strArr[4];
            int index = str.charAt(15);
            int N10 = str2.charAt(15);
            if (index != N10) {
                throw new RuntimeException();
            }
            A08[5] = "5BliZlAS3QBBz9o";
            int N11 = i10 << 1;
            if (objArr[N11] == null) {
                return i10;
            }
            i10++;
        }
        for (int end = A02 - 1; end >= 0; end--) {
            int N12 = this.A01[end];
            if (N12 != 0) {
                break;
            }
            int N13 = end << 1;
            if (this.A02[N13] == null) {
                return end;
            }
        }
        int N14 = i10 ^ (-1);
        return N14;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i9) {
        int i10 = this.A00;
        if (i10 == 0) {
            if (A08[7].charAt(6) != 'Z') {
                throw new RuntimeException();
            }
            A08[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            return -1;
        }
        int end = A02(this.A01, i10, i9);
        if (end < 0) {
            return end;
        }
        int N8 = end << 1;
        if (obj.equals(this.A02[N8])) {
            return end;
        }
        int i11 = end + 1;
        while (i11 < i10) {
            int N9 = this.A01[i11];
            if (N9 != i9) {
                break;
            }
            int N10 = i11 << 1;
            if (obj.equals(this.A02[N10])) {
                return i11;
            }
            i11++;
        }
        for (int end2 = end - 1; end2 >= 0; end2--) {
            int N11 = this.A01[end2];
            if (N11 != i9) {
                break;
            }
            int N12 = end2 << 1;
            if (obj.equals(this.A02[N12])) {
                return end2;
            }
        }
        int N13 = i11 ^ (-1);
        return N13;
    }

    public static int A02(int[] iArr, int i9, int i10) {
        try {
            return AbstractC08542r.A02(iArr, i9, i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i9) {
        if (i9 == 8) {
            synchronized (C1677a5.class) {
                Object[] objArr = A06;
                if (objArr != null) {
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i9 == 4) {
            synchronized (C1677a5.class) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i9];
        this.A02 = new Object[i9 << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i9) {
        if (iArr.length == 8) {
            synchronized (C1677a5.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i10 = (i9 << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1677a5.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i11 = (i9 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i9 = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    int N8 = i10 >> 1;
                    return N8;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                int N9 = i11 >> 1;
                return N9;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i9) {
        return (K) this.A02[i9 << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i9) {
        return (V) this.A02[(i9 << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i9, V v6) {
        int i10 = (i9 << 1) + 1;
        Object[] objArr = this.A02;
        V v9 = (V) objArr[i10];
        objArr[i10] = v6;
        return v9;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i9) {
        int i10 = this.A00;
        int osize = this.A01.length;
        if (osize < i9) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i9);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i10);
                int osize3 = i10 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i10);
        }
        int osize4 = this.A00;
        if (osize4 == i10) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            int i9 = this.A00;
            int[] ohashes = AbstractC08542r.A00;
            this.A01 = ohashes;
            this.A02 = AbstractC08542r.A02;
            this.A00 = 0;
            A06(iArr, objArr, i9);
        }
        if (this.A00 <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int A082 = A08(obj);
        if (A082 >= 0) {
            return (V) this.A02[(A082 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int index = A08(obj);
        if (index >= 0) {
            return A0A(index);
        }
        String[] strArr = A08;
        if (strArr[2].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        A08[5] = "POG7nMkVNzdGaGlGxNMu0E80q";
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 31);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.A00; i9++) {
            if (i9 > 0) {
                sb.append(A03(10, 2, 45));
            }
            K A09 = A09(i9);
            int i10 = A08[5].length();
            if (i10 == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "5MoFeGsxqoTSR8Y6IShdOiE5VevAoRo0";
            strArr[3] = "kGPruxXsJMcA49LPD5OztVvQJS4oto1Y";
            String A032 = A03(0, 10, 42);
            if (A09 != this) {
                sb.append(A09);
            } else {
                sb.append(A032);
            }
            sb.append('=');
            V A0B = A0B(i9);
            if (A0B != this) {
                sb.append(A0B);
            } else {
                sb.append(A032);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
