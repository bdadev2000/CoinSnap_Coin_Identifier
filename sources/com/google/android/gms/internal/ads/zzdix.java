package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzdix extends com.google.android.gms.ads.internal.client.zzea {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzeb zzb;
    private final zzbpv zzc;

    public zzdix(com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbpv zzbpvVar) {
        this.zzb = zzebVar;
        this.zzc = zzbpvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        zzbpv zzbpvVar = this.zzc;
        if (zzbpvVar != null) {
            return zzbpvVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        zzbpv zzbpvVar = this.zzc;
        if (zzbpvVar != null) {
            return zzbpvVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar != null) {
                return zzebVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar != null) {
                zzebVar.zzm(zzeeVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
