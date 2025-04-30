package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzhau implements zzhfi {
    private final zzhat zza;

    private zzhau(zzhat zzhatVar) {
        zzhcb.zzc(zzhatVar, "output");
        this.zza = zzhatVar;
        zzhatVar.zze = this;
    }

    public static zzhau zza(zzhat zzhatVar) {
        zzhau zzhauVar = zzhatVar.zze;
        if (zzhauVar != null) {
            return zzhauVar;
        }
        return new zzhau(zzhatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzA(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhctVar.size(); i12++) {
                    zzhctVar.zza(i12);
                    i11 += 8;
                }
                this.zza.zzu(i11);
                while (i10 < zzhctVar.size()) {
                    this.zza.zzk(zzhctVar.zza(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhctVar.size()) {
                this.zza.zzj(i9, zzhctVar.zza(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzB(int i9, int i10) throws IOException {
        this.zza.zzt(i9, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzC(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbpVar.size(); i12++) {
                    int zzd = zzhbpVar.zzd(i12);
                    i11 += zzhat.zzD((zzd >> 31) ^ (zzd + zzd));
                }
                this.zza.zzu(i11);
                while (i10 < zzhbpVar.size()) {
                    zzhat zzhatVar = this.zza;
                    int zzd2 = zzhbpVar.zzd(i10);
                    zzhatVar.zzu((zzd2 >> 31) ^ (zzd2 + zzd2));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbpVar.size()) {
                zzhat zzhatVar2 = this.zza;
                int zzd3 = zzhbpVar.zzd(i10);
                zzhatVar2.zzt(i9, (zzd3 >> 31) ^ (zzd3 + zzd3));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += zzhat.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                zzhat zzhatVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i10)).intValue();
                zzhatVar3.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzhat zzhatVar4 = this.zza;
            int intValue3 = ((Integer) list.get(i10)).intValue();
            zzhatVar4.zzt(i9, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzD(int i9, long j7) throws IOException {
        this.zza.zzv(i9, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzE(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhctVar.size(); i12++) {
                    long zza = zzhctVar.zza(i12);
                    i11 += zzhat.zzE((zza >> 63) ^ (zza + zza));
                }
                this.zza.zzu(i11);
                while (i10 < zzhctVar.size()) {
                    zzhat zzhatVar = this.zza;
                    long zza2 = zzhctVar.zza(i10);
                    zzhatVar.zzw((zza2 >> 63) ^ (zza2 + zza2));
                    i10++;
                }
                return;
            }
            while (i10 < zzhctVar.size()) {
                zzhat zzhatVar2 = this.zza;
                long zza3 = zzhctVar.zza(i10);
                zzhatVar2.zzv(i9, (zza3 >> 63) ^ (zza3 + zza3));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += zzhat.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                zzhat zzhatVar3 = this.zza;
                long longValue2 = ((Long) list.get(i10)).longValue();
                zzhatVar3.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzhat zzhatVar4 = this.zza;
            long longValue3 = ((Long) list.get(i10)).longValue();
            zzhatVar4.zzv(i9, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    @Deprecated
    public final void zzF(int i9) throws IOException {
        this.zza.zzs(i9, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzG(int i9, String str) throws IOException {
        this.zza.zzq(i9, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzH(int i9, List list) throws IOException {
        int i10 = 0;
        if (list instanceof zzhcm) {
            zzhcm zzhcmVar = (zzhcm) list;
            while (i10 < list.size()) {
                Object zze = zzhcmVar.zze(i10);
                if (zze instanceof String) {
                    this.zza.zzq(i9, (String) zze);
                } else {
                    this.zza.zzO(i9, (zzhac) zze);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzq(i9, (String) list.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzI(int i9, int i10) throws IOException {
        this.zza.zzt(i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzJ(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbpVar.size(); i12++) {
                    i11 += zzhat.zzD(zzhbpVar.zzd(i12));
                }
                this.zza.zzu(i11);
                while (i10 < zzhbpVar.size()) {
                    this.zza.zzu(zzhbpVar.zzd(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbpVar.size()) {
                this.zza.zzt(i9, zzhbpVar.zzd(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzhat.zzD(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzt(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzK(int i9, long j7) throws IOException {
        this.zza.zzv(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzL(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhctVar.size(); i12++) {
                    i11 += zzhat.zzE(zzhctVar.zza(i12));
                }
                this.zza.zzu(i11);
                while (i10 < zzhctVar.size()) {
                    this.zza.zzw(zzhctVar.zza(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhctVar.size()) {
                this.zza.zzv(i9, zzhctVar.zza(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzhat.zzE(((Long) list.get(i14)).longValue());
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzv(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzb(int i9, boolean z8) throws IOException {
        this.zza.zzN(i9, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzc(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzgzp) {
            zzgzp zzgzpVar = (zzgzp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzgzpVar.size(); i12++) {
                    zzgzpVar.zzh(i12);
                    i11++;
                }
                this.zza.zzu(i11);
                while (i10 < zzgzpVar.size()) {
                    this.zza.zzM(zzgzpVar.zzh(i10) ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < zzgzpVar.size()) {
                this.zza.zzN(i9, zzgzpVar.zzh(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzM(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzN(i9, ((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzd(int i9, zzhac zzhacVar) throws IOException {
        this.zza.zzO(i9, zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zze(int i9, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzO(i9, (zzhac) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzf(int i9, double d2) throws IOException {
        this.zza.zzj(i9, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzg(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhav) {
            zzhav zzhavVar = (zzhav) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhavVar.size(); i12++) {
                    zzhavVar.zzd(i12);
                    i11 += 8;
                }
                this.zza.zzu(i11);
                while (i10 < zzhavVar.size()) {
                    this.zza.zzk(Double.doubleToRawLongBits(zzhavVar.zzd(i10)));
                    i10++;
                }
                return;
            }
            while (i10 < zzhavVar.size()) {
                this.zza.zzj(i9, Double.doubleToRawLongBits(zzhavVar.zzd(i10)));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i9, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    @Deprecated
    public final void zzh(int i9) throws IOException {
        this.zza.zzs(i9, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzi(int i9, int i10) throws IOException {
        this.zza.zzl(i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzj(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.zza.zzs(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzhat.zzE(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzl(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzk(int i9, int i10) throws IOException {
        this.zza.zzh(i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzl(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbpVar.size(); i12++) {
                    zzhbpVar.zzd(i12);
                    i11 += 4;
                }
                this.zza.zzu(i11);
                while (i10 < zzhbpVar.size()) {
                    this.zza.zzi(zzhbpVar.zzd(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbpVar.size()) {
                this.zza.zzh(i9, zzhbpVar.zzd(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzm(int i9, long j7) throws IOException {
        this.zza.zzj(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzn(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhctVar.size(); i12++) {
                    zzhctVar.zza(i12);
                    i11 += 8;
                }
                this.zza.zzu(i11);
                while (i10 < zzhctVar.size()) {
                    this.zza.zzk(zzhctVar.zza(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhctVar.size()) {
                this.zza.zzj(i9, zzhctVar.zza(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzo(int i9, float f9) throws IOException {
        this.zza.zzh(i9, Float.floatToRawIntBits(f9));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzp(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbfVar.size(); i12++) {
                    zzhbfVar.zzd(i12);
                    i11 += 4;
                }
                this.zza.zzu(i11);
                while (i10 < zzhbfVar.size()) {
                    this.zza.zzi(Float.floatToRawIntBits(zzhbfVar.zzd(i10)));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbfVar.size()) {
                this.zza.zzh(i9, Float.floatToRawIntBits(zzhbfVar.zzd(i10)));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzq(int i9, Object obj, zzhdz zzhdzVar) throws IOException {
        zzhat zzhatVar = this.zza;
        zzhatVar.zzs(i9, 3);
        zzhdzVar.zzj((zzhde) obj, zzhatVar.zze);
        zzhatVar.zzs(i9, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzr(int i9, int i10) throws IOException {
        this.zza.zzl(i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzs(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbpVar.size(); i12++) {
                    i11 += zzhat.zzE(zzhbpVar.zzd(i12));
                }
                this.zza.zzu(i11);
                while (i10 < zzhbpVar.size()) {
                    this.zza.zzm(zzhbpVar.zzd(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbpVar.size()) {
                this.zza.zzl(i9, zzhbpVar.zzd(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzhat.zzE(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzl(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzt(int i9, long j7) throws IOException {
        this.zza.zzv(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzu(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhctVar.size(); i12++) {
                    i11 += zzhat.zzE(zzhctVar.zza(i12));
                }
                this.zza.zzu(i11);
                while (i10 < zzhctVar.size()) {
                    this.zza.zzw(zzhctVar.zza(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhctVar.size()) {
                this.zza.zzv(i9, zzhctVar.zza(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzhat.zzE(((Long) list.get(i14)).longValue());
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzv(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzv(int i9, Object obj, zzhdz zzhdzVar) throws IOException {
        this.zza.zzn(i9, (zzhde) obj, zzhdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzw(int i9, Object obj) throws IOException {
        if (obj instanceof zzhac) {
            this.zza.zzp(i9, (zzhac) obj);
        } else {
            this.zza.zzo(i9, (zzhde) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzx(int i9, int i10) throws IOException {
        this.zza.zzh(i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzy(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            if (z8) {
                this.zza.zzs(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzhbpVar.size(); i12++) {
                    zzhbpVar.zzd(i12);
                    i11 += 4;
                }
                this.zza.zzu(i11);
                while (i10 < zzhbpVar.size()) {
                    this.zza.zzi(zzhbpVar.zzd(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzhbpVar.size()) {
                this.zza.zzh(i9, zzhbpVar.zzd(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzs(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzu(i13);
            while (i10 < list.size()) {
                this.zza.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzz(int i9, long j7) throws IOException {
        this.zza.zzj(i9, j7);
    }
}
