package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdtx extends com.google.android.gms.ads.internal.client.zzbk {
    final /* synthetic */ zzdtr zza;
    final /* synthetic */ zzdty zzb;

    public zzdtx(zzdty zzdtyVar, zzdtr zzdtrVar) {
        this.zza = zzdtrVar;
        this.zzb = zzdtyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zzb(j3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zzc(j3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i10) throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zzd(j3, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zzd(j3, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zze(j3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        long j3;
        zzdty zzdtyVar = this.zzb;
        zzdtr zzdtrVar = this.zza;
        j3 = zzdtyVar.zza;
        zzdtrVar.zzg(j3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
