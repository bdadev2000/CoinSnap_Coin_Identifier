package com.facebook.ads.redexgen.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0792Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC1173b5 A00;
    public InterfaceC0791Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C1070Yn A06;
    public final J2 A07;
    public final C0729Lg A08;
    public final MC A09;
    public final RE A0A;
    public final String A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{Ascii.US, 8, Ascii.GS, Ascii.RS, 41, 40, 40, 51, 50, Ascii.US, 48, 53, 63, 55, Ascii.DLE, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, Ascii.ETB, 82, 79, 82, 84, 66, 67, 94, 89, 80, Ascii.ETB, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A01();
        A0C = 0L;
    }

    public C0792Nr(C1070Yn c1070Yn, String str, RE re2, C0729Lg c0729Lg, J2 j22, C1U c1u) {
        this(c1070Yn, str, re2, c0729Lg, j22, c1u, new C0943Tm());
    }

    public C0792Nr(C1070Yn c1070Yn, String str, RE re2, C0729Lg c0729Lg, J2 j22, C1U c1u, MC mc2) {
        this.A03 = true;
        this.A06 = c1070Yn;
        this.A0B = str;
        this.A0A = re2;
        this.A08 = c0729Lg;
        this.A07 = j22;
        this.A05 = c1u;
        this.A09 = mc2;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 52);
        try {
            AbstractC0737Lo.A0Z(map, this.A00);
            AbstractC02270h A01 = C02280i.A01(this.A06, this.A07, str, AbstractC0721Ky.A00(str2), new C0783Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (A01 instanceof C0584Fg) {
                ((C0584Fg) A01).A0H(this.A02);
            }
            EnumC02260g actionOutcome = EnumC02260g.A08;
            if (A01 != null) {
                actionOutcome = A01.A0C();
            }
            if (!(((A01 instanceof C0582Fe) || (A01 instanceof C0584Fg)) && AbstractC0737Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC02260g.A05) {
                InterfaceC0791Nq interfaceC0791Nq = this.A01;
                if (interfaceC0791Nq != null) {
                    interfaceC0791Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e2) {
            Log.e(A00, A00(44, 20, 100) + str2, e2);
        } catch (Exception e10) {
            Log.e(A00, A00(22, 22, 95), e10);
        }
    }

    public static boolean A03(C1070Yn c1070Yn) {
        boolean isIABBottomSheetEnabled = C0659Ih.A2N(c1070Yn);
        int A06 = C0659Ih.A06(c1070Yn);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = A0C;
        long j10 = currentTimeMillis - j3;
        if (isIABBottomSheetEnabled) {
            String[] strArr = A0E;
            String str = strArr[0];
            String str2 = strArr[6];
            int clickguardTime = str.length();
            if (clickguardTime == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "iHhMWVvnkjnFrqYtRUL";
            strArr2[4] = "26cGs68neeVahMKc5kl";
            if (j3 > 0 && j10 < A06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1173b5 abstractC1173b5) {
        this.A00 = abstractC1173b5;
    }

    public final void A05(InterfaceC0791Nq interfaceC0791Nq) {
        this.A01 = interfaceC0791Nq;
    }

    public final void A06(OG og2) {
        this.A02 = og2;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z10) {
        this.A04 = z10;
    }
}
