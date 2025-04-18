package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzegv implements zzefb {
    private final zzcqh zza;
    private final zzegc zzb;
    private final zzges zzc;
    private final zzcwo zzd;
    private final ScheduledExecutorService zze;
    private final zzdsh zzf;

    public zzegv(zzcqh zzcqhVar, zzegc zzegcVar, zzcwo zzcwoVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar, zzdsh zzdshVar) {
        this.zza = zzcqhVar;
        this.zzb = zzegcVar;
        this.zzd = zzcwoVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgesVar;
        this.zzf = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzegv.this.zzc(zzfffVar, zzfetVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        Object obj;
        zzbhp zza = zzfffVar.zza.zza.zza();
        boolean zzb = this.zzb.zzb(zzfffVar, zzfetVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlH)).booleanValue()) {
            zzdsh zzdshVar = this.zzf;
            String str = "1";
            if (zza != null) {
                obj = "1";
            } else {
                obj = "0";
            }
            zzdshVar.zzb().put("has_dbl", obj);
            zzdsh zzdshVar2 = this.zzf;
            if (true != zzb) {
                str = "0";
            }
            zzdshVar2.zzb().put("crdb", str);
        }
        if (zza != null && zzb) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzcpd zzc(final zzfff zzfffVar, final zzfet zzfetVar) throws Exception {
        return this.zza.zzb(new zzcsg(zzfffVar, zzfetVar, null), new zzcqy(zzfffVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // java.lang.Runnable
            public final void run() {
                zzegv.this.zzf(zzfffVar, zzfetVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfff zzfffVar, zzfet zzfetVar) {
        zzgei.zzr(zzgei.zzo(this.zzb.zza(zzfffVar, zzfetVar), zzfetVar.zzR, TimeUnit.SECONDS, this.zze), new zzegu(this), this.zzc);
    }
}
