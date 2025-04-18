package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UX implements NS {
    public static byte[] A01;
    public static String[] A02 = {"yUnSsugZEqBvOWeWThYJXSUWJr98hEn9", "v1Zq", "vxAHZYDX9w6ucwOVSplT3", "JJMQVo6GPYWEzjGHy5WTa", "lME5sv3YYwuy9JAOW9qVgD8", "DlJJS3tIuTCvZ0MdUSHO9FzR8ufOm18", "kywp41vHVnWBiZX0SE6DEwI4oCFMz", "7CWOaxJQPrz5qAknrW7tkHM6WZbECHWN"};
    public final /* synthetic */ ViewOnClickListenerC0498Bi A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{79, 73, 95, 72, 101, 88, 79, 92, 92, 95, 72, 95, 94, 101, 89, 86, 83, 89, 81, 101, 83, 91, 88, 101, 84, 91, 76, 83, 93, 91, 78, 83, 85, 84};
    }

    static {
        A01();
    }

    public UX(ViewOnClickListenerC0498Bi viewOnClickListenerC0498Bi) {
        this.A00 = viewOnClickListenerC0498Bi;
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACT(String str) {
        this.A00.A0C.setProgress(100);
        ((UT) this.A00).A05 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACV(String str) {
        int i10;
        ((UT) this.A00).A05 = true;
        this.A00.A0B.setUrl(str);
        i10 = this.A00.A00;
        if (i10 > 1) {
            this.A00.A0H(A00(0, 34, 94));
        }
        ViewOnClickListenerC0498Bi.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACn(int i10) {
        if (((UT) this.A00).A05) {
            ViewOnClickListenerC0498Bi viewOnClickListenerC0498Bi = this.A00;
            if (A02[6].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "ozb06X96Ky3QCfknnucaT";
            strArr[3] = "ZNoDxQJp8ccLn1qnPdtqa";
            viewOnClickListenerC0498Bi.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACq(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACs() {
        this.A00.A0A.AB0(14);
    }
}
