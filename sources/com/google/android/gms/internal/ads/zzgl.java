package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzgl implements zzgc {

    @Nullable
    private zzhd zzb;

    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzgx zza = new zzgx();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgl zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzgl zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzgl zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzgl zze(@Nullable zzhd zzhdVar) {
        this.zzb = zzhdVar;
        return this;
    }

    public final zzgl zzf(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgq zza() {
        zzgq zzgqVar = new zzgq(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhd zzhdVar = this.zzb;
        if (zzhdVar != null) {
            zzgqVar.zzf(zzhdVar);
        }
        return zzgqVar;
    }
}
