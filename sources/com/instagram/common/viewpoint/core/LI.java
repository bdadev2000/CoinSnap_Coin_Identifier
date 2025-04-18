package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.os.Build;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class LI implements Runnable {
    public static byte[] A04;
    public static String[] A05 = {"rpDB7rKXNsFsWkDz6IFMGYiQm5SIurhV", "Zw7gqQaUB6b8OXSgkCM5acQChbi0fPQB", "ij96xAlSFdb9T8", "9lv2KZaF3yGNFfkp5oM5AxENUzlVWnoh", "BtiLNkHShKV4ox8o5K74B7kMcT6dIDQ3", "4qYR1HKsivt0y2MxZdwkaRz4cXsJEuH0", "44IOIp9GJ1CB282l", "5xjMlDyVDQDeuAskdNZft2cHBWd2iktp"};
    public final /* synthetic */ C1T A00;
    public final /* synthetic */ LL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{56, 62, 40, Utf8.REPLACEMENT_BYTE, 46, 33, 36, 46, 38};
    }

    static {
        A01();
    }

    public LI(LL ll, String str, C1T c1t, String str2) {
        this.A01 = ll;
        this.A03 = str;
        this.A00 = c1t;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        C1045Zs c1045Zs;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A01.A00;
            if (!z2) {
                return;
            }
            boolean z3 = false;
            this.A01.A00 = false;
            c1045Zs = this.A01.A03;
            Activity A0D = c1045Zs.A0D();
            boolean z4 = false;
            int i2 = Build.VERSION.SDK_INT;
            String[] strArr = A05;
            if (strArr[1].charAt(30) != strArr[4].charAt(30)) {
                throw new RuntimeException();
            }
            A05[2] = "zngGPNErwRp983";
            if (i2 >= 24) {
                if (A0D != null && A0D.isInMultiWindowMode()) {
                    z3 = true;
                }
                z4 = z3;
            }
            if (!z4 && C0663Kw.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03 != null ? this.A03 : A00(0, 9, 80), this.A00, this.A02);
        } catch (Throwable th) {
            if (A05[2].length() != 14) {
                KQ.A00(th, this);
            } else {
                A05[2] = "Mnh0XYPOQy81qp";
                KQ.A00(th, this);
            }
        }
    }
}
