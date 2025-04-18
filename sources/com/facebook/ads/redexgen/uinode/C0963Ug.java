package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0963Ug implements LU {
    public static byte[] A03;
    public static String[] A04 = {"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    public int A00;
    public String A01;
    public final LU A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b3 = copyOfRange[i13];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            copyOfRange[i13] = (byte) ((b3 - i12) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, ByteCompanionObject.MIN_VALUE};
    }

    static {
        A02();
    }

    public C0963Ug(LU lu) {
        this.A02 = lu;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AE8(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void AE8(String str) {
        boolean A0A;
        String A042;
        A0A = LW.A0A(str);
        if (!A0A) {
            A042 = LW.A04(str);
            String filtered = this.A01;
            if (A042.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A042;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AE8(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
