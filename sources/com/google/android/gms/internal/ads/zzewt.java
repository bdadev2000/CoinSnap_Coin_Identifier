package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzewt implements zzevz {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzges zzc;
    private final ScheduledExecutorService zzd;
    private final zzeez zze;
    private final zzffo zzf;
    private final VersionInfoParcel zzg;

    public zzewt(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzeez zzeezVar, zzffo zzffoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgesVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeezVar;
        this.zzf = zzffoVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzevz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.b zzb() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewt.zzb():ua.b");
    }

    public final /* synthetic */ ua.b zzc(final Throwable th2) throws Exception {
        zzewv zzewvVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewq
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkc)).booleanValue();
                Throwable th3 = th2;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th2 instanceof SecurityException) {
            zzewvVar = new zzewv("", 2, null);
        } else if (th2 instanceof IllegalStateException) {
            zzewvVar = new zzewv("", 3, null);
        } else if (th2 instanceof IllegalArgumentException) {
            zzewvVar = new zzewv("", 4, null);
        } else if (th2 instanceof TimeoutException) {
            zzewvVar = new zzewv("", 5, null);
        } else {
            zzewvVar = new zzewv("", 0, null);
        }
        return zzgei.zzh(zzewvVar);
    }
}
