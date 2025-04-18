package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzahr {
    private final zzed zza = new zzed(8);
    private int zzb;

    private final long zzb(zzacs zzacsVar) throws IOException {
        int i10;
        zzacg zzacgVar = (zzacg) zzacsVar;
        int i11 = 0;
        zzacgVar.zzm(this.zza.zzN(), 0, 1, false);
        int i12 = this.zza.zzN()[0] & UByte.MAX_VALUE;
        if (i12 != 0) {
            int i13 = 128;
            int i14 = 0;
            while (true) {
                i10 = i14 + 1;
                if ((i12 & i13) != 0) {
                    break;
                }
                i13 >>= 1;
                i14 = i10;
            }
            int i15 = i12 & (~i13);
            zzacgVar.zzm(this.zza.zzN(), 1, i14, false);
            while (i11 < i14) {
                i11++;
                i15 = (this.zza.zzN()[i11] & UByte.MAX_VALUE) + (i15 << 8);
            }
            this.zzb += i10;
            return i15;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzacs zzacsVar) throws IOException {
        long zzd = zzacsVar.zzd();
        long j3 = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j3 = zzd;
        }
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i10 = (int) j3;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzacgVar.zzm(this.zza.zzN(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzN()[0] & UByte.MAX_VALUE);
        }
        long zzb = zzb(zzacsVar);
        long j10 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j11 = j10 + zzb;
            if (zzd == -1 || j11 < zzd) {
                while (true) {
                    long j12 = this.zzb;
                    if (j12 < j11) {
                        if (zzb(zzacsVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzacsVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i12 = (int) zzb2;
                            zzacgVar.zzl(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j12 == j11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
