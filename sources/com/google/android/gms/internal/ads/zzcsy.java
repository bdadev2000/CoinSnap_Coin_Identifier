package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcsy {
    private final zzdya zza;
    private final zzffo zzb;
    private final zzfjr zzc;
    private final zzclp zzd;
    private final zzejc zze;
    private final zzdbt zzf;

    @Nullable
    private zzfff zzg;
    private final zzdzj zzh;
    private final zzcvq zzi;
    private final Executor zzj;
    private final zzdyt zzk;
    private final zzefg zzl;
    private final zzdzz zzm;
    private final zzeag zzn;

    public zzcsy(zzdya zzdyaVar, zzffo zzffoVar, zzfjr zzfjrVar, zzclp zzclpVar, zzejc zzejcVar, zzdbt zzdbtVar, @Nullable zzfff zzfffVar, zzdzj zzdzjVar, zzcvq zzcvqVar, Executor executor, zzdyt zzdytVar, zzefg zzefgVar, zzdzz zzdzzVar, zzeag zzeagVar) {
        this.zza = zzdyaVar;
        this.zzb = zzffoVar;
        this.zzc = zzfjrVar;
        this.zzd = zzclpVar;
        this.zze = zzejcVar;
        this.zzf = zzdbtVar;
        this.zzg = zzfffVar;
        this.zzh = zzdzjVar;
        this.zzi = zzcvqVar;
        this.zzj = executor;
        this.zzk = zzdytVar;
        this.zzl = zzefgVar;
        this.zzm = zzdzzVar;
        this.zzn = zzeagVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th2) {
        return zzfgq.zzb(th2, this.zzl);
    }

    public final zzdbt zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfff zzd(zzfff zzfffVar) throws Exception {
        this.zzd.zza(zzfffVar);
        return zzfffVar;
    }

    public final ua.b zze(final zzfhj zzfhjVar) {
        zzfix zza = this.zzc.zzb(zzfjl.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsu
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzcsy.this.zzf(zzfhjVar, (zzbvx) obj);
            }
        }).zza();
        zzgei.zzr(zza, new zzcsw(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ ua.b zzf(zzfhj zzfhjVar, zzbvx zzbvxVar) throws Exception {
        zzbvxVar.zzi = zzfhjVar;
        return this.zzh.zza(zzbvxVar);
    }

    public final /* synthetic */ ua.b zzg(ua.b bVar, ua.b bVar2, ua.b bVar3) throws Exception {
        return this.zzn.zzc((zzbvx) bVar.get(), (JSONObject) bVar2.get(), (zzbvz) bVar3.get());
    }

    public final ua.b zzh(zzbvx zzbvxVar) {
        zzfix zza = this.zzc.zzb(zzfjl.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvxVar)).zza();
        zzgei.zzr(zza, new zzcsx(this), this.zzj);
        return zza;
    }

    public final ua.b zzi(ua.b bVar) {
        zzfjh zzf = this.zzc.zzb(zzfjl.RENDERER, bVar).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzfff zzfffVar = (zzfff) obj;
                zzcsy.this.zzd(zzfffVar);
                return zzfffVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfw)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ua.b zzj() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfjr zzfjrVar = this.zzc;
        zzdya zzdyaVar = this.zza;
        return zzfjb.zzc(zzdyaVar.zza(), zzfjl.PRELOADED_LOADER, zzfjrVar).zza();
    }

    public final ua.b zzk(final ua.b bVar) {
        zzfff zzfffVar = this.zzg;
        if (zzfffVar != null) {
            return zzfjb.zzc(zzgei.zzh(zzfffVar), zzfjl.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzv.zzc().zzj();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzli)).booleanValue() && !((Boolean) zzbet.zzc.zze()).booleanValue()) {
            final zzdzz zzdzzVar = this.zzm;
            Objects.requireNonNull(zzdzzVar);
            final ua.b zzn = zzgei.zzn(bVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsq
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzdzz.this.zza((zzbvx) obj);
                }
            }, this.zzj);
            zzfjh zzb = this.zzc.zzb(zzfjl.BUILD_URL, zzn);
            final zzdzj zzdzjVar = this.zzh;
            Objects.requireNonNull(zzdzjVar);
            final zzfix zza = zzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsr
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzdzj.this.zzb((JSONObject) obj);
                }
            }).zza();
            return this.zzc.zza(zzfjl.SERVER_TRANSACTION, bVar, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcss
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcsy.this.zzg(bVar, zzn, zza);
                }
            }).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcst
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return (ua.b) obj;
                }
            }).zza();
        }
        zzfjh zzb2 = this.zzc.zzb(zzfjl.SERVER_TRANSACTION, bVar);
        final zzdyt zzdytVar = this.zzk;
        Objects.requireNonNull(zzdytVar);
        return zzb2.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsv
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdyt.this.zzb((zzbvx) obj);
            }
        }).zza();
    }

    public final void zzl(zzfff zzfffVar) {
        this.zzg = zzfffVar;
    }
}
