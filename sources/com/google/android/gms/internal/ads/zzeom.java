package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeom {
    private final zzeor zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzeom(zzeor zzeorVar, String str) {
        this.zza = zzeorVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    @Nullable
    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) throws RemoteException {
        this.zzc = null;
        zzeos zzeosVar = new zzeos(i2);
        zzeol zzeolVar = new zzeol(this);
        this.zza.zzb(zzmVar, this.zzb, zzeosVar, zzeolVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
