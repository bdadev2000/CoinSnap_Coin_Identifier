package com.instagram.common.viewpoint.core;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class OH {
    public static long A0D;
    public static byte[] A0E;
    public static String[] A0F = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public AbstractC1187cD A00;
    public LL A01;
    public LZ A02;
    public OG A03;
    public boolean A04;
    public boolean A05;
    public final C1T A06;
    public final C1045Zs A07;
    public final J7 A08;
    public final C0688Lv A09;
    public final MR A0A;
    public final C0833Rk A0B;
    public final String A0C;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, UnsignedBytes.MAX_POWER_OF_TWO, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119};
        String[] strArr = A0F;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0F[5] = "";
        A0E = bArr;
    }

    static {
        A01();
        A0D = 0L;
    }

    public OH(C1045Zs c1045Zs, String str, C0833Rk c0833Rk, C0688Lv c0688Lv, J7 j7, C1T c1t) {
        this(c1045Zs, str, c0833Rk, c0688Lv, j7, c1t, new C0910Uj());
    }

    public OH(C1045Zs c1045Zs, String str, C0833Rk c0833Rk, C0688Lv c0688Lv, J7 j7, C1T c1t, MR mr) {
        this.A04 = true;
        this.A07 = c1045Zs;
        this.A0C = str;
        this.A0B = c0833Rk;
        this.A09 = c0688Lv;
        this.A08 = j7;
        this.A06 = c1t;
        this.A0A = mr;
    }

    public OH(C1045Zs c1045Zs, String str, C0833Rk c0833Rk, C0688Lv c0688Lv, J7 j7, C1T c1t, MR mr, LZ lz) {
        this.A04 = true;
        this.A07 = c1045Zs;
        this.A0C = str;
        this.A0B = c0833Rk;
        this.A09 = c0688Lv;
        this.A08 = j7;
        this.A06 = c1t;
        this.A0A = mr;
        this.A02 = lz;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 33);
        try {
            M3.A0a(map, this.A00);
            AbstractC01710h adAction = C01720i.A01(this.A07, this.A08, str, L5.A00(str2), new O8(map).A03(this.A0B).A02(this.A09).A05(), this.A04, this.A05, this.A06);
            if (adAction instanceof C0551Gf) {
                ((C0551Gf) adAction).A0H(this.A01);
            }
            EnumC01700g enumC01700g = EnumC01700g.A09;
            if (adAction != null) {
                enumC01700g = adAction.A0C();
            }
            if (!(((adAction instanceof GQ) || (adAction instanceof C0551Gf)) && M3.A0g(this.A07, enumC01700g, map)) && enumC01700g != EnumC01700g.A06) {
                if (this.A03 != null) {
                    this.A03.ABf();
                }
                this.A0A.A4P(this.A0C);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(A00, A00(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            String A002 = A00(22, 22, 27);
            if (A0F[2].charAt(19) != 'S') {
                throw new RuntimeException();
            }
            A0F[0] = "pDGFYqmHYV4Rom3KsQ";
            Log.e(A00, A002, e2);
        }
    }

    public static boolean A03(C1045Zs c1045Zs) {
        boolean A2j = C0608Im.A2j(c1045Zs);
        int A07 = C0608Im.A07(c1045Zs);
        long currentTimeMillis = System.currentTimeMillis() - A0D;
        if (A2j && A0D > 0 && currentTimeMillis < A07) {
            return true;
        }
        A0D = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1187cD abstractC1187cD) {
        this.A00 = abstractC1187cD;
    }

    public final void A05(LL ll) {
        this.A01 = ll;
    }

    public final void A06(LZ lz) {
        this.A02 = lz;
    }

    public final void A07(OG og) {
        this.A03 = og;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new JF(str, this.A08).A04(JE.A0J, extraData);
        if (this.A09.A09(this.A07)) {
            this.A08.A9w(str, extraData);
            return;
        }
        A02(str, str2, extraData);
        if (this.A00 == null || this.A00.A1P().A0I() == null || this.A02 == null) {
            return;
        }
        LC.A07(this.A07.A01(), this.A00.A1P().A0I(), this.A02);
    }

    public final void A09(boolean z2) {
        this.A05 = z2;
    }
}
