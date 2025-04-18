package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzemt {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdru zzb;

    public zzemt(zzdru zzdruVar) {
        this.zzb = zzdruVar;
    }

    public final zzbrk zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrk) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
