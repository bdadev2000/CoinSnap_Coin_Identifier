package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes2.dex */
public final class zzbcb extends zzbci {

    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbcb(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzb(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzd(zzbcg zzbcgVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbcc(zzbcgVar, this.zzb));
        }
    }
}
