package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import eb.j;

/* loaded from: classes3.dex */
public final class zzhe {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzha zze;

    private final long zzb() {
        return this.zze.zzg().getLong(this.zza, 0L);
    }

    private final void zzc() {
        this.zze.zzt();
        long currentTimeMillis = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.remove(this.zzb);
        edit.remove(this.zzc);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair<String, Long> zza() {
        long abs;
        this.zze.zzt();
        this.zze.zzt();
        long zzb = zzb();
        if (zzb == 0) {
            zzc();
            abs = 0;
        } else {
            abs = Math.abs(zzb - this.zze.zzb().currentTimeMillis());
        }
        long j3 = this.zzd;
        if (abs < j3) {
            return null;
        }
        if (abs > (j3 << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzg().getString(this.zzc, null);
        long j10 = this.zze.zzg().getLong(this.zzb, 0L);
        zzc();
        if (string != null && j10 > 0) {
            return new Pair<>(string, Long.valueOf(j10));
        }
        return zzha.zza;
    }

    private zzhe(zzha zzhaVar, String str, long j3) {
        this.zze = zzhaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j3 > 0);
        this.zza = str + ":start";
        this.zzb = j.k(str, ":count");
        this.zzc = j.k(str, ":value");
        this.zzd = j3;
    }

    public final void zza(String str, long j3) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j10 = this.zze.zzg().getLong(this.zzb, 0L);
        if (j10 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzg().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1L);
            edit.apply();
            return;
        }
        long j11 = j10 + 1;
        boolean z10 = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j11;
        SharedPreferences.Editor edit2 = this.zze.zzg().edit();
        if (z10) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j11);
        edit2.apply();
    }
}
