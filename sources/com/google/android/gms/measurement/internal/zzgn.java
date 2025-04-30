package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzgn {
    private final String zza;
    private boolean zzb;
    private String zzc;
    private final /* synthetic */ zzgh zzd;

    public zzgn(zzgh zzghVar, String str, String str2) {
        this.zzd = zzghVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    public final String zza() {
        if (!this.zzb) {
            this.zzb = true;
            this.zzc = this.zzd.zzg().getString(this.zza, null);
        }
        return this.zzc;
    }

    public final void zza(String str) {
        SharedPreferences.Editor edit = this.zzd.zzg().edit();
        edit.putString(this.zza, str);
        edit.apply();
        this.zzc = str;
    }
}
