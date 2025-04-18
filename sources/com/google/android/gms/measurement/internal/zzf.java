package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes3.dex */
final class zzf {
    private final zzjh zza;

    public zzf(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    public final zzjh zza() {
        return this.zza;
    }

    public final String zzb() {
        return String.valueOf(zzje.zza(this.zza));
    }

    public static zzf zza(String str) {
        zzjh zzjhVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzjhVar = zzje.zza(str.charAt(0));
        } else {
            zzjhVar = zzjh.UNINITIALIZED;
        }
        return new zzf(zzjhVar);
    }
}
