package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzhb {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ zzha zze;

    public zzhb(zzha zzhaVar, String str, long j3) {
        this.zze = zzhaVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = j3;
    }

    public final long zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(long j3) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putLong(this.zza, j3);
        edit.apply();
        this.zzd = j3;
    }
}
