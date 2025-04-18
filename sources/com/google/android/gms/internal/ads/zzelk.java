package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzelk {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqd zzb;

    public zzelk(zzdqd zzdqdVar) {
        this.zzb = zzdqdVar;
    }

    public final zzbrf zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrf) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e2);
        }
    }
}
