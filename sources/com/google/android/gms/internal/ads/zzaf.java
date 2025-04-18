package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzaf {

    @Nullable
    public final zzo zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    private int zzJ;

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final List zzc;

    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;

    @Nullable
    public final String zzj;

    @Nullable
    public final zzbk zzk;

    @Nullable
    public final Object zzl;

    @Nullable
    public final String zzm;

    @Nullable
    public final String zzn;
    public final int zzo;
    public final int zzp;
    public final List zzq;

    @Nullable
    public final zzy zzr;
    public final long zzs;
    public final int zzt;
    public final int zzu;
    public final float zzv;
    public final int zzw;
    public final float zzx;

    @Nullable
    public final byte[] zzy;
    public final int zzz;

    static {
        new zzaf(new zzad());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i3 = this.zzJ;
            if ((i3 == 0 || (i2 = zzafVar.zzJ) == 0 || i3 == i2) && this.zze == zzafVar.zze && this.zzf == zzafVar.zzf && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzo == zzafVar.zzo && this.zzs == zzafVar.zzs && this.zzt == zzafVar.zzt && this.zzu == zzafVar.zzu && this.zzw == zzafVar.zzw && this.zzz == zzafVar.zzz && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && this.zzG == zzafVar.zzG && this.zzI == zzafVar.zzI && Float.compare(this.zzv, zzafVar.zzv) == 0 && Float.compare(this.zzx, zzafVar.zzx) == 0 && Objects.equals(this.zza, zzafVar.zza) && Objects.equals(this.zzb, zzafVar.zzb) && this.zzc.equals(zzafVar.zzc) && Objects.equals(this.zzj, zzafVar.zzj) && Objects.equals(this.zzm, zzafVar.zzm) && Objects.equals(this.zzn, zzafVar.zzn) && Objects.equals(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzy, zzafVar.zzy) && Objects.equals(this.zzk, zzafVar.zzk) && Objects.equals(this.zzA, zzafVar.zzA) && Objects.equals(this.zzr, zzafVar.zzr) && zzd(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzJ;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = this.zzc.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int hashCode3 = ((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzg) * 31) + this.zzh) * 31;
        String str4 = this.zzj;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbk zzbkVar = this.zzk;
        int hashCode5 = (hashCode4 + (zzbkVar == null ? 0 : zzbkVar.hashCode())) * 961;
        String str5 = this.zzm;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int floatToIntBits = this.zzI + ((((((((((((((((((((Float.floatToIntBits(this.zzx) + ((((Float.floatToIntBits(this.zzv) + ((((((((((hashCode6 + (this.zzn != null ? r0.hashCode() : 0)) * 31) + this.zzo) * 31) + ((int) this.zzs)) * 31) + this.zzt) * 31) + this.zzu) * 31)) * 31) + this.zzw) * 31)) * 31) + this.zzz) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) - 1) * 31) - 1) * 31);
        this.zzJ = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzA);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.zza);
        sb.append(", ");
        sb.append(this.zzb);
        sb.append(", ");
        sb.append(this.zzm);
        sb.append(", ");
        sb.append(this.zzn);
        sb.append(", ");
        sb.append(this.zzj);
        sb.append(", ");
        sb.append(this.zzi);
        sb.append(", ");
        sb.append(this.zzd);
        sb.append(", [");
        sb.append(this.zzt);
        sb.append(", ");
        sb.append(this.zzu);
        sb.append(", ");
        sb.append(this.zzv);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(this.zzB);
        sb.append(", ");
        return androidx.compose.foundation.text.input.a.n(sb, this.zzC, "])");
    }

    public final int zza() {
        int i2;
        int i3 = this.zzt;
        if (i3 == -1 || (i2 = this.zzu) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i2) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzD(i2);
        return new zzaf(zzadVar);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (this.zzq.size() != zzafVar.zzq.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            if (!Arrays.equals((byte[]) this.zzq.get(i2), (byte[]) zzafVar.zzq.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private zzaf(zzad zzadVar) {
        boolean z2;
        String str;
        this.zza = zzad.zzaj(zzadVar);
        String zzD = zzeu.zzD(zzad.zzal(zzadVar));
        this.zzd = zzD;
        if (zzad.zzao(zzadVar).isEmpty() && zzad.zzak(zzadVar) != null) {
            this.zzc = zzgax.zzo(new zzak(zzD, zzad.zzak(zzadVar)));
            this.zzb = zzad.zzak(zzadVar);
        } else if (!zzad.zzao(zzadVar).isEmpty() && zzad.zzak(zzadVar) == null) {
            this.zzc = zzad.zzao(zzadVar);
            List zzao = zzad.zzao(zzadVar);
            Iterator it = zzao.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzak zzakVar = (zzak) it.next();
                    if (TextUtils.equals(zzakVar.zza, zzD)) {
                        str = zzakVar.zzb;
                        break;
                    }
                } else {
                    str = ((zzak) zzao.get(0)).zzb;
                    break;
                }
            }
            this.zzb = str;
        } else {
            if (!zzad.zzao(zzadVar).isEmpty() || zzad.zzak(zzadVar) != null) {
                for (int i2 = 0; i2 < zzad.zzao(zzadVar).size(); i2++) {
                    if (!((zzak) zzad.zzao(zzadVar).get(i2)).zzb.equals(zzad.zzak(zzadVar))) {
                    }
                }
                z2 = false;
                zzdi.zzf(z2);
                this.zzc = zzad.zzao(zzadVar);
                this.zzb = zzad.zzak(zzadVar);
            }
            z2 = true;
            zzdi.zzf(z2);
            this.zzc = zzad.zzao(zzadVar);
            this.zzb = zzad.zzak(zzadVar);
        }
        this.zze = zzad.zzr(zzadVar);
        this.zzf = zzad.zzo(zzadVar);
        int zzd = zzad.zzd(zzadVar);
        this.zzg = zzd;
        int zzn = zzad.zzn(zzadVar);
        this.zzh = zzn;
        this.zzi = zzn != -1 ? zzn : zzd;
        this.zzj = zzad.zzah(zzadVar);
        this.zzk = zzad.zzag(zzadVar);
        this.zzl = null;
        this.zzm = zzad.zzai(zzadVar);
        this.zzn = zzad.zzam(zzadVar);
        this.zzo = zzad.zzk(zzadVar);
        this.zzp = zzad.zzl(zzadVar);
        this.zzq = zzad.zzan(zzadVar) == null ? Collections.emptyList() : zzad.zzan(zzadVar);
        zzy zzw = zzad.zzw(zzadVar);
        this.zzr = zzw;
        this.zzs = zzad.zzu(zzadVar);
        this.zzt = zzad.zzt(zzadVar);
        this.zzu = zzad.zzj(zzadVar);
        this.zzv = zzad.zza(zzadVar);
        this.zzw = zzad.zzp(zzadVar) == -1 ? 0 : zzad.zzp(zzadVar);
        this.zzx = zzad.zzb(zzadVar) == -1.0f ? 1.0f : zzad.zzb(zzadVar);
        this.zzy = zzad.zzap(zzadVar);
        this.zzz = zzad.zzs(zzadVar);
        this.zzA = zzad.zzv(zzadVar);
        this.zzB = zzad.zze(zzadVar);
        this.zzC = zzad.zzq(zzadVar);
        this.zzD = zzad.zzm(zzadVar);
        this.zzE = zzad.zzh(zzadVar) == -1 ? 0 : zzad.zzh(zzadVar);
        this.zzF = zzad.zzi(zzadVar) != -1 ? zzad.zzi(zzadVar) : 0;
        this.zzG = zzad.zzc(zzadVar);
        this.zzH = zzad.zzg(zzadVar);
        if (zzad.zzf(zzadVar) != 0 || zzw == null) {
            this.zzI = zzad.zzf(zzadVar);
        } else {
            this.zzI = 1;
        }
    }
}
