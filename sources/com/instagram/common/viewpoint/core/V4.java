package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class V4 implements NG {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ NE A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public V4(NE ne) {
        this.A00 = ne;
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void A4h() {
        MR mr;
        MR mr2;
        mr = this.A00.A07;
        if (mr != null) {
            mr2 = this.A00.A07;
            mr2.A4P(A00(0, 53, Opcodes.DREM));
        }
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void A4i() {
        MS ms;
        MS ms2;
        this.A00.A0M();
        ms = this.A00.A08;
        if (ms != null) {
            ms2 = this.A00.A08;
            ms2.ADN(true);
        }
        this.A00.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void A8n() {
        C2W c2w;
        C2W c2w2;
        C2W c2w3;
        C2W c2w4;
        C1045Zs c1045Zs;
        c2w = this.A00.A03;
        if (c2w == null) {
            A4i();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        NE.A01(this.A00);
        c2w2 = this.A00.A03;
        if (c2w2.A02() == null) {
            this.A00.A0C();
        } else {
            NE ne = this.A00;
            NE ne2 = this.A00;
            if (A02[7].length() != 21) {
                String[] strArr2 = A02;
                strArr2[1] = "INFlSY3hMh2PzUDbq0dGz0F";
                strArr2[3] = "HzdMOFaNJmeC7SCfZ9pfkiD";
                c2w4 = ne2.A03;
                ne.A0E(c2w4.A02());
            } else {
                A02[0] = "z9yYgUlQPv8m5YvZTPOnZi9Yl33249VB";
                c2w3 = ne2.A03;
                ne.A0E(c2w3.A02());
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1045Zs = this.A00.A05;
            if (C0608Im.A2N(c1045Zs)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void A9m() {
        C2S c2s;
        C2V c2v;
        C1045Zs c1045Zs;
        C2S c2s2;
        String str;
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0I())) {
            L2 l2 = new L2();
            c1045Zs = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = L5.A00(c2s2.A0I());
            str = this.A00.A09;
            L2.A0M(l2, c1045Zs, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A04();
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void A9n() {
        MS ms;
        C2S c2s;
        C2V c2v;
        C1045Zs c1045Zs;
        C2S c2s2;
        String str;
        MS ms2;
        this.A00.A0M();
        ms = this.A00.A08;
        if (ms != null) {
            ms2 = this.A00.A08;
            ms2.ADN(true);
        }
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0C())) {
            L2 l2 = new L2();
            c1045Zs = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = L5.A00(c2s2.A0C());
            str = this.A00.A09;
            L2.A0M(l2, c1045Zs, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A06();
        this.A00.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void ACj(C2U c2u) {
        C2U c2u2;
        C2S c2s;
        C2W A0B;
        C2S c2s2;
        C2S c2s3;
        NE.A00(this.A00);
        this.A00.A01 = c2u;
        c2u2 = this.A00.A01;
        if (c2u2 == C2U.A04) {
            c2s3 = this.A00.A04;
            A0B = c2s3.A0A();
        } else {
            NE ne = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c2s2 = ne.A04;
                A0B = c2s2.A0B();
            } else {
                c2s = ne.A04;
                A0B = c2s.A0B();
            }
        }
        NE ne2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        ne2.A0E(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void ACt(C2W c2w) {
        C2V c2v;
        NE.A00(this.A00);
        c2v = this.A00.A02;
        c2v.A07(c2w.A01());
        if (c2w.A05().isEmpty()) {
            this.A00.A0D(c2w);
            return;
        }
        NE ne = this.A00;
        String[] strArr = A02;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
        strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
        ne.A0E(c2w);
    }
}
