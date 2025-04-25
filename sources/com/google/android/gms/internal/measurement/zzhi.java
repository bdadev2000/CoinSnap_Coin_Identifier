package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Optional;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes12.dex */
public final class zzhi {
    private static volatile Optional<Boolean> zza = Optional.absent();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L26
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r5, r6)
            return r1
        L26:
            com.google.common.base.Optional<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.zzhi.zza
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L3b
            com.google.common.base.Optional<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L3b:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzhi.zzb
            monitor-enter(r6)
            com.google.common.base.Optional<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.zzhi.zza     // Catch: java.lang.Throwable -> La0
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L54
            com.google.common.base.Optional<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> La0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> La0
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> La0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La0
            return r5
        L54:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> La0
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L61
            goto L81
        L61:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La0
            r4 = 29
            if (r3 >= r4) goto L6f
            r3 = r1
            goto L71
        L6f:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L71:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L88
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> La0
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L88
        L81:
            boolean r5 = zza(r5)     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L88
            r1 = 1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La0
            com.google.common.base.Optional r5 = com.google.common.base.Optional.of(r5)     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.internal.measurement.zzhi.zza = r5     // Catch: java.lang.Throwable -> La0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La0
            com.google.common.base.Optional<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La0:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhi.zza(android.content.Context, android.net.Uri):boolean");
    }
}
