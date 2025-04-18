package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzuk extends zzuf {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    private zzuk(zzbv zzbvVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbvVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzuk zzq(zzaw zzawVar) {
        return new zzuk(new zzul(zzawVar), zzbu.zza, zzc);
    }

    public static zzuk zzr(zzbv zzbvVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzuk(zzbvVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i10, zzbt zzbtVar, boolean z10) {
        this.zzb.zzd(i10, zzbtVar, z10);
        if (Objects.equals(zzbtVar.zzb, this.zze) && z10) {
            zzbtVar.zzb = zzc;
        }
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i10, zzbu zzbuVar, long j3) {
        this.zzb.zze(i10, zzbuVar, j3);
        if (Objects.equals(zzbuVar.zzb, this.zzd)) {
            zzbuVar.zzb = zzbu.zza;
        }
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i10) {
        Object zzf = this.zzb.zzf(i10);
        if (Objects.equals(zzf, this.zze)) {
            return zzc;
        }
        return zzf;
    }

    public final zzuk zzp(zzbv zzbvVar) {
        return new zzuk(zzbvVar, this.zzd, this.zze);
    }
}
