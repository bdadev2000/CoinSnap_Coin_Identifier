package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhah extends zzhae {
    private final OutputStream zzg;

    public zzhah(OutputStream outputStream, int i2) {
        super(i2);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i2) throws IOException {
        if (this.zzb - this.zzc < i2) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzK() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzL(byte b2) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzM(int i2, boolean z2) throws IOException {
        zzJ(11);
        zzf(i2 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzN(int i2, zzgzs zzgzsVar) throws IOException {
        zzu((i2 << 3) | 2);
        zzu(zzgzsVar.zzd());
        zzgzsVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj, com.google.android.gms.internal.ads.zzgzj
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzr(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzh(int i2, int i3) throws IOException {
        zzJ(14);
        zzf((i2 << 3) | 5);
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzi(int i2) throws IOException {
        zzJ(4);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzj(int i2, long j2) throws IOException {
        zzJ(18);
        zzf((i2 << 3) | 1);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzk(long j2) throws IOException {
        zzJ(8);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzl(int i2, int i3) throws IOException {
        zzJ(20);
        zzf(i2 << 3);
        if (i3 >= 0) {
            zzf(i3);
        } else {
            zzg(i3);
        }
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zzb;
        int i5 = this.zzc;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, this.zza, i5, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        System.arraycopy(bArr, i2, this.zza, i5, i6);
        int i7 = i2 + i6;
        this.zzc = this.zzb;
        this.zzd += i6;
        zzI();
        int i8 = i3 - i6;
        if (i8 <= this.zzb) {
            System.arraycopy(bArr, i7, this.zza, 0, i8);
            this.zzc = i8;
        } else {
            this.zzg.write(bArr, i7, i8);
        }
        this.zzd += i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzs(int i2, int i3) throws IOException {
        zzu((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzt(int i2, int i3) throws IOException {
        zzJ(20);
        zzf(i2 << 3);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzu(int i2) throws IOException {
        zzJ(5);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzv(int i2, long j2) throws IOException {
        zzJ(20);
        zzf(i2 << 3);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzw(long j2) throws IOException {
        zzJ(10);
        zzg(j2);
    }

    public final void zzx(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzD = zzhaj.zzD(length);
            int i2 = zzD + length;
            int i3 = this.zzb;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int zzd = zzhek.zzd(str, bArr, 0, length);
                zzu(zzd);
                zzr(bArr, 0, zzd);
                return;
            }
            if (i2 > i3 - this.zzc) {
                zzI();
            }
            int zzD2 = zzhaj.zzD(str.length());
            int i4 = this.zzc;
            try {
                if (zzD2 == zzD) {
                    int i5 = i4 + zzD2;
                    this.zzc = i5;
                    int zzd2 = zzhek.zzd(str, this.zza, i5, this.zzb - i5);
                    this.zzc = i4;
                    zze = (zzd2 - i4) - zzD2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzhek.zze(str);
                    zzf(zze);
                    this.zzc = zzhek.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzhej e) {
                this.zzd -= this.zzc - i4;
                this.zzc = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzhag(e2);
            }
        } catch (zzhej e3) {
            zzG(str, e3);
        }
    }
}
