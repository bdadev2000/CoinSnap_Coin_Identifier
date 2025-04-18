package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;

/* loaded from: classes3.dex */
abstract class zzgcx extends zzgdy implements Runnable {
    ua.b zza;
    Class zzb;
    Object zzc;

    public zzgcx(ua.b bVar, Class cls, Object obj) {
        bVar.getClass();
        this.zza = bVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            ua.b r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto L90
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L22
            goto L90
        L22:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgfk     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzgfk r4 = (com.google.android.gms.internal.ads.zzgfk) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L62
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgei.zzp(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L63
        L39:
            r4 = move-exception
            goto L62
        L3b:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L61
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            java.lang.String r9 = " without a cause"
            java.lang.String r4 = a4.j.h(r7, r6, r8, r4, r9)
            r5.<init>(r4)
        L61:
            r4 = r5
        L62:
            r5 = r3
        L63:
            if (r4 != 0) goto L69
            r10.zzc(r5)
            return
        L69:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L8d
            java.lang.Object r0 = r10.zze(r2, r4)     // Catch: java.lang.Throwable -> L7b
            r10.zzb = r3
            r10.zzc = r3
            r10.zzf(r0)
            return
        L7b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgez.zza(r0)     // Catch: java.lang.Throwable -> L87
            r10.zzd(r0)     // Catch: java.lang.Throwable -> L87
            r10.zzb = r3
            r10.zzc = r3
            return
        L87:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L8d:
            r10.zzs(r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcx.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        String str;
        ua.b bVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (bVar != null) {
            str = e.f("inputFuture=[", bVar.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th2) throws Exception;

    public abstract void zzf(Object obj);
}
