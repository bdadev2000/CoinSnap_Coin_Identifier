package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaiz {
    private final zzfu zza = new zzfu(8);
    private int zzb;

    private final long zzb(zzadv zzadvVar) throws IOException {
        int i9;
        zzadi zzadiVar = (zzadi) zzadvVar;
        int i10 = 0;
        zzadiVar.zzm(this.zza.zzM(), 0, 1, false);
        int i11 = this.zza.zzM()[0] & 255;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while (true) {
                i9 = i13 + 1;
                if ((i11 & i12) != 0) {
                    break;
                }
                i12 >>= 1;
                i13 = i9;
            }
            int i14 = i11 & (~i12);
            zzadiVar.zzm(this.zza.zzM(), 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.zza.zzM()[i10] & 255) + (i14 << 8);
            }
            this.zzb += i9;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzadv zzadvVar) throws IOException {
        long zzd = zzadvVar.zzd();
        long j7 = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j7 = zzd;
        }
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(this.zza.zzM(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i9 = (int) j7;
            int i10 = this.zzb + 1;
            this.zzb = i10;
            if (i10 == i9) {
                return false;
            }
            zzadiVar.zzm(this.zza.zzM(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzM()[0] & 255);
        }
        long zzb = zzb(zzadvVar);
        long j9 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j10 = j9 + zzb;
            if (zzd == -1 || j10 < zzd) {
                while (true) {
                    long j11 = this.zzb;
                    if (j11 < j10) {
                        if (zzb(zzadvVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzadvVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i11 = (int) zzb2;
                            zzadiVar.zzl(i11, false);
                            this.zzb += i11;
                        }
                    } else if (j11 == j10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
