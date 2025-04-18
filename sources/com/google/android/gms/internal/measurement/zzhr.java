package com.google.android.gms.internal.measurement;

import android.net.Uri;
import ra.g;

/* loaded from: classes3.dex */
public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final g zzh;
    private final boolean zzi;

    public zzhr(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzhr zza() {
        return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhr zzb() {
        if (this.zzc.isEmpty()) {
            g gVar = this.zzh;
            if (gVar == null) {
                return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, gVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private zzhr(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, g gVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = z11;
        this.zzi = z12;
        this.zzg = z13;
        this.zzh = gVar;
    }

    public final zzhj<Double> zza(String str, double d10) {
        return zzhj.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzhj<Long> zza(String str, long j3) {
        return zzhj.zza(this, str, Long.valueOf(j3), true);
    }

    public final zzhj<String> zza(String str, String str2) {
        return zzhj.zza(this, str, str2, true);
    }

    public final zzhj<Boolean> zza(String str, boolean z10) {
        return zzhj.zza(this, str, Boolean.valueOf(z10), true);
    }
}
