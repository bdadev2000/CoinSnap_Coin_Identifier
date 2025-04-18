package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzef implements zzhv {
    private final zzee zza;

    private zzef(zzee zzeeVar) {
        byte[] bArr = zzfd.zzd;
        this.zza = zzeeVar;
        zzeeVar.zza = this;
    }

    public static zzef zza(zzee zzeeVar) {
        zzef zzefVar = zzeeVar.zza;
        return zzefVar != null ? zzefVar : new zzef(zzeeVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzA(int i2, int i3) throws IOException {
        this.zza.zzp(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                zzee zzeeVar = this.zza;
                int intValue = ((Integer) list.get(i3)).intValue();
                zzeeVar.zzp(i2, (intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += zzee.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            zzee zzeeVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i3)).intValue();
            zzeeVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzC(int i2, long j2) throws IOException {
        this.zza.zzr(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                zzee zzeeVar = this.zza;
                long longValue = ((Long) list.get(i3)).longValue();
                zzeeVar.zzr(i2, (longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += zzee.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            zzee zzeeVar2 = this.zza;
            long longValue3 = ((Long) list.get(i3)).longValue();
            zzeeVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    @Deprecated
    public final void zzE(int i2) throws IOException {
        this.zza.zzo(i2, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzF(int i2, String str) throws IOException {
        this.zza.zzm(i2, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzG(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzfk)) {
            while (i3 < list.size()) {
                this.zza.zzm(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzfk zzfkVar = (zzfk) list;
        while (i3 < list.size()) {
            Object zzf = zzfkVar.zzf(i3);
            if (zzf instanceof String) {
                this.zza.zzm(i2, (String) zzf);
            } else {
                this.zza.zze(i2, (zzdw) zzf);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzH(int i2, int i3) throws IOException {
        this.zza.zzp(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzI(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzp(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzee.zzx(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzq(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzJ(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzee.zzy(((Long) list.get(i5)).longValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzs(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzb(int i2, boolean z2) throws IOException {
        this.zza.zzd(i2, z2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).booleanValue();
            i4++;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzd(int i2, zzdw zzdwVar) throws IOException {
        this.zza.zze(i2, zzdwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzdw) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzf(int i2, double d) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).doubleValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzee.zzu(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzk(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).floatValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzq(int i2, Object obj, zzgm zzgmVar) throws IOException {
        zzee zzeeVar = this.zza;
        zzeeVar.zzo(i2, 3);
        zzgmVar.zzi((zzgc) obj, zzeeVar.zza);
        zzeeVar.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzee.zzu(((Integer) list.get(i5)).intValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzk(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzee.zzy(((Long) list.get(i5)).longValue());
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzs(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzv(int i2, Object obj, zzgm zzgmVar) throws IOException {
        zzgc zzgcVar = (zzgc) obj;
        zzeb zzebVar = (zzeb) this.zza;
        zzebVar.zzq((i2 << 3) | 2);
        zzebVar.zzq(((zzdg) zzgcVar).zza(zzgmVar));
        zzgmVar.zzi(zzgcVar, zzebVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzw(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzx(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzy(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhv
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Long) list.get(i3)).longValue());
            i3++;
        }
    }
}
