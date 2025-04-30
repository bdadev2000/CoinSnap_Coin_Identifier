package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzepn {
    private final zzeps zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzepn(zzeps zzepsVar, String str) {
        this.zza = zzepsVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            return null;
        }
        return str;
    }

    @Nullable
    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i9) throws RemoteException {
        this.zzc = null;
        zzept zzeptVar = new zzept(i9);
        zzepm zzepmVar = new zzepm(this);
        this.zza.zzb(zzlVar, this.zzb, zzeptVar, zzepmVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
