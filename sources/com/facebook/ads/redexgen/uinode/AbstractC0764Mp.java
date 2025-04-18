package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAdLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0764Mp {
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

    public static AbstractC0763Mo A01(C1070Yn c1070Yn, J2 j22, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h10 = nativeAdLayout.getWidth();
        int w10 = nativeAdLayout.getHeight();
        int i10 = A01;
        if (h10 >= i10 && w10 >= i10) {
            return new U4(c1070Yn, j22, str);
        }
        if (h10 < A03 || w10 < A02) {
            return null;
        }
        return new U5(c1070Yn, j22, str);
    }

    public static U6 A02(C1070Yn c1070Yn, J2 j22, String str, C02451a c02451a, MD md2, MC mc2) {
        return new U6(c1070Yn, j22, str, c02451a, md2, mc2);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h10 = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w10 = A01;
        if (h10 < w10 || height < w10) {
            if (h10 >= A03) {
                int i10 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i10) {
                }
            }
            return true;
        }
        return false;
    }
}
