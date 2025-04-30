package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzgv implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzhh zzd;

    public zzgv(boolean z8) {
        this.zza = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        if (!this.zzb.contains(zzieVar)) {
            this.zzb.add(zzieVar);
            this.zzc++;
        }
    }

    public final void zzg(int i9) {
        zzhh zzhhVar = this.zzd;
        int i10 = zzgd.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzie) this.zzb.get(i11)).zza(this, zzhhVar, this.zza, i9);
        }
    }

    public final void zzh() {
        zzhh zzhhVar = this.zzd;
        int i9 = zzgd.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzie) this.zzb.get(i10)).zzb(this, zzhhVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzhh zzhhVar) {
        for (int i9 = 0; i9 < this.zzc; i9++) {
            ((zzie) this.zzb.get(i9)).zzc(this, zzhhVar, this.zza);
        }
    }

    public final void zzj(zzhh zzhhVar) {
        this.zzd = zzhhVar;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            ((zzie) this.zzb.get(i9)).zzd(this, zzhhVar, this.zza);
        }
    }
}
