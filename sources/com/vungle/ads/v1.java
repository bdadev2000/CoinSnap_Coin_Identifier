package com.vungle.ads;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1 extends com.vungle.ads.internal.v implements com.vungle.ads.internal.presenter.z {
    public static final u1 Companion = new u1(null);
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    public static final String TOKEN_APP_ICON = "APP_ICON";
    public static final String TOKEN_APP_NAME = "APP_NAME";
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.v
    public String getAdSizeForAdRequest() {
        return AppLovinMediationProvider.UNKNOWN;
    }

    @Override // com.vungle.ads.internal.presenter.z
    public List<String> getImpressionUrls() {
        bh.i0 bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.z
    public String getPlacementRefId() {
        bh.o3 placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdSize(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return true;
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdTypeForPlacement(bh.o3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isNative();
    }
}
