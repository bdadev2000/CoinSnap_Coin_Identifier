package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzus implements zzvm, zzvl {
    public final zzvm zza;
    long zzb;

    @Nullable
    private zzvl zzc;
    private zzur[] zzd = new zzur[0];
    private long zze = 0;

    public zzus(zzvm zzvmVar, boolean z8, long j7, long j9) {
        this.zza = zzvmVar;
        this.zzb = j9;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j7, zzmr zzmrVar) {
        long j9;
        if (j7 == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzmrVar.zzf, j7));
        long j10 = zzmrVar.zzg;
        long j11 = this.zzb;
        if (j11 == Long.MIN_VALUE) {
            j9 = Long.MAX_VALUE;
        } else {
            j9 = j11 - j7;
        }
        long max2 = Math.max(0L, Math.min(j10, j9));
        if (max != zzmrVar.zzf || max2 != zzmrVar.zzg) {
            zzmrVar = new zzmr(max, max2);
        }
        return this.zza.zza(j7, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j7 = this.zzb;
            if (j7 == Long.MIN_VALUE || zzb < j7) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j7 = this.zzb;
            if (j7 == Long.MIN_VALUE || zzc < j7) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        boolean z8;
        if (zzq()) {
            long j7 = this.zze;
            this.zze = C.TIME_UNSET;
            long zzd = zzd();
            if (zzd != C.TIME_UNSET) {
                return zzd;
            }
            return j7;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z9 = false;
        if (zzd2 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        long j9 = this.zzb;
        if (j9 == Long.MIN_VALUE || zzd2 <= j9) {
            z9 = true;
        }
        zzeq.zzf(z9);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzur[] r0 = r7.zzd
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
            com.google.android.gms.internal.ads.zzvm r0 = r7.zza
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
            com.google.android.gms.internal.ads.zzeq.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzus.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzzg[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzxf[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzur[] r3 = new com.google.android.gms.internal.ads.zzur[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzxf[] r2 = new com.google.android.gms.internal.ads.zzxf[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzur[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzur r6 = (com.google.android.gms.internal.ads.zzur) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzxf r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzvm r4 = r0.zza
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
            com.google.android.gms.internal.ads.zzeq.zzf(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zzur[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zzur[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zzxf r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zzur r8 = new com.google.android.gms.internal.ads.zzur
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zzur[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzus.zzf(com.google.android.gms.internal.ads.zzzg[], boolean[], com.google.android.gms.internal.ads.zzxf[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j7, boolean z8) {
        this.zza.zzj(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j7) {
        this.zzc = zzvlVar;
        this.zza.zzl(this, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        this.zza.zzm(j7);
    }

    public final void zzn(long j7, long j9) {
        this.zzb = j9;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        return this.zza.zzo(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != C.TIME_UNSET;
    }
}
