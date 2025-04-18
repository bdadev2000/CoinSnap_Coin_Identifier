package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhae extends zzhaj {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzhae(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b2) {
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        this.zza[i2] = b2;
        this.zzd++;
    }

    public final void zzd(int i2) {
        int i3 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i3] = (byte) (i2 & 255);
        bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
        this.zzc = i3 + 4;
        bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
        this.zzd += 4;
    }

    public final void zze(long j2) {
        int i2 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) (255 & (j2 >> 24));
        bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
        bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
        bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
        this.zzc = i2 + 8;
        bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
        this.zzd += 8;
    }

    public final void zzf(int i2) {
        boolean z2;
        z2 = zzhaj.zzb;
        if (!z2) {
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((i2 | 128) & 255);
                this.zzd++;
                i2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr2[i4] = (byte) i2;
            this.zzd++;
            return;
        }
        long j2 = this.zzc;
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzhef.zzq(bArr3, i5, (byte) ((i2 | 128) & 255));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        zzhef.zzq(bArr4, i6, (byte) i2);
        this.zzd += (int) (this.zzc - j2);
    }

    public final void zzg(long j2) {
        boolean z2;
        z2 = zzhaj.zzb;
        if (z2) {
            long j3 = this.zzc;
            while (true) {
                int i2 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    zzhef.zzq(bArr, i3, (byte) i2);
                    this.zzd += (int) (this.zzc - j3);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzhef.zzq(bArr2, i4, (byte) ((i2 | 128) & 255));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                int i5 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i6 = this.zzc;
                    this.zzc = i6 + 1;
                    bArr3[i6] = (byte) i5;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                bArr4[i7] = (byte) ((i5 | 128) & 255);
                this.zzd++;
                j2 >>>= 7;
            }
        }
    }
}
