package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzyi extends zzyf {
    private final boolean zze;
    private final zzxy zzf;
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
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzyi(int r5, com.google.android.gms.internal.ads.zzcd r6, int r7, com.google.android.gms.internal.ads.zzxy r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyi.<init>(int, com.google.android.gms.internal.ads.zzcd, int, com.google.android.gms.internal.ads.zzxy, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzyi zzyiVar, zzyi zzyiVar2) {
        zzgci zzgciVar;
        zzgci zza;
        if (zzyiVar.zze && zzyiVar.zzh) {
            zza = zzyj.zzc;
        } else {
            zzgciVar = zzyj.zzc;
            zza = zzgciVar.zza();
        }
        zzgam zzj = zzgam.zzj();
        boolean z2 = zzyiVar.zzf.zzy;
        return zzj.zzc(Integer.valueOf(zzyiVar.zzk), Integer.valueOf(zzyiVar2.zzk), zza).zzc(Integer.valueOf(zzyiVar.zzj), Integer.valueOf(zzyiVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzyi zzyiVar, zzyi zzyiVar2) {
        zzgam zzd = zzgam.zzj().zzd(zzyiVar.zzh, zzyiVar2.zzh).zzb(zzyiVar.zzm, zzyiVar2.zzm).zzd(zzyiVar.zzn, zzyiVar2.zzn).zzd(zzyiVar.zzi, zzyiVar2.zzi).zzd(zzyiVar.zze, zzyiVar2.zze).zzd(zzyiVar.zzg, zzyiVar2.zzg).zzc(Integer.valueOf(zzyiVar.zzl), Integer.valueOf(zzyiVar2.zzl), zzgci.zzc().zza()).zzd(zzyiVar.zzp, zzyiVar2.zzp).zzd(zzyiVar.zzq, zzyiVar2.zzq);
        if (zzyiVar.zzp && zzyiVar.zzq) {
            zzd = zzd.zzb(zzyiVar.zzr, zzyiVar2.zzr);
        }
        return zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(zzyf zzyfVar) {
        zzyi zzyiVar = (zzyi) zzyfVar;
        if (!Objects.equals(this.zzd.zzn, zzyiVar.zzd.zzn)) {
            return false;
        }
        boolean z2 = this.zzf.zzF;
        return this.zzp == zzyiVar.zzp && this.zzq == zzyiVar.zzq;
    }
}
