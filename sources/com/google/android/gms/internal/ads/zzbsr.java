package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbsr extends zzbhe {
    final /* synthetic */ zzbst zza;

    public /* synthetic */ zzbsr(zzbst zzbstVar, zzbss zzbssVar) {
        this.zza = zzbstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhf
    public final void zze(zzbgs zzbgsVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbst zzbstVar = this.zza;
        onCustomFormatAdLoadedListener = zzbstVar.zza;
        zzf = zzbstVar.zzf(zzbgsVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
