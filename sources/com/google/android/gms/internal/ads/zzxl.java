package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzxl extends zzxw implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzxp zzh;
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
    public zzxl(int i10, zzbw zzbwVar, int i11, zzxp zzxpVar, int i12, boolean z10, zzfwr zzfwrVar, int i13) {
        super(i10, zzbwVar, i11);
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        String[] strArr;
        int i17;
        boolean z13;
        boolean z14;
        boolean z15;
        this.zzh = zzxpVar;
        int i18 = 1;
        if (true != zzxpVar.zzL) {
            i14 = 16;
        } else {
            i14 = 24;
        }
        this.zzg = zzyb.zzh(this.zzd.zzd);
        this.zzi = zzlo.zza(i12, false);
        int i19 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i19 < zzxpVar.zzn.size()) {
                i16 = zzyb.zzc(this.zzd, (String) zzxpVar.zzn.get(i19), false);
                if (i16 > 0) {
                    break;
                } else {
                    i19++;
                }
            } else {
                i16 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzk = i19;
        this.zzj = i16;
        this.zzl = zzyb.zzb(this.zzd.zzf, 0);
        zzad zzadVar = this.zzd;
        int i20 = zzadVar.zzf;
        if (i20 != 0 && (i20 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.zzm = z11;
        if (1 != (zzadVar.zze & 1)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.zzp = z12;
        this.zzq = zzadVar.zzC;
        this.zzr = zzadVar.zzD;
        this.zzs = zzadVar.zzj;
        this.zzf = zzfwrVar.zza(zzadVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzen.zza >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i21 = 0; i21 < strArr.length; i21++) {
            strArr[i21] = zzen.zzE(strArr[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 < strArr.length) {
                i17 = zzyb.zzc(this.zzd, strArr[i22], false);
                if (i17 > 0) {
                    break;
                } else {
                    i22++;
                }
            } else {
                i17 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzn = i22;
        this.zzo = i17;
        int i23 = 0;
        while (true) {
            if (i23 >= zzxpVar.zzr.size()) {
                break;
            }
            String str = this.zzd.zzo;
            if (str != null && str.equals(zzxpVar.zzr.get(i23))) {
                i15 = i23;
                break;
            }
            i23++;
        }
        this.zzt = i15;
        if ((i12 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.zzu = z13;
        if ((i12 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.zzv = z14;
        zzxp zzxpVar2 = this.zzh;
        if (!zzlo.zza(i12, zzxpVar2.zzN) || (!(z15 = this.zzf) && !zzxpVar2.zzG)) {
            i18 = 0;
        } else if (zzlo.zza(i12, false) && z15 && this.zzd.zzj != -1 && ((zzxpVar2.zzP || !z10) && (i14 & i12) != 0)) {
            i18 = 2;
        }
        this.zze = i18;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxl zzxlVar) {
        zzgaz zzgazVar;
        zzgaz zza;
        if (this.zzf && this.zzi) {
            zza = zzyb.zzc;
        } else {
            zzgazVar = zzyb.zzc;
            zza = zzgazVar.zza();
        }
        zzfzd zzc = zzfzd.zzj().zzd(this.zzi, zzxlVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxlVar.zzk), zzgaz.zzc().zza()).zzb(this.zzj, zzxlVar.zzj).zzb(this.zzl, zzxlVar.zzl).zzd(this.zzp, zzxlVar.zzp).zzd(this.zzm, zzxlVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxlVar.zzn), zzgaz.zzc().zza()).zzb(this.zzo, zzxlVar.zzo).zzd(this.zzf, zzxlVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxlVar.zzt), zzgaz.zzc().zza());
        boolean z10 = this.zzh.zzy;
        zzfzd zzc2 = zzc.zzd(this.zzu, zzxlVar.zzu).zzd(this.zzv, zzxlVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxlVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxlVar.zzr), zza);
        if (Objects.equals(this.zzg, zzxlVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxlVar.zzs), zza);
        }
        return zzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        String str;
        zzxl zzxlVar = (zzxl) zzxwVar;
        boolean z10 = this.zzh.zzJ;
        zzad zzadVar = this.zzd;
        int i10 = zzadVar.zzC;
        if (i10 != -1) {
            zzad zzadVar2 = zzxlVar.zzd;
            if (i10 == zzadVar2.zzC && (str = zzadVar.zzo) != null && TextUtils.equals(str, zzadVar2.zzo)) {
                boolean z11 = this.zzh.zzI;
                int i11 = this.zzd.zzD;
                if (i11 != -1 && i11 == zzxlVar.zzd.zzD && this.zzu == zzxlVar.zzu && this.zzv == zzxlVar.zzv) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
