package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzeyb implements zzexh {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgfz zzc;
    private final ScheduledExecutorService zzd;
    private final zzegi zze;
    private final zzfhc zzf;
    private final VersionInfoParcel zzg;

    public zzeyb(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgfz zzgfzVar, ScheduledExecutorService scheduledExecutorService, zzegi zzegiVar, zzfhc zzfhcVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgfzVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzegiVar;
        this.zzf = zzfhcVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzexh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyb.zzb():com.google.common.util.concurrent.ListenableFuture");
    }

    public final /* synthetic */ ListenableFuture zzc(final Throwable th) throws Exception {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexy
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzka)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgfo.zzh(th instanceof SecurityException ? new zzeyd("", 2, null) : th instanceof IllegalStateException ? new zzeyd("", 3, null) : th instanceof IllegalArgumentException ? new zzeyd("", 4, null) : th instanceof TimeoutException ? new zzeyd("", 5, null) : new zzeyd("", 0, null));
    }
}
