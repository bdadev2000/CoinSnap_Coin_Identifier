package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class zzyd extends zzyf implements Comparable {
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
    public zzyd(int i2, zzcd zzcdVar, int i3, zzxy zzxyVar, int i4, @Nullable String str) {
        super(i2, zzcdVar, i3);
        int i5;
        int i6 = 0;
        this.zzf = zzls.zza(i4, false);
        int i7 = this.zzd.zze;
        int i8 = zzxyVar.zzv;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        zzgax zzo = zzxyVar.zzt.isEmpty() ? zzgax.zzo("") : zzxyVar.zzt;
        int i9 = 0;
        while (true) {
            if (i9 >= zzo.size()) {
                i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i5 = 0;
                break;
            } else {
                i5 = zzyj.zzc(this.zzd, (String) zzo.get(i9), false);
                if (i5 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.zzi = i9;
        this.zzj = i5;
        int zzb = zzyj.zzb(this.zzd.zzf, zzxyVar.zzu);
        this.zzk = zzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzc = zzyj.zzc(this.zzd, str, zzyj.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i5 > 0 || (zzxyVar.zzt.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzls.zza(i4, zzxyVar.zzN) && z2) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyd zzydVar) {
        zzgam zzb = zzgam.zzj().zzd(this.zzf, zzydVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzydVar.zzi), zzgci.zzc().zza()).zzb(this.zzj, zzydVar.zzj).zzb(this.zzk, zzydVar.zzk).zzd(this.zzg, zzydVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzydVar.zzh), this.zzj == 0 ? zzgci.zzc() : zzgci.zzc().zza()).zzb(this.zzl, zzydVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzydVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(zzyf zzyfVar) {
        return false;
    }
}
