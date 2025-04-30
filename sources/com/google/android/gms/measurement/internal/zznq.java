package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zznq {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final Object zze;

    public zznq(String str, String str2, String str3, long j7, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j7;
        this.zze = obj;
    }
}
