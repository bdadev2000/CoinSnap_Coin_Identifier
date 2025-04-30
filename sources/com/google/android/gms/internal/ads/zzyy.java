package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzyy extends zzza implements Comparable {
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
    public zzyy(int i9, zzde zzdeVar, int i10, zzys zzysVar, int i11, @Nullable String str) {
        super(i9, zzdeVar, i10);
        boolean z8;
        boolean z9;
        zzgbc zzgbcVar;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13 = 0;
        this.zzf = zzze.zzo(i11, false);
        int i14 = this.zzd.zzf;
        int i15 = zzysVar.zzy;
        if (1 != (i14 & 1)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.zzg = z8;
        if ((i14 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzh = z9;
        if (zzysVar.zzw.isEmpty()) {
            zzgbcVar = zzgbc.zzn("");
        } else {
            zzgbcVar = zzysVar.zzw;
        }
        int i16 = 0;
        while (true) {
            if (i16 < zzgbcVar.size()) {
                i12 = zzze.zzc(this.zzd, (String) zzgbcVar.get(i16), false);
                if (i12 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i16 = Integer.MAX_VALUE;
                i12 = 0;
                break;
            }
        }
        this.zzi = i16;
        this.zzj = i12;
        int zzb = zzze.zzb(this.zzd.zzg, zzysVar.zzx);
        this.zzk = zzb;
        if ((this.zzd.zzg & 1088) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzm = z10;
        if (zzze.zzh(str) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int zzc = zzze.zzc(this.zzd, str, z11);
        this.zzl = zzc;
        if (i12 > 0 || ((zzysVar.zzw.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0))) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (zzze.zzo(i11, zzysVar.zzT) && z12) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyy zzyyVar) {
        zzgcn zza;
        zzgar zze = zzgar.zzk().zze(this.zzf, zzyyVar.zzf).zzd(Integer.valueOf(this.zzi), Integer.valueOf(zzyyVar.zzi), zzgcn.zzc().zza()).zzb(this.zzj, zzyyVar.zzj).zzb(this.zzk, zzyyVar.zzk).zze(this.zzg, zzyyVar.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzyyVar.zzh);
        if (this.zzj == 0) {
            zza = zzgcn.zzc();
        } else {
            zza = zzgcn.zzc().zza();
        }
        zzgar zzb = zze.zzd(valueOf, valueOf2, zza).zzb(this.zzl, zzyyVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zzf(this.zzm, zzyyVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        return false;
    }
}
