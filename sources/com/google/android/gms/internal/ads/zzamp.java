package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzamp {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzamp(int i10) {
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (!this.zze) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.zzc;
        int length = bArr2.length;
        int i13 = this.zza + i12;
        if (length < i13) {
            this.zzc = Arrays.copyOf(bArr2, i13 + i13);
        }
        System.arraycopy(bArr, i10, this.zzc, this.zza, i12);
        this.zza += i12;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int i10, int i11) {
        int i12 = this.zzf;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i10 == 179 || i10 == 181) {
                            this.zza -= i11;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        zzdt.zzf("H263Reader", "Unexpected start code value");
                        zzb();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i10 > 31) {
                    zzdt.zzf("H263Reader", "Unexpected start code value");
                    zzb();
                } else {
                    this.zzf = 3;
                }
            } else if (i10 != 181) {
                zzdt.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else {
                this.zzf = 2;
            }
        } else if (i10 == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
