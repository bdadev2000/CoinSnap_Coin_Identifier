package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbzp implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcao zzb;

    public zzbzp(zzbzq zzbzqVar, Context context, zzcao zzcaoVar) {
        this.zza = context;
        this.zzb = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.zzb.zzd(e2);
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception while getting advertising Id info", e2);
        }
    }
}
