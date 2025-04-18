package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzfwo implements Serializable {
    public static zzfwo zzc() {
        return zzfvy.zza;
    }

    public static zzfwo zzd(Object obj) {
        return obj == null ? zzfvy.zza : new zzfwv(obj);
    }

    public abstract zzfwo zza(zzfwh zzfwhVar);

    public abstract Object zzb(Object obj);
}
