package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YQ implements C0T {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C09647f A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, Ascii.GS, Ascii.SYN, Ascii.SYN, Ascii.CR, Ascii.DC4, -12, 35, Ascii.FS, Ascii.FS, 19, Ascii.SUB, -24, -50, -3, Ascii.FF, 34, -16, 33, Ascii.DLE, Ascii.EM, Ascii.US, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, 63, 50, 63, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public YQ(C09647f c09647f) {
        this.A00 = c09647f;
    }

    private void A02(int i9, String str, JSONObject jSONObject, boolean z8, int i10) {
        C8B c8b = new C8B(A00(4, 6, 78));
        c8b.A07(jSONObject);
        c8b.A05(1);
        c8b.A09(z8);
        c8b.A04(i10);
        try {
            jSONObject.put(A00(33, 13, 121), AnonymousClass84.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A07().A9b(A00(27, 6, 27), i9 + 4000, c8b);
        if (this.A00.A04().A8z()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i9 + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    public static boolean A03(C0V c0v) {
        for (C0V c0v2 : YI.A06) {
            if (c0v2.equals(c0v)) {
                String[] strArr = A02;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.C0T
    public final void A9c(C0V c0v, JSONObject jSONObject, int i9) {
        A02(c0v.A02(), c0v.toString(), jSONObject, A03(c0v), i9);
    }

    @Override // com.meta.analytics.dsp.uinode.C0T
    public final void A9x(int i9, JSONObject jSONObject) {
        A02(i9, A00(18, 9, 81) + i9, jSONObject, false, 0);
    }
}
