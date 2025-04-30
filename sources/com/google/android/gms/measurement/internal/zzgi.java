package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class zzgi {
    private final zzim zza;

    public zzgi(zzim zzimVar) {
        this.zza = zzimVar;
    }

    public static zzgi zza(String str) {
        zzim zzimVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzimVar = zzin.zza(str.charAt(0));
        } else {
            zzimVar = zzim.UNINITIALIZED;
        }
        return new zzgi(zzimVar);
    }

    public final String zzb() {
        return String.valueOf(zzin.zza(this.zza));
    }

    public final zzim zza() {
        return this.zza;
    }
}
