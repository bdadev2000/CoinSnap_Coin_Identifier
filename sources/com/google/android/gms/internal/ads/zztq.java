package com.google.android.gms.internal.ads;

import U4.u;
import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class zztq {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r6 = ((com.google.android.gms.internal.ads.zztp) r4.get(r5)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        com.google.android.gms.internal.ads.e.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (zzb(r6, U4.u.c()) != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = U4.u.g(r2)
            r0 = 0
            if (r2 == 0) goto L9c
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto L9c
        Lf:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = U4.u.d(r3, r4, r5)
            int r2 = zzb(r2, r3)
            r3 = 1
            if (r2 != r3) goto L9b
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zztr.zzb()
            if (r4 != 0) goto L9b
            int r4 = com.google.android.gms.internal.ads.zzgd.zza
            r5 = 35
            if (r4 < r5) goto L29
        L27:
            r3 = r0
            goto L89
        L29:
            com.google.android.gms.internal.ads.zzal r4 = new com.google.android.gms.internal.ads.zzal     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            java.lang.String r5 = "video/avc"
            r4.zzX(r5)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            com.google.android.gms.internal.ads.zzan r4 = r4.zzad()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            java.lang.String r5 = r4.zzn     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r5 == 0) goto L89
            com.google.android.gms.internal.ads.zztx r5 = com.google.android.gms.internal.ads.zztx.zza     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            java.util.List r4 = com.google.android.gms.internal.ads.zzuj.zzf(r5, r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            r5 = r0
        L42:
            int r6 = r4.size()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r5 >= r6) goto L89
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            com.google.android.gms.internal.ads.zztp r6 = (com.google.android.gms.internal.ads.zztp) r6     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r6 == 0) goto L86
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            com.google.android.gms.internal.ads.zztp r6 = (com.google.android.gms.internal.ads.zztp) r6     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r6 == 0) goto L86
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            com.google.android.gms.internal.ads.zztp r6 = (com.google.android.gms.internal.ads.zztp) r6     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            java.util.List r6 = U4.u.g(r6)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r6 == 0) goto L86
            boolean r1 = r6.isEmpty()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r1 != 0) goto L86
            com.google.android.gms.internal.ads.e.d()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = U4.u.c()     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            int r4 = zzb(r6, r4)     // Catch: com.google.android.gms.internal.ads.zzud -> L89
            if (r4 != r3) goto L27
            goto L89
        L86:
            int r5 = r5 + 1
            goto L42
        L89:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zztr.zzc(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zztr.zzb()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9b
            return r0
        L9b:
            return r2
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i9 = 0; i9 < list.size(); i9++) {
            covers = u.e(list.get(i9)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
