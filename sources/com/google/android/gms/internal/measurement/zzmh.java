package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzmh extends zzmf<zzme, zzme> {
    @Override // com.google.android.gms.internal.measurement.zzmf
    public final boolean zza(zzli zzliVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ int zzb(zzme zzmeVar) {
        return zzmeVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ zzme zzc(Object obj) {
        zzme zzmeVar = ((zzjk) obj).zzb;
        if (zzmeVar != zzme.zzc()) {
            return zzmeVar;
        }
        zzme zzd = zzme.zzd();
        zza(obj, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ zzme zzd(Object obj) {
        return ((zzjk) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ zzme zze(zzme zzmeVar) {
        zzme zzmeVar2 = zzmeVar;
        zzmeVar2.zze();
        return zzmeVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final void zzf(Object obj) {
        ((zzjk) obj).zzb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ int zza(zzme zzmeVar) {
        return zzmeVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zzb(zzme zzmeVar, int i9, long j7) {
        zzmeVar.zza(i9 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ zzme zza(zzme zzmeVar, zzme zzmeVar2) {
        zzme zzmeVar3 = zzmeVar;
        zzme zzmeVar4 = zzmeVar2;
        if (zzme.zzc().equals(zzmeVar4)) {
            return zzmeVar3;
        }
        if (zzme.zzc().equals(zzmeVar3)) {
            return zzme.zza(zzmeVar3, zzmeVar4);
        }
        return zzmeVar3.zza(zzmeVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zzb(Object obj, zzme zzmeVar) {
        zza(obj, zzmeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zzc(Object obj, zzme zzmeVar) {
        zza(obj, zzmeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zzb(zzme zzmeVar, zzna zznaVar) throws IOException {
        zzmeVar.zzb(zznaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ zzme zza() {
        return zzme.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zza(zzme zzmeVar, int i9, int i10) {
        zzmeVar.zza((i9 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zza(zzme zzmeVar, int i9, long j7) {
        zzmeVar.zza((i9 << 3) | 1, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zza(zzme zzmeVar, int i9, zzme zzmeVar2) {
        zzmeVar.zza((i9 << 3) | 3, zzmeVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zza(zzme zzmeVar, int i9, zzia zziaVar) {
        zzmeVar.zza((i9 << 3) | 2, zziaVar);
    }

    private static void zza(Object obj, zzme zzmeVar) {
        ((zzjk) obj).zzb = zzmeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final /* synthetic */ void zza(zzme zzmeVar, zzna zznaVar) throws IOException {
        zzmeVar.zza(zznaVar);
    }
}
