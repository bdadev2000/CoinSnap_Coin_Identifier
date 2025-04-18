package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzgp implements zzgf {

    @Nullable
    private zzhh zzb;

    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzhb zza = new zzhb();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgp zzb(boolean z2) {
        this.zzf = true;
        return this;
    }

    public final zzgp zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzgp zzd(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzgp zze(@Nullable zzhh zzhhVar) {
        this.zzb = zzhhVar;
        return this;
    }

    public final zzgp zzf(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgu zza() {
        zzgu zzguVar = new zzgu(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhh zzhhVar = this.zzb;
        if (zzhhVar != null) {
            zzguVar.zzf(zzhhVar);
        }
        return zzguVar;
    }
}
