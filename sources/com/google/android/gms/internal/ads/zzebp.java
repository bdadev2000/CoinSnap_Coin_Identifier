package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzebp implements zzgee {
    final /* synthetic */ zzbvm zza;

    public zzebp(zzebq zzebqVar, zzbvm zzbvmVar) {
        this.zza = zzbvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzba.zzb(th2));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e2);
        }
    }
}
