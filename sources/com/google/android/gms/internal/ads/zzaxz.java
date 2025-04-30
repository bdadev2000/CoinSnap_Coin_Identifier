package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzaxz extends zzavn {
    public Long zza;
    public Long zzb;

    public zzaxz() {
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzaxz(String str) {
        HashMap zza = zzavn.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }
}
