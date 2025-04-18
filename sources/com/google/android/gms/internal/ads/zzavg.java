package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzavg extends zzats {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzavg() {
    }

    public zzavg(String str) {
        HashMap zza = zzats.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
