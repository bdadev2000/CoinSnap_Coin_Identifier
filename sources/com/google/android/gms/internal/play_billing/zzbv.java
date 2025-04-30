package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbv extends zzby {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzbv(byte[] bArr, int i9, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            this.zzd = i9 + 1;
            bArr[i9] = b;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzd(int i9, boolean z8) throws IOException {
        zzq(i9 << 3);
        zzb(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zze(int i9, zzbq zzbqVar) throws IOException {
        zzq((i9 << 3) | 2);
        zzq(zzbqVar.zzd());
        zzbqVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzf(int i9, int i10) throws IOException {
        zzq((i9 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzg(int i9) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.zzd = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.zzd = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.zzd = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzh(int i9, long j7) throws IOException {
        zzq((i9 << 3) | 1);
        zzi(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzi(long j7) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            int i10 = i9 + 1;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) j7) & 255);
            int i11 = i9 + 2;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j7 >> 8)) & 255);
            int i12 = i9 + 3;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j7 >> 16)) & 255);
            int i13 = i9 + 4;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j7 >> 24)) & 255);
            int i14 = i9 + 5;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j7 >> 32)) & 255);
            int i15 = i9 + 6;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j7 >> 40)) & 255);
            int i16 = i9 + 7;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j7 >> 48)) & 255);
            this.zzd = i9 + 8;
            bArr[i16] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzj(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzk(int i9) throws IOException {
        if (i9 >= 0) {
            zzq(i9);
        } else {
            zzs(i9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzl(byte[] bArr, int i9, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzm(int i9, String str) throws IOException {
        zzq((i9 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i9 = this.zzd;
        try {
            int zzw = zzby.zzw(str.length() * 3);
            int zzw2 = zzby.zzw(str.length());
            if (zzw2 == zzw) {
                int i10 = i9 + zzw2;
                this.zzd = i10;
                int zzb = zzfu.zzb(str, this.zzb, i10, this.zzc - i10);
                this.zzd = i9;
                zzq((zzb - i9) - zzw2);
                this.zzd = zzb;
                return;
            }
            zzq(zzfu.zzc(str));
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = zzfu.zzb(str, bArr, i11, this.zzc - i11);
        } catch (zzft e4) {
            this.zzd = i9;
            zzA(str, e4);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzo(int i9, int i10) throws IOException {
        zzq((i9 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzp(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzq(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i9 | 128) & 255);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i9;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzr(int i9, long j7) throws IOException {
        zzq(i9 << 3);
        zzs(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzs(long j7) throws IOException {
        boolean z8;
        z8 = zzby.zzc;
        if (!z8 || this.zzc - this.zzd < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i9 = this.zzd;
                    this.zzd = i9 + 1;
                    bArr[i9] = (byte) ((((int) j7) | 128) & 255);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr2[i10] = (byte) j7;
            return;
        }
        while (true) {
            int i11 = (int) j7;
            if ((j7 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                zzfp.zzn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            zzfp.zzn(bArr4, i13, (byte) ((i11 | 128) & 255));
            j7 >>>= 7;
        }
    }
}
