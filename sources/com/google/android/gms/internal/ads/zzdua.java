package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzdua extends zzbxi {
    final /* synthetic */ zzduc zza;

    public zzdua(zzduc zzducVar) {
        this.zza = zzducVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i10) throws RemoteException {
        zzdtr zzdtrVar;
        long j3;
        zzduc zzducVar = this.zza;
        zzdtrVar = zzducVar.zzb;
        j3 = zzducVar.zza;
        zzdtrVar.zzm(j3, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtr zzdtrVar;
        long j3;
        zzduc zzducVar = this.zza;
        zzdtrVar = zzducVar.zzb;
        j3 = zzducVar.zza;
        zzdtrVar.zzm(j3, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() throws RemoteException {
        zzdtr zzdtrVar;
        long j3;
        zzduc zzducVar = this.zza;
        zzdtrVar = zzducVar.zzb;
        j3 = zzducVar.zza;
        zzdtrVar.zzp(j3);
    }
}
