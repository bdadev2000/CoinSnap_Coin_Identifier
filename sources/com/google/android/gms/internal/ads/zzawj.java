package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzawj extends zzatw {
    public Long zza;
    public Long zzb;

    public zzawj() {
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzawj(String str) {
        HashMap zza = zzatw.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }
}
