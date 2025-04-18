package vh;

import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes5.dex */
public final class f extends NativeAdMapper {
    public f(NativeAd nativeAd) {
        setAdvertiser(nativeAd.getAdvertiser());
        setBody(nativeAd.getBody());
        setCallToAction(nativeAd.getCallToAction());
        setExtras(nativeAd.getExtras());
        setHasVideoContent(nativeAd.getMediaContent().hasVideoContent());
        setHeadline(nativeAd.getHeadline());
        setIcon(nativeAd.getIcon());
        setImages(nativeAd.getImages());
        setStarRating(nativeAd.getStarRating());
        setMediaContentAspectRatio(nativeAd.getMediaContent().getAspectRatio());
        setStore(nativeAd.getStore());
        setPrice(nativeAd.getPrice());
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void handleClick(View view) {
        super.handleClick(view);
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void recordImpression() {
        super.recordImpression();
    }
}
