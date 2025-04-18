package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbv extends zzby {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzbv(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzb(byte b3) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzd(int i10, boolean z10) throws IOException {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zze(int i10, zzbq zzbqVar) throws IOException {
        zzq((i10 << 3) | 2);
        zzq(zzbqVar.zzd());
        zzbqVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzf(int i10, int i11) throws IOException {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzg(int i10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzd = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzh(int i10, long j3) throws IOException {
        zzq((i10 << 3) | 1);
        zzi(j3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzi(long j3) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
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
            this.zzd = i17 + 1;
            bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzj(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzm(int i10, String str) throws IOException {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int zzw = zzby.zzw(str.length() * 3);
            int zzw2 = zzby.zzw(str.length());
            if (zzw2 == zzw) {
                int i11 = i10 + zzw2;
                this.zzd = i11;
                int zzb = zzfu.zzb(str, this.zzb, i11, this.zzc - i11);
                this.zzd = i10;
                zzq((zzb - i10) - zzw2);
                this.zzd = zzb;
                return;
            }
            zzq(zzfu.zzc(str));
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            this.zzd = zzfu.zzb(str, bArr, i12, this.zzc - i12);
        } catch (zzft e2) {
            this.zzd = i10;
            zzA(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbw(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzo(int i10, int i11) throws IOException {
        zzq((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzp(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzq(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzr(int i10, long j3) throws IOException {
        zzq(i10 << 3);
        zzs(j3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzs(long j3) throws IOException {
        boolean z10;
        z10 = zzby.zzc;
        if (!z10 || this.zzc - this.zzd < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) ((((int) j3) | 128) & 255);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) j3;
            return;
        }
        while (true) {
            int i12 = (int) j3;
            if ((j3 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzfp.zzn(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            zzfp.zzn(bArr4, i14, (byte) ((i12 | 128) & 255));
            j3 >>>= 7;
        }
    }
}
