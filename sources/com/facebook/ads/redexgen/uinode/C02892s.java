package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.2s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02892s<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final E A02(long j3, E e2) {
        E e10;
        int A03 = AbstractC02882r.A03(this.A02, this.A00, j3);
        return (A03 < 0 || (e10 = (E) this.A03[A03]) == A05) ? e2 : e10;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, Ascii.ESC, 118, 90, 75, Ascii.DC2, 91, 87, 51, 53};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0B(long j3, E e2) {
        int A03 = AbstractC02882r.A03(this.A02, this.A00, j3);
        if (A03 >= 0) {
            this.A03[A03] = e2;
            return;
        }
        int i10 = A03 ^ (-1);
        int i11 = this.A00;
        if (i10 < i11) {
            Object[] objArr = this.A03;
            if (objArr[i10] == A05) {
                this.A02[i10] = j3;
                objArr[i10] = e2;
                return;
            }
        }
        if (this.A01 && i11 >= this.A02.length) {
            A04();
            i10 = AbstractC02882r.A03(this.A02, this.A00, j3) ^ (-1);
        }
        int i12 = this.A00;
        if (i12 >= this.A02.length) {
            int A00 = AbstractC02882r.A00(i12 + 1);
            long[] jArr = new long[A00];
            Object[] objArr2 = new Object[A00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i13 = this.A00;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, i10, jArr3, i10 + 1, i13 - i10);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i10, objArr4, i10 + 1, this.A00 - i10);
        }
        this.A02[i10] = j3;
        this.A03[i10] = e2;
        this.A00++;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final String toString() {
        if (A06() <= 0) {
            return A03(12, 2, 126);
        }
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.A00; i10++) {
            if (i10 > 0) {
                sb2.append(A03(10, 2, 65));
            }
            sb2.append(A00(i10));
            sb2.append('=');
            E A07 = A07(i10);
            if (A07 != this) {
                sb2.append(A07);
            } else {
                sb2.append(A03(0, 10, 13));
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C02892s() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C02892s(int i10) {
        this.A01 = false;
        if (i10 == 0) {
            this.A02 = AbstractC02882r.A01;
            this.A03 = AbstractC02882r.A02;
        } else {
            int A00 = AbstractC02882r.A00(i10);
            this.A02 = new long[A00];
            this.A03 = new Object[A00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i10) {
        if (this.A01) {
            A04();
        }
        return this.A02[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C02892s<E> clone() {
        C02892s<E> c02892s = null;
        try {
            c02892s = (C02892s) super.clone();
            c02892s.A02 = (long[]) this.A02.clone();
            c02892s.A03 = (Object[]) this.A03.clone();
            return c02892s;
        } catch (CloneNotSupportedException unused) {
            return c02892s;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i10 = this.A00;
        int i11 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != A05) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.A01 = false;
        this.A00 = i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i10) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j3) {
        return A02(j3, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i10 = this.A00;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i10) {
        Object[] objArr = this.A03;
        Object obj = objArr[i10];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.A01 = true;
        }
    }
}
