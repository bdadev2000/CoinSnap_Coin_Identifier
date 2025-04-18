package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes2.dex */
final class zzhak implements zzhen {
    private final zzhaj zza;

    private zzhak(zzhaj zzhajVar) {
        zzhbr.zzc(zzhajVar, AgentOptions.OUTPUT);
        this.zza = zzhajVar;
        zzhajVar.zze = this;
    }

    public static zzhak zza(zzhaj zzhajVar) {
        zzhak zzhakVar = zzhajVar.zze;
        return zzhakVar != null ? zzhakVar : new zzhak(zzhajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhce)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzhce zzhceVar = (zzhce) list;
        if (!z2) {
            while (i3 < zzhceVar.size()) {
                this.zza.zzj(i2, zzhceVar.zza(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhceVar.size(); i7++) {
            zzhceVar.zza(i7);
            i6 += 8;
        }
        this.zza.zzu(i6);
        while (i3 < zzhceVar.size()) {
            this.zza.zzk(zzhceVar.zza(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzB(int i2, int i3) throws IOException {
        this.zza.zzt(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzhaj zzhajVar = this.zza;
                    int intValue = ((Integer) list.get(i3)).intValue();
                    zzhajVar.zzt(i2, (intValue >> 31) ^ (intValue + intValue));
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue2 = ((Integer) list.get(i5)).intValue();
                i4 += zzhaj.zzD((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                zzhaj zzhajVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i3)).intValue();
                zzhajVar2.zzu((intValue3 >> 31) ^ (intValue3 + intValue3));
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                zzhaj zzhajVar3 = this.zza;
                int zzd = zzhbfVar.zzd(i3);
                zzhajVar3.zzt(i2, (zzd >> 31) ^ (zzd + zzd));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            int zzd2 = zzhbfVar.zzd(i7);
            i6 += zzhaj.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            zzhaj zzhajVar4 = this.zza;
            int zzd3 = zzhbfVar.zzd(i3);
            zzhajVar4.zzu((zzd3 >> 31) ^ (zzd3 + zzd3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzD(int i2, long j2) throws IOException {
        this.zza.zzv(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhce)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzhaj zzhajVar = this.zza;
                    long longValue = ((Long) list.get(i3)).longValue();
                    zzhajVar.zzv(i2, (longValue >> 63) ^ (longValue + longValue));
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue2 = ((Long) list.get(i5)).longValue();
                i4 += zzhaj.zzE((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                zzhaj zzhajVar2 = this.zza;
                long longValue3 = ((Long) list.get(i3)).longValue();
                zzhajVar2.zzw((longValue3 >> 63) ^ (longValue3 + longValue3));
                i3++;
            }
            return;
        }
        zzhce zzhceVar = (zzhce) list;
        if (!z2) {
            while (i3 < zzhceVar.size()) {
                zzhaj zzhajVar3 = this.zza;
                long zza = zzhceVar.zza(i3);
                zzhajVar3.zzv(i2, (zza >> 63) ^ (zza + zza));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhceVar.size(); i7++) {
            long zza2 = zzhceVar.zza(i7);
            i6 += zzhaj.zzE((zza2 >> 63) ^ (zza2 + zza2));
        }
        this.zza.zzu(i6);
        while (i3 < zzhceVar.size()) {
            zzhaj zzhajVar4 = this.zza;
            long zza3 = zzhceVar.zza(i3);
            zzhajVar4.zzw((zza3 >> 63) ^ (zza3 + zza3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    @Deprecated
    public final void zzF(int i2) throws IOException {
        this.zza.zzs(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzG(int i2, String str) throws IOException {
        this.zza.zzq(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzH(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhcb)) {
            while (i3 < list.size()) {
                this.zza.zzq(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzhcb zzhcbVar = (zzhcb) list;
        while (i3 < list.size()) {
            Object zzc = zzhcbVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzq(i2, (String) zzc);
            } else {
                this.zza.zzN(i2, (zzgzs) zzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzI(int i2, int i3) throws IOException {
        this.zza.zzt(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzt(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhaj.zzD(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzu(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                this.zza.zzt(i2, zzhbfVar.zzd(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            i6 += zzhaj.zzD(zzhbfVar.zzd(i7));
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            this.zza.zzu(zzhbfVar.zzd(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzK(int i2, long j2) throws IOException {
        this.zza.zzv(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhce)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzv(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhaj.zzE(((Long) list.get(i5)).longValue());
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzw(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzhce zzhceVar = (zzhce) list;
        if (!z2) {
            while (i3 < zzhceVar.size()) {
                this.zza.zzv(i2, zzhceVar.zza(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhceVar.size(); i7++) {
            i6 += zzhaj.zzE(zzhceVar.zza(i7));
        }
        this.zza.zzu(i6);
        while (i3 < zzhceVar.size()) {
            this.zza.zzw(zzhceVar.zza(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzb(int i2, boolean z2) throws IOException {
        this.zza.zzM(i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzgzi)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzM(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).booleanValue();
                i4++;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzgzi zzgziVar = (zzgzi) list;
        if (!z2) {
            while (i3 < zzgziVar.size()) {
                this.zza.zzM(i2, zzgziVar.zzh(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzgziVar.size(); i7++) {
            zzgziVar.zzh(i7);
            i6++;
        }
        this.zza.zzu(i6);
        while (i3 < zzgziVar.size()) {
            this.zza.zzL(zzgziVar.zzh(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzd(int i2, zzgzs zzgzsVar) throws IOException {
        this.zza.zzN(i2, zzgzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzN(i2, (zzgzs) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzf(int i2, double d) throws IOException {
        this.zza.zzj(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhal)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).doubleValue();
                i4 += 8;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzhal zzhalVar = (zzhal) list;
        if (!z2) {
            while (i3 < zzhalVar.size()) {
                this.zza.zzj(i2, Double.doubleToRawLongBits(zzhalVar.zzd(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhalVar.size(); i7++) {
            zzhalVar.zzd(i7);
            i6 += 8;
        }
        this.zza.zzu(i6);
        while (i3 < zzhalVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzhalVar.zzd(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzs(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzl(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhaj.zzE(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                this.zza.zzl(i2, zzhbfVar.zzd(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            i6 += zzhaj.zzE(zzhbfVar.zzd(i7));
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            this.zza.zzm(zzhbfVar.zzd(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                this.zza.zzh(i2, zzhbfVar.zzd(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            zzhbfVar.zzd(i7);
            i6 += 4;
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            this.zza.zzi(zzhbfVar.zzd(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzj(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhce)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzhce zzhceVar = (zzhce) list;
        if (!z2) {
            while (i3 < zzhceVar.size()) {
                this.zza.zzj(i2, zzhceVar.zza(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhceVar.size(); i7++) {
            zzhceVar.zza(i7);
            i6 += 8;
        }
        this.zza.zzu(i6);
        while (i3 < zzhceVar.size()) {
            this.zza.zzk(zzhceVar.zza(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzh(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhav)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).floatValue();
                i4 += 4;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzhav zzhavVar = (zzhav) list;
        if (!z2) {
            while (i3 < zzhavVar.size()) {
                this.zza.zzh(i2, Float.floatToRawIntBits(zzhavVar.zzd(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhavVar.size(); i7++) {
            zzhavVar.zzd(i7);
            i6 += 4;
        }
        this.zza.zzu(i6);
        while (i3 < zzhavVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzhavVar.zzd(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzq(int i2, Object obj, zzhdk zzhdkVar) throws IOException {
        zzhaj zzhajVar = this.zza;
        zzhajVar.zzs(i2, 3);
        zzhdkVar.zzj((zzhcp) obj, zzhajVar.zze);
        zzhajVar.zzs(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzl(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhaj.zzE(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                this.zza.zzl(i2, zzhbfVar.zzd(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            i6 += zzhaj.zzE(zzhbfVar.zzd(i7));
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            this.zza.zzm(zzhbfVar.zzd(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzv(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhce)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzv(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhaj.zzE(((Long) list.get(i5)).longValue());
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzw(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzhce zzhceVar = (zzhce) list;
        if (!z2) {
            while (i3 < zzhceVar.size()) {
                this.zza.zzv(i2, zzhceVar.zza(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhceVar.size(); i7++) {
            i6 += zzhaj.zzE(zzhceVar.zza(i7));
        }
        this.zza.zzu(i6);
        while (i3 < zzhceVar.size()) {
            this.zza.zzw(zzhceVar.zza(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzv(int i2, Object obj, zzhdk zzhdkVar) throws IOException {
        this.zza.zzn(i2, (zzhcp) obj, zzhdkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzw(int i2, Object obj) throws IOException {
        if (obj instanceof zzgzs) {
            this.zza.zzp(i2, (zzgzs) obj);
        } else {
            this.zza.zzo(i2, (zzhcp) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzx(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzs(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzu(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z2) {
            while (i3 < zzhbfVar.size()) {
                this.zza.zzh(i2, zzhbfVar.zzd(i3));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhbfVar.size(); i7++) {
            zzhbfVar.zzd(i7);
            i6 += 4;
        }
        this.zza.zzu(i6);
        while (i3 < zzhbfVar.size()) {
            this.zza.zzi(zzhbfVar.zzd(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzz(int i2, long j2) throws IOException {
        this.zza.zzj(i2, j2);
    }
}
