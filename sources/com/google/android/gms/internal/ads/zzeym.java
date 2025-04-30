package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzeym implements zzexw {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgge zzc;
    private final ScheduledExecutorService zzd;
    private final zzehj zze;
    private final zzfho zzf;
    private final VersionInfoParcel zzg;

    public zzeym(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzehj zzehjVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzggeVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehjVar;
        this.zzf = zzfhoVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzexw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f4.c zzb() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzkt
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfc
            com.google.android.gms.ads.internal.util.zzg r0 = r5.zza
            boolean r0 = r0.zzT()
            if (r0 == 0) goto Lfc
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzkx
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzfho r0 = r5.zzf
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto Lfc
        L3a:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r5.zzg
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzkr
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfc
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzks
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfc
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzkp
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzkq
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfc
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.zzb
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfc
        La0:
            com.google.android.gms.internal.ads.zzehj r0 = r5.zze     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            f4.c r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzkv     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.zzd     // Catch: java.lang.Exception -> Lc1
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzo(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzg(r0)
        Lc6:
            com.google.android.gms.internal.ads.zzgfk r0 = com.google.android.gms.internal.ads.zzgfk.zzu(r0)
            com.google.android.gms.internal.ads.zzeyk r1 = new com.google.android.gms.internal.ads.zzeyk
            r1.<init>()
            com.google.android.gms.internal.ads.zzgge r2 = r5.zzc
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.zzeyl r1 = new com.google.android.gms.internal.ads.zzeyl
            r1.<init>()
            com.google.android.gms.internal.ads.zzgge r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzf(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzkv
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzd
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzo(r0, r1, r4, r3)
            return r0
        Lfc:
            com.google.android.gms.internal.ads.zzeyo r0 = new com.google.android.gms.internal.ads.zzeyo
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            f4.c r0 = com.google.android.gms.internal.ads.zzgft.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeym.zzb():f4.c");
    }

    public final /* synthetic */ f4.c zzc(final Throwable th) throws Exception {
        zzeyo zzeyoVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzku)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzeyoVar = new zzeyo("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzeyoVar = new zzeyo("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzeyoVar = new zzeyo("", 4, null);
        } else if (th instanceof TimeoutException) {
            zzeyoVar = new zzeyo("", 5, null);
        } else {
            zzeyoVar = new zzeyo("", 0, null);
        }
        return zzgft.zzh(zzeyoVar);
    }
}
