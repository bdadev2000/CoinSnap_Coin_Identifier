package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class zzfyb implements Serializable {
    public static zzfyb zzc() {
        return zzfxk.zza;
    }

    public static zzfyb zzd(Object obj) {
        if (obj == null) {
            return zzfxk.zza;
        }
        return new zzfyl(obj);
    }

    public abstract zzfyb zza(zzfxu zzfxuVar);

    public abstract Object zzb(Object obj);
}
