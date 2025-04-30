package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class M6 {
    public static byte[] A00;
    public static String[] A01 = {"75", "", "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    public static final String A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, Ascii.ESC, 82, 85, Ascii.ESC, 76, 82, 85, 95, 84, 76, Ascii.ESC, 82, 85, 93, 84, Ascii.ESC, 88, 83, 94, 88, 80, Ascii.FS, Ascii.DC2, Ascii.SO, Ascii.DLE, 2, Ascii.SYN, 5, 19, 119, 123, 110, 115, 104, 114, 106, 120, 10, Ascii.ESC, Ascii.EM, Ascii.SYN, Ascii.SUB, Ascii.SYN, 7, Ascii.DC2, Ascii.SYN, Ascii.CR, 90, 89};
    }

    static {
        A02();
        A02 = M6.class.getSimpleName();
    }

    public static Map<String, String> A01(C1636Yn c1636Yn) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c1636Yn == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 111), String.valueOf(A04(c1636Yn)));
            Activity A0D = c1636Yn.A0D();
            if (A0D != null && (window = A0D.getWindow()) != null) {
                int i9 = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 94), Integer.toString(flags));
                int type = 4194304 & i9;
                String A002 = A00(1, 1, 110);
                String A003 = A00(0, 1, 8);
                hashMap.put(A00(48, 5, 14), type > 0 ? A002 : A003);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                A01[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                int type2 = 524288 & i9;
                if (type2 <= 0) {
                    A002 = A003;
                }
                hashMap.put(A00(53, 5, 18), A002);
            }
        } catch (Exception e4) {
            Log.e(A02, A00(2, 30, 72), e4);
            AnonymousClass89 A07 = c1636Yn.A07();
            int type3 = C8A.A2T;
            A07.A9a(A00(43, 5, 114), type3, new C8B(e4));
        }
        return hashMap;
    }

    public static boolean A03(C1636Yn c1636Yn) {
        return !C1304Lp.A04(A01(c1636Yn));
    }

    public static boolean A04(C1636Yn c1636Yn) {
        KeyguardManager keyguardManager = (KeyguardManager) c1636Yn.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
