package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcbo implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzccn zzb;

    public zzcbo(zzcbp zzcbpVar, Context context, zzccn zzccnVar) {
        this.zza = context;
        this.zzb = zzccnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e4) {
            this.zzb.zzd(e4);
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception while getting advertising Id info", e4);
        }
    }
}
