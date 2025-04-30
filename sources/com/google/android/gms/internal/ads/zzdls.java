package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzdls extends com.google.android.gms.ads.internal.client.zzdp {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzdq zzb;
    private final zzbru zzc;

    public zzdls(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbru zzbruVar) {
        this.zzb = zzdqVar;
        this.zzc = zzbruVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        zzbru zzbruVar = this.zzc;
        if (zzbruVar != null) {
            return zzbruVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        zzbru zzbruVar = this.zzc;
        if (zzbruVar != null) {
            return zzbruVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
                if (zzdqVar != null) {
                    return zzdqVar.zzi();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z8) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
                if (zzdqVar != null) {
                    zzdqVar.zzm(zzdtVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
