package com.google.android.gms.internal.ads;

import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzadi implements zzadv {
    private final zzu zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzbv.zzb("media3.extractor");
    }

    public zzadi(zzu zzuVar, long j7, long j9) {
        this.zzb = zzuVar;
        this.zzd = j7;
        this.zzc = j9;
    }

    private final int zzp(byte[] bArr, int i9, int i10) {
        int i11 = this.zzg;
        if (i11 == 0) {
            return 0;
        }
        int min = Math.min(i11, i10);
        System.arraycopy(this.zze, 0, bArr, i9, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i9, int i10, int i11, boolean z8) throws IOException {
        if (!Thread.interrupted()) {
            int zza = this.zzb.zza(bArr, i9 + i11, i10 - i11);
            if (zza == -1) {
                if (i11 == 0 && z8) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + zza;
        }
        throw new InterruptedIOException();
    }

    private final int zzr(int i9) {
        int min = Math.min(this.zzg, i9);
        zzu(min);
        return min;
    }

    private final void zzs(int i9) {
        if (i9 != -1) {
            this.zzd += i9;
        }
    }

    private final void zzt(int i9) {
        int i10 = this.zzf + i9;
        int length = this.zze.length;
        if (i10 > length) {
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i10, Math.min(length + length, i10 + ImageMetadata.LENS_APERTURE)));
        }
    }

    private final void zzu(int i9) {
        byte[] bArr;
        int i10 = this.zzg - i9;
        this.zzg = i10;
        this.zzf = 0;
        byte[] bArr2 = this.zze;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i9, bArr, 0, i10);
        this.zze = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        int zzp = zzp(bArr, i9, i10);
        if (zzp == 0) {
            zzp = zzq(bArr, i9, i10, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzb(byte[] bArr, int i9, int i10) throws IOException {
        int min;
        zzt(i10);
        int i11 = this.zzg;
        int i12 = this.zzf;
        int i13 = i11 - i12;
        if (i13 == 0) {
            min = zzq(this.zze, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i10, i13);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i9, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzc(int i9) throws IOException {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzg(int i9) throws IOException {
        zzl(i9, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzh(byte[] bArr, int i9, int i10) throws IOException {
        zzm(bArr, i9, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzi(byte[] bArr, int i9, int i10) throws IOException {
        zzn(bArr, i9, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzk(int i9) throws IOException {
        zzo(i9, false);
    }

    public final boolean zzl(int i9, boolean z8) throws IOException {
        zzt(i9);
        int i10 = this.zzg - this.zzf;
        while (i10 < i9) {
            i10 = zzq(this.zze, this.zzf, i9, i10, z8);
            if (i10 == -1) {
                return false;
            }
            this.zzg = this.zzf + i10;
        }
        this.zzf += i9;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzm(byte[] bArr, int i9, int i10, boolean z8) throws IOException {
        if (!zzl(i10, z8)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i10, bArr, i9, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzn(byte[] bArr, int i9, int i10, boolean z8) throws IOException {
        int zzp = zzp(bArr, i9, i10);
        while (zzp < i10 && zzp != -1) {
            zzp = zzq(bArr, i9, i10, zzp, z8);
        }
        zzs(zzp);
        if (zzp != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzo(int i9, boolean z8) throws IOException {
        int zzr = zzr(i9);
        while (zzr < i9 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i9, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        if (zzr != -1) {
            return true;
        }
        return false;
    }
}
