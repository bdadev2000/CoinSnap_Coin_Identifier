package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzebc implements zzgee {
    final /* synthetic */ zzbvx zza;
    final /* synthetic */ zzbvp zzb;

    public zzebc(zzebg zzebgVar, zzbvx zzbvxVar, zzbvp zzbvpVar) {
        this.zza = zzbvxVar;
        this.zzb = zzbvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzba.zzb(th2));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcj)).booleanValue() && (bundle = this.zza.zzm) != null) {
                    bundle.putLong(zzdrv.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                }
                this.zzb.zzg(parcelFileDescriptor, this.zza);
                return;
            }
            this.zzb.zzf(parcelFileDescriptor);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }
}
