package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzgm {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ zzgh zze;

    public zzgm(zzgh zzghVar, String str, long j7) {
        this.zze = zzghVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = j7;
    }

    public final long zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(long j7) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putLong(this.zza, j7);
        edit.apply();
        this.zzd = j7;
    }
}
