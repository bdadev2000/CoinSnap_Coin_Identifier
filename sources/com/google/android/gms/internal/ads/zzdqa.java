package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdqa {
    private final Map zza = new HashMap();

    public final synchronized zzdpz zza(String str) {
        return (zzdpz) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbru zzbruVar;
        zzdpz zza = zza(str);
        if (zza != null && (zzbruVar = zza.zzb) != null) {
            return zzbruVar.toString();
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc(java.lang.String r6, com.google.android.gms.internal.ads.zzfgm r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdpz r0 = new com.google.android.gms.internal.ads.zzdpz     // Catch: java.lang.Throwable -> L43
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbru r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.zzffv -> L10 java.lang.Throwable -> L43
        L16:
            if (r7 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbru r1 = r7.zzf()     // Catch: com.google.android.gms.internal.ads.zzffv -> L1d java.lang.Throwable -> L43
        L1d:
            com.google.android.gms.internal.ads.zzbce r3 = com.google.android.gms.internal.ads.zzbcn.zziW     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzbcl r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L43
            r4 = 1
            if (r3 != 0) goto L31
            goto L39
        L31:
            r3 = 0
            if (r7 != 0) goto L36
        L34:
            r4 = r3
            goto L39
        L36:
            r7.zzC()     // Catch: com.google.android.gms.internal.ads.zzffv -> L34 java.lang.Throwable -> L43
        L39:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L43
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L43
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            return
        L43:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqa.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfgm):void");
    }

    public final synchronized void zzd(String str, zzbrf zzbrfVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpz(str, zzbrfVar.zzf(), zzbrfVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
