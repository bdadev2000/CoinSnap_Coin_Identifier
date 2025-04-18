package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzejc implements zzgdp {
    private final zzfjr zza;
    private final zzcwo zzb;
    private final zzfln zzc;
    private final zzflr zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrt zzg;
    private final zzeiv zzh;
    private final zzefg zzi;
    private final Context zzj;
    private final zzfkl zzk;
    private final zzeif zzl;
    private final zzdsh zzm;

    public zzejc(Context context, zzfjr zzfjrVar, zzeiv zzeivVar, zzcwo zzcwoVar, zzfln zzflnVar, zzflr zzflrVar, zzcrt zzcrtVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefg zzefgVar, zzfkl zzfklVar, zzeif zzeifVar, zzdsh zzdshVar) {
        this.zzj = context;
        this.zza = zzfjrVar;
        this.zzh = zzeivVar;
        this.zzb = zzcwoVar;
        this.zzc = zzflnVar;
        this.zzd = zzflrVar;
        this.zzg = zzcrtVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefgVar;
        this.zzk = zzfklVar;
        this.zzl = zzeifVar;
        this.zzm = zzdshVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzfu)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfff r5) {
        /*
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfv
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
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
            com.google.android.gms.internal.ads.zzffe r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfew r2 = r2.zzb
            int r2 = r2.zzf
            if (r2 == 0) goto L4c
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzfu
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
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
            java.lang.String r1 = eb.j.i(r0, r2)
            goto L4d
        L4c:
            r1 = r0
        L4d:
            com.google.android.gms.internal.ads.zzffe r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfew r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfev r5 = r5.zzj
            if (r5 == 0) goto L5a
            java.lang.String r5 = r5.zza()
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejc.zzc(com.google.android.gms.internal.ads.zzfff):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    @Override // com.google.android.gms.internal.ads.zzgdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ ua.b zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejc.zza(java.lang.Object):ua.b");
    }

    public final /* synthetic */ ua.b zzb(zzfet zzfetVar, zzfff zzfffVar, zzefb zzefbVar, Throwable th2) throws Exception {
        zzfka zza = zzfjz.zza(this.zzj, 12);
        zza.zzd(zzfetVar.zzE);
        zza.zzi();
        ua.b zzo = zzgei.zzo(zzefbVar.zza(zzfffVar, zzfetVar), zzfetVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfffVar, zzfetVar, zzo, this.zzc);
        zzfkk.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
