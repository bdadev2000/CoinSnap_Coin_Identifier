package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzdxv implements zzdyv {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwv zzb;
    private final zzges zzc;
    private final zzffo zzd;
    private final ScheduledExecutorService zze;
    private final zzecl zzf;
    private final zzfkl zzg;
    private final Context zzh;

    public zzdxv(Context context, zzffo zzffoVar, zzdwv zzdwvVar, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzecl zzeclVar, zzfkl zzfklVar) {
        this.zzh = context;
        this.zzd = zzffoVar;
        this.zzb = zzdwvVar;
        this.zzc = zzgesVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeclVar;
        this.zzg = zzfklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final ua.b zzb(zzbvx zzbvxVar) {
        Context context = this.zzh;
        ua.b zzc = this.zzb.zzc(zzbvxVar);
        zzfka zza2 = zzfjz.zza(context, 11);
        zzfkk.zzd(zzc, zza2);
        ua.b zzn = zzgei.zzn(zzc, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdxv.this.zzc((zzdyx) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfw)).booleanValue()) {
            zzn = zzgei.zzf(zzgei.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxt
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzgei.zzg(new zzdwn(5));
                }
            }, zzcaj.zzf);
        }
        zzfkk.zza(zzn, this.zzg, zza2);
        zzgei.zzr(zzn, new zzdxu(this), zzcaj.zzf);
        return zzn;
    }

    public final /* synthetic */ ua.b zzc(zzdyx zzdyxVar) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zzd), zzffe.zza(new InputStreamReader(zzdyxVar.zzb()), zzdyxVar.zza())));
    }
}
