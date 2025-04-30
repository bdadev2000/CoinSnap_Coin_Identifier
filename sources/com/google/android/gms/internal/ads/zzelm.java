package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzelm implements zzgfa {
    private final zzflt zza;
    private final zzczn zzb;
    private final zzfoa zzc;
    private final zzfoe zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcus zzg;
    private final zzelf zzh;
    private final zzehq zzi;
    private final Context zzj;
    private final zzfmn zzk;
    private final zzekp zzl;
    private final zzdux zzm;

    public zzelm(Context context, zzflt zzfltVar, zzelf zzelfVar, zzczn zzcznVar, zzfoa zzfoaVar, zzfoe zzfoeVar, zzcus zzcusVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehq zzehqVar, zzfmn zzfmnVar, zzekp zzekpVar, zzdux zzduxVar) {
        this.zzj = context;
        this.zza = zzfltVar;
        this.zzh = zzelfVar;
        this.zzb = zzcznVar;
        this.zzc = zzfoaVar;
        this.zzd = zzfoeVar;
        this.zzg = zzcusVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzehqVar;
        this.zzk = zzfmnVar;
        this.zzl = zzekpVar;
        this.zzm = zzduxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzfB)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfhf r5) {
        /*
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzfC
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfhe r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfgw r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L4c
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbeg r2 = com.google.android.gms.internal.ads.zzbep.zzfB
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L4c
            goto L4d
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L4d
        L45:
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r1 = com.mbridge.msdk.foundation.entity.o.h(r2, r0)
            goto L4d
        L4c:
            r1 = r0
        L4d:
            com.google.android.gms.internal.ads.zzfhe r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgw r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgv r5 = r5.zzi
            if (r5 == 0) goto L5a
            java.lang.String r5 = r5.zza()
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelm.zzc(com.google.android.gms.internal.ads.zzfhf):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    @Override // com.google.android.gms.internal.ads.zzgfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ f4.c zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelm.zza(java.lang.Object):f4.c");
    }

    public final /* synthetic */ f4.c zzb(zzfgt zzfgtVar, zzfhf zzfhfVar, zzehl zzehlVar, Throwable th) throws Exception {
        zzfmc zza = zzfmb.zza(this.zzj, zzfmu.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER);
        zza.zze(zzfgtVar.zzF);
        zza.zzj();
        f4.c zzo = zzgft.zzo(zzehlVar.zza(zzfhfVar, zzfgtVar), zzfgtVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfhfVar, zzfgtVar, zzo, this.zzc);
        zzfmm.zzb(zzo, this.zzk, zza);
        return zzo;
    }
}
