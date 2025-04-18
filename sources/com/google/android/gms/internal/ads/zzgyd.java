package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzgyd implements zzhcc {
    private final zzgyc zza;

    private zzgyd(zzgyc zzgycVar) {
        zzgzk.zzc(zzgycVar, "output");
        this.zza = zzgycVar;
        zzgycVar.zze = this;
    }

    public static zzgyd zza(zzgyc zzgycVar) {
        zzgyd zzgydVar = zzgycVar.zze;
        if (zzgydVar != null) {
            return zzgydVar;
        }
        return new zzgyd(zzgycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgzxVar.size(); i13++) {
                    zzgzxVar.zza(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgzxVar.size()) {
                    this.zza.zzk(zzgzxVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgzxVar.size()) {
                this.zza.zzj(i10, zzgzxVar.zza(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    int zzd = zzgyyVar.zzd(i13);
                    i12 += zzgyc.zzD((zzd >> 31) ^ (zzd + zzd));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    zzgyc zzgycVar = this.zza;
                    int zzd2 = zzgyyVar.zzd(i11);
                    zzgycVar.zzu((zzd2 >> 31) ^ (zzd2 + zzd2));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                zzgyc zzgycVar2 = this.zza;
                int zzd3 = zzgyyVar.zzd(i11);
                zzgycVar2.zzt(i10, (zzd3 >> 31) ^ (zzd3 + zzd3));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                int intValue = ((Integer) list.get(i15)).intValue();
                i14 += zzgyc.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                zzgyc zzgycVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzgycVar3.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzgyc zzgycVar4 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzgycVar4.zzt(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzD(int i10, long j3) throws IOException {
        this.zza.zzv(i10, (j3 >> 63) ^ (j3 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgzxVar.size(); i13++) {
                    long zza = zzgzxVar.zza(i13);
                    i12 += zzgyc.zzE((zza >> 63) ^ (zza + zza));
                }
                this.zza.zzu(i12);
                while (i11 < zzgzxVar.size()) {
                    zzgyc zzgycVar = this.zza;
                    long zza2 = zzgzxVar.zza(i11);
                    zzgycVar.zzw((zza2 >> 63) ^ (zza2 + zza2));
                    i11++;
                }
                return;
            }
            while (i11 < zzgzxVar.size()) {
                zzgyc zzgycVar2 = this.zza;
                long zza3 = zzgzxVar.zza(i11);
                zzgycVar2.zzv(i10, (zza3 >> 63) ^ (zza3 + zza3));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                long longValue = ((Long) list.get(i15)).longValue();
                i14 += zzgyc.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                zzgyc zzgycVar3 = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzgycVar3.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzgyc zzgycVar4 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzgycVar4.zzv(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzu) {
            zzgzu zzgzuVar = (zzgzu) list;
            while (i11 < list.size()) {
                Object zzc = zzgzuVar.zzc();
                if (zzc instanceof String) {
                    this.zza.zzq(i10, (String) zzc);
                } else {
                    this.zza.zzN(i10, (zzgxp) zzc);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzq(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    i12 += zzgyc.zzD(zzgyyVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzu(zzgyyVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzt(i10, zzgyyVar.zzd(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgyc.zzD(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzK(int i10, long j3) throws IOException {
        this.zza.zzv(i10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgzxVar.size(); i13++) {
                    i12 += zzgyc.zzE(zzgzxVar.zza(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgzxVar.size()) {
                    this.zza.zzw(zzgzxVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgzxVar.size()) {
                this.zza.zzv(i10, zzgzxVar.zza(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgyc.zzE(((Long) list.get(i15)).longValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzM(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgxfVar.size(); i13++) {
                    zzgxfVar.zzh(i13);
                    i12++;
                }
                this.zza.zzu(i12);
                while (i11 < zzgxfVar.size()) {
                    this.zza.zzL(zzgxfVar.zzh(i11) ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < zzgxfVar.size()) {
                this.zza.zzM(i10, zzgxfVar.zzh(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Boolean) list.get(i15)).booleanValue();
                i14++;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzM(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzd(int i10, zzgxp zzgxpVar) throws IOException {
        this.zza.zzN(i10, zzgxpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzN(i10, (zzgxp) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgye) {
            zzgye zzgyeVar = (zzgye) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyeVar.size(); i13++) {
                    zzgyeVar.zzd(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyeVar.size()) {
                    this.zza.zzk(Double.doubleToRawLongBits(zzgyeVar.zzd(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyeVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzgyeVar.zzd(i11)));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).doubleValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    i12 += zzgyc.zzE(zzgyyVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzm(zzgyyVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzl(i10, zzgyyVar.zzd(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgyc.zzE(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    zzgyyVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzi(zzgyyVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzh(i10, zzgyyVar.zzd(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzm(int i10, long j3) throws IOException {
        this.zza.zzj(i10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgzxVar.size(); i13++) {
                    zzgzxVar.zza(i13);
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < zzgzxVar.size()) {
                    this.zza.zzk(zzgzxVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgzxVar.size()) {
                this.zza.zzj(i10, zzgzxVar.zza(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyo) {
            zzgyo zzgyoVar = (zzgyo) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyoVar.size(); i13++) {
                    zzgyoVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyoVar.size()) {
                    this.zza.zzi(Float.floatToRawIntBits(zzgyoVar.zzd(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyoVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgyoVar.zzd(i11)));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Float) list.get(i15)).floatValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzq(int i10, Object obj, zzhbb zzhbbVar) throws IOException {
        zzgyc zzgycVar = this.zza;
        zzgycVar.zzs(i10, 3);
        zzhbbVar.zzj((zzhai) obj, zzgycVar.zze);
        zzgycVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    i12 += zzgyc.zzE(zzgyyVar.zzd(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzm(zzgyyVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzl(i10, zzgyyVar.zzd(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgyc.zzE(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzt(int i10, long j3) throws IOException {
        this.zza.zzv(i10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgzxVar.size(); i13++) {
                    i12 += zzgyc.zzE(zzgzxVar.zza(i13));
                }
                this.zza.zzu(i12);
                while (i11 < zzgzxVar.size()) {
                    this.zza.zzw(zzgzxVar.zza(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgzxVar.size()) {
                this.zza.zzv(i10, zzgzxVar.zza(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgyc.zzE(((Long) list.get(i15)).longValue());
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzv(int i10, Object obj, zzhbb zzhbbVar) throws IOException {
        this.zza.zzn(i10, (zzhai) obj, zzhbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzgxp) {
            this.zza.zzp(i10, (zzgxp) obj);
        } else {
            this.zza.zzo(i10, (zzhai) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgyyVar.size(); i13++) {
                    zzgyyVar.zzd(i13);
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < zzgyyVar.size()) {
                    this.zza.zzi(zzgyyVar.zzd(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzgyyVar.size()) {
                this.zza.zzh(i10, zzgyyVar.zzd(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzs(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzu(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzz(int i10, long j3) throws IOException {
        this.zza.zzj(i10, j3);
    }
}
