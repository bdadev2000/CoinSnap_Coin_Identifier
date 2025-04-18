package c7;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends b7.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a vungleFactory) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback, vungleFactory);
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
    }

    @Override // b7.b
    public final String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        Intrinsics.checkNotNullExpressionValue(bidResponse, "mediationAppOpenAdConfiguration.bidResponse");
        return bidResponse;
    }

    @Override // b7.b
    public final void b(com.vungle.ads.d adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        boolean z10;
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        Intrinsics.checkNotNullExpressionValue(watermark, "mediationAppOpenAdConfiguration.watermark");
        if (watermark.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            adConfig.setWatermark(watermark);
        }
    }
}
