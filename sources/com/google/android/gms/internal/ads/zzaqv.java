package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzaqv {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaqv(java.lang.String r14, com.google.android.gms.internal.ads.zzapl r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzapu r11 = new com.google.android.gms.internal.ads.zzapu
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqv.<init>(java.lang.String, com.google.android.gms.internal.ads.zzapl):void");
    }

    public static zzaqv zza(zzaqw zzaqwVar) throws IOException {
        if (zzaqy.zze(zzaqwVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzaqy.zzh(zzaqwVar);
        String zzh2 = zzaqy.zzh(zzaqwVar);
        long zzf = zzaqy.zzf(zzaqwVar);
        long zzf2 = zzaqy.zzf(zzaqwVar);
        long zzf3 = zzaqy.zzf(zzaqwVar);
        long zzf4 = zzaqy.zzf(zzaqwVar);
        int zze = zzaqy.zze(zzaqwVar);
        if (zze < 0) {
            throw new IOException(d.i("readHeaderList size=", zze));
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i2 = 0; i2 < zze; i2++) {
            emptyList.add(new zzapu(zzaqy.zzh(zzaqwVar).intern(), zzaqy.zzh(zzaqwVar).intern()));
        }
        return new zzaqv(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzaqv(String str, String str2, long j2, long j3, long j4, long j5, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = list;
    }
}
