package net.premiumads.sdk.admob;

import a8.b;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import gb.d;
import java.util.List;
import vh.f;

/* loaded from: classes5.dex */
public class PremiumNativeAd extends Adapter {

    /* renamed from: b, reason: collision with root package name */
    public MediationAdLoadCallback f22759b;

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f22759b = mediationAdLoadCallback;
        String string = mediationNativeAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (nativeAdOptions != null) {
            builder.setReturnUrlsForImageAssets(nativeAdOptions.shouldReturnUrlsForImageAssets());
            builder.setRequestMultipleImages(nativeAdOptions.shouldRequestMultipleImages());
            builder.setMediaAspectRatio(nativeAdOptions.getMediaAspectRatio());
        }
        new AdLoader.Builder(mediationNativeAdConfiguration.getContext(), string).withNativeAdOptions(builder.build()).forNativeAd(new d(this, 14)).withAdListener(new com.google.ads.mediation.d(this, mediationAdLoadCallback)).build().loadAds(new AdRequest.Builder().build(), 3);
    }

    public void onAdFetchFailed(LoadAdError loadAdError) {
        this.f22759b.onFailure(loadAdError);
    }

    public void onNativeAdFetched(NativeAd nativeAd) {
        f fVar = new f(nativeAd);
        MediationAdLoadCallback mediationAdLoadCallback = this.f22759b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onSuccess(fVar);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        com.google.android.gms.ads.VersionInfo version = MobileAds.getVersion();
        return new VersionInfo(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        int i10 = 2;
        b bVar = new b(i10, i10, 5);
        return new VersionInfo(bVar.a, bVar.f310b, bVar.f311c);
    }
}
