package v6;

import android.net.Uri;
import android.os.Bundle;
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

/* loaded from: classes3.dex */
public final class f extends NativeAdWithCodeListener {
    public final MediationAdLoadCallback a;

    /* renamed from: b, reason: collision with root package name */
    public MediationNativeAdCallback f26060b;

    /* renamed from: c, reason: collision with root package name */
    public final e f26061c;

    public f(e eVar) {
        this.f26061c = eVar;
        this.a = eVar.f26058d;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f26060b.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdFramesLoaded(List list) {
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public final void onAdLoadErrorWithCode(int i10, String str) {
        AdError h10 = c6.c.h(i10, str);
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
        this.a.onFailure(h10);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdLoaded(List list, int i10) {
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (list != null && list.size() != 0) {
            Campaign campaign = (Campaign) list.get(0);
            e eVar = this.f26061c;
            eVar.f26056b = campaign;
            if (campaign.getAppName() != null) {
                eVar.setHeadline(eVar.f26056b.getAppName());
            }
            if (eVar.f26056b.getAppDesc() != null) {
                eVar.setBody(eVar.f26056b.getAppDesc());
            }
            if (eVar.f26056b.getAdCall() != null) {
                eVar.setCallToAction(eVar.f26056b.getAdCall());
            }
            eVar.setStarRating(Double.valueOf(eVar.f26056b.getRating()));
            if (!TextUtils.isEmpty(eVar.f26056b.getIconUrl())) {
                eVar.setIcon(new d(Uri.parse(eVar.f26056b.getIconUrl())));
            }
            MediationNativeAdConfiguration mediationNativeAdConfiguration = eVar.f26057c;
            MBMediaView mBMediaView = new MBMediaView(mediationNativeAdConfiguration.getContext());
            Bundle mediationExtras = mediationNativeAdConfiguration.getMediationExtras();
            boolean z10 = w5.d.a;
            mBMediaView.setVideoSoundOnOff(!mediationExtras.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO));
            mBMediaView.setNativeAd(eVar.f26056b);
            eVar.setMediaView(mBMediaView);
            MBAdChoice mBAdChoice = new MBAdChoice(mediationNativeAdConfiguration.getContext());
            mBAdChoice.setCampaign(eVar.f26056b);
            eVar.setAdChoicesContent(mBAdChoice);
            eVar.setOverrideClickHandling(true);
            this.f26060b = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(eVar);
            return;
        }
        AdError g10 = c6.c.g(104, "Mintegral SDK failed to return a native ad.");
        Log.w(MintegralMediationAdapter.TAG, g10.toString());
        mediationAdLoadCallback.onFailure(g10);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onLoggingImpression(int i10) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }
}
