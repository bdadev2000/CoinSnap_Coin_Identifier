package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes4.dex */
final class zzdvr extends zzbxl {
    final /* synthetic */ zzdvt zza;

    public zzdvr(zzdvt zzdvtVar) {
        this.zza = zzdvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zze(int i2) throws RemoteException {
        zzdvi zzdviVar;
        long j2;
        zzdvt zzdvtVar = this.zza;
        zzdviVar = zzdvtVar.zzb;
        j2 = zzdvtVar.zza;
        zzdviVar.zzm(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdvi zzdviVar;
        long j2;
        zzdvt zzdvtVar = this.zza;
        zzdviVar = zzdvtVar.zzb;
        j2 = zzdvtVar.zza;
        zzdviVar.zzm(j2, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzg() throws RemoteException {
        zzdvi zzdviVar;
        long j2;
        zzdvt zzdvtVar = this.zza;
        zzdviVar = zzdvtVar.zzb;
        j2 = zzdvtVar.zza;
        zzdviVar.zzp(j2);
    }
}
