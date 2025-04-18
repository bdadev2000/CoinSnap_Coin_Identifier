package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzand {
    private final zzaeh zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzand(zzaeh zzaehVar) {
        this.zza = zzaehVar;
    }

    public final void zza(byte[] bArr, int i2, int i3) {
        if (this.zzc) {
            int i4 = this.zzf;
            int i5 = (i2 + 1) - i4;
            if (i5 >= i3) {
                this.zzf = (i3 - i2) + i4;
            } else {
                this.zzd = ((bArr[i5] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j2, int i2, boolean z2) {
        zzdi.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z2 && this.zzb) {
            this.zza.zzs(this.zzh, this.zzd ? 1 : 0, (int) (j2 - this.zzg), i2, null);
        }
        if (this.zze != 179) {
            this.zzg = j2;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzand.zzc(int, long):void");
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
