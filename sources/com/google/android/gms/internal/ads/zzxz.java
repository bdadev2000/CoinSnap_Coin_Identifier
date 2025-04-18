package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzxz extends zzxw {
    private final boolean zze;
    private final zzxp zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzxz(int r5, com.google.android.gms.internal.ads.zzbw r6, int r7, com.google.android.gms.internal.ads.zzxp r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxz.<init>(int, com.google.android.gms.internal.ads.zzbw, int, com.google.android.gms.internal.ads.zzxp, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxz zzxzVar, zzxz zzxzVar2) {
        zzgaz zzgazVar;
        zzgaz zza;
        if (zzxzVar.zze && zzxzVar.zzh) {
            zza = zzyb.zzc;
        } else {
            zzgazVar = zzyb.zzc;
            zza = zzgazVar.zza();
        }
        zzfzd zzj = zzfzd.zzj();
        boolean z10 = zzxzVar.zzf.zzy;
        return zzj.zzc(Integer.valueOf(zzxzVar.zzk), Integer.valueOf(zzxzVar2.zzk), zza).zzc(Integer.valueOf(zzxzVar.zzj), Integer.valueOf(zzxzVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxz zzxzVar, zzxz zzxzVar2) {
        zzfzd zzd = zzfzd.zzj().zzd(zzxzVar.zzh, zzxzVar2.zzh).zzb(zzxzVar.zzm, zzxzVar2.zzm).zzd(zzxzVar.zzn, zzxzVar2.zzn).zzd(zzxzVar.zzi, zzxzVar2.zzi).zzd(zzxzVar.zze, zzxzVar2.zze).zzd(zzxzVar.zzg, zzxzVar2.zzg).zzc(Integer.valueOf(zzxzVar.zzl), Integer.valueOf(zzxzVar2.zzl), zzgaz.zzc().zza()).zzd(zzxzVar.zzp, zzxzVar2.zzp).zzd(zzxzVar.zzq, zzxzVar2.zzq);
        if (zzxzVar.zzp && zzxzVar.zzq) {
            zzd = zzd.zzb(zzxzVar.zzr, zzxzVar2.zzr);
        }
        return zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        zzxz zzxzVar = (zzxz) zzxwVar;
        if (Objects.equals(this.zzd.zzo, zzxzVar.zzd.zzo)) {
            boolean z10 = this.zzf.zzF;
            if (this.zzp == zzxzVar.zzp && this.zzq == zzxzVar.zzq) {
                return true;
            }
            return false;
        }
        return false;
    }
}
