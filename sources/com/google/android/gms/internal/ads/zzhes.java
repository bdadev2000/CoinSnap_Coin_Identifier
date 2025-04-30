package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzhes extends zzheq {
    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ int zza(Object obj) {
        return ((zzher) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzher) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzher zzherVar = zzhboVar.zzt;
        if (zzherVar == zzher.zzc()) {
            zzher zzf = zzher.zzf();
            zzhboVar.zzt = zzf;
            return zzf;
        }
        return zzherVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzhbo) obj).zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzher.zzc().equals(obj2)) {
            if (zzher.zzc().equals(obj)) {
                return zzher.zze((zzher) obj, (zzher) obj2);
            }
            ((zzher) obj).zzd((zzher) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ Object zzf() {
        return zzher.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzher) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i9, int i10) {
        ((zzher) obj).zzj((i9 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i9, long j7) {
        ((zzher) obj).zzj((i9 << 3) | 1, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i9, Object obj2) {
        ((zzher) obj).zzj((i9 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i9, zzhac zzhacVar) {
        ((zzher) obj).zzj((i9 << 3) | 2, zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i9, long j7) {
        ((zzher) obj).zzj(i9 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final void zzm(Object obj) {
        ((zzhbo) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzhbo) obj).zzt = (zzher) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzhbo) obj).zzt = (zzher) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ void zzp(Object obj, zzhfi zzhfiVar) throws IOException {
        ((zzher) obj).zzk(zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final /* synthetic */ void zzq(Object obj, zzhfi zzhfiVar) throws IOException {
        ((zzher) obj).zzl(zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zzs(zzhdr zzhdrVar) {
        return false;
    }
}
