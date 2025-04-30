package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzenu {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdst zzb;

    public zzenu(zzdst zzdstVar) {
        this.zzb = zzdstVar;
    }

    public final zzbte zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbte) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e4);
        }
    }
}
