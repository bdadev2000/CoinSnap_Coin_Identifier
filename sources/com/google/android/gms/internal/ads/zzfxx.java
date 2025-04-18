package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzfxx implements Serializable {
    public static zzfxx zzc() {
        return zzfxg.zza;
    }

    public static zzfxx zzd(Object obj) {
        return obj == null ? zzfxg.zza : new zzfye(obj);
    }

    public abstract zzfxx zza(zzfxq zzfxqVar);

    public abstract Object zzb(Object obj);
}
