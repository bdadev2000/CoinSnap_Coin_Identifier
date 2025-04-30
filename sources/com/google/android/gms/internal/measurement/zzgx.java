package com.google.android.gms.internal.measurement;

import android.content.Context;
import c4.C0607a;
import c4.c;

/* loaded from: classes2.dex */
public final class zzgx {
    private static volatile c zza = C0607a.b;
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L30;
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
            if (r0 != 0) goto L24
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6)
            return r1
        L24:
            c4.c r6 = com.google.android.gms.internal.measurement.zzgx.zza
            boolean r6 = r6.b()
            if (r6 == 0) goto L39
            c4.c r5 = com.google.android.gms.internal.measurement.zzgx.zza
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L39:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzgx.zzb
            monitor-enter(r6)
            c4.c r0 = com.google.android.gms.internal.measurement.zzgx.zza     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L54
            c4.c r5 = com.google.android.gms.internal.measurement.zzgx.zza     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r5 = move-exception
            goto La1
        L54:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L61
            goto L81
        L61:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r4 = 29
            if (r3 >= r4) goto L6f
            r3 = r1
            goto L71
        L6f:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L71:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L52
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
        L81:
            boolean r5 = zza(r5)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L88
            r1 = 1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L52
            c4.d r0 = new c4.d     // Catch: java.lang.Throwable -> L52
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.measurement.zzgx.zza = r0     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            c4.c r5 = com.google.android.gms.internal.measurement.zzgx.zza
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgx.zza(android.content.Context, android.net.Uri):boolean");
    }
}
