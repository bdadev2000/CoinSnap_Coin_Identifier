package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbz implements zzfx {
    private final zzby zza;

    private zzbz(zzby zzbyVar) {
        byte[] bArr = zzda.zzd;
        this.zza = zzbyVar;
        zzbyVar.zza = this;
    }

    public static zzbz zza(zzby zzbyVar) {
        zzbz zzbzVar = zzbyVar.zza;
        if (zzbzVar != null) {
            return zzbzVar;
        }
        return new zzbz(zzbyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzA(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
                    zzdrVar.zze(i12);
                    i11 += 8;
                }
                this.zza.zzq(i11);
                while (i10 < zzdrVar.size()) {
                    this.zza.zzi(zzdrVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzdrVar.size()) {
                this.zza.zzh(i9, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzB(int i9, int i10) throws IOException {
        this.zza.zzp(i9, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzC(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    int zze = zzctVar.zze(i12);
                    i11 += zzby.zzw((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    zzby zzbyVar = this.zza;
                    int zze2 = zzctVar.zze(i10);
                    zzbyVar.zzq((zze2 >> 31) ^ (zze2 + zze2));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                zzby zzbyVar2 = this.zza;
                int zze3 = zzctVar.zze(i10);
                zzbyVar2.zzp(i9, (zze3 >> 31) ^ (zze3 + zze3));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += zzby.zzw((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                zzby zzbyVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i10)).intValue();
                zzbyVar3.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzby zzbyVar4 = this.zza;
            int intValue3 = ((Integer) list.get(i10)).intValue();
            zzbyVar4.zzp(i9, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzD(int i9, long j7) throws IOException {
        this.zza.zzr(i9, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzE(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
                    long zze = zzdrVar.zze(i12);
                    i11 += zzby.zzx((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzq(i11);
                while (i10 < zzdrVar.size()) {
                    zzby zzbyVar = this.zza;
                    long zze2 = zzdrVar.zze(i10);
                    zzbyVar.zzs((zze2 >> 63) ^ (zze2 + zze2));
                    i10++;
                }
                return;
            }
            while (i10 < zzdrVar.size()) {
                zzby zzbyVar2 = this.zza;
                long zze3 = zzdrVar.zze(i10);
                zzbyVar2.zzr(i9, (zze3 >> 63) ^ (zze3 + zze3));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += zzby.zzx((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                zzby zzbyVar3 = this.zza;
                long longValue2 = ((Long) list.get(i10)).longValue();
                zzbyVar3.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzby zzbyVar4 = this.zza;
            long longValue3 = ((Long) list.get(i10)).longValue();
            zzbyVar4.zzr(i9, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzF(int i9) throws IOException {
        this.zza.zzo(i9, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzG(int i9, String str) throws IOException {
        this.zza.zzm(i9, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzH(int i9, List list) throws IOException {
        int i10 = 0;
        if (list instanceof zzdk) {
            zzdk zzdkVar = (zzdk) list;
            while (i10 < list.size()) {
                Object zzf = zzdkVar.zzf(i10);
                if (zzf instanceof String) {
                    this.zza.zzm(i9, (String) zzf);
                } else {
                    this.zza.zze(i9, (zzbq) zzf);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzm(i9, (String) list.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzI(int i9, int i10) throws IOException {
        this.zza.zzp(i9, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzJ(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    i11 += zzby.zzw(zzctVar.zze(i12));
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    this.zza.zzq(zzctVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                this.zza.zzp(i9, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzby.zzw(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzp(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzK(int i9, long j7) throws IOException {
        this.zza.zzr(i9, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzL(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
                    i11 += zzby.zzx(zzdrVar.zze(i12));
                }
                this.zza.zzq(i11);
                while (i10 < zzdrVar.size()) {
                    this.zza.zzs(zzdrVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzdrVar.size()) {
                this.zza.zzr(i9, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzby.zzx(((Long) list.get(i14)).longValue());
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(int i9, boolean z8) throws IOException {
        this.zza.zzd(i9, z8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzc(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzbe) {
            zzbe zzbeVar = (zzbe) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzbeVar.size(); i12++) {
                    zzbeVar.zzf(i12);
                    i11++;
                }
                this.zza.zzq(i11);
                while (i10 < zzbeVar.size()) {
                    this.zza.zzb(zzbeVar.zzf(i10) ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < zzbeVar.size()) {
                this.zza.zzd(i9, zzbeVar.zzf(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzd(i9, ((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i9, zzbq zzbqVar) throws IOException {
        this.zza.zze(i9, zzbqVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(int i9, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i9, (zzbq) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i9, double d2) throws IOException {
        this.zza.zzh(i9, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzca) {
            zzca zzcaVar = (zzca) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzcaVar.size(); i12++) {
                    zzcaVar.zze(i12);
                    i11 += 8;
                }
                this.zza.zzq(i11);
                while (i10 < zzcaVar.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzcaVar.zze(i10)));
                    i10++;
                }
                return;
            }
            while (i10 < zzcaVar.size()) {
                this.zza.zzh(i9, Double.doubleToRawLongBits(zzcaVar.zze(i10)));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzh(int i9) throws IOException {
        this.zza.zzo(i9, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i9, int i10) throws IOException {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    i11 += zzby.zzx(zzctVar.zze(i12));
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    this.zza.zzk(zzctVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                this.zza.zzj(i9, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzby.zzx(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(int i9, int i10) throws IOException {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    zzctVar.zze(i12);
                    i11 += 4;
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    this.zza.zzg(zzctVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                this.zza.zzf(i9, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i9, long j7) throws IOException {
        this.zza.zzh(i9, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
                    zzdrVar.zze(i12);
                    i11 += 8;
                }
                this.zza.zzq(i11);
                while (i10 < zzdrVar.size()) {
                    this.zza.zzi(zzdrVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzdrVar.size()) {
                this.zza.zzh(i9, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i9, float f9) throws IOException {
        this.zza.zzf(i9, Float.floatToRawIntBits(f9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzck) {
            zzck zzckVar = (zzck) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzckVar.size(); i12++) {
                    zzckVar.zze(i12);
                    i11 += 4;
                }
                this.zza.zzq(i11);
                while (i10 < zzckVar.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzckVar.zze(i10)));
                    i10++;
                }
                return;
            }
            while (i10 < zzckVar.size()) {
                this.zza.zzf(i9, Float.floatToRawIntBits(zzckVar.zze(i10)));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i9, Object obj, zzeo zzeoVar) throws IOException {
        zzby zzbyVar = this.zza;
        zzbyVar.zzo(i9, 3);
        zzeoVar.zzi((zzec) obj, zzbyVar.zza);
        zzbyVar.zzo(i9, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(int i9, int i10) throws IOException {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    i11 += zzby.zzx(zzctVar.zze(i12));
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    this.zza.zzk(zzctVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                this.zza.zzj(i9, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzby.zzx(((Integer) list.get(i14)).intValue());
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i9, long j7) throws IOException {
        this.zza.zzr(i9, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
                    i11 += zzby.zzx(zzdrVar.zze(i12));
                }
                this.zza.zzq(i11);
                while (i10 < zzdrVar.size()) {
                    this.zza.zzs(zzdrVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzdrVar.size()) {
                this.zza.zzr(i9, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzby.zzx(((Long) list.get(i14)).longValue());
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i9, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i9, Object obj, zzeo zzeoVar) throws IOException {
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar = (zzbv) this.zza;
        zzbvVar.zzq((i9 << 3) | 2);
        zzbvVar.zzq(((zzay) zzecVar).zza(zzeoVar));
        zzeoVar.zzi(zzecVar, zzbvVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(int i9, Object obj) throws IOException {
        if (obj instanceof zzbq) {
            zzbv zzbvVar = (zzbv) this.zza;
            zzbvVar.zzq(11);
            zzbvVar.zzp(2, i9);
            zzbvVar.zze(3, (zzbq) obj);
            zzbvVar.zzq(12);
            return;
        }
        zzby zzbyVar = this.zza;
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar2 = (zzbv) zzbyVar;
        zzbvVar2.zzq(11);
        zzbvVar2.zzp(2, i9);
        zzbvVar2.zzq(26);
        zzbvVar2.zzq(zzecVar.zzf());
        zzecVar.zze(zzbyVar);
        zzbvVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzx(int i9, int i10) throws IOException {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzy(int i9, List list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            if (z8) {
                this.zza.zzo(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzctVar.size(); i12++) {
                    zzctVar.zze(i12);
                    i11 += 4;
                }
                this.zza.zzq(i11);
                while (i10 < zzctVar.size()) {
                    this.zza.zzg(zzctVar.zze(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzctVar.size()) {
                this.zza.zzf(i9, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzo(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzq(i13);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzz(int i9, long j7) throws IOException {
        this.zza.zzh(i9, j7);
    }
}
