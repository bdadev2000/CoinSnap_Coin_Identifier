package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0722Kz {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{121, 123, 110, 111, -120, 119, 126, 118, -120, 106, 109, 124, -120, 119, 120, -120, 108, 113, 106, 114, 119, -71, -73, -55, -71, -73, -70, -69, -70, -75, -73, -70, -25, -6, -10, -12, -29, -31, -26, -29, -10, -29, -82, -81, -76, -70, -71, -58, -57, -58, -69, -64, -71, -63, -58, -67, -68, -73, -71, -68, -53, -8, -6};
    }

    public static int A00(C1070Yn c1070Yn, int i10) {
        return KE.A00(c1070Yn).getInt(A01(0, 21, 2), i10);
    }

    public static String A02(C1070Yn c1070Yn, String str) {
        int A002 = A00(c1070Yn, -1);
        if (A002 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 49), Integer.valueOf(A002))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String A01 = A01(61, 2, 86);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String extraData = A01(42, 5, 31);
            JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            String extraData2 = A01(32, 10, 91);
            A01 = jSONObject2.optString(extraData2, A01);
        }
        JSONObject jSONObject3 = new JSONObject(A01);
        jSONObject3.put(str2, obj);
        String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01(61, 2, 86))).optBoolean(A01(21, 11, 47), false);
    }

    public final InterstitialAd A06(C1070Yn c1070Yn, String str, String str2) {
        if (c1070Yn == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1070Yn, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C1070Yn c1070Yn, String str, String str2) {
        if (c1070Yn == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c1070Yn, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C1070Yn c1070Yn, boolean z10) {
        int i10 = 0;
        String A01 = A01(0, 21, 2);
        if (!z10) {
            int lastNonChainedAds = KE.A00(c1070Yn).getInt(A01, 0);
            i10 = lastNonChainedAds + 1;
        }
        KE.A00(c1070Yn).edit().putInt(A01, i10).apply();
    }

    public final boolean A09(C1070Yn c1070Yn, String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c1070Yn, i10 - 1);
                return lastNonChainedAds >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
