package com.google.android.gms.internal.measurement;

import android.net.Uri;
import c4.b;

/* loaded from: classes2.dex */
public final class zzhh {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final b zzh;
    private final boolean zzi;

    public zzhh(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzhh zza() {
        return new zzhh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhh zzb() {
        if (this.zzc.isEmpty()) {
            b bVar = this.zzh;
            if (bVar == null) {
                return new zzhh(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, bVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private zzhh(String str, Uri uri, String str2, String str3, boolean z8, boolean z9, boolean z10, boolean z11, b bVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z8;
        this.zzf = z9;
        this.zzi = z10;
        this.zzg = z11;
    }

    public final zzgz<Double> zza(String str, double d2) {
        return zzgz.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgz<Long> zza(String str, long j7) {
        return zzgz.zza(this, str, Long.valueOf(j7), true);
    }

    public final zzgz<String> zza(String str, String str2) {
        return zzgz.zza(this, str, str2, true);
    }

    public final zzgz<Boolean> zza(String str, boolean z8) {
        return zzgz.zza(this, str, Boolean.valueOf(z8), true);
    }
}
