package net.premiumads.sdk.admob;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.Date;
import java.util.List;
import vh.a;
import vh.b;
import vh.c;

/* loaded from: classes5.dex */
public class PremiumAppOpenAd extends Adapter implements MediationAppOpenAd {

    /* renamed from: b */
    public boolean f22751b = false;

    /* renamed from: c */
    public long f22752c = 0;

    /* renamed from: d */
    public AppOpenAd f22753d;

    /* renamed from: f */
    public MediationAppOpenAdCallback f22754f;

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        boolean z10;
        if (!this.f22751b) {
            boolean z11 = false;
            if (this.f22753d != null) {
                if (new Date().getTime() - this.f22752c < 14400000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (!z11) {
                String string = mediationAppOpenAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                a.b().getClass();
                AppOpenAd.load(mediationAppOpenAdConfiguration.getContext(), string, a.a(mediationAppOpenAdConfiguration), 1, new b(this, mediationAdLoadCallback));
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        AppOpenAd appOpenAd = this.f22753d;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(new c(this, 0));
            this.f22753d.show((Activity) context);
        } else {
            MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f22754f;
            if (mediationAppOpenAdCallback != null) {
                mediationAppOpenAdCallback.onAdFailedToShow(new AdError(88, "PremiumAds isn't initialized yet", "net.premiumads.sdk.admob"));
            }
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
        a8.b bVar = new a8.b(i10, i10, 5);
        return new VersionInfo(bVar.a, bVar.f310b, bVar.f311c);
    }
}
