package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzfz implements zzgg {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzgm zzd;

    public zzfz(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(zzhh zzhhVar) {
        zzhhVar.getClass();
        if (this.zzb.contains(zzhhVar)) {
            return;
        }
        this.zzb.add(zzhhVar);
        this.zzc++;
    }

    public final void zzg(int i2) {
        zzgm zzgmVar = this.zzd;
        int i3 = zzeu.zza;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            ((zzhh) this.zzb.get(i4)).zza(this, zzgmVar, this.zza, i2);
        }
    }

    public final void zzh() {
        zzgm zzgmVar = this.zzd;
        int i2 = zzeu.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzhh) this.zzb.get(i3)).zzb(this, zzgmVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgm zzgmVar) {
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhh) this.zzb.get(i2)).zzc(this, zzgmVar, this.zza);
        }
    }

    public final void zzj(zzgm zzgmVar) {
        this.zzd = zzgmVar;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhh) this.zzb.get(i2)).zzd(this, zzgmVar, this.zza);
        }
    }
}
