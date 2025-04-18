package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzmm extends zzmk<zzmj, zzmj> {
    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zza(zzlr zzlrVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ int zzb(zzmj zzmjVar) {
        return zzmjVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmj zzc(Object obj) {
        zzmj zzmjVar = ((zzjt) obj).zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzd = zzmj.zzd();
        zza(obj, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmj zzd(Object obj) {
        return ((zzjt) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmj zze(zzmj zzmjVar) {
        zzmj zzmjVar2 = zzmjVar;
        zzmjVar2.zze();
        return zzmjVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzf(Object obj) {
        ((zzjt) obj).zzb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ int zza(zzmj zzmjVar) {
        return zzmjVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zzb(zzmj zzmjVar, int i10, long j3) {
        zzmjVar.zza(i10 << 3, Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmj zza(zzmj zzmjVar, zzmj zzmjVar2) {
        zzmj zzmjVar3 = zzmjVar;
        zzmj zzmjVar4 = zzmjVar2;
        if (zzmj.zzc().equals(zzmjVar4)) {
            return zzmjVar3;
        }
        if (zzmj.zzc().equals(zzmjVar3)) {
            return zzmj.zza(zzmjVar3, zzmjVar4);
        }
        return zzmjVar3.zza(zzmjVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zzb(Object obj, zzmj zzmjVar) {
        zza(obj, zzmjVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zzc(Object obj, zzmj zzmjVar) {
        zza(obj, zzmjVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zzb(zzmj zzmjVar, zznb zznbVar) throws IOException {
        zzmjVar.zzb(zznbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ zzmj zza() {
        return zzmj.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zza(zzmj zzmjVar, int i10, int i11) {
        zzmjVar.zza((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zza(zzmj zzmjVar, int i10, long j3) {
        zzmjVar.zza((i10 << 3) | 1, Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zza(zzmj zzmjVar, int i10, zzmj zzmjVar2) {
        zzmjVar.zza((i10 << 3) | 3, zzmjVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zza(zzmj zzmjVar, int i10, zzik zzikVar) {
        zzmjVar.zza((i10 << 3) | 2, zzikVar);
    }

    private static void zza(Object obj, zzmj zzmjVar) {
        ((zzjt) obj).zzb = zzmjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final /* synthetic */ void zza(zzmj zzmjVar, zznb zznbVar) throws IOException {
        zzmjVar.zza(zznbVar);
    }
}
