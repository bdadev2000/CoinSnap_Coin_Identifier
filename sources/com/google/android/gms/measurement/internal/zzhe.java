package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.compose.foundation.text.input.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zzhe {

    @VisibleForTesting
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzha zze;

    @WorkerThread
    private final long zzb() {
        return this.zze.zzg().getLong(this.zza, 0L);
    }

    @WorkerThread
    private final void zzc() {
        this.zze.zzt();
        long currentTimeMillis = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.remove(this.zzb);
        edit.remove(this.zzc);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
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
        long j2 = this.zzd;
        if (abs < j2) {
            return null;
        }
        if (abs > (j2 << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzg().getString(this.zzc, null);
        long j3 = this.zze.zzg().getLong(this.zzb, 0L);
        zzc();
        if (string != null && j3 > 0) {
            return new Pair<>(string, Long.valueOf(j3));
        }
        return zzha.zza;
    }

    private zzhe(zzha zzhaVar, String str, long j2) {
        this.zze = zzhaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j2 > 0);
        this.zza = str + ":start";
        this.zzb = a.j(str, ":count");
        this.zzc = a.j(str, ":value");
        this.zzd = j2;
    }

    @WorkerThread
    public final void zza(String str, long j2) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.zze.zzg().getLong(this.zzb, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzg().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1L);
            edit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z2 = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor edit2 = this.zze.zzg().edit();
        if (z2) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j4);
        edit2.apply();
    }
}
