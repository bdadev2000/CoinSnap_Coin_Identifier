package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzxs extends zzyf implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzxy zzh;
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
    public zzxs(int i2, zzcd zzcdVar, int i3, zzxy zzxyVar, int i4, boolean z2, zzfya zzfyaVar, int i5) {
        super(i2, zzcdVar, i3);
        int i6;
        int i7;
        int i8;
        boolean z3;
        this.zzh = zzxyVar;
        int i9 = 1;
        int i10 = true != zzxyVar.zzL ? 16 : 24;
        this.zzg = zzyj.zzh(this.zzd.zzd);
        this.zzi = zzls.zza(i4, false);
        int i11 = 0;
        while (true) {
            int size = zzxyVar.zzn.size();
            i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i11 >= size) {
                i7 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = zzyj.zzc(this.zzd, (String) zzxyVar.zzn.get(i11), false);
                if (i7 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.zzk = i11;
        this.zzj = i7;
        this.zzl = zzyj.zzb(this.zzd.zzf, 0);
        zzaf zzafVar = this.zzd;
        int i12 = zzafVar.zzf;
        this.zzm = i12 == 0 || (i12 & 1) != 0;
        this.zzp = 1 == (zzafVar.zze & 1);
        this.zzq = zzafVar.zzB;
        this.zzr = zzafVar.zzC;
        this.zzs = zzafVar.zzi;
        this.zzf = zzfyaVar.zza(zzafVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zzeu.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i13 = 0; i13 < split.length; i13++) {
            split[i13] = zzeu.zzD(split[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= split.length) {
                i8 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = zzyj.zzc(this.zzd, split[i14], false);
                if (i8 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzn = i14;
        this.zzo = i8;
        int i15 = 0;
        while (true) {
            if (i15 >= zzxyVar.zzr.size()) {
                break;
            }
            String str = this.zzd.zzn;
            if (str != null && str.equals(zzxyVar.zzr.get(i15))) {
                i6 = i15;
                break;
            }
            i15++;
        }
        this.zzt = i6;
        this.zzu = (i4 & 384) == 128;
        this.zzv = (i4 & 64) == 64;
        zzxy zzxyVar2 = this.zzh;
        if (!zzls.zza(i4, zzxyVar2.zzN) || (!(z3 = this.zzf) && !zzxyVar2.zzG)) {
            i9 = 0;
        } else if (zzls.zza(i4, false) && z3 && this.zzd.zzi != -1 && ((zzxyVar2.zzP || !z2) && (i10 & i4) != 0)) {
            i9 = 2;
        }
        this.zze = i9;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxs zzxsVar) {
        zzgci zzgciVar;
        zzgci zza;
        if (this.zzf && this.zzi) {
            zza = zzyj.zzc;
        } else {
            zzgciVar = zzyj.zzc;
            zza = zzgciVar.zza();
        }
        zzgam zzc = zzgam.zzj().zzd(this.zzi, zzxsVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxsVar.zzk), zzgci.zzc().zza()).zzb(this.zzj, zzxsVar.zzj).zzb(this.zzl, zzxsVar.zzl).zzd(this.zzp, zzxsVar.zzp).zzd(this.zzm, zzxsVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxsVar.zzn), zzgci.zzc().zza()).zzb(this.zzo, zzxsVar.zzo).zzd(this.zzf, zzxsVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxsVar.zzt), zzgci.zzc().zza());
        boolean z2 = this.zzh.zzy;
        zzgam zzc2 = zzc.zzd(this.zzu, zzxsVar.zzu).zzd(this.zzv, zzxsVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxsVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxsVar.zzr), zza);
        if (Objects.equals(this.zzg, zzxsVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxsVar.zzs), zza);
        }
        return zzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(zzyf zzyfVar) {
        String str;
        zzxs zzxsVar = (zzxs) zzyfVar;
        boolean z2 = this.zzh.zzJ;
        zzaf zzafVar = this.zzd;
        int i2 = zzafVar.zzB;
        if (i2 == -1) {
            return false;
        }
        zzaf zzafVar2 = zzxsVar.zzd;
        if (i2 != zzafVar2.zzB || (str = zzafVar.zzn) == null || !TextUtils.equals(str, zzafVar2.zzn)) {
            return false;
        }
        boolean z3 = this.zzh.zzI;
        int i3 = this.zzd.zzC;
        return i3 != -1 && i3 == zzxsVar.zzd.zzC && this.zzu == zzxsVar.zzu && this.zzv == zzxsVar.zzv;
    }
}
