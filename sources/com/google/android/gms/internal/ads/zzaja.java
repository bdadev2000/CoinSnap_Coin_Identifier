package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaja {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i9) {
        int i10 = 0;
        while (i10 < 8) {
            int i11 = i10 + 1;
            if ((zza[i10] & i9) == 0) {
                i10 = i11;
            } else {
                return i11;
            }
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i9, boolean z8) {
        long j7 = bArr[0] & 255;
        if (z8) {
            j7 &= ~zza[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j7 = (j7 << 8) | (bArr[i10] & 255);
        }
        return j7;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzadv zzadvVar, boolean z8, boolean z9, int i9) throws IOException {
        if (this.zzc == 0) {
            if (!zzadvVar.zzn(this.zzb, 0, 1, z8)) {
                return -1L;
            }
            int zzb = zzb(this.zzb[0] & 255);
            this.zzd = zzb;
            if (zzb != -1) {
                this.zzc = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i10 = this.zzd;
        if (i10 > i9) {
            this.zzc = 0;
            return -2L;
        }
        if (i10 != 1) {
            ((zzadi) zzadvVar).zzn(this.zzb, 1, i10 - 1, false);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z9);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
