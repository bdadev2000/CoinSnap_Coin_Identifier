package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1330Mp {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", CampaignEx.JSON_KEY_AD_K};
    public static final int A01 = (int) (LD.A02 * 200.0f);
    public static final int A03 = (int) (LD.A02 * 200.0f);
    public static final int A02 = (int) (LD.A02 * 50.0f);

    public static AnonymousClass13 A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass13.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass13.A06;
        }
        return AnonymousClass13.A04;
    }

    public static AbstractC1329Mo A01(C1636Yn c1636Yn, J2 j22, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h6 = nativeAdLayout.getWidth();
        int w2 = nativeAdLayout.getHeight();
        int i9 = A01;
        if (h6 >= i9 && w2 >= i9) {
            return new U4(c1636Yn, j22, str);
        }
        if (h6 < A03 || w2 < A02) {
            return null;
        }
        return new U5(c1636Yn, j22, str);
    }

    public static U6 A02(C1636Yn c1636Yn, J2 j22, String str, C08111a c08111a, MD md, MC mc) {
        return new U6(c1636Yn, j22, str, c08111a, md, mc);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h6 = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w2 = A01;
        if (h6 < w2 || height < w2) {
            if (h6 >= A03) {
                int i9 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i9) {
                }
            }
            return true;
        }
        return false;
    }
}
