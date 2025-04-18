package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeb extends zzee {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzeb(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzb(byte b2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i3);
            this.zze += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i3)), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzd(int i2, boolean z2) throws IOException {
        zzq(i2 << 3);
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zze(int i2, zzdw zzdwVar) throws IOException {
        zzq((i2 << 3) | 2);
        zzq(zzdwVar.zzd());
        zzdwVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzf(int i2, int i3) throws IOException {
        zzq((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzg(int i2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i3 = this.zze;
            bArr[i3] = (byte) (i2 & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
            this.zze = i3 + 4;
            bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzh(int i2, long j2) throws IOException {
        zzq((i2 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzi(long j2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            bArr[i2] = (byte) (((int) j2) & 255);
            bArr[i2 + 1] = (byte) (((int) (j2 >> 8)) & 255);
            bArr[i2 + 2] = (byte) (((int) (j2 >> 16)) & 255);
            bArr[i2 + 3] = (byte) (((int) (j2 >> 24)) & 255);
            bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
            bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
            bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
            this.zze = i2 + 8;
            bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzj(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzq(i2);
        } else {
            zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzm(int i2, String str) throws IOException {
        zzq((i2 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i2 = this.zze;
        try {
            int zzx = zzee.zzx(str.length() * 3);
            int zzx2 = zzee.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zzhs.zzc(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = zzhs.zzb(str, bArr, i3, this.zzd - i3);
                return;
            }
            int i4 = i2 + zzx2;
            this.zze = i4;
            int zzb = zzhs.zzb(str, this.zzc, i4, this.zzd - i4);
            this.zze = i2;
            zzq((zzb - i2) - zzx2);
            this.zze = zzb;
        } catch (zzhr e) {
            this.zze = i2;
            zzB(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzec(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzo(int i2, int i3) throws IOException {
        zzq((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzp(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzq(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzq(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i4 = this.zze;
        this.zze = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzr(int i2, long j2) throws IOException {
        zzq(i2 << 3);
        zzs(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzee
    public final void zzs(long j2) throws IOException {
        boolean z2;
        z2 = zzee.zzd;
        if (!z2 || this.zzd - this.zze < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzc;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzec(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr2 = this.zzc;
            int i3 = this.zze;
            this.zze = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while (true) {
            int i4 = (int) j2;
            if ((j2 & (-128)) == 0) {
                byte[] bArr3 = this.zzc;
                int i5 = this.zze;
                this.zze = i5 + 1;
                zzhn.zzn(bArr3, i5, (byte) i4);
                return;
            }
            byte[] bArr4 = this.zzc;
            int i6 = this.zze;
            this.zze = i6 + 1;
            zzhn.zzn(bArr4, i6, (byte) ((i4 & 127) | 128));
            j2 >>>= 7;
        }
    }
}
