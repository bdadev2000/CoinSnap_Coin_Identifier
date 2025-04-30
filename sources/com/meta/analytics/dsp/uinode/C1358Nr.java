package com.meta.analytics.dsp.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1358Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC1739b5 A00;
    public InterfaceC1357Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C1636Yn A06;
    public final J2 A07;
    public final C1295Lg A08;
    public final MC A09;
    public final RE A0A;
    public final String A0B;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 104);
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

    public C1358Nr(C1636Yn c1636Yn, String str, RE re, C1295Lg c1295Lg, J2 j22, C1U c1u) {
        this(c1636Yn, str, re, c1295Lg, j22, c1u, new C1509Tm());
    }

    public C1358Nr(C1636Yn c1636Yn, String str, RE re, C1295Lg c1295Lg, J2 j22, C1U c1u, MC mc) {
        this.A03 = true;
        this.A06 = c1636Yn;
        this.A0B = str;
        this.A0A = re;
        this.A08 = c1295Lg;
        this.A07 = j22;
        this.A05 = c1u;
        this.A09 = mc;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 52);
        try {
            AbstractC1303Lo.A0Z(map, this.A00);
            AbstractC07930h A01 = C07940i.A01(this.A06, this.A07, str, AbstractC1287Ky.A00(str2), new C1349Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (A01 instanceof C1150Fg) {
                ((C1150Fg) A01).A0H(this.A02);
            }
            EnumC07920g actionOutcome = EnumC07920g.A08;
            if (A01 != null) {
                actionOutcome = A01.A0C();
            }
            if (!(((A01 instanceof C1148Fe) || (A01 instanceof C1150Fg)) && AbstractC1303Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC07920g.A05) {
                InterfaceC1357Nq interfaceC1357Nq = this.A01;
                if (interfaceC1357Nq != null) {
                    interfaceC1357Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e4) {
            Log.e(A00, A00(44, 20, 100) + str2, e4);
        } catch (Exception e9) {
            Log.e(A00, A00(22, 22, 95), e9);
        }
    }

    public static boolean A03(C1636Yn c1636Yn) {
        boolean isIABBottomSheetEnabled = C1225Ih.A2N(c1636Yn);
        int A06 = C1225Ih.A06(c1636Yn);
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = A0C;
        long j9 = currentTimeMillis - j7;
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
            if (j7 > 0 && j9 < A06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1739b5 abstractC1739b5) {
        this.A00 = abstractC1739b5;
    }

    public final void A05(InterfaceC1357Nq interfaceC1357Nq) {
        this.A01 = interfaceC1357Nq;
    }

    public final void A06(OG og) {
        this.A02 = og;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z8) {
        this.A04 = z8;
    }
}
