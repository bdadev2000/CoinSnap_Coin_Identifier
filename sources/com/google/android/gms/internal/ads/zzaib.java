package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
final class zzaib {
    private final zzek zza = new zzek(8);
    private int zzb;

    private final long zzb(zzadc zzadcVar) throws IOException {
        int i2;
        zzacq zzacqVar = (zzacq) zzadcVar;
        int i3 = 0;
        zzacqVar.zzm(this.zza.zzN(), 0, 1, false);
        int i4 = this.zza.zzN()[0] & UnsignedBytes.MAX_VALUE;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while (true) {
            i2 = i6 + 1;
            if ((i4 & i5) != 0) {
                break;
            }
            i5 >>= 1;
            i6 = i2;
        }
        int i7 = i4 & (~i5);
        zzacqVar.zzm(this.zza.zzN(), 1, i6, false);
        while (i3 < i6) {
            i3++;
            i7 = (this.zza.zzN()[i3] & UnsignedBytes.MAX_VALUE) + (i7 << 8);
        }
        this.zzb += i2;
        return i7;
    }

    public final boolean zza(zzadc zzadcVar) throws IOException {
        long zzd = zzadcVar.zzd();
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (zzd != -1 && zzd <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = zzd;
        }
        zzacq zzacqVar = (zzacq) zzadcVar;
        zzacqVar.zzm(this.zza.zzN(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i2 = (int) j2;
            int i3 = this.zzb + 1;
            this.zzb = i3;
            if (i3 == i2) {
                return false;
            }
            zzacqVar.zzm(this.zza.zzN(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzN()[0] & UnsignedBytes.MAX_VALUE);
        }
        long zzb = zzb(zzadcVar);
        long j3 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j4 = j3 + zzb;
            if (zzd == -1 || j4 < zzd) {
                while (true) {
                    long j5 = this.zzb;
                    if (j5 < j4) {
                        if (zzb(zzadcVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzadcVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i4 = (int) zzb2;
                            zzacqVar.zzl(i4, false);
                            this.zzb += i4;
                        }
                    } else if (j5 == j4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
