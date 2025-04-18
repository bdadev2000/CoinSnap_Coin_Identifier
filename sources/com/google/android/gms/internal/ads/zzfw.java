package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzfw implements zzgd {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzgi zzd;

    public zzfw(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        if (!this.zzb.contains(zzhdVar)) {
            this.zzb.add(zzhdVar);
            this.zzc++;
        }
    }

    public final void zzg(int i10) {
        zzgi zzgiVar = this.zzd;
        int i11 = zzen.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzhd) this.zzb.get(i12)).zza(this, zzgiVar, this.zza, i10);
        }
    }

    public final void zzh() {
        zzgi zzgiVar = this.zzd;
        int i10 = zzen.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhd) this.zzb.get(i11)).zzb(this, zzgiVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgi zzgiVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhd) this.zzb.get(i10)).zzc(this, zzgiVar, this.zza);
        }
    }

    public final void zzj(zzgi zzgiVar) {
        this.zzd = zzgiVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhd) this.zzb.get(i10)).zzd(this, zzgiVar, this.zza);
        }
    }
}
