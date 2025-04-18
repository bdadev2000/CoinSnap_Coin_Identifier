package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0533Fk extends AbstractC1187cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{51, 38, 56, 34, 51, 37, 38, 37, 32, 55, 42, 37, 38, 48};
    }

    static {
        A04();
    }

    public C0533Fk(List<C1F> list) {
        super(list);
    }

    public static C0533Fk A02(JSONObject jSONObject, C1045Zs c1045Zs) {
        C0533Fk c0533Fk = new C0533Fk(AbstractC1187cD.A08(jSONObject, c1045Zs, new C1182c8()));
        c0533Fk.A1Y(jSONObject);
        c0533Fk.A0u(A03(0, 14, 106));
        return c0533Fk;
    }

    @Override // com.instagram.common.viewpoint.core.C1E
    public final int A0R() {
        if (A14()) {
            return 3;
        }
        C01901b A06 = A1P().A0E().A06();
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
        if (A06 != null) {
            C1F A1P = A1P();
            String[] strArr2 = A01;
            if (strArr2[5].charAt(18) == strArr2[3].charAt(18)) {
                throw new RuntimeException();
            }
            A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
            if (A1P.A0E().A06().A0O()) {
                return 4;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.C1E
    public final int A0S() {
        return A1P().A0E().A04();
    }
}
