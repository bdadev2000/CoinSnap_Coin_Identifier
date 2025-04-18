package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzoj {
    private long zza;
    private zzfy.zzj zzb;
    private String zzc;
    private Map<String, String> zzd;
    private zznt zze;

    public final long zza() {
        return this.zza;
    }

    public final zznw zzb() {
        return new zznw(this.zzc, this.zzd, this.zze);
    }

    @Nullable
    public final zzfy.zzj zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final Map<String, String> zze() {
        return this.zzd;
    }

    private zzoj(long j3, zzfy.zzj zzjVar, String str, Map<String, String> map, zznt zzntVar) {
        this.zza = j3;
        this.zzb = zzjVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzntVar;
    }
}
