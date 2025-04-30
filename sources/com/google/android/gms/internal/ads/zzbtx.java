package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import u.C2738g;
import u.C2739h;

/* loaded from: classes2.dex */
public final class zzbtx implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (context instanceof Activity) {
            if (!zzbfm.zzg(context)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            } else {
                this.zza = (Activity) context;
                this.zzc = Uri.parse(string);
                this.zzb.onAdLoaded(this);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C2739h a6 = new C2738g().a();
        Uri uri = this.zzc;
        Intent intent = a6.f23048a;
        intent.setData(uri);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzbtw(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(intent, null), null, new zzbtv(this), null, new VersionInfoParcel(0, 0, false), null, null)));
        com.google.android.gms.ads.internal.zzu.zzo().zzq();
    }
}
