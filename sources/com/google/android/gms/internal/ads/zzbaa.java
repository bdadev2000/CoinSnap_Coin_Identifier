package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes3.dex */
public final class zzbaa extends zzbah {

    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbaa(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd(zzbaf zzbafVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbab(zzbafVar, this.zzb));
        }
    }
}
