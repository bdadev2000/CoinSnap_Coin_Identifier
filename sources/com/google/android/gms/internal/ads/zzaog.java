package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzaog {
    private final zzafa zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaog(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    public final void zza(byte[] bArr, int i9, int i10) {
        boolean z8;
        if (this.zzc) {
            int i11 = this.zzf;
            int i12 = (i9 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.zzd = z8;
                this.zzc = false;
                return;
            }
            this.zzf = (i10 - i9) + i11;
        }
    }

    public final void zzb(long j7, int i9, boolean z8) {
        boolean z9;
        if (this.zzh != C.TIME_UNSET) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzf(z9);
        if (this.zze == 182 && z8 && this.zzb) {
            long j9 = j7 - this.zzg;
            this.zza.zzs(this.zzh, this.zzd ? 1 : 0, (int) j9, i9, null);
        }
        if (this.zze != 179) {
            this.zzg = j7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(int r5, long r6) {
        /*
            r4 = this;
            r4.zze = r5
            r0 = 0
            r4.zzd = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto Lf
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L11
            r5 = r3
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r4.zzb = r3
            if (r5 != r2) goto L17
            goto L18
        L17:
            r1 = r0
        L18:
            r4.zzc = r1
            r4.zzf = r0
            r4.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaog.zzc(int, long):void");
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
