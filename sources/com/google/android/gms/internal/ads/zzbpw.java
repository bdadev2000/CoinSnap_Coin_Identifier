package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbpw extends com.google.android.gms.ads.internal.client.zzea {
    private final Object zza = new Object();

    @Nullable
    private volatile com.google.android.gms.ads.internal.client.zzee zzb;

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        synchronized (this.zza) {
            zzeeVar = this.zzb;
        }
        return zzeeVar;
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
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
        synchronized (this.zza) {
            this.zzb = zzeeVar;
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
