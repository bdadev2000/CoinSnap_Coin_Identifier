package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzeyv {
    private final zzbvx zza;
    private final int zzb;

    public zzeyv(zzbvx zzbvxVar, int i10) {
        this.zza = zzbvxVar;
        this.zzb = i10;
    }

    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfxf.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    public final boolean zzg() {
        return this.zza.zzl;
    }

    public final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    public final boolean zzi() {
        return this.zza.zzk;
    }
}
