package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaof {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzaof(int i9) {
    }

    public final void zza(byte[] bArr, int i9, int i10) {
        if (!this.zze) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.zzc;
        int length = bArr2.length;
        int i12 = this.zza + i11;
        if (length < i12) {
            this.zzc = Arrays.copyOf(bArr2, i12 + i12);
        }
        System.arraycopy(bArr, i9, this.zzc, this.zza, i11);
        this.zza += i11;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int i9, int i10) {
        int i11 = this.zzf;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i9 == 179 || i9 == 181) {
                            this.zza -= i10;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i9 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        zzfk.zzf("H263Reader", "Unexpected start code value");
                        zzb();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i9 > 31) {
                    zzfk.zzf("H263Reader", "Unexpected start code value");
                    zzb();
                } else {
                    this.zzf = 3;
                }
            } else if (i9 != 181) {
                zzfk.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else {
                this.zzf = 2;
            }
        } else if (i9 == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
