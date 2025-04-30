package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzewa implements zzexw {
    private final zzgge zza;
    private final Context zzb;
    private final Set zzc;

    public zzewa(zzgge zzggeVar, Context context, Set set) {
        this.zza = zzggeVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewa.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzewb zzc() throws java.lang.Exception {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzeZ
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzfk
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.zzc
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzewb r1 = new com.google.android.gms.internal.ads.zzewb
            com.google.android.gms.internal.ads.zzehb r2 = com.google.android.gms.ads.internal.zzu.zzA()
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L56:
            com.google.android.gms.internal.ads.zzewb r0 = new com.google.android.gms.internal.ads.zzewb
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewa.zzc():com.google.android.gms.internal.ads.zzewb");
    }
}
