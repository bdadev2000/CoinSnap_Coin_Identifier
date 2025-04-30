package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzzd extends zzza {
    private final boolean zze;
    private final zzys zzf;
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
    public zzzd(int r5, com.google.android.gms.internal.ads.zzde r6, int r7, com.google.android.gms.internal.ads.zzys r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.<init>(int, com.google.android.gms.internal.ads.zzde, int, com.google.android.gms.internal.ads.zzys, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzzd zzzdVar, zzzd zzzdVar2) {
        zzgcn zzgcnVar;
        zzgcn zza;
        if (zzzdVar.zze && zzzdVar.zzh) {
            zza = zzze.zzb;
        } else {
            zzgcnVar = zzze.zzb;
            zza = zzgcnVar.zza();
        }
        zzgar zzk = zzgar.zzk();
        boolean z8 = zzzdVar.zzf.zzB;
        return zzk.zzd(Integer.valueOf(zzzdVar.zzk), Integer.valueOf(zzzdVar2.zzk), zza).zzd(Integer.valueOf(zzzdVar.zzj), Integer.valueOf(zzzdVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzzd zzzdVar, zzzd zzzdVar2) {
        zzgar zzd = zzgar.zzk().zze(zzzdVar.zzh, zzzdVar2.zzh).zzb(zzzdVar.zzm, zzzdVar2.zzm).zze(zzzdVar.zzn, zzzdVar2.zzn).zze(zzzdVar.zzi, zzzdVar2.zzi).zze(zzzdVar.zze, zzzdVar2.zze).zze(zzzdVar.zzg, zzzdVar2.zzg).zzd(Integer.valueOf(zzzdVar.zzl), Integer.valueOf(zzzdVar2.zzl), zzgcn.zzc().zza());
        boolean z8 = zzzdVar.zzp;
        zzgar zze = zzd.zze(z8, zzzdVar2.zzp);
        boolean z9 = zzzdVar.zzq;
        zzgar zze2 = zze.zze(z9, zzzdVar2.zzq);
        if (z8 && z9) {
            zze2 = zze2.zzb(zzzdVar.zzr, zzzdVar2.zzr);
        }
        return zze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        zzzd zzzdVar = (zzzd) zzzaVar;
        if (zzgd.zzG(this.zzd.zzn, zzzdVar.zzd.zzn)) {
            boolean z8 = this.zzf.zzL;
            if (this.zzp == zzzdVar.zzp && this.zzq == zzzdVar.zzq) {
                return true;
            }
            return false;
        }
        return false;
    }
}
