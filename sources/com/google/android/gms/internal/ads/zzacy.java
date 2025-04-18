package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzacy {
    public static int zza(zzed zzedVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzedVar.zzm() + 1;
            case 7:
                return zzedVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzacs zzacsVar, zzadc zzadcVar) throws IOException {
        boolean z10;
        int i10;
        zzacsVar.zzj();
        zzacsVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacsVar.zzh(bArr, 0, 1);
        int i11 = bArr[0] & 1;
        if (1 != i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzacsVar.zzg(2);
        if (1 != i11) {
            i10 = 6;
        } else {
            i10 = 7;
        }
        zzed zzedVar = new zzed(i10);
        zzedVar.zzK(zzacv.zza(zzacsVar, zzedVar.zzN(), 0, i10));
        zzacsVar.zzj();
        zzacx zzacxVar = new zzacx();
        if (zzd(zzedVar, zzadcVar, z10, zzacxVar)) {
            return zzacxVar.zza;
        }
        throw zzbh.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r3 != r22.zzf) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r21.zzm() * 1000) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r4 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzc(com.google.android.gms.internal.ads.zzed r21, com.google.android.gms.internal.ads.zzadc r22, int r23, com.google.android.gms.internal.ads.zzacx r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.zzd()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.zzg
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.zzg
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.zzi
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = zza(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.zzb
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.zze
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.zzf
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.zzq()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.zzm()
            int r3 = r21.zzd()
            byte[] r0 = r21.zzN()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.zzen.zzg(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zzc(com.google.android.gms.internal.ads.zzed, com.google.android.gms.internal.ads.zzadc, int, com.google.android.gms.internal.ads.zzacx):boolean");
    }

    private static boolean zzd(zzed zzedVar, zzadc zzadcVar, boolean z10, zzacx zzacxVar) {
        try {
            long zzx = zzedVar.zzx();
            if (!z10) {
                zzx *= zzadcVar.zzb;
            }
            zzacxVar.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
