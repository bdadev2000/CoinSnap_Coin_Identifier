package com.vungle.ads;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.vungle.ads.internal.AbstractC2115v;
import java.util.List;

/* renamed from: com.vungle.ads.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2148x0 extends AbstractC2115v implements com.vungle.ads.internal.presenter.z {
    public static final C2146w0 Companion = new C2146w0(null);
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
    public C2148x0(Context context) {
        super(context);
        G7.j.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public String getAdSizeForAdRequest() {
        return AppLovinMediationProvider.UNKNOWN;
    }

    @Override // com.vungle.ads.internal.presenter.z
    public List<String> getImpressionUrls() {
        c7.I bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.z
    public String getPlacementRefId() {
        c7.p1 placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdSize(String str) {
        G7.j.e(str, "adSize");
        return true;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdTypeForPlacement(c7.p1 p1Var) {
        G7.j.e(p1Var, "placement");
        return p1Var.isNative();
    }
}
