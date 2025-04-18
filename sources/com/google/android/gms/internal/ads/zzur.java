package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzur extends zzum {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    private zzur(zzcc zzccVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzccVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzur zzq(zzbc zzbcVar) {
        return new zzur(new zzus(zzbcVar), zzcb.zza, zzc);
    }

    public static zzur zzr(zzcc zzccVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzur(zzccVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i2, zzca zzcaVar, boolean z2) {
        this.zzb.zzd(i2, zzcaVar, z2);
        if (Objects.equals(zzcaVar.zzb, this.zze) && z2) {
            zzcaVar.zzb = zzc;
        }
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i2, zzcb zzcbVar, long j2) {
        this.zzb.zze(i2, zzcbVar, j2);
        if (Objects.equals(zzcbVar.zzb, this.zzd)) {
            zzcbVar.zzb = zzcb.zza;
        }
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i2) {
        Object zzf = this.zzb.zzf(i2);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzur zzp(zzcc zzccVar) {
        return new zzur(zzccVar, this.zzd, this.zze);
    }
}
