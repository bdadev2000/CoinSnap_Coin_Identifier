package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhaf extends zzhaj {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhaf(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzK() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzL(byte b2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzM(int i2, boolean z2) throws IOException {
        zzu(i2 << 3);
        zzL(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzN(int i2, zzgzs zzgzsVar) throws IOException {
        zzu((i2 << 3) | 2);
        zzu(zzgzsVar.zzd());
        zzgzsVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj, com.google.android.gms.internal.ads.zzgzj
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zze(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i3)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzh(int i2, int i3) throws IOException {
        zzu((i2 << 3) | 5);
        zzi(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzi(int i2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            bArr[i3] = (byte) (i2 & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
            this.zzc = i3 + 4;
            bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzj(int i2, long j2) throws IOException {
        zzu((i2 << 3) | 1);
        zzk(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzk(long j2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            bArr[i2] = (byte) (((int) j2) & 255);
            bArr[i2 + 1] = (byte) (((int) (j2 >> 8)) & 255);
            bArr[i2 + 2] = (byte) (((int) (j2 >> 16)) & 255);
            bArr[i2 + 3] = (byte) (((int) (j2 >> 24)) & 255);
            bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
            bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
            bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzc = i2 + 8;
            bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzl(int i2, int i3) throws IOException {
        zzu(i2 << 3);
        zzm(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzm(int i2) throws IOException {
        if (i2 >= 0) {
            zzu(i2);
        } else {
            zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzn(int i2, zzhcp zzhcpVar, zzhdk zzhdkVar) throws IOException {
        zzu((i2 << 3) | 2);
        zzu(((zzgzb) zzhcpVar).zzaM(zzhdkVar));
        zzhdkVar.zzj(zzhcpVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzo(int i2, zzhcp zzhcpVar) throws IOException {
        zzu(11);
        zzt(2, i2);
        zzu(26);
        zzu(zzhcpVar.zzaY());
        zzhcpVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzp(int i2, zzgzs zzgzsVar) throws IOException {
        zzu(11);
        zzt(2, i2);
        zzN(3, zzgzsVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzq(int i2, String str) throws IOException {
        zzu((i2 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i2 = this.zzc;
        try {
            int zzD = zzhaj.zzD(str.length() * 3);
            int zzD2 = zzhaj.zzD(str.length());
            if (zzD2 != zzD) {
                zzu(zzhek.zze(str));
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = zzhek.zzd(str, bArr, i3, this.zzb - i3);
                return;
            }
            int i4 = i2 + zzD2;
            this.zzc = i4;
            int zzd = zzhek.zzd(str, this.zza, i4, this.zzb - i4);
            this.zzc = i2;
            zzu((zzd - i2) - zzD2);
            this.zzc = zzd;
        } catch (zzhej e) {
            this.zzc = i2;
            zzG(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhag(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzs(int i2, int i3) throws IOException {
        zzu((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzt(int i2, int i3) throws IOException {
        zzu(i2 << 3);
        zzu(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzu(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr2 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzv(int i2, long j2) throws IOException {
        zzu(i2 << 3);
        zzw(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzw(long j2) throws IOException {
        boolean z2;
        z2 = zzhaj.zzb;
        if (!z2 || this.zzb - this.zzc < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzhag(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
                }
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while (true) {
            int i4 = (int) j2;
            if ((j2 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zzhef.zzq(bArr3, i5, (byte) i4);
                return;
            }
            byte[] bArr4 = this.zza;
            int i6 = this.zzc;
            this.zzc = i6 + 1;
            zzhef.zzq(bArr4, i6, (byte) ((i4 | 128) & 255));
            j2 >>>= 7;
        }
    }
}
