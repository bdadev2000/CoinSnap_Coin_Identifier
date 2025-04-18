package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggi implements Runnable {
    zzggl zza;

    public zzggi(zzggl zzgglVar) {
        this.zza = zzgglVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            java.lang.String r0 = "Timed out (timeout delayed by "
            com.google.android.gms.internal.ads.zzggl r1 = r11.zza
            if (r1 != 0) goto L8
            goto L7e
        L8:
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzggl.zze(r1)
            if (r2 == 0) goto L7e
            r3 = 0
            r11.zza = r3
            boolean r4 = r2.isDone()
            if (r4 == 0) goto L1b
            r1.zzs(r2)
            return
        L1b:
            r4 = 1
            java.util.concurrent.ScheduledFuture r5 = com.google.android.gms.internal.ads.zzggl.zzv(r1)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzggl.zzw(r1, r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "Timed out"
            if (r5 == 0) goto L4b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L49
            long r7 = r5.getDelay(r7)     // Catch: java.lang.Throwable -> L49
            long r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Throwable -> L49
            r9 = 10
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L49
            r5.append(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = " ms after scheduled time)"
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r0 = move-exception
            goto L71
        L4b:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>()     // Catch: java.lang.Throwable -> L49
            r5.append(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = ": "
            r5.append(r7)     // Catch: java.lang.Throwable -> L49
            r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzggk r5 = new com.google.android.gms.internal.ads.zzggk     // Catch: java.lang.Throwable -> L6f
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L6f
            r1.zzd(r5)     // Catch: java.lang.Throwable -> L6f
            r2.cancel(r4)
            return
        L6f:
            r0 = move-exception
            goto L7a
        L71:
            com.google.android.gms.internal.ads.zzggk r5 = new com.google.android.gms.internal.ads.zzggk     // Catch: java.lang.Throwable -> L6f
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L6f
            r1.zzd(r5)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L7a:
            r2.cancel(r4)
            throw r0
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzggi.run():void");
    }
}
