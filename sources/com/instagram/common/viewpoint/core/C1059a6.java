package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1059a6 {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final AnonymousClass69 A00;
    public final C03226f A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = C1059a6.class.getSimpleName();
    }

    public C1059a6(AnonymousClass69 anonymousClass69, C1044Zr c1044Zr) {
        this.A00 = anonymousClass69;
        this.A00.A3l(new C1061a8(this));
        this.A01 = new C03226f(c1044Zr);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            AnonymousClass69 anonymousClass69 = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(anonymousClass69.A6Q().size()));
        }
        for (C6C c6c : this.A00.A6Q()) {
            switch (AnonymousClass68.A00[c6c.A8b().ordinal()]) {
                case 1:
                    A04(c6c.getUrl());
                    break;
                case 2:
                    A06(c6c.getUrl());
                    break;
                case 3:
                    A05(c6c.getUrl());
                    break;
            }
        }
        this.A01.A0W(new C1060a7(this), new C6Y(A00(81, 36, Opcodes.LSHR), A00(Opcodes.LUSHR, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C03206d c03206d = new C03206d(str, -1, -1, A00(81, 36, Opcodes.LSHR), A00(Opcodes.LUSHR, 7, 50));
        c03206d.A01 = A00(Opcodes.LNEG, 8, 106);
        this.A01.A0b(c03206d);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C03186b c03186b = new C03186b(str, A00(81, 36, Opcodes.LSHR), A00(Opcodes.LUSHR, 7, 50));
        c03186b.A04 = true;
        c03186b.A02 = A00(Opcodes.LNEG, 8, 106);
        this.A01.A0X(c03186b);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C03186b c03186b = new C03186b(str, A00(81, 36, Opcodes.LSHR), A00(Opcodes.LUSHR, 7, 50));
        c03186b.A04 = false;
        c03186b.A02 = A00(Opcodes.LNEG, 8, 106);
        this.A01.A0a(c03186b);
    }
}
