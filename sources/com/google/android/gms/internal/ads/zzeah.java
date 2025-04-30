package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzeah implements zzebg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzi zzb;
    private final zzgge zzc;
    private final zzfho zzd;
    private final ScheduledExecutorService zze;
    private final zzeev zzf;
    private final zzfmn zzg;
    private final Context zzh;

    public zzeah(Context context, zzfho zzfhoVar, zzdzi zzdziVar, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzeev zzeevVar, zzfmn zzfmnVar) {
        this.zzh = context;
        this.zzd = zzfhoVar;
        this.zzb = zzdziVar;
        this.zzc = zzggeVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeevVar;
        this.zzg = zzfmnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final f4.c zzb(zzbxu zzbxuVar) {
        Context context = this.zzh;
        f4.c zzc = this.zzb.zzc(zzbxuVar);
        zzfmc zza2 = zzfmb.zza(context, zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zzfmm.zze(zzc, zza2);
        f4.c zzn = zzgft.zzn(zzc, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeah.this.zzc((zzebi) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfD)).booleanValue()) {
            zzn = zzgft.zzf(zzgft.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeaf
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzgft.zzg(new zzdzd(5));
                }
            }, zzcci.zzf);
        }
        zzfmm.zzb(zzn, this.zzg, zza2);
        zzgft.zzr(zzn, new zzeag(this), zzcci.zzf);
        return zzn;
    }

    public final /* synthetic */ f4.c zzc(zzebi zzebiVar) throws Exception {
        return zzgft.zzh(new zzfhf(new zzfhc(this.zzd), zzfhe.zza(new InputStreamReader(zzebiVar.zzb()), zzebiVar.zza())));
    }
}
