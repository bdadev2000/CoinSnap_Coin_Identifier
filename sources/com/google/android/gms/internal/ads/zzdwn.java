package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdwn extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdwh zza;
    final /* synthetic */ zzdwo zzb;

    public zzdwn(zzdwo zzdwoVar, zzdwh zzdwhVar) {
        this.zza = zzdwhVar;
        this.zzb = zzdwoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zzb(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zzc(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i9) throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zzd(j7, i9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zzd(j7, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zze(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j7;
        zzdwo zzdwoVar = this.zzb;
        zzdwh zzdwhVar = this.zza;
        j7 = zzdwoVar.zza;
        zzdwhVar.zzg(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
