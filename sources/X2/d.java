package X2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends NativeAdWithCodeListener {

    /* renamed from: a, reason: collision with root package name */
    public MediationAdLoadCallback f3665a;
    public MediationNativeAdCallback b;

    /* renamed from: c, reason: collision with root package name */
    public c f3666c;

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.b.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public final void onAdLoadErrorWithCode(int i9, String str) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.w(MintegralMediationAdapter.TAG, l.toString());
        this.f3665a.onFailure(l);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdLoaded(List list, int i9) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f3665a;
        if (list != null && list.size() != 0) {
            Campaign campaign = (Campaign) list.get(0);
            c cVar = this.f3666c;
            cVar.b = campaign;
            if (campaign.getAppName() != null) {
                cVar.setHeadline(cVar.b.getAppName());
            }
            if (cVar.b.getAppDesc() != null) {
                cVar.setBody(cVar.b.getAppDesc());
            }
            if (cVar.b.getAdCall() != null) {
                cVar.setCallToAction(cVar.b.getAdCall());
            }
            cVar.setStarRating(Double.valueOf(cVar.b.getRating()));
            if (!TextUtils.isEmpty(cVar.b.getIconUrl())) {
                cVar.setIcon(new b(Uri.parse(cVar.b.getIconUrl())));
            }
            MediationNativeAdConfiguration mediationNativeAdConfiguration = cVar.f3662c;
            MBMediaView mBMediaView = new MBMediaView(mediationNativeAdConfiguration.getContext());
            mBMediaView.setVideoSoundOnOff(!mediationNativeAdConfiguration.getMediationExtras().getBoolean(AppLovinExtras.Keys.MUTE_AUDIO));
            mBMediaView.setNativeAd(cVar.b);
            cVar.setMediaView(mBMediaView);
            MBAdChoice mBAdChoice = new MBAdChoice(mediationNativeAdConfiguration.getContext());
            mBAdChoice.setCampaign(cVar.b);
            cVar.setAdChoicesContent(mBAdChoice);
            cVar.setOverrideClickHandling(true);
            this.b = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(cVar);
            return;
        }
        AdError g9 = android.support.v4.media.session.a.g(104, "Mintegral SDK failed to return a native ad.");
        Log.w(MintegralMediationAdapter.TAG, g9.toString());
        mediationAdLoadCallback.onFailure(g9);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onLoggingImpression(int i9) {
        MediationNativeAdCallback mediationNativeAdCallback = this.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdFramesLoaded(List list) {
    }
}
