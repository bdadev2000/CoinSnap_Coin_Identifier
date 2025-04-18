package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03565j implements NativeAdScrollViewApi {
    public static byte[] A07;
    public final int A00;
    public final NativeAdScrollView.AdViewProvider A01;
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final ZE A05;
    public final C1070Yn A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-61, -21, -23, -22, -106, -26, -24, -27, -20, -33, -38, -37, -106, -41, -106, -60, -41, -22, -33, -20, -37, -73, -38, -52, -33, -37, -19, -92, -54, -17, -26, -37, -94, -106, -73, -38, -52, -33, -37, -19, -58, -24, -27, -20, -33, -38, -37, -24, -106, -27, -24, -106, -41, -106, -28, -41, -22, -33, -20, -37, -73, -38, -52, -33, -37, -19, -66, -37, -33, -35, -34, -22, -70, -26, -106, -87, -68, -79, -66, -83, -119, -84, -69, -107, -87, -74, -87, -81, -83, -70, 104, -74, -73, -68, 104, -76, -73, -87, -84, -83, -84};
    }

    public C03565j(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i10 > 0) {
                this.A06 = C03495c.A03(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i11;
                ZF zf2 = new ZF(this);
                ZE ze2 = new ZE(context);
                this.A05 = ze2;
                if (type == null) {
                    if (i10 > 0) {
                        ze2.A00(((int) LD.A02) * i10);
                    }
                } else {
                    ze2.A00((int) (LD.A02 * type.getHeight()));
                }
                ze2.setAdapter(zf2);
                setInset(20);
                zf2.A09();
                nativeAdScrollView.addView(ze2);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 85));
        }
        throw new IllegalStateException(A06(74, 27, 39));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i10) {
        if (i10 > 0) {
            float f10 = LD.A02;
            float density = i10;
            int insetDp = Math.round(density * f10);
            this.A05.setPadding(insetDp, 0, insetDp, 0);
            float density2 = i10 / 2;
            this.A05.setPageMargin(Math.round(density2 * f10));
            this.A05.setClipToPadding(false);
        }
    }
}
