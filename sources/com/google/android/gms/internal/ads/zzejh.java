package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzejh extends zzbrk implements zzdav {
    private zzbrl zza;
    private zzdau zzb;

    @Override // com.google.android.gms.internal.ads.zzdav
    public final synchronized void zza(zzdau zzdauVar) {
        this.zzb = zzdauVar;
    }

    public final synchronized void zzc(zzbrl zzbrlVar) {
        this.zza = zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zze() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzf() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzg(int i9) throws RemoteException {
        zzdau zzdauVar = this.zzb;
        if (zzdauVar != null) {
            zzdauVar.zza(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdau zzdauVar = this.zzb;
        if (zzdauVar != null) {
            zzdauVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzi(int i9, String str) throws RemoteException {
        zzdau zzdauVar = this.zzb;
        if (zzdauVar != null) {
            zzdauVar.zzc(i9, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzj(int i9) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzj(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzl(String str) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzm() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzn() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzo() throws RemoteException {
        try {
            zzbrl zzbrlVar = this.zza;
            if (zzbrlVar != null) {
                zzbrlVar.zzo();
            }
            zzdau zzdauVar = this.zzb;
            if (zzdauVar != null) {
                zzdauVar.zzd();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzp() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzr(zzbip zzbipVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzs(zzbyt zzbytVar) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzs(zzbytVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzt(zzbyx zzbyxVar) throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzt(zzbyxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzu() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzv() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzw() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzx() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void zzy() throws RemoteException {
        zzbrl zzbrlVar = this.zza;
        if (zzbrlVar != null) {
            zzbrlVar.zzy();
        }
    }
}
