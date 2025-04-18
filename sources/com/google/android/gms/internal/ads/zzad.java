package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzad {
    public static final /* synthetic */ int zzK = 0;
    public final int zzA;

    @Nullable
    public final zzm zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    private int zzL;

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
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzbd zzl;

    @Nullable
    public final Object zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;

    @Nullable
    public final zzw zzs;
    public final long zzt;
    public final int zzu;
    public final int zzv;
    public final float zzw;
    public final int zzx;
    public final float zzy;

    @Nullable
    public final byte[] zzz;

    static {
        new zzad(new zzab());
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
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            int i11 = this.zzL;
            if ((i11 == 0 || (i10 = zzadVar.zzL) == 0 || i11 == i10) && this.zze == zzadVar.zze && this.zzf == zzadVar.zzf && this.zzh == zzadVar.zzh && this.zzi == zzadVar.zzi && this.zzp == zzadVar.zzp && this.zzt == zzadVar.zzt && this.zzu == zzadVar.zzu && this.zzv == zzadVar.zzv && this.zzx == zzadVar.zzx && this.zzA == zzadVar.zzA && this.zzC == zzadVar.zzC && this.zzD == zzadVar.zzD && this.zzE == zzadVar.zzE && this.zzF == zzadVar.zzF && this.zzG == zzadVar.zzG && this.zzH == zzadVar.zzH && this.zzJ == zzadVar.zzJ && Float.compare(this.zzw, zzadVar.zzw) == 0 && Float.compare(this.zzy, zzadVar.zzy) == 0 && Objects.equals(this.zza, zzadVar.zza) && Objects.equals(this.zzb, zzadVar.zzb) && this.zzc.equals(zzadVar.zzc) && Objects.equals(this.zzk, zzadVar.zzk) && Objects.equals(this.zzn, zzadVar.zzn) && Objects.equals(this.zzo, zzadVar.zzo) && Objects.equals(this.zzd, zzadVar.zzd) && Arrays.equals(this.zzz, zzadVar.zzz) && Objects.equals(this.zzl, zzadVar.zzl) && Objects.equals(this.zzB, zzadVar.zzB) && Objects.equals(this.zzs, zzadVar.zzs) && zzd(zzadVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i10 = this.zzL;
        if (i10 == 0) {
            String str = this.zza;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzb;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = this.zzc.hashCode() + ((((hashCode + 527) * 31) + hashCode2) * 31);
            String str3 = this.zzd;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = ((((((((((hashCode7 * 31) + hashCode3) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzh) * 31) + this.zzi) * 31;
            String str4 = this.zzk;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            zzbd zzbdVar = this.zzl;
            if (zzbdVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = zzbdVar.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.zzn;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.zzo;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            int floatToIntBits = this.zzJ + ((((((((((((((((((((Float.floatToIntBits(this.zzy) + ((((Float.floatToIntBits(this.zzw) + ((((((((((i15 + i11) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzu) * 31) + this.zzv) * 31)) * 31) + this.zzx) * 31)) * 31) + this.zzA) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) - 1) * 31) - 1) * 31);
            this.zzL = floatToIntBits;
            return floatToIntBits;
        }
        return i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzB);
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        sb2.append(this.zzn);
        sb2.append(", ");
        sb2.append(this.zzo);
        sb2.append(", ");
        sb2.append(this.zzk);
        sb2.append(", ");
        sb2.append(this.zzj);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(", [");
        sb2.append(this.zzu);
        sb2.append(", ");
        sb2.append(this.zzv);
        sb2.append(", ");
        sb2.append(this.zzw);
        sb2.append(", ");
        sb2.append(valueOf);
        sb2.append("], [");
        sb2.append(this.zzC);
        sb2.append(", ");
        return e.g(sb2, this.zzD, "])");
    }

    public final int zza() {
        int i10;
        int i11 = this.zzu;
        if (i11 == -1 || (i10 = this.zzv) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzab zzb() {
        return new zzab(this, null);
    }

    public final zzad zzc(int i10) {
        zzab zzabVar = new zzab(this, null);
        zzabVar.zzD(i10);
        return new zzad(zzabVar);
    }

    public final boolean zzd(zzad zzadVar) {
        if (this.zzr.size() != zzadVar.zzr.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzr.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzr.get(i10), (byte[]) zzadVar.zzr.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzad(zzab zzabVar) {
        boolean z10;
        String str;
        this.zza = zzab.zzaj(zzabVar);
        String zzE = zzen.zzE(zzab.zzal(zzabVar));
        this.zzd = zzE;
        if (zzab.zzao(zzabVar).isEmpty() && zzab.zzak(zzabVar) != null) {
            this.zzc = zzfzo.zzo(new zzai(zzE, zzab.zzak(zzabVar)));
            this.zzb = zzab.zzak(zzabVar);
        } else if (!zzab.zzao(zzabVar).isEmpty() && zzab.zzak(zzabVar) == null) {
            this.zzc = zzab.zzao(zzabVar);
            List zzao = zzab.zzao(zzabVar);
            Iterator it = zzao.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzai zzaiVar = (zzai) it.next();
                    if (TextUtils.equals(zzaiVar.zza, zzE)) {
                        str = zzaiVar.zzb;
                        break;
                    }
                } else {
                    str = ((zzai) zzao.get(0)).zzb;
                    break;
                }
            }
            this.zzb = str;
        } else {
            if (!zzab.zzao(zzabVar).isEmpty() || zzab.zzak(zzabVar) != null) {
                for (int i10 = 0; i10 < zzab.zzao(zzabVar).size(); i10++) {
                    if (!((zzai) zzab.zzao(zzabVar).get(i10)).zzb.equals(zzab.zzak(zzabVar))) {
                    }
                }
                z10 = false;
                zzdb.zzf(z10);
                this.zzc = zzab.zzao(zzabVar);
                this.zzb = zzab.zzak(zzabVar);
            }
            z10 = true;
            zzdb.zzf(z10);
            this.zzc = zzab.zzao(zzabVar);
            this.zzb = zzab.zzak(zzabVar);
        }
        this.zze = zzab.zzr(zzabVar);
        zzdb.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzab.zzo(zzabVar);
        this.zzg = 0;
        int zzd = zzab.zzd(zzabVar);
        this.zzh = zzd;
        int zzn = zzab.zzn(zzabVar);
        this.zzi = zzn;
        this.zzj = zzn != -1 ? zzn : zzd;
        this.zzk = zzab.zzah(zzabVar);
        this.zzl = zzab.zzag(zzabVar);
        this.zzm = null;
        this.zzn = zzab.zzai(zzabVar);
        this.zzo = zzab.zzam(zzabVar);
        this.zzp = zzab.zzk(zzabVar);
        this.zzq = zzab.zzl(zzabVar);
        this.zzr = zzab.zzan(zzabVar) == null ? Collections.emptyList() : zzab.zzan(zzabVar);
        zzw zzw = zzab.zzw(zzabVar);
        this.zzs = zzw;
        this.zzt = zzab.zzu(zzabVar);
        this.zzu = zzab.zzt(zzabVar);
        this.zzv = zzab.zzj(zzabVar);
        this.zzw = zzab.zza(zzabVar);
        this.zzx = zzab.zzp(zzabVar) == -1 ? 0 : zzab.zzp(zzabVar);
        this.zzy = zzab.zzb(zzabVar) == -1.0f ? 1.0f : zzab.zzb(zzabVar);
        this.zzz = zzab.zzap(zzabVar);
        this.zzA = zzab.zzs(zzabVar);
        this.zzB = zzab.zzv(zzabVar);
        this.zzC = zzab.zze(zzabVar);
        this.zzD = zzab.zzq(zzabVar);
        this.zzE = zzab.zzm(zzabVar);
        this.zzF = zzab.zzh(zzabVar) == -1 ? 0 : zzab.zzh(zzabVar);
        this.zzG = zzab.zzi(zzabVar) != -1 ? zzab.zzi(zzabVar) : 0;
        this.zzH = zzab.zzc(zzabVar);
        this.zzI = zzab.zzg(zzabVar);
        if (zzab.zzf(zzabVar) != 0 || zzw == null) {
            this.zzJ = zzab.zzf(zzabVar);
        } else {
            this.zzJ = 1;
        }
    }
}
