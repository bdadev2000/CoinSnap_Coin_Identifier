package com.google.android.gms.internal.ads;

import eb.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaqi {
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
    public zzaqi(java.lang.String r14, com.google.android.gms.internal.ads.zzaoy r15) {
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
            com.google.android.gms.internal.ads.zzaph r11 = new com.google.android.gms.internal.ads.zzaph
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqi.<init>(java.lang.String, com.google.android.gms.internal.ads.zzaoy):void");
    }

    public static zzaqi zza(zzaqj zzaqjVar) throws IOException {
        List arrayList;
        if (zzaql.zze(zzaqjVar) == 538247942) {
            String zzh = zzaql.zzh(zzaqjVar);
            String zzh2 = zzaql.zzh(zzaqjVar);
            long zzf = zzaql.zzf(zzaqjVar);
            long zzf2 = zzaql.zzf(zzaqjVar);
            long zzf3 = zzaql.zzf(zzaqjVar);
            long zzf4 = zzaql.zzf(zzaqjVar);
            int zze = zzaql.zze(zzaqjVar);
            if (zze >= 0) {
                if (zze == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i10 = 0; i10 < zze; i10++) {
                    list.add(new zzaph(zzaql.zzh(zzaqjVar).intern(), zzaql.zzh(zzaqjVar).intern()));
                }
                return new zzaqi(zzh, zzh2, zzf, zzf2, zzf3, zzf4, list);
            }
            throw new IOException(j.i("readHeaderList size=", zze));
        }
        throw new IOException();
    }

    private zzaqi(String str, String str2, long j3, long j10, long j11, long j12, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j3;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = list;
    }
}
