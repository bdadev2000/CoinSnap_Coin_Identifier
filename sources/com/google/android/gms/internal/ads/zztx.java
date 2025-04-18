package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zztx implements zzvb, zzrl {
    final /* synthetic */ zztz zza;
    private final Object zzb;
    private zzva zzc;
    private zzrk zzd;

    public zztx(zztz zztzVar, Object obj) {
        this.zza = zztzVar;
        this.zzc = zztzVar.zze(null);
        this.zzd = zztzVar.zzc(null);
        this.zzb = obj;
    }

    private final zzun zzf(zzun zzunVar, @Nullable zzur zzurVar) {
        zztz zztzVar = this.zza;
        Object obj = this.zzb;
        long j3 = zzunVar.zzc;
        zztzVar.zzx(obj, j3, zzurVar);
        zztz zztzVar2 = this.zza;
        Object obj2 = this.zzb;
        long j10 = zzunVar.zzd;
        zztzVar2.zzx(obj2, j10, zzurVar);
        if (j3 == zzunVar.zzc && j10 == zzunVar.zzd) {
            return zzunVar;
        }
        return new zzun(1, zzunVar.zza, zzunVar.zzb, 0, null, j3, j10);
    }

    private final boolean zzg(int i10, @Nullable zzur zzurVar) {
        zzur zzurVar2;
        if (zzurVar != null) {
            zzurVar2 = this.zza.zzy(this.zzb, zzurVar);
            if (zzurVar2 == null) {
                return false;
            }
        } else {
            zzurVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzva zzvaVar = this.zzc;
        int i11 = zzvaVar.zza;
        if (!Objects.equals(zzvaVar.zzb, zzurVar2)) {
            this.zzc = this.zza.zzf(0, zzurVar2);
        }
        zzrk zzrkVar = this.zzd;
        int i12 = zzrkVar.zza;
        if (!Objects.equals(zzrkVar.zzb, zzurVar2)) {
            this.zzd = this.zza.zzd(0, zzurVar2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaf(int i10, @Nullable zzur zzurVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzc(zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i10, @Nullable zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzd(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i10, @Nullable zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zze(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i10, @Nullable zzur zzurVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z10) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzf(zzuiVar, zzf(zzunVar, zzurVar), iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i10, @Nullable zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzg(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }
}
