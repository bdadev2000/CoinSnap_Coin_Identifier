package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzan {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    private int zzaq;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;
    public final List zzd;

    @Nullable
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzcd zzl;

    @Nullable
    public final String zzm;

    @Nullable
    public final String zzn;
    public final int zzo;
    public final List zzp;

    @Nullable
    public final zzae zzq;
    public final long zzr;
    public final int zzs;
    public final int zzt;
    public final float zzu;
    public final int zzv;
    public final float zzw;

    @Nullable
    public final byte[] zzx;
    public final int zzy;

    @Nullable
    public final zzt zzz;
    private static final zzan zzI = new zzan(new zzal());
    private static final String zzJ = Integer.toString(0, 36);
    private static final String zzK = Integer.toString(1, 36);
    private static final String zzL = Integer.toString(2, 36);
    private static final String zzM = Integer.toString(3, 36);
    private static final String zzN = Integer.toString(4, 36);
    private static final String zzO = Integer.toString(5, 36);
    private static final String zzP = Integer.toString(6, 36);
    private static final String zzQ = Integer.toString(7, 36);
    private static final String zzR = Integer.toString(8, 36);
    private static final String zzS = Integer.toString(9, 36);
    private static final String zzT = Integer.toString(10, 36);
    private static final String zzU = Integer.toString(11, 36);
    private static final String zzV = Integer.toString(12, 36);
    private static final String zzW = Integer.toString(13, 36);
    private static final String zzX = Integer.toString(14, 36);
    private static final String zzY = Integer.toString(15, 36);
    private static final String zzZ = Integer.toString(16, 36);
    private static final String zzaa = Integer.toString(17, 36);
    private static final String zzab = Integer.toString(18, 36);
    private static final String zzac = Integer.toString(19, 36);
    private static final String zzad = Integer.toString(20, 36);
    private static final String zzae = Integer.toString(21, 36);
    private static final String zzaf = Integer.toString(22, 36);
    private static final String zzag = Integer.toString(23, 36);
    private static final String zzah = Integer.toString(24, 36);
    private static final String zzai = Integer.toString(25, 36);
    private static final String zzaj = Integer.toString(26, 36);
    private static final String zzak = Integer.toString(27, 36);
    private static final String zzal = Integer.toString(28, 36);
    private static final String zzam = Integer.toString(29, 36);
    private static final String zzan = Integer.toString(30, 36);
    private static final String zzao = Integer.toString(31, 36);
    private static final String zzap = Integer.toString(32, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    public final boolean equals(@Nullable Object obj) {
        int i9;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzan.class == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            int i10 = this.zzaq;
            if ((i10 == 0 || (i9 = zzanVar.zzaq) == 0 || i10 == i9) && this.zzf == zzanVar.zzf && this.zzg == zzanVar.zzg && this.zzh == zzanVar.zzh && this.zzi == zzanVar.zzi && this.zzo == zzanVar.zzo && this.zzr == zzanVar.zzr && this.zzs == zzanVar.zzs && this.zzt == zzanVar.zzt && this.zzv == zzanVar.zzv && this.zzy == zzanVar.zzy && this.zzA == zzanVar.zzA && this.zzB == zzanVar.zzB && this.zzC == zzanVar.zzC && this.zzD == zzanVar.zzD && this.zzE == zzanVar.zzE && this.zzF == zzanVar.zzF && this.zzH == zzanVar.zzH && Float.compare(this.zzu, zzanVar.zzu) == 0 && Float.compare(this.zzw, zzanVar.zzw) == 0 && zzgd.zzG(this.zzb, zzanVar.zzb) && zzgd.zzG(this.zzc, zzanVar.zzc) && this.zzd.equals(zzanVar.zzd) && zzgd.zzG(this.zzk, zzanVar.zzk) && zzgd.zzG(this.zzm, zzanVar.zzm) && zzgd.zzG(this.zzn, zzanVar.zzn) && zzgd.zzG(this.zze, zzanVar.zze) && Arrays.equals(this.zzx, zzanVar.zzx) && zzgd.zzG(this.zzl, zzanVar.zzl) && zzgd.zzG(this.zzz, zzanVar.zzz) && zzgd.zzG(this.zzq, zzanVar.zzq) && zzd(zzanVar)) {
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
        int i9 = this.zzaq;
        if (i9 == 0) {
            String str = this.zzb;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzc;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = this.zzd.hashCode() + ((((hashCode + 527) * 31) + hashCode2) * 31);
            String str3 = this.zze;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = ((((((((((hashCode7 * 31) + hashCode3) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
            String str4 = this.zzk;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            zzcd zzcdVar = this.zzl;
            if (zzcdVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = zzcdVar.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str5 = this.zzm;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.zzn;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = this.zzH + ((((((((((((((((((((Float.floatToIntBits(this.zzw) + ((((Float.floatToIntBits(this.zzu) + ((((((((((i14 + i10) * 31) + this.zzo) * 31) + ((int) this.zzr)) * 31) + this.zzs) * 31) + this.zzt) * 31)) * 31) + this.zzv) * 31)) * 31) + this.zzy) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) - 1) * 31) - 1) * 31);
            this.zzaq = floatToIntBits;
            return floatToIntBits;
        }
        return i9;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzz);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.zzb);
        sb.append(", ");
        sb.append(this.zzc);
        sb.append(", ");
        sb.append(this.zzm);
        sb.append(", ");
        sb.append(this.zzn);
        sb.append(", ");
        sb.append(this.zzk);
        sb.append(", ");
        sb.append(this.zzj);
        sb.append(", ");
        sb.append(this.zze);
        sb.append(", [");
        sb.append(this.zzs);
        sb.append(", ");
        sb.append(this.zzt);
        sb.append(", ");
        sb.append(this.zzu);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(this.zzA);
        sb.append(", ");
        return AbstractC2914a.g(sb, this.zzB, "])");
    }

    public final int zza() {
        int i9;
        int i10 = this.zzs;
        if (i10 == -1 || (i9 = this.zzt) == -1) {
            return -1;
        }
        return i10 * i9;
    }

    public final zzal zzb() {
        return new zzal(this, null);
    }

    public final zzan zzc(int i9) {
        zzal zzalVar = new zzal(this, null);
        zzalVar.zzC(i9);
        return new zzan(zzalVar);
    }

    public final boolean zzd(zzan zzanVar) {
        if (this.zzp.size() != zzanVar.zzp.size()) {
            return false;
        }
        for (int i9 = 0; i9 < this.zzp.size(); i9++) {
            if (!Arrays.equals((byte[]) this.zzp.get(i9), (byte[]) zzanVar.zzp.get(i9))) {
                return false;
            }
        }
        return true;
    }

    private zzan(final zzal zzalVar) {
        String str;
        this.zzb = zzal.zzah(zzalVar);
        String zzD = zzgd.zzD(zzal.zzaj(zzalVar));
        this.zze = zzD;
        if (zzal.zzam(zzalVar).isEmpty() && zzal.zzai(zzalVar) != null) {
            this.zzd = zzgbc.zzn(new zzas(zzD, zzal.zzai(zzalVar)));
            this.zzc = zzal.zzai(zzalVar);
        } else if (!zzal.zzam(zzalVar).isEmpty() && zzal.zzai(zzalVar) == null) {
            this.zzd = zzal.zzam(zzalVar);
            List zzam2 = zzal.zzam(zzalVar);
            Iterator it = zzam2.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzas zzasVar = (zzas) it.next();
                    if (TextUtils.equals(zzasVar.zza, zzD)) {
                        str = zzasVar.zzb;
                        break;
                    }
                } else {
                    str = ((zzas) zzam2.get(0)).zzb;
                    break;
                }
            }
            this.zzc = str;
        } else {
            zzeq.zzf((zzal.zzam(zzalVar).isEmpty() && zzal.zzai(zzalVar) == null) || zzal.zzam(zzalVar).stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzaj
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2;
                    zzn zznVar = zzan.zza;
                    String str3 = ((zzas) obj).zzb;
                    str2 = zzal.this.zzb;
                    return str3.equals(str2);
                }
            }));
            this.zzd = zzal.zzam(zzalVar);
            this.zzc = zzal.zzai(zzalVar);
        }
        this.zzf = zzal.zzq(zzalVar);
        this.zzg = zzal.zzn(zzalVar);
        int zzd = zzal.zzd(zzalVar);
        this.zzh = zzd;
        int zzm = zzal.zzm(zzalVar);
        this.zzi = zzm;
        this.zzj = zzm != -1 ? zzm : zzd;
        this.zzk = zzal.zzaf(zzalVar);
        this.zzl = zzal.zzae(zzalVar);
        this.zzm = zzal.zzag(zzalVar);
        this.zzn = zzal.zzak(zzalVar);
        this.zzo = zzal.zzk(zzalVar);
        this.zzp = zzal.zzal(zzalVar) == null ? Collections.emptyList() : zzal.zzal(zzalVar);
        zzae zzv = zzal.zzv(zzalVar);
        this.zzq = zzv;
        this.zzr = zzal.zzt(zzalVar);
        this.zzs = zzal.zzs(zzalVar);
        this.zzt = zzal.zzj(zzalVar);
        this.zzu = zzal.zza(zzalVar);
        this.zzv = zzal.zzo(zzalVar) == -1 ? 0 : zzal.zzo(zzalVar);
        this.zzw = zzal.zzb(zzalVar) == -1.0f ? 1.0f : zzal.zzb(zzalVar);
        this.zzx = zzal.zzan(zzalVar);
        this.zzy = zzal.zzr(zzalVar);
        this.zzz = zzal.zzu(zzalVar);
        this.zzA = zzal.zze(zzalVar);
        this.zzB = zzal.zzp(zzalVar);
        this.zzC = zzal.zzl(zzalVar);
        this.zzD = zzal.zzh(zzalVar) == -1 ? 0 : zzal.zzh(zzalVar);
        this.zzE = zzal.zzi(zzalVar) != -1 ? zzal.zzi(zzalVar) : 0;
        this.zzF = zzal.zzc(zzalVar);
        this.zzG = zzal.zzg(zzalVar);
        if (zzal.zzf(zzalVar) != 0 || zzv == null) {
            this.zzH = zzal.zzf(zzalVar);
        } else {
            this.zzH = 1;
        }
    }
}
