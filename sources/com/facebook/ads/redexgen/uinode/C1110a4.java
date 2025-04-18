package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1110a4<T> implements InterfaceC02962z<T> {
    public static byte[] A02;
    public static String[] A03 = {"pRcBA4OWefysSNzvRxIkpBVTVwfc3AVE", "RPn4qv0f1UarsEXGS1XogTnrbpEJEmnV", "xmsaI0t9E", "ZcBN", "DIlRoYRb", "oKMZSswBXiC", "UEhtJ1eDnORTZ2wzgc9obnj9WqOhgFHK", "4xQT2X5Ea9Pr"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b3 = copyOfRange[i13];
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[5] = "P1E265Ge3cQ";
            copyOfRange[i13] = (byte) ((b3 ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{44, 1, Ascii.US, 8, Ascii.FF, 9, Ascii.DC4, 77, 4, 3, 77, Ascii.EM, 5, 8, 77, Ascii.GS, 2, 2, 1, 76, 76, 112, 125, 56, 117, 121, 96, 56, 104, 119, 119, 116, 56, 107, 113, 98, 125, 56, 117, 109, 107, 108, 56, 122, 125, 56, 38, 56, 40};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C1110a4(int i10) {
        if (i10 > 0) {
            this.A01 = new Object[i10];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 114));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(T r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            int r0 = r5.A00
            if (r4 >= r0) goto L34
            java.lang.Object[] r0 = r5.A01
            r3 = r0[r4]
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1110a4.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2e
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C1110a4.A03
            java.lang.String r1 = "IsiBXNP8"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "yZIlFrLQCuaZ"
            r0 = 7
            r2[r0] = r1
            if (r3 != r6) goto L2b
            r0 = 1
            return r0
        L2b:
            int r4 = r4 + 1
            goto L1
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1110a4.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02962z
    public T A2b() {
        int i10 = this.A00;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.A01;
        T t5 = (T) objArr[i11];
        objArr[i11] = null;
        this.A00 = i10 - 1;
        return t5;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02962z
    public boolean AEY(T instance) {
        if (!A02(instance)) {
            int i10 = this.A00;
            Object[] objArr = this.A01;
            if (i10 < objArr.length) {
                objArr[i10] = instance;
                this.A00 = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 7));
    }
}
