package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzahs {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            if ((zza[i11] & i10) != 0) {
                return i12;
            }
            i11 = i12;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i10, boolean z10) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~zza[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzacs zzacsVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.zzc == 0) {
            if (!zzacsVar.zzn(this.zzb, 0, 1, z10)) {
                return -1L;
            }
            int zzb = zzb(this.zzb[0] & UByte.MAX_VALUE);
            this.zzd = zzb;
            if (zzb != -1) {
                this.zzc = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.zzd;
        if (i11 > i10) {
            this.zzc = 0;
            return -2L;
        }
        if (i11 != 1) {
            zzacsVar.zzi(this.zzb, 1, i11 - 1);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z11);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
