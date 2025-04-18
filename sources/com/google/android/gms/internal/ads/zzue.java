package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzue implements zzvi, zzrr {
    final /* synthetic */ zzug zza;
    private final Object zzb;
    private zzvh zzc;
    private zzrq zzd;

    public zzue(zzug zzugVar, Object obj) {
        this.zza = zzugVar;
        this.zzc = zzugVar.zze(null);
        this.zzd = zzugVar.zzc(null);
        this.zzb = obj;
    }

    private final zzuu zzf(zzuu zzuuVar, @Nullable zzuy zzuyVar) {
        zzug zzugVar = this.zza;
        Object obj = this.zzb;
        long j2 = zzuuVar.zzc;
        zzugVar.zzx(obj, j2, zzuyVar);
        zzug zzugVar2 = this.zza;
        Object obj2 = this.zzb;
        long j3 = zzuuVar.zzd;
        zzugVar2.zzx(obj2, j3, zzuyVar);
        return (j2 == zzuuVar.zzc && j3 == zzuuVar.zzd) ? zzuuVar : new zzuu(1, zzuuVar.zza, zzuuVar.zzb, 0, null, j2, j3);
    }

    private final boolean zzg(int i2, @Nullable zzuy zzuyVar) {
        zzuy zzuyVar2;
        if (zzuyVar != null) {
            zzuyVar2 = this.zza.zzy(this.zzb, zzuyVar);
            if (zzuyVar2 == null) {
                return false;
            }
        } else {
            zzuyVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzvh zzvhVar = this.zzc;
        int i3 = zzvhVar.zza;
        if (!Objects.equals(zzvhVar.zzb, zzuyVar2)) {
            this.zzc = this.zza.zzf(0, zzuyVar2);
        }
        zzrq zzrqVar = this.zzd;
        int i4 = zzrqVar.zza;
        if (Objects.equals(zzrqVar.zzb, zzuyVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzuyVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzae(int i2, @Nullable zzuy zzuyVar, zzuu zzuuVar) {
        if (zzg(0, zzuyVar)) {
            this.zzc.zzc(zzf(zzuuVar, zzuyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzaf(int i2, @Nullable zzuy zzuyVar, zzup zzupVar, zzuu zzuuVar) {
        if (zzg(0, zzuyVar)) {
            this.zzc.zzd(zzupVar, zzf(zzuuVar, zzuyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzag(int i2, @Nullable zzuy zzuyVar, zzup zzupVar, zzuu zzuuVar) {
        if (zzg(0, zzuyVar)) {
            this.zzc.zze(zzupVar, zzf(zzuuVar, zzuyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzah(int i2, @Nullable zzuy zzuyVar, zzup zzupVar, zzuu zzuuVar, IOException iOException, boolean z2) {
        if (zzg(0, zzuyVar)) {
            this.zzc.zzf(zzupVar, zzf(zzuuVar, zzuyVar), iOException, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzai(int i2, @Nullable zzuy zzuyVar, zzup zzupVar, zzuu zzuuVar) {
        if (zzg(0, zzuyVar)) {
            this.zzc.zzg(zzupVar, zzf(zzuuVar, zzuyVar));
        }
    }
}
