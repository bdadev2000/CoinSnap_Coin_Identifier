package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzexd implements zzexw {
    private final String zza;
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfho zze;
    private final zzcjd zzf;

    public zzexd(zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfho zzfhoVar, zzcjd zzcjdVar) {
        this.zzb = zzggeVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfhoVar;
        this.zzf = zzcjdVar;
    }

    public static /* synthetic */ f4.c zzc(zzexd zzexdVar) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzp = zzexdVar.zzf.zzp();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(zzexdVar.zzd);
        zzfhm zzfhmVar = new zzfhm();
        zzfhmVar.zzt("adUnitId");
        zzfhmVar.zzH(zzexdVar.zze.zzd);
        zzfhmVar.zzs(new com.google.android.gms.ads.internal.client.zzq());
        zzfhmVar.zzz(true);
        zzcytVar.zzi(zzfhmVar.zzJ());
        zzp.zza(zzcytVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzam();
        zzamVar.zza(zzexdVar.zza);
        zzp.zzb(zzamVar.zzb());
        new zzdfa();
        return zzgft.zze(zzgft.zzm((zzgfk) zzgft.zzo(zzgfk.zzu(zzp.zzc().zzb()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhp)).longValue(), TimeUnit.MILLISECONDS, zzexdVar.zzc), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzax) obj;
                return zzaxVar != null ? new zzexe(zzaxVar.zza) : new zzexe(null);
            }
        }, zzexdVar.zzb), Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return new zzexe(null);
            }
        }, zzexdVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzho)).booleanValue() && !this.zze.zzr) {
            return zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // com.google.android.gms.internal.ads.zzgez
                public final f4.c zza() {
                    return zzexd.zzc(zzexd.this);
                }
            }, this.zzb);
        }
        return zzgft.zzh(new zzexe(null));
    }
}
