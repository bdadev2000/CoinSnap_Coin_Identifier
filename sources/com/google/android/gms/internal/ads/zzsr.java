package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;
import g0.q;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
/* loaded from: classes3.dex */
public final class zzsr {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r6 = ((com.google.android.gms.internal.ads.zzsq) r4.get(r5)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        g0.q.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (zzb(r6, ba.a.f()) != 1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = g0.q.o(r2)
            r0 = 0
            if (r2 == 0) goto La0
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto La0
        Lf:
            int r5 = (int) r5
            g0.q.q()
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = g0.q.i(r3, r4, r5)
            int r2 = zzb(r2, r3)
            r3 = 1
            if (r2 != r3) goto L9f
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zzss.zzb()
            if (r4 != 0) goto L9f
            int r4 = com.google.android.gms.internal.ads.zzen.zza
            r5 = 35
            if (r4 < r5) goto L2b
            goto L88
        L2b:
            com.google.android.gms.internal.ads.zzab r4 = new com.google.android.gms.internal.ads.zzab     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            java.lang.String r5 = "video/avc"
            r4.zzZ(r5)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            com.google.android.gms.internal.ads.zzad r4 = r4.zzaf()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            java.lang.String r5 = r4.zzo     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r5 == 0) goto L8d
            com.google.android.gms.internal.ads.zzta r5 = com.google.android.gms.internal.ads.zzta.zza     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            java.util.List r4 = com.google.android.gms.internal.ads.zztl.zze(r5, r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            r5 = r0
        L44:
            int r6 = r4.size()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r5 >= r6) goto L8d
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            com.google.android.gms.internal.ads.zzsq r6 = (com.google.android.gms.internal.ads.zzsq) r6     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            com.google.android.gms.internal.ads.zzsq r6 = (com.google.android.gms.internal.ads.zzsq) r6     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            com.google.android.gms.internal.ads.zzsq r6 = (com.google.android.gms.internal.ads.zzsq) r6     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            java.util.List r6 = g0.q.o(r6)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r6 == 0) goto L8a
            boolean r1 = r6.isEmpty()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r1 != 0) goto L8a
            g0.q.q()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = ba.a.f()     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            int r4 = zzb(r6, r4)     // Catch: com.google.android.gms.internal.ads.zztf -> L8d
            if (r4 != r3) goto L88
            goto L8d
        L88:
            r3 = r0
            goto L8d
        L8a:
            int r5 = r5 + 1
            goto L44
        L8d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzss.zzc(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zzss.zzb()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9f
            return r0
        L9f:
            return r2
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsr.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i10 = 0; i10 < list.size(); i10++) {
            covers = q.j(list.get(i10)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
