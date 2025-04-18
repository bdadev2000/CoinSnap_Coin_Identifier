package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzacq implements zzadc {
    private final zzp zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzbd.zzb("media3.extractor");
    }

    public zzacq(zzp zzpVar, long j2, long j3) {
        this.zzb = zzpVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final int zzp(byte[] bArr, int i2, int i3) {
        int i4 = this.zzg;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.zze, 0, bArr, i2, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i2, int i3, int i4, boolean z2) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int zza = this.zzb.zza(bArr, i2 + i4, i3 - i4);
        if (zza != -1) {
            return i4 + zza;
        }
        if (i4 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i2) {
        int min = Math.min(this.zzg, i2);
        zzu(min);
        return min;
    }

    private final void zzs(int i2) {
        if (i2 != -1) {
            this.zzd += i2;
        }
    }

    private final void zzt(int i2) {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i3, Math.min(length + length, i3 + Opcodes.ASM8)));
        }
    }

    private final void zzu(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int zzp = zzp(bArr, i2, i3);
        if (zzp == 0) {
            zzp = zzq(bArr, i2, i3, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final int zzb(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        zzt(i3);
        int i4 = this.zzg;
        int i5 = this.zzf;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = zzq(this.zze, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i2, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final int zzc(int i2) throws IOException {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzg(int i2) throws IOException {
        zzl(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzh(byte[] bArr, int i2, int i3) throws IOException {
        zzm(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzi(byte[] bArr, int i2, int i3) throws IOException {
        zzn(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzk(int i2) throws IOException {
        zzo(i2, false);
    }

    public final boolean zzl(int i2, boolean z2) throws IOException {
        zzt(i2);
        int i3 = this.zzg - this.zzf;
        while (i3 < i2) {
            i3 = zzq(this.zze, this.zzf, i2, i3, z2);
            if (i3 == -1) {
                return false;
            }
            this.zzg = this.zzf + i3;
        }
        this.zzf += i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final boolean zzm(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        if (!zzl(i3, z2)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final boolean zzn(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        int zzp = zzp(bArr, i2, i3);
        while (zzp < i3 && zzp != -1) {
            zzp = zzq(bArr, i2, i3, zzp, z2);
        }
        zzs(zzp);
        return zzp != -1;
    }

    public final boolean zzo(int i2, boolean z2) throws IOException {
        int zzr = zzr(i2);
        while (zzr < i2 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i2, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        return zzr != -1;
    }
}
