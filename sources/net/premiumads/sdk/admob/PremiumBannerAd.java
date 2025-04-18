package net.premiumads.sdk.admob;

import a8.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.List;
import vh.a;
import vh.d;

/* loaded from: classes5.dex */
public class PremiumBannerAd extends Adapter implements MediationBannerAd {

    /* renamed from: b, reason: collision with root package name */
    public AdView f22755b;

    /* renamed from: c, reason: collision with root package name */
    public MediationBannerAdCallback f22756c;

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f22755b;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @SuppressLint({"MissingPermission"})
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        String string = mediationBannerAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        AdView adView = new AdView(mediationBannerAdConfiguration.getContext());
        adView.setAdSize(mediationBannerAdConfiguration.getAdSize());
        adView.setAdUnitId(string);
        adView.setAdListener(new d(this, adView, mediationAdLoadCallback));
        a.b().getClass();
        adView.loadAd(a.a(mediationBannerAdConfiguration));
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
