package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhao extends zzhat {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzhao(int i9) {
        super(null);
        if (i9 >= 0) {
            byte[] bArr = new byte[Math.max(i9, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b) {
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        this.zza[i9] = b;
        this.zzd++;
    }

    public final void zzd(int i9) {
        int i10 = this.zzc;
        int i11 = i10 + 1;
        this.zzc = i11;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) (i9 & 255);
        int i12 = i10 + 2;
        this.zzc = i12;
        bArr[i11] = (byte) ((i9 >> 8) & 255);
        int i13 = i10 + 3;
        this.zzc = i13;
        bArr[i12] = (byte) ((i9 >> 16) & 255);
        this.zzc = i10 + 4;
        bArr[i13] = (byte) ((i9 >> 24) & 255);
        this.zzd += 4;
    }

    public final void zze(long j7) {
        int i9 = this.zzc;
        int i10 = i9 + 1;
        this.zzc = i10;
        byte[] bArr = this.zza;
        bArr[i9] = (byte) (j7 & 255);
        int i11 = i9 + 2;
        this.zzc = i11;
        bArr[i10] = (byte) ((j7 >> 8) & 255);
        int i12 = i9 + 3;
        this.zzc = i12;
        bArr[i11] = (byte) ((j7 >> 16) & 255);
        int i13 = i9 + 4;
        this.zzc = i13;
        bArr[i12] = (byte) (255 & (j7 >> 24));
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
        this.zzd += 8;
    }

    public final void zzf(int i9) {
        boolean z8;
        z8 = zzhat.zzb;
        if (z8) {
            long j7 = this.zzc;
            while ((i9 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzhfa.zzq(bArr, i10, (byte) ((i9 | 128) & 255));
                i9 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzhfa.zzq(bArr2, i11, (byte) i9);
            this.zzd += (int) (this.zzc - j7);
            return;
        }
        while ((i9 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr3[i12] = (byte) ((i9 | 128) & 255);
            this.zzd++;
            i9 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        bArr4[i13] = (byte) i9;
        this.zzd++;
    }

    public final void zzg(long j7) {
        boolean z8;
        z8 = zzhat.zzb;
        if (z8) {
            long j9 = this.zzc;
            while (true) {
                int i9 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzhfa.zzq(bArr, i10, (byte) i9);
                    this.zzd += (int) (this.zzc - j9);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzhfa.zzq(bArr2, i11, (byte) ((i9 | 128) & 255));
                j7 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i13 = this.zzc;
                    this.zzc = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i14 = this.zzc;
                this.zzc = i14 + 1;
                bArr4[i14] = (byte) ((i12 | 128) & 255);
                this.zzd++;
                j7 >>>= 7;
            }
        }
    }
}
