package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzyl extends zzza implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzys zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzyl(int i9, zzde zzdeVar, int i10, zzys zzysVar, int i11, boolean z8, zzfyh zzfyhVar, int i12) {
        super(i9, zzdeVar, i10);
        int i13;
        int i14;
        int i15;
        boolean z9;
        boolean z10;
        String[] strArr;
        int i16;
        boolean z11;
        boolean z12;
        boolean z13;
        this.zzh = zzysVar;
        int i17 = 1;
        if (true != zzysVar.zzR) {
            i13 = 16;
        } else {
            i13 = 24;
        }
        this.zzg = zzze.zzh(this.zzd.zze);
        this.zzi = zzze.zzo(i11, false);
        int i18 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i18 < zzysVar.zzq.size()) {
                i15 = zzze.zzc(this.zzd, (String) zzysVar.zzq.get(i18), false);
                if (i15 > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                i15 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzk = i18;
        this.zzj = i15;
        this.zzl = zzze.zzb(this.zzd.zzg, 0);
        zzan zzanVar = this.zzd;
        int i19 = zzanVar.zzg;
        if (i19 == 0 || (i19 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzm = z9;
        if (1 != (zzanVar.zzf & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzp = z10;
        this.zzq = zzanVar.zzA;
        this.zzr = zzanVar.zzB;
        this.zzs = zzanVar.zzj;
        this.zzf = zzfyhVar.zza(zzanVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzgd.zza >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i20 = 0; i20 < strArr.length; i20++) {
            strArr[i20] = zzgd.zzD(strArr[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 < strArr.length) {
                i16 = zzze.zzc(this.zzd, strArr[i21], false);
                if (i16 > 0) {
                    break;
                } else {
                    i21++;
                }
            } else {
                i16 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzn = i21;
        this.zzo = i16;
        int i22 = 0;
        while (true) {
            if (i22 >= zzysVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzn;
            if (str != null && str.equals(zzysVar.zzu.get(i22))) {
                i14 = i22;
                break;
            }
            i22++;
        }
        this.zzt = i14;
        if ((i11 & 384) == 128) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzu = z11;
        if ((i11 & 64) == 64) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzv = z12;
        zzys zzysVar2 = this.zzh;
        if (!zzze.zzo(i11, zzysVar2.zzT) || (!(z13 = this.zzf) && !zzysVar2.zzM)) {
            i17 = 0;
        } else if (zzze.zzo(i11, false) && z13 && this.zzd.zzj != -1 && ((zzysVar2.zzV || !z8) && (i13 & i11) != 0)) {
            i17 = 2;
        }
        this.zze = i17;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyl zzylVar) {
        zzgcn zzgcnVar;
        zzgcn zza;
        if (this.zzf && this.zzi) {
            zza = zzze.zzb;
        } else {
            zzgcnVar = zzze.zzb;
            zza = zzgcnVar.zza();
        }
        zzgar zzd = zzgar.zzk().zze(this.zzi, zzylVar.zzi).zzd(Integer.valueOf(this.zzk), Integer.valueOf(zzylVar.zzk), zzgcn.zzc().zza()).zzb(this.zzj, zzylVar.zzj).zzb(this.zzl, zzylVar.zzl).zze(this.zzp, zzylVar.zzp).zze(this.zzm, zzylVar.zzm).zzd(Integer.valueOf(this.zzn), Integer.valueOf(zzylVar.zzn), zzgcn.zzc().zza()).zzb(this.zzo, zzylVar.zzo).zze(this.zzf, zzylVar.zzf).zzd(Integer.valueOf(this.zzt), Integer.valueOf(zzylVar.zzt), zzgcn.zzc().zza());
        boolean z8 = this.zzh.zzB;
        zzgar zzd2 = zzd.zze(this.zzu, zzylVar.zzu).zze(this.zzv, zzylVar.zzv).zzd(Integer.valueOf(this.zzq), Integer.valueOf(zzylVar.zzq), zza).zzd(Integer.valueOf(this.zzr), Integer.valueOf(zzylVar.zzr), zza);
        if (zzgd.zzG(this.zzg, zzylVar.zzg)) {
            zzd2 = zzd2.zzd(Integer.valueOf(this.zzs), Integer.valueOf(zzylVar.zzs), zza);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        String str;
        zzyl zzylVar = (zzyl) zzzaVar;
        boolean z8 = this.zzh.zzP;
        zzan zzanVar = this.zzd;
        int i9 = zzanVar.zzA;
        if (i9 != -1) {
            zzan zzanVar2 = zzylVar.zzd;
            if (i9 == zzanVar2.zzA && (str = zzanVar.zzn) != null && TextUtils.equals(str, zzanVar2.zzn)) {
                boolean z9 = this.zzh.zzO;
                int i10 = this.zzd.zzB;
                if (i10 != -1 && i10 == zzylVar.zzd.zzB && this.zzu == zzylVar.zzu && this.zzv == zzylVar.zzv) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
