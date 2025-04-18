package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzend {
    private final zzeni zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzend(zzeni zzeniVar, String str) {
        this.zza = zzeniVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zzc;
            if (zzdyVar != null) {
                str = zzdyVar.zzg();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return str;
    }

    @Nullable
    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zzc;
            if (zzdyVar != null) {
                str = zzdyVar.zzg();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zzc = null;
        zzenj zzenjVar = new zzenj(i10);
        zzenc zzencVar = new zzenc(this);
        this.zza.zzb(zzmVar, this.zzb, zzenjVar, zzencVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
