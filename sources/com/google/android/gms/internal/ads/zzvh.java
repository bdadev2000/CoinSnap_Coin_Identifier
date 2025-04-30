package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvh extends zzvc {
    public static final Object zzd = new Object();

    @Nullable
    private final Object zze;

    @Nullable
    private final Object zzf;

    private zzvh(zzdc zzdcVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzdcVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzvh zzq(zzbu zzbuVar) {
        return new zzvh(new zzvi(zzbuVar), zzdb.zza, zzd);
    }

    public static zzvh zzr(zzdc zzdcVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzvh(zzdcVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i9, zzcz zzczVar, boolean z8) {
        this.zzc.zzd(i9, zzczVar, z8);
        if (zzgd.zzG(zzczVar.zzc, this.zzf) && z8) {
            zzczVar.zzc = zzd;
        }
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i9, zzdb zzdbVar, long j7) {
        this.zzc.zze(i9, zzdbVar, j7);
        if (zzgd.zzG(zzdbVar.zzc, this.zze)) {
            zzdbVar.zzc = zzdb.zza;
        }
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i9) {
        Object zzf = this.zzc.zzf(i9);
        if (zzgd.zzG(zzf, this.zzf)) {
            return zzd;
        }
        return zzf;
    }

    public final zzvh zzp(zzdc zzdcVar) {
        return new zzvh(zzdcVar, this.zze, this.zzf);
    }
}
