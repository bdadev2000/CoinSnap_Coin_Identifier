package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbus extends zzbjb {
    final /* synthetic */ zzbut zza;

    public /* synthetic */ zzbus(zzbut zzbutVar, zzbur zzburVar) {
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zze(zzbip zzbipVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbut zzbutVar = this.zza;
        onCustomFormatAdLoadedListener = zzbutVar.zza;
        zzf = zzbutVar.zzf(zzbipVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
