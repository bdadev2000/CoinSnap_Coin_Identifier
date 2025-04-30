package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhar extends zzhao {
    private final OutputStream zzg;

    public zzhar(OutputStream outputStream, int i9) {
        super(i9);
        if (outputStream != null) {
            this.zzg = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private final void zzJ() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzK(int i9) throws IOException {
        if (this.zzb - this.zzc < i9) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzL() throws IOException {
        if (this.zzc > 0) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzM(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzJ();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzN(int i9, boolean z8) throws IOException {
        zzK(11);
        zzf(i9 << 3);
        zzc(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzO(int i9, zzhac zzhacVar) throws IOException {
        zzu((i9 << 3) | 2);
        zzu(zzhacVar.zzd());
        zzhacVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhat, com.google.android.gms.internal.ads.zzgzq
    public final void zza(byte[] bArr, int i9, int i10) throws IOException {
        zzr(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzh(int i9, int i10) throws IOException {
        zzK(14);
        zzf((i9 << 3) | 5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzi(int i9) throws IOException {
        zzK(4);
        zzd(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzj(int i9, long j7) throws IOException {
        zzK(18);
        zzf((i9 << 3) | 1);
        zze(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzk(long j7) throws IOException {
        zzK(8);
        zze(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzl(int i9, int i10) throws IOException {
        zzK(20);
        zzf(i9 << 3);
        if (i10 >= 0) {
            zzf(i10);
        } else {
            zzg(i10);
        }
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, i9, this.zza, i12, i10);
            this.zzc += i10;
            this.zzd += i10;
            return;
        }
        System.arraycopy(bArr, i9, this.zza, i12, i13);
        int i14 = i9 + i13;
        this.zzc = this.zzb;
        this.zzd += i13;
        zzJ();
        int i15 = i10 - i13;
        if (i15 <= this.zzb) {
            System.arraycopy(bArr, i14, this.zza, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzs(int i9, int i10) throws IOException {
        zzu((i9 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzt(int i9, int i10) throws IOException {
        zzK(20);
        zzf(i9 << 3);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzu(int i9) throws IOException {
        zzK(5);
        zzf(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzv(int i9, long j7) throws IOException {
        zzK(20);
        zzf(i9 << 3);
        zzg(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzw(long j7) throws IOException {
        zzK(10);
        zzg(j7);
    }

    public final void zzx(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzD = zzhat.zzD(length);
            int i9 = zzD + length;
            int i10 = this.zzb;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int zzd = zzhff.zzd(str, bArr, 0, length);
                zzu(zzd);
                zzr(bArr, 0, zzd);
                return;
            }
            if (i9 > i10 - this.zzc) {
                zzJ();
            }
            int zzD2 = zzhat.zzD(str.length());
            int i11 = this.zzc;
            try {
                if (zzD2 == zzD) {
                    int i12 = i11 + zzD2;
                    this.zzc = i12;
                    int zzd2 = zzhff.zzd(str, this.zza, i12, this.zzb - i12);
                    this.zzc = i11;
                    zze = (zzd2 - i11) - zzD2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzhff.zze(str);
                    zzf(zze);
                    this.zzc = zzhff.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzhfe e4) {
                this.zzd -= this.zzc - i11;
                this.zzc = i11;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new zzhaq(e9);
            }
        } catch (zzhfe e10) {
            zzH(str, e10);
        }
    }
}
