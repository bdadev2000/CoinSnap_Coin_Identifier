package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzek extends zzbd {
    final /* synthetic */ zzel zza;

    public zzek(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        zzel zzelVar = this.zza;
        videoController = zzelVar.zze;
        videoController.zzb(zzelVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        zzel zzelVar = this.zza;
        videoController = zzelVar.zze;
        videoController.zzb(zzelVar.zzi());
        super.onAdLoaded();
    }
}
