package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzwr extends zzcc {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzbc zzf;

    @Nullable
    private final zzav zzg;

    static {
        zzam zzamVar = new zzam();
        zzamVar.zza("SinglePeriodTimeline");
        zzamVar.zzb(Uri.EMPTY);
        zzamVar.zzc();
    }

    public zzwr(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, boolean z3, boolean z4, @Nullable Object obj, zzbc zzbcVar, @Nullable zzav zzavVar) {
        this.zzc = j5;
        this.zzd = j6;
        this.zze = z2;
        zzbcVar.getClass();
        this.zzf = zzbcVar;
        this.zzg = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i2, zzca zzcaVar, boolean z2) {
        zzdi.zza(i2, 0, 1);
        zzcaVar.zzi(null, z2 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i2, zzcb zzcbVar, long j2) {
        zzdi.zza(i2, 0, 1);
        Object obj = zzcb.zza;
        zzbc zzbcVar = this.zzf;
        long j3 = this.zzd;
        zzcbVar.zza(obj, zzbcVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j3, 0, 0, 0L);
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i2) {
        zzdi.zza(i2, 0, 1);
        return zzb;
    }
}
