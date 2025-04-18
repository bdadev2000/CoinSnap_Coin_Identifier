package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxy extends zzgyc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgxy(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzK() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzL(byte b3) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzM(int i10, boolean z10) throws IOException {
        zzu(i10 << 3);
        zzL(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzN(int i10, zzgxp zzgxpVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(zzgxpVar.zzd());
        zzgxpVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc, com.google.android.gms.internal.ads.zzgxg
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzh(int i10, int i11) throws IOException {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzi(int i10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzj(int i10, long j3) throws IOException {
        zzu((i10 << 3) | 1);
        zzk(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzk(long j3) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j3) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j3 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j3 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j3 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzl(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzn(int i10, zzhai zzhaiVar, zzhbb zzhbbVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(((zzgwy) zzhaiVar).zzaM(zzhbbVar));
        zzhbbVar.zzj(zzhaiVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzo(int i10, zzhai zzhaiVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzhaiVar.zzaY());
        zzhaiVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzp(int i10, zzgxp zzgxpVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzN(3, zzgxpVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int zzD = zzgyc.zzD(str.length() * 3);
            int zzD2 = zzgyc.zzD(str.length());
            if (zzD2 == zzD) {
                int i11 = i10 + zzD2;
                this.zzc = i11;
                int zzd = zzhbz.zzd(str, this.zza, i11, this.zzb - i11);
                this.zzc = i10;
                zzu((zzd - i10) - zzD2);
                this.zzc = zzd;
                return;
            }
            zzu(zzhbz.zze(str));
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = zzhbz.zzd(str, bArr, i12, this.zzb - i12);
        } catch (zzhby e2) {
            this.zzc = i10;
            zzG(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxz(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzt(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzu(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzu(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
            }
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzv(int i10, long j3) throws IOException {
        zzu(i10 << 3);
        zzw(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyc
    public final void zzw(long j3) throws IOException {
        boolean z10;
        z10 = zzgyc.zzb;
        if (!z10 || this.zzb - this.zzc < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) ((((int) j3) | 128) & 255);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzgxz(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
                }
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) j3;
            return;
        }
        while (true) {
            int i12 = (int) j3;
            if ((j3 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzhbu.zzq(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzhbu.zzq(bArr4, i14, (byte) ((i12 | 128) & 255));
            j3 >>>= 7;
        }
    }
}
