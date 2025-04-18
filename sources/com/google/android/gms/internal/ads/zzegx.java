package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzegx extends zzbpl implements zzcxw {
    private zzbpm zza;
    private zzcxv zzb;

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zza(zzcxv zzcxvVar) {
        this.zzb = zzcxvVar;
    }

    public final synchronized void zzc(zzbpm zzbpmVar) {
        this.zza = zzbpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zze() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzf() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzg(int i10) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzi(int i10, String str) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzj(int i10) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzj(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzl(String str) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzm() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzn() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzo() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzo();
        }
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzp() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzr(zzbgs zzbgsVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzs(zzbwv zzbwvVar) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzs(zzbwvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzt(zzbwz zzbwzVar) throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzt(zzbwzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzu() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzv() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzw() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzx() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final synchronized void zzy() throws RemoteException {
        zzbpm zzbpmVar = this.zza;
        if (zzbpmVar != null) {
            zzbpmVar.zzy();
        }
    }
}
