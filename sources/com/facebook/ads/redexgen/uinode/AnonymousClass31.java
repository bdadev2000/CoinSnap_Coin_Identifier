package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.31, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass31<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"BrVHgBkmBksyBnnjIq0pHnqXAu9AUg3j", "iIth6RrlZFIJsCIcgsKekGbs32ChyRjv", "Uwdt1z4SmD1Mf7UvGeSYdNXOfhFYTYnY", "QITUqyWPG2VnlGrB2a6hYhF3R3KaavLD", "arDW8RiIBmWFNCZvgTvY8WvuJ76u3VTs", "pOGA2rk9V0ZEl", "438Cia9wbNYnLnXWpHR8BTCUnyjltaF2", "slnYcYZFDBEgJMtczrpzy3D6NQdPiCOq"};
    public int[] A01 = AbstractC02882r.A00;
    public Object[] A02 = AbstractC02882r.A02;
    public int A00 = 0;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
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
    public final V A0A(int i10) {
        int i11;
        Object[] objArr = this.A02;
        V v10 = (V) objArr[(i10 << 1) + 1];
        int i12 = this.A00;
        if (i12 <= 1) {
            A06(this.A01, objArr, i12);
            this.A01 = AbstractC02882r.A00;
            this.A02 = AbstractC02882r.A02;
            i11 = 0;
        } else {
            i11 = i12 - 1;
            int[] iArr = this.A01;
            if (iArr.length <= 8 || this.A00 >= iArr.length / 3) {
                if (i10 < i11) {
                    System.arraycopy(iArr, i10 + 1, iArr, i10, i11 - i10);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, (i10 + 1) << 1, objArr2, i10 << 1, (i11 - i10) << 1);
                }
                Object[] objArr3 = this.A02;
                objArr3[i11 << 1] = null;
                objArr3[(i11 << 1) + 1] = null;
            } else {
                int i13 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArr2 = this.A01;
                Object[] objArr4 = this.A02;
                A05(i13);
                if (i12 != this.A00) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr2, 0, this.A01, 0, i10);
                    System.arraycopy(objArr4, 0, this.A02, 0, i10 << 1);
                }
                if (i10 < i11) {
                    System.arraycopy(iArr2, i10 + 1, this.A01, i10, i11 - i10);
                    System.arraycopy(objArr4, (i10 + 1) << 1, this.A02, i10 << 1, (i11 - i10) << 1);
                }
            }
        }
        int i14 = this.A00;
        String[] strArr = A08;
        if (strArr[0].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[0] = "xFHRCOjHDqSI1UlNRZSx5FadcPcGQITj";
        strArr2[1] = "4ZMke5GLOi53P3lo3UgzHK3l5Qzb3367";
        if (i12 != i14) {
            throw new ConcurrentModificationException();
        }
        this.A00 = i11;
        return v10;
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
            for (int i10 = 0; i10 < this.A00; i10++) {
                try {
                    K A09 = A09(i10);
                    V A0B = A0B(i10);
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
        for (int i11 = 0; i11 < this.A00; i11++) {
            try {
                K A092 = A09(i11);
                V A0B2 = A0B(i11);
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
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        int i13 = this.A00;
        while (i11 < i13) {
            Object obj = objArr[i12];
            i10 += iArr[i11] ^ (obj == null ? 0 : obj.hashCode());
            i11++;
            i12 += 2;
        }
        return i10;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final V put(K k10, V v10) {
        int hashCode;
        int A01;
        int i10 = this.A00;
        if (k10 == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k10.hashCode();
            A01 = A01(k10, hashCode);
        }
        if (A01 >= 0) {
            int i11 = (A01 << 1) + 1;
            Object[] objArr = this.A02;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = A01 ^ (-1);
        if (i10 >= this.A01.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArr = this.A01;
            Object[] objArr2 = this.A02;
            A05(i13);
            if (i10 != this.A00) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.A01;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
            }
            A06(iArr, objArr2, i10);
        }
        if (i12 < i10) {
            int[] iArr3 = this.A01;
            System.arraycopy(iArr3, i12, iArr3, i12 + 1, i10 - i12);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i12 << 1, objArr3, (i12 + 1) << 1, (this.A00 - i12) << 1);
        }
        int i14 = this.A00;
        if (i10 == i14) {
            int[] iArr4 = this.A01;
            if (i12 < iArr4.length) {
                iArr4[i12] = hashCode;
                Object[] objArr4 = this.A02;
                objArr4[i12 << 1] = k10;
                objArr4[(i12 << 1) + 1] = v10;
                this.A00 = i14 + 1;
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
        int i10 = this.A00;
        if (i10 == 0) {
            return -1;
        }
        int A02 = A02(this.A01, i10, 0);
        if (A02 < 0) {
            return A02;
        }
        int N = A02 << 1;
        if (this.A02[N] == null) {
            return A02;
        }
        int i11 = A02 + 1;
        while (i11 < i10) {
            int N2 = this.A01[i11];
            if (N2 != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[2];
            String str2 = strArr[4];
            int index = str.charAt(15);
            int N3 = str2.charAt(15);
            if (index != N3) {
                throw new RuntimeException();
            }
            A08[5] = "5BliZlAS3QBBz9o";
            int N4 = i11 << 1;
            if (objArr[N4] == null) {
                return i11;
            }
            i11++;
        }
        for (int end = A02 - 1; end >= 0; end--) {
            int N5 = this.A01[end];
            if (N5 != 0) {
                break;
            }
            int N6 = end << 1;
            if (this.A02[N6] == null) {
                return end;
            }
        }
        int N7 = i11 ^ (-1);
        return N7;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i10) {
        int i11 = this.A00;
        if (i11 == 0) {
            if (A08[7].charAt(6) != 'Z') {
                throw new RuntimeException();
            }
            A08[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            return -1;
        }
        int end = A02(this.A01, i11, i10);
        if (end < 0) {
            return end;
        }
        int N = end << 1;
        if (obj.equals(this.A02[N])) {
            return end;
        }
        int i12 = end + 1;
        while (i12 < i11) {
            int N2 = this.A01[i12];
            if (N2 != i10) {
                break;
            }
            int N3 = i12 << 1;
            if (obj.equals(this.A02[N3])) {
                return i12;
            }
            i12++;
        }
        for (int end2 = end - 1; end2 >= 0; end2--) {
            int N4 = this.A01[end2];
            if (N4 != i10) {
                break;
            }
            int N5 = end2 << 1;
            if (obj.equals(this.A02[N5])) {
                return end2;
            }
        }
        int N6 = i12 ^ (-1);
        return N6;
    }

    public static int A02(int[] iArr, int i10, int i11) {
        try {
            return AbstractC02882r.A02(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i10) {
        if (i10 == 8) {
            synchronized (C1111a5.class) {
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
        } else if (i10 == 4) {
            synchronized (C1111a5.class) {
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
        this.A01 = new int[i10];
        this.A02 = new Object[i10 << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C1111a5.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1111a5.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i10 = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    int N = i11 >> 1;
                    return N;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                int N2 = i12 >> 1;
                return N2;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i10) {
        return (K) this.A02[i10 << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i10) {
        return (V) this.A02[(i10 << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.A02;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i10) {
        int i11 = this.A00;
        int osize = this.A01.length;
        if (osize < i10) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i10);
            int osize2 = this.A00;
            if (osize2 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i11);
                int osize3 = i11 << 1;
                System.arraycopy(objArr, 0, this.A02, 0, osize3);
            }
            A06(iArr, objArr, i11);
        }
        int osize4 = this.A00;
        if (osize4 == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.31 != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            int i10 = this.A00;
            int[] ohashes = AbstractC02882r.A00;
            this.A01 = ohashes;
            this.A02 = AbstractC02882r.A02;
            this.A00 = 0;
            A06(iArr, objArr, i10);
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
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.A00; i10++) {
            if (i10 > 0) {
                sb2.append(A03(10, 2, 45));
            }
            K A09 = A09(i10);
            int i11 = A08[5].length();
            if (i11 == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "5MoFeGsxqoTSR8Y6IShdOiE5VevAoRo0";
            strArr[3] = "kGPruxXsJMcA49LPD5OztVvQJS4oto1Y";
            String A032 = A03(0, 10, 42);
            if (A09 != this) {
                sb2.append(A09);
            } else {
                sb2.append(A032);
            }
            sb2.append('=');
            V A0B = A0B(i10);
            if (A0B != this) {
                sb2.append(A0B);
            } else {
                sb2.append(A032);
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
