package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhap extends zzhat {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhap(byte[] bArr, int i9, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzL() {
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzM(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i9 = this.zzc;
            this.zzc = i9 + 1;
            bArr[i9] = b;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzN(int i9, boolean z8) throws IOException {
        zzu(i9 << 3);
        zzM(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzO(int i9, zzhac zzhacVar) throws IOException {
        zzu((i9 << 3) | 2);
        zzu(zzhacVar.zzd());
        zzhacVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhat, com.google.android.gms.internal.ads.zzgzq
    public final void zza(byte[] bArr, int i9, int i10) throws IOException {
        zze(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i9, this.zza, this.zzc, i10);
            this.zzc += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i10)), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzh(int i9, int i10) throws IOException {
        zzu((i9 << 3) | 5);
        zzi(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzi(int i9) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.zzc = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.zzc = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.zzc = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzj(int i9, long j7) throws IOException {
        zzu((i9 << 3) | 1);
        zzk(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzk(long j7) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i9 = this.zzc;
            int i10 = i9 + 1;
            this.zzc = i10;
            bArr[i9] = (byte) (((int) j7) & 255);
            int i11 = i9 + 2;
            this.zzc = i11;
            bArr[i10] = (byte) (((int) (j7 >> 8)) & 255);
            int i12 = i9 + 3;
            this.zzc = i12;
            bArr[i11] = (byte) (((int) (j7 >> 16)) & 255);
            int i13 = i9 + 4;
            this.zzc = i13;
            bArr[i12] = (byte) (((int) (j7 >> 24)) & 255);
            int i14 = i9 + 5;
            this.zzc = i14;
            bArr[i13] = (byte) (((int) (j7 >> 32)) & 255);
            int i15 = i9 + 6;
            this.zzc = i15;
            bArr[i14] = (byte) (((int) (j7 >> 40)) & 255);
            int i16 = i9 + 7;
            this.zzc = i16;
            bArr[i15] = (byte) (((int) (j7 >> 48)) & 255);
            this.zzc = i9 + 8;
            bArr[i16] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzl(int i9, int i10) throws IOException {
        zzu(i9 << 3);
        zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzm(int i9) throws IOException {
        if (i9 >= 0) {
            zzu(i9);
        } else {
            zzw(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzn(int i9, zzhde zzhdeVar, zzhdz zzhdzVar) throws IOException {
        zzu((i9 << 3) | 2);
        zzu(((zzgzi) zzhdeVar).zzaM(zzhdzVar));
        zzhdzVar.zzj(zzhdeVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzo(int i9, zzhde zzhdeVar) throws IOException {
        zzu(11);
        zzt(2, i9);
        zzu(26);
        zzu(zzhdeVar.zzaY());
        zzhdeVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzp(int i9, zzhac zzhacVar) throws IOException {
        zzu(11);
        zzt(2, i9);
        zzO(3, zzhacVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzq(int i9, String str) throws IOException {
        zzu((i9 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i9 = this.zzc;
        try {
            int zzD = zzhat.zzD(str.length() * 3);
            int zzD2 = zzhat.zzD(str.length());
            if (zzD2 == zzD) {
                int i10 = i9 + zzD2;
                this.zzc = i10;
                int zzd = zzhff.zzd(str, this.zza, i10, this.zzb - i10);
                this.zzc = i9;
                zzu((zzd - i9) - zzD2);
                this.zzc = zzd;
                return;
            }
            zzu(zzhff.zze(str));
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            this.zzc = zzhff.zzd(str, bArr, i11, this.zzb - i11);
        } catch (zzhfe e4) {
            this.zzc = i9;
            zzH(str, e4);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzhaq(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzs(int i9, int i10) throws IOException {
        zzu((i9 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzt(int i9, int i10) throws IOException {
        zzu(i9 << 3);
        zzu(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzu(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) ((i9 | 128) & 255);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
            }
        }
        byte[] bArr2 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        bArr2[i11] = (byte) i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzv(int i9, long j7) throws IOException {
        zzu(i9 << 3);
        zzw(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzw(long j7) throws IOException {
        boolean z8;
        z8 = zzhat.zzb;
        if (!z8 || this.zzb - this.zzc < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i9 = this.zzc;
                    this.zzc = i9 + 1;
                    bArr[i9] = (byte) ((((int) j7) | 128) & 255);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzhaq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
                }
            }
            byte[] bArr2 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr2[i10] = (byte) j7;
            return;
        }
        while (true) {
            int i11 = (int) j7;
            if ((j7 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzhfa.zzq(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzhfa.zzq(bArr4, i13, (byte) ((i11 | 128) & 255));
            j7 >>>= 7;
        }
    }
}
