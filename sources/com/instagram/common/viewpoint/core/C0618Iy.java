package com.instagram.common.viewpoint.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;

/* renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0618Iy {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", c.f29536f, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC0615Iv A01 = EnumC0615Iv.A03;
    public EnumC0616Iw A02 = EnumC0616Iw.A06;
    public EnumC0617Ix A03 = EnumC0617Ix.A02;
    public EnumC0614Iu A00 = EnumC0614Iu.A02;

    public final void A00() {
        this.A00 = EnumC0614Iu.A03;
    }

    public final void A01() {
        this.A02 = EnumC0616Iw.A04;
    }

    public final void A02() {
        this.A02 = EnumC0616Iw.A05;
    }

    public final void A03() {
        this.A03 = EnumC0617Ix.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC0616Iw.A06) {
            EnumC0616Iw enumC0616Iw = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC0616Iw != EnumC0616Iw.A02 && this.A02 != EnumC0616Iw.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC0616Iw.A06 || this.A02 == EnumC0616Iw.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC0617Ix.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC0614Iu.A03;
    }
}
