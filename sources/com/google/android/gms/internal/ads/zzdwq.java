package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzdwq extends zzbzg {
    final /* synthetic */ zzdws zza;

    public zzdwq(zzdws zzdwsVar) {
        this.zza = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(int i9) throws RemoteException {
        zzdwh zzdwhVar;
        long j7;
        zzdws zzdwsVar = this.zza;
        zzdwhVar = zzdwsVar.zzb;
        j7 = zzdwsVar.zza;
        zzdwhVar.zzm(j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdwh zzdwhVar;
        long j7;
        zzdws zzdwsVar = this.zza;
        zzdwhVar = zzdwsVar.zzb;
        j7 = zzdwsVar.zza;
        zzdwhVar.zzm(j7, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg() throws RemoteException {
        zzdwh zzdwhVar;
        long j7;
        zzdws zzdwsVar = this.zza;
        zzdwhVar = zzdwsVar.zzb;
        j7 = zzdwsVar.zza;
        zzdwhVar.zzp(j7);
    }
}
