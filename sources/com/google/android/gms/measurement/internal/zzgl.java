package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzgl {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzgh zze;

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
        long j7 = this.zzd;
        if (abs < j7) {
            return null;
        }
        if (abs > (j7 << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzg().getString(this.zzc, null);
        long j9 = this.zze.zzg().getLong(this.zzb, 0L);
        zzc();
        if (string != null && j9 > 0) {
            return new Pair<>(string, Long.valueOf(j9));
        }
        return zzgh.zza;
    }

    private zzgl(zzgh zzghVar, String str, long j7) {
        this.zze = zzghVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j7 > 0);
        this.zza = str + ":start";
        this.zzb = o.j(str, ":count");
        this.zzc = o.j(str, ":value");
        this.zzd = j7;
    }

    public final void zza(String str, long j7) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.zze.zzg().getLong(this.zzb, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzg().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1L);
            edit.apply();
            return;
        }
        long j10 = j9 + 1;
        boolean z8 = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j10;
        SharedPreferences.Editor edit2 = this.zze.zzg().edit();
        if (z8) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j10);
        edit2.apply();
    }
}
