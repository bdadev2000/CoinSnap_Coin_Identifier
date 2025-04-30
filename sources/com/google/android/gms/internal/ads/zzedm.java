package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzedm implements zzgfp {
    final /* synthetic */ zzbxn zza;
    final /* synthetic */ zzbxu zzb;

    public zzedm(zzedq zzedqVar, zzbxn zzbxnVar, zzbxu zzbxuVar) {
        this.zza = zzbxnVar;
        this.zzb = zzbxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
                this.zza.zzg(parcelFileDescriptor, this.zzb);
            } else {
                this.zza.zzf(parcelFileDescriptor);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }
}
