package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzxu extends zzxw implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxu(int i10, zzbw zzbwVar, int i11, zzxp zzxpVar, int i12, @Nullable String str) {
        super(i10, zzbwVar, i11);
        boolean z10;
        boolean z11;
        zzfzo zzfzoVar;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.zzf = zzlo.zza(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzxpVar.zzv;
        if (1 != (i15 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzg = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        if (zzxpVar.zzt.isEmpty()) {
            zzfzoVar = zzfzo.zzo("");
        } else {
            zzfzoVar = zzxpVar.zzt;
        }
        int i17 = 0;
        while (true) {
            if (i17 < zzfzoVar.size()) {
                i13 = zzyb.zzc(this.zzd, (String) zzfzoVar.get(i17), false);
                if (i13 > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                i17 = Integer.MAX_VALUE;
                i13 = 0;
                break;
            }
        }
        this.zzi = i17;
        this.zzj = i13;
        int zzb = zzyb.zzb(this.zzd.zzf, zzxpVar.zzu);
        this.zzk = zzb;
        if ((this.zzd.zzf & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzm = z12;
        if (zzyb.zzh(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int zzc = zzyb.zzc(this.zzd, str, z13);
        this.zzl = zzc;
        if (i13 <= 0 && ((!zzxpVar.zzt.isEmpty() || zzb <= 0) && !this.zzg && (!this.zzh || zzc <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (zzlo.zza(i12, zzxpVar.zzN) && z14) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxu zzxuVar) {
        zzgaz zza;
        zzfzd zzd = zzfzd.zzj().zzd(this.zzf, zzxuVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxuVar.zzi), zzgaz.zzc().zza()).zzb(this.zzj, zzxuVar.zzj).zzb(this.zzk, zzxuVar.zzk).zzd(this.zzg, zzxuVar.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzxuVar.zzh);
        if (this.zzj == 0) {
            zza = zzgaz.zzc();
        } else {
            zza = zzgaz.zzc().zza();
        }
        zzfzd zzb = zzd.zzc(valueOf, valueOf2, zza).zzb(this.zzl, zzxuVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxuVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        return false;
    }
}
