package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2F {
    public static String[] A0E = {"pQFQWrff5apwgeDCfICDjWO2FINXUEGY", "Zrlf7mbphLj9aknW7PcFFQ", "n3KJlhWP5Ju2JP4ez23sn5JFnk3TGtqs", "LKe9A2", "QZ6oU5eByjCJaazPOJhmSAWWHc", "bIzEhjdis4s2Gtu6NLj44xIWpvJeHb48", "cSwbeF06gtlZkK5ZI0p5Ev", "223A19fPLhE6SS6l"};
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Ad A09;
    public WeakReference<Ad> A0A;
    public final C1070Yn A0B;
    public final C8Z A0C;
    public final String A0D;

    public C2F(C1070Yn c1070Yn, String str, Ad ad2, C8Z c8z) {
        this.A0B = c1070Yn;
        this.A0D = str;
        this.A09 = ad2;
        this.A0A = new WeakReference<>(ad2);
        this.A0C = c8z;
        c1070Yn.A0M(this);
    }

    public final Ad A00() {
        Ad ad2 = this.A09;
        return ad2 != null ? ad2 : this.A0A.get();
    }

    public final RewardedVideoAdListener A01() {
        return this.A04;
    }

    public final C1070Yn A02() {
        return this.A0B;
    }

    public final void A03(Ad ad2) {
        if (ad2 == null) {
            C1070Yn c1070Yn = this.A0B;
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "e0pPDU8i87wGcMU5DIxBijYJQd";
            if (!C0659Ih.A0p(c1070Yn)) {
                return;
            }
        }
        this.A09 = ad2;
    }
}
