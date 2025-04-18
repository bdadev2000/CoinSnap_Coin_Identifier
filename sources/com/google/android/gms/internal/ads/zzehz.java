package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzehz extends zzbqy {
    final /* synthetic */ zzeib zza;
    private final zzefe zzb;

    public /* synthetic */ zzehz(zzeib zzeibVar, zzefe zzefeVar, zzeia zzeiaVar) {
        this.zza = zzeibVar;
        this.zzb = zzefeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zze(String str) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final void zzg(zzbpv zzbpvVar) throws RemoteException {
        zzeib.zzc(this.zza, zzbpvVar);
        ((zzegx) this.zzb.zzc).zzo();
    }
}
