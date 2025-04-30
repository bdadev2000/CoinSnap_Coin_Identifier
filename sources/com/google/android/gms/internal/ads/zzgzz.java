package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgzz extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    public zzgzz(int i9) {
    }

    private final void zzd(int i9) {
        this.zzc.add(new zzgzy(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i9, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i9) {
        try {
            if (this.zzf == this.zze.length) {
                zzd(1);
            }
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            this.zzf = i10 + 1;
            bArr[i10] = (byte) i9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized zzhac zzb() {
        try {
            int i9 = this.zzf;
            byte[] bArr = this.zze;
            if (i9 < bArr.length) {
                if (i9 > 0) {
                    this.zzc.add(new zzgzy(Arrays.copyOf(bArr, i9)));
                }
            } else {
                this.zzc.add(new zzgzy(this.zze));
                this.zze = zza;
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzhac.zzu(this.zzc);
    }

    public final synchronized void zzc() {
        this.zzc.clear();
        this.zzd = 0;
        this.zzf = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i11 = this.zzf;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i9, bArr2, i11, i10);
            this.zzf += i10;
            return;
        }
        System.arraycopy(bArr, i9, bArr2, i11, i12);
        int i13 = i10 - i12;
        zzd(i13);
        System.arraycopy(bArr, i9 + i12, this.zze, 0, i13);
        this.zzf = i13;
    }
}
