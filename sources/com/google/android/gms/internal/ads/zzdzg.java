package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zzdzg implements zzeaf {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdyj zzb;
    private final zzgfz zzc;
    private final zzfhc zzd;
    private final ScheduledExecutorService zze;
    private final zzedu zzf;
    private final zzfma zzg;
    private final Context zzh;

    public zzdzg(Context context, zzfhc zzfhcVar, zzdyj zzdyjVar, zzgfz zzgfzVar, ScheduledExecutorService scheduledExecutorService, zzedu zzeduVar, zzfma zzfmaVar) {
        this.zzh = context;
        this.zzd = zzfhcVar;
        this.zzb = zzdyjVar;
        this.zzc = zzgfzVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeduVar;
        this.zzg = zzfmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final ListenableFuture zzb(zzbwa zzbwaVar) {
        Context context = this.zzh;
        ListenableFuture zzc = this.zzb.zzc(zzbwaVar);
        zzflp zza2 = zzflo.zza(context, 11);
        zzflz.zzd(zzc, zza2);
        ListenableFuture zzn = zzgfo.zzn(zzc, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdzg.this.zzc((zzeah) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfp)).booleanValue()) {
            zzn = zzgfo.zzf(zzgfo.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzgfo.zzg(new zzdye(5));
                }
            }, zzcan.zzf);
        }
        zzflz.zza(zzn, this.zzg, zza2);
        zzgfo.zzr(zzn, new zzdzf(this), zzcan.zzf);
        return zzn;
    }

    public final /* synthetic */ ListenableFuture zzc(zzeah zzeahVar) throws Exception {
        return zzgfo.zzh(new zzfgt(new zzfgq(this.zzd), zzfgs.zza(new InputStreamReader(zzeahVar.zzb()), zzeahVar.zza())));
    }
}
