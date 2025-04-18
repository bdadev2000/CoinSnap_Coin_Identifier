package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdrr {
    private final Map zza = new HashMap();

    public final synchronized zzdrq zza(String str) {
        return (zzdrq) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrz zzbrzVar;
        zzdrq zza = zza(str);
        return (zza == null || (zzbrzVar = zza.zzb) == null) ? "" : zzbrzVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc(java.lang.String r6, com.google.android.gms.internal.ads.zzfia r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdrq r0 = new com.google.android.gms.internal.ads.zzdrq     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.zzbrz r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.zzbrz r1 = r7.zzf()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfhj -> L20
        L20:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziU     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.zzC()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfhj -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrr.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfia):void");
    }

    public final synchronized void zzd(String str, zzbrk zzbrkVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdrq(str, zzbrkVar.zzf(), zzbrkVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
