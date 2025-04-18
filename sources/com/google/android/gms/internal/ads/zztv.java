package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zztv implements zzup, zzuo {
    public final zzup zza;
    long zzb;

    @Nullable
    private zzuo zzc;
    private zztu[] zzd = new zztu[0];
    private long zze = 0;

    public zztv(zzup zzupVar, boolean z10, long j3, long j10) {
        this.zza = zzupVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j3, zzls zzlsVar) {
        long j10;
        if (j3 == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzlsVar.zzc, j3));
        long j11 = zzlsVar.zzd;
        long j12 = this.zzb;
        if (j12 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j12 - j3;
        }
        long max2 = Math.max(0L, Math.min(j11, j10));
        if (max != zzlsVar.zzc || max2 != zzlsVar.zzd) {
            zzlsVar = new zzls(max, max2);
        }
        return this.zza.zza(j3, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j3 = this.zzb;
            if (j3 == Long.MIN_VALUE || zzb < j3) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j3 = this.zzb;
            if (j3 == Long.MIN_VALUE || zzc < j3) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        boolean z10;
        if (zzq()) {
            long j3 = this.zze;
            this.zze = C.TIME_UNSET;
            long zzd = zzd();
            if (zzd != C.TIME_UNSET) {
                return zzd;
            }
            return j3;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z11 = false;
        if (zzd2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        long j10 = this.zzb;
        if (j10 == Long.MIN_VALUE || zzd2 <= j10) {
            z11 = true;
        }
        zzdb.zzf(z11);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zztu[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzup r0 = r7.zza
            long r0 = r0.zze(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.zzb
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.zzdb.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzyd[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzwg[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zztu[] r3 = new com.google.android.gms.internal.ads.zztu[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzwg[] r2 = new com.google.android.gms.internal.ads.zzwg[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zztu[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zztu r6 = (com.google.android.gms.internal.ads.zztu) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzwg r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzup r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.zzb
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            com.google.android.gms.internal.ads.zzdb.zzf(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zztu[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zztu[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zzwg r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zztu r8 = new com.google.android.gms.internal.ads.zztu
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zztu[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzf(com.google.android.gms.internal.ads.zzyd[], boolean[], com.google.android.gms.internal.ads.zzwg[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j3, boolean z10) {
        this.zza.zzj(j3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j3) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        this.zza.zzm(j3);
    }

    public final void zzn(long j3, long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        return this.zza.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != C.TIME_UNSET;
    }
}
