package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdvo extends com.google.android.gms.ads.internal.client.zzbk {
    final /* synthetic */ zzdvi zza;
    final /* synthetic */ zzdvp zzb;

    public zzdvo(zzdvp zzdvpVar, zzdvi zzdviVar) {
        this.zza = zzdviVar;
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zzb(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zzc(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i2) throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zzd(j2, i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zzd(j2, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zze(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        long j2;
        zzdvp zzdvpVar = this.zzb;
        zzdvi zzdviVar = this.zza;
        j2 = zzdvpVar.zza;
        zzdviVar.zzg(j2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
