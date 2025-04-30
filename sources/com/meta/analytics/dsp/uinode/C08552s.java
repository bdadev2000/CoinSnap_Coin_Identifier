package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08552s<E> implements Cloneable {
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
    private final E A02(long j7, E e4) {
        E e9;
        int A03 = AbstractC08542r.A03(this.A02, this.A00, j7);
        return (A03 < 0 || (e9 = (E) this.A03[A03]) == A05) ? e4 : e9;
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 54);
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
    public final void A0B(long j7, E e4) {
        int A03 = AbstractC08542r.A03(this.A02, this.A00, j7);
        if (A03 >= 0) {
            this.A03[A03] = e4;
            return;
        }
        int i9 = A03 ^ (-1);
        int i10 = this.A00;
        if (i9 < i10) {
            Object[] objArr = this.A03;
            if (objArr[i9] == A05) {
                this.A02[i9] = j7;
                objArr[i9] = e4;
                return;
            }
        }
        if (this.A01 && i10 >= this.A02.length) {
            A04();
            i9 = AbstractC08542r.A03(this.A02, this.A00, j7) ^ (-1);
        }
        int i11 = this.A00;
        if (i11 >= this.A02.length) {
            int A00 = AbstractC08542r.A00(i11 + 1);
            long[] jArr = new long[A00];
            Object[] objArr2 = new Object[A00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i12 = this.A00;
        if (i12 - i9 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, i9, jArr3, i9 + 1, i12 - i9);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i9, objArr4, i9 + 1, this.A00 - i9);
        }
        this.A02[i9] = j7;
        this.A03[i9] = e4;
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
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.A00; i9++) {
            if (i9 > 0) {
                sb.append(A03(10, 2, 65));
            }
            sb.append(A00(i9));
            sb.append('=');
            E A07 = A07(i9);
            if (A07 != this) {
                sb.append(A07);
            } else {
                sb.append(A03(0, 10, 13));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C08552s() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C08552s(int i9) {
        this.A01 = false;
        if (i9 == 0) {
            this.A02 = AbstractC08542r.A01;
            this.A03 = AbstractC08542r.A02;
        } else {
            int A00 = AbstractC08542r.A00(i9);
            this.A02 = new long[A00];
            this.A03 = new Object[A00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i9) {
        if (this.A01) {
            A04();
        }
        return this.A02[i9];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C08552s<E> clone() {
        C08552s<E> c08552s = null;
        try {
            c08552s = (C08552s) super.clone();
            c08552s.A02 = (long[]) this.A02.clone();
            c08552s.A03 = (Object[]) this.A03.clone();
            return c08552s;
        } catch (CloneNotSupportedException unused) {
            return c08552s;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i9 = this.A00;
        int i10 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != A05) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.A01 = false;
        this.A00 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i9) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i9];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j7) {
        return A02(j7, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i9 = this.A00;
        Object[] objArr = this.A03;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i9) {
        Object[] objArr = this.A03;
        Object obj = objArr[i9];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i9] = obj2;
            this.A01 = true;
        }
    }
}
