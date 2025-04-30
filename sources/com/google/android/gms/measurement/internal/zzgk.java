package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzgk {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzgh zze;

    public zzgk(zzgh zzghVar, String str, boolean z8) {
        this.zze = zzghVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z8;
    }

    public final void zza(boolean z8) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putBoolean(this.zza, z8);
        edit.apply();
        this.zzd = z8;
    }

    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}
